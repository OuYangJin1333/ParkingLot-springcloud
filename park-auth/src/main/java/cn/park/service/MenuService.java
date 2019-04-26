package cn.park.service;


import cn.park.mapper.MenuMapper;
import cn.park.pojo.Menu;
import cn.park.utils.AdminUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {
    @Autowired
    MenuMapper menuMapper;


    //获取全部菜单
    public List<Menu> getAllMenu(){
        return menuMapper.getAllMenu();
    }

    /**/
    public List<Menu> getMenusByAdminId() {
        System.err.println("用户ID："+AdminUtils.getCurrentHr().getId());
        return menuMapper.getMenusByAdminId(AdminUtils.getCurrentHr().getId());
    }

}
