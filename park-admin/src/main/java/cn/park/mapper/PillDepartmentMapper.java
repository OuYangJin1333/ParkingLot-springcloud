package cn.park.mapper;

import cn.park.pojo.PillDepartment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface PillDepartmentMapper {

    public PillDepartment getMasterNode(Integer id);

    public List<PillDepartment> getSlaveNodes(Integer id);

    public  List<PillDepartment>  getAllDepartment();
}
