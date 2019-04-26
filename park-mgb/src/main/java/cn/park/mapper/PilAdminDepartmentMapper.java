package cn.park.mapper;

import cn.park.pojo.PilAdminDepartment;
import cn.park.pojo.PilAdminDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilAdminDepartmentMapper {
    int countByExample(PilAdminDepartmentExample example);

    int deleteByExample(PilAdminDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilAdminDepartment record);

    int insertSelective(PilAdminDepartment record);

    List<PilAdminDepartment> selectByExample(PilAdminDepartmentExample example);

    PilAdminDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilAdminDepartment record, @Param("example") PilAdminDepartmentExample example);

    int updateByExample(@Param("record") PilAdminDepartment record, @Param("example") PilAdminDepartmentExample example);

    int updateByPrimaryKeySelective(PilAdminDepartment record);

    int updateByPrimaryKey(PilAdminDepartment record);
}