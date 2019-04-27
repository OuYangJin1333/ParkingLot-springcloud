package cn.park.service.impl;

import cn.park.mapper.PillDepartmentMapper;
import cn.park.pojo.PillDepartment;
import cn.park.service.PildepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PildepartmentServiceImpl implements PildepartmentService {
    @Autowired
    PillDepartmentMapper pillDepartmentMapper;



    @Override
    public PillDepartment getMasterNode(Integer id) {
        return pillDepartmentMapper.getMasterNode(id);
    }

    @Override
    public List<PillDepartment> getSlaveNodes(Integer id) {
        return pillDepartmentMapper.getSlaveNodes(id);
    }

    @Override
    public List<PillDepartment> getAll() {
        return  pillDepartmentMapper.getAllDepartment();
    }
}
