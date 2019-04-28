package cn.park.service.impl;

import cn.park.mapper.PiladminroleMapper;
import cn.park.service.PiladminroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiladminroleServiceImpl implements PiladminroleService {
         @Autowired
         PiladminroleMapper piladminroleMapper;

    @Override
    public int updateAdminRole(int aid, int rid) {
        return piladminroleMapper.update(aid,rid);
    }

    @Override
    public int addAdminRole(int aid,int rid) {

        return piladminroleMapper.add(aid,rid);
    }
}
