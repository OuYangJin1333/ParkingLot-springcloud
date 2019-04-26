package cn.park.utils;




import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 响应信息
 */

public class RespBean {
    //操作成功
    public static final int SUCCESS = 200;
    //操作失败
    public static final int FAILED = 500;
    //参数校验失败
    public static final int VALIDATE_FAILED = 404;
    //未认证
    public static final int UNAUTHORIZED = 401;
    //未授权
    public static final int  FORBIDDEN = 403;
    private Integer status;
    private String msg;
    private Object obj;

    public RespBean() {
        this.msg="操作成功";
        this.status= SUCCESS;
    }

    public RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    /**
     * 分页数据
     * @param data
     * @return
     */
    public RespBean pageSuccess(List data){
        PageInfo pageInfo = new PageInfo(data);
        Map<String, Object> result = new HashMap<>();
        result.put("pageSize", pageInfo.getPageSize());
        result.put("totalPage", pageInfo.getPages());
        result.put("total", pageInfo.getTotal());
        result.put("pageNum", pageInfo.getPageNum());
        result.put("list", pageInfo.getList());
        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getPageSize());
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPageNum());
        this.status = SUCCESS;
        this.msg = "操作成功";
        this.obj = result;
        return this;
    }
    public RespBean pageSuccess(Page pageInfo){
        Map<String, Object> result = new HashMap<>();
        result.put("pageSize", pageInfo.getSize());
        result.put("totalPage", pageInfo.getTotalPages());
        result.put("total", pageInfo.getTotalElements());
        result.put("pageNum", pageInfo.getNumber());
        result.put("list", pageInfo.getContent());
        this.status = SUCCESS;
        this.msg = "操作成功";
        this.obj = result;
        return this;
    }
    public static RespBean error401() {
        return error(401, "你还没有登录",null);
    }
    public static RespBean error403() {
        return error(403, "你没有访问权限",null);
    }

    public static RespBean build() {
        return new RespBean();
    }

    public static RespBean ok(String msg, Object obj) {
        return new RespBean(200, msg, obj);
    }

    public static RespBean ok(String msg) {
        return new RespBean(200, msg, null);
    }

    public static RespBean error(String msg, Object obj) {
        return new RespBean(500, msg, obj);
    }

    public static RespBean error(Integer status,String msg, Object obj) {
        return new RespBean(status, msg, obj);
    }

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
