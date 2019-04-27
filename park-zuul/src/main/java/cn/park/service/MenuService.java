package cn.park.service;

import cn.park.pojo.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@Headers("Content-Type:application/json")
@FeignClient(name = "api-auth")
public interface MenuService {
    @GetMapping("/config/sysmenu")
    public List<Menu> userMenus();
}
