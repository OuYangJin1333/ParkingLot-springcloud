package cn.park.service;

import cn.park.pojo.Role;

import java.util.List;

public interface RoleService {
    //根据角色名查找信息
    List<Role> getAllRole(String rname);
    //遍历所有角色
    List<Role> getRole();
    int add(Role role);
    int delete(Integer id);
}
