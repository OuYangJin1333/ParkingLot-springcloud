package cn.park.service.impl;

import cn.park.pojo.Role;
import cn.park.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleService roleService;

    @Override
    public List<Role> getAllRole() {
        return roleService.getAllRole();
    }
}
