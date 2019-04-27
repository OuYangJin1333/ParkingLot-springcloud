package cn.park.service;

import cn.park.pojo.PillDepartment;

import java.util.List;

public interface PildepartmentService {

    public PillDepartment getMasterNode(Integer id);

    public List<PillDepartment> getSlaveNodes(Integer id);

    public List<PillDepartment> getAll();
}
