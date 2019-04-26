package cn.park.config;


import cn.park.pojo.Menu;
import cn.park.pojo.Role;
import cn.park.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

@Component
public class CustomMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    MenuService menuService;
    AntPathMatcher antPathMatcher=new AntPathMatcher();
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl=((FilterInvocation) o).getRequestUrl();//获取请求地址
        List<Menu> allMenu=menuService.getAllMenu();//获取菜单资源
        for (Menu menu:allMenu){
            //角色
            if (antPathMatcher.match(menu.getUrl(),requestUrl)&&menu.getRoles().size()>0){
                List<Role> roles=menu.getRoles();
                int size=roles.size();
                String[] values=new String[size];
                for (int i=0;i<size;i++){
                    values[i]=roles.get(i).getRole_name();
                }
                return SecurityConfig.createList(values);//创建一个角色集合
            }
        }
        //没有匹配上的资源，都是登录访问
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
