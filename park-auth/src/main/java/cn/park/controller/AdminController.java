package cn.park.controller;

import cn.park.pojo.Admin;
import cn.park.pojo.RespBean;
import cn.park.service.AdminService;
import cn.park.service.TokenService;
import cn.park.utils.AdminUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    TokenService tokenService;


    @RequestMapping("/putAdmin")
    public RespBean putAdmin(Admin admin){
        int num=adminService.putAdmin(admin);
        if (num>0){
            return RespBean.ok("修改成功!");
        }else
        return RespBean.error("修改失败!");
    }

    @RequestMapping("/login")
    public RespBean login(String username, String password, HttpServletRequest request){
        String userAgent=request.getHeader("user-agent");
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        UserDetails userDetails = adminService.loadUserByUsername(username);
        if(!userDetails.getPassword().equals(password)){
            return RespBean.error("账号或密码错误");
        }
        String token=tokenService.generateToken(userAgent,admin);
        return RespBean.ok("登录成功",token);
    }

    @RequestMapping(value = "/getAdmin",method = RequestMethod.GET)
    public String getAdmin(){
        Map<String,Object> map=new HashMap<>();
        Admin admin=AdminUtils.getCurrentHr();
        System.out.println("admin =="+admin.toString());;
        return JSONObject.toJSONString(admin);
    }

//    public Map<String, Object> getAdmin(){



//    @RequestMapping(value = "/log_out",method = RequestMethod.GET,produces = "application/json",headers = "token")
//    public @ResponseBody String logout(HttpServletRequest request){
//        String token=request.getHeader("token");
//        String userAgent=request.getHeader("user-agent");
//        tokenService.delete(token);
//        //RespBean respBean = RespBean.ok("注销成功!");
//        return JSONObject.toJSONString("注销成功");
//    }
}