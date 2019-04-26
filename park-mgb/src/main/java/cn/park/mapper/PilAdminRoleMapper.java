package cn.park.mapper;

import cn.park.pojo.PilAdminRole;
import cn.park.pojo.PilAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilAdminRoleMapper {
    int countByExample(PilAdminRoleExample example);

    int deleteByExample(PilAdminRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilAdminRole record);

    int insertSelective(PilAdminRole record);

    List<PilAdminRole> selectByExample(PilAdminRoleExample example);

    PilAdminRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilAdminRole record, @Param("example") PilAdminRoleExample example);

    int updateByExample(@Param("record") PilAdminRole record, @Param("example") PilAdminRoleExample example);

    int updateByPrimaryKeySelective(PilAdminRole record);

    int updateByPrimaryKey(PilAdminRole record);
}