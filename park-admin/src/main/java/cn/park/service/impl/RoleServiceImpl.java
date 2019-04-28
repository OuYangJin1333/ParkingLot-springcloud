package cn.park.service.impl;

import cn.park.mapper.RoleMapper;
import cn.park.pojo.Role;
import cn.park.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
      @Autowired
      RoleMapper roleMapper;

    @Override
    public List<Role> getAllRole(String rname) {
        return  roleMapper.getAllRole(rname);
    }

    @Override
    public List<Role> getRole() {
        return roleMapper.getRole() ;
    }

    @Override
    public int add(Role role) {
        return roleMapper.add(role);
    }

    @Override
    public int delete(Integer id) {
        return roleMapper.delete(id);
    }
}
