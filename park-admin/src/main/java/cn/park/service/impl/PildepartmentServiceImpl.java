package cn.park.service.impl;

import cn.park.mapper.PildepartmentMapper;
import cn.park.pojo.Pildepartment;
import cn.park.service.PildepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PildepartmentServiceImpl implements PildepartmentService {
    @Autowired
    PildepartmentMapper pildepartmentMapper;



    @Override
    public Pildepartment getMasterNode(Integer id) {
        return pildepartmentMapper.getMasterNode(id);
    }

    @Override
    public List<Pildepartment> getSlaveNodes(Integer id) {
        return pildepartmentMapper.getSlaveNodes(id);
    }

    @Override
    public List<Pildepartment> getAll() {
        return  pildepartmentMapper.getAllDepartment();
    }
}
