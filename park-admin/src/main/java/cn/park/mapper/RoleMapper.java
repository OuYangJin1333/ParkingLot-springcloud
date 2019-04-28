package cn.park.mapper;

import cn.park.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

    List<Role> getAllRole(@Param("rname") String rname);    //查询所有角色

    List<Role>   getRole();     //角色管理信息

    int add(Role role);           //新增角色

    int  delete(Integer id);      //删除角色


}
