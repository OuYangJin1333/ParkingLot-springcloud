package cn.park.service;

import cn.park.pojo.Pildepartment;

import java.util.List;

public interface PildepartmentService {

    public Pildepartment getMasterNode(Integer id);

    public List<Pildepartment> getSlaveNodes(Integer id);

    public List<Pildepartment> getAll();
}
