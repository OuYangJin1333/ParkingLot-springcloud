package cn.park.utils;

import cn.park.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

public class AdminUtils {
    //返回用户登录信息
    public static Admin getCurrentHr() {
        Object o = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.err.println(o);
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
