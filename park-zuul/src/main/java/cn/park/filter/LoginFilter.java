package cn.park.filter;

import cn.park.pojo.Menu;
import cn.park.service.MenuService;
import cn.park.service.RedisService;
import cn.park.utils.CommonConstants;
import cn.park.utils.FilterContextHandler;
import cn.park.utils.RespBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LoginFilter extends ZuulFilter {
    @Autowired
    MenuService menuService;
    private String ignorePath = "/api-auth/login";
    @Autowired
    RedisService redisService;
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 10000;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取上下文对象
        RequestContext ctx = RequestContext.getCurrentContext();
        //获取request对象
        HttpServletRequest request = ctx.getRequest();
        //获取请求的url
        final String requestUri = request.getRequestURI();
        //如果请求是去登录,直接返回
        if (isStartWith(requestUri)) {
            return null;
        }
        //认证身份
        String accessToken = request.getHeader(CommonConstants.CONTEXT_TOKEN);
        if(StringUtils.isEmpty(accessToken)){
            accessToken = request.getParameter(CommonConstants.TOKEN);
        }
        if (null == accessToken) {
            setFailedRequest(RespBean.error401(), 200);
            return null;
        }
        String token = redisService.getCurrentAdminToken("accessToken");
        FilterContextHandler.setToken(accessToken);
        if(!havePermission(request)){
            setFailedRequest(RespBean.error403(), 200);
            return null;
        }
        return null;
    }
    private boolean havePermission(HttpServletRequest request){
        String currentURL = request.getRequestURI();
        List<Menu> menuList = menuService.userMenus();
        for(Menu menu:menuList){
            if(currentURL!=null&&null!=menu.getUrl()&&currentURL.startsWith(menu.getUrl())){
                return true;
            }
        }
        return true;
    }
    private void setFailedRequest(Object body, int code) {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.setResponseStatusCode(code);
        HttpServletResponse response = ctx.getResponse();
        PrintWriter out = null;
        try{
            out = response.getWriter();
            out.write(new ObjectMapper().writeValueAsString(body));
            out.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
        ctx.setSendZuulResponse(false);
    }

    private boolean isStartWith(String requestUri) {
        boolean flag = false;
        for (String s : ignorePath.split(",")) {
            if (requestUri.startsWith(s)) {
                return true;
            }
        }
        return flag;
    }
}
