package cn.park.mapper;

import cn.park.pojo.PilDepartment;
import cn.park.pojo.PilDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilDepartmentMapper {
    int countByExample(PilDepartmentExample example);

    int deleteByExample(PilDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilDepartment record);

    int insertSelective(PilDepartment record);

    List<PilDepartment> selectByExample(PilDepartmentExample example);

    PilDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilDepartment record, @Param("example") PilDepartmentExample example);

    int updateByExample(@Param("record") PilDepartment record, @Param("example") PilDepartmentExample example);

    int updateByPrimaryKeySelective(PilDepartment record);

    int updateByPrimaryKey(PilDepartment record);
}