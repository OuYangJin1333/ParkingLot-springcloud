package cn.park.mapper;
import cn.park.pojo.Pildepartment;

import java.util.List;

public interface PildepartmentMapper {

    public  Pildepartment getMasterNode(Integer id);

    public List<Pildepartment> getSlaveNodes(Integer id);

    public  List<Pildepartment>  getAllDepartment();
}
