package cn.park.controller;

import cn.park.pojo.Menu;
import cn.park.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "动态菜单")
@RequestMapping("/config")
public class MenuController {
    @Autowired
    MenuService menuService;
    @ApiOperation(value = "查询菜单",notes = "根据ID查询菜单")
    @RequestMapping("/sysmenu")
    public List<Menu> sysmenu() {
        return menuService.getMenusByAdminId();
    }
}
