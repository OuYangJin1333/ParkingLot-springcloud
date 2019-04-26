package cn.park.mapper;


import cn.park.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    //获取菜单资源
    List<Menu> getAllMenu();

    //根据用户ID查询菜单
    List<Menu> getMenusByAdminId(int id);
}
