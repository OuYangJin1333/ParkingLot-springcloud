package cn.park.mapper;

import cn.park.pojo.Pildepartment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PildepartmentMapper {

    public Pildepartment getMasterNode(Integer id);

    public List<Pildepartment> getSlaveNodes(Integer id);

    public  List<Pildepartment>  getAllDepartment();
}
