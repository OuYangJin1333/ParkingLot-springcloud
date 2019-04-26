package cn.park.controller;

import cn.park.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class PilAdminController {
    @Autowired
    RedisService redisService;

    @GetMapping("/getCurrentAdminToken")
    public String getCurrentAdminToken(@RequestParam("token") String token){
        return redisService.get(token);
    }
}
