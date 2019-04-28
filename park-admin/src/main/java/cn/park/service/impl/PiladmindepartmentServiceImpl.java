package cn.park.service.impl;

import cn.park.mapper.PiladmindepartmentMapper;
import cn.park.service.PiladmindepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiladmindepartmentServiceImpl  implements PiladmindepartmentService {
    @Autowired
    PiladmindepartmentMapper piladmindepartmentMapper;

    @Override
    public int updateAdminDepartment(int aid, int did) {
        return piladmindepartmentMapper.update(aid,did);
    }

    @Override
    public int addAdminDepartment(int aid,int did) {
        return piladmindepartmentMapper.add(aid,did);
    }
}
