package cn.park.service;

import cn.park.pojo.Menu;
import cn.park.pojo.PilMenu;
import cn.park.utils.FeignIntercepter;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@Headers("Content-Type:application/json")
@FeignClient(name = "api-auth", configuration = FeignIntercepter.class)
public interface MenuService {
    @GetMapping("/config/sysmenu")
    List<Menu> userMenus();
}
