package cn.park.service;

import cn.park.pojo.PilAdmin;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "api-admin")
@Headers("Content-Type:application/json")
public interface RedisService {
    @GetMapping("/admin/getCurrentAdminToken")
    String getCurrentAdminToken(@RequestParam("token")String token);
}
