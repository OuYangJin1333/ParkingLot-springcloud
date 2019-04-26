package cn.park.mapper;

import cn.park.pojo.PilMenuRole;
import cn.park.pojo.PilMenuRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilMenuRoleMapper {
    int countByExample(PilMenuRoleExample example);

    int deleteByExample(PilMenuRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilMenuRole record);

    int insertSelective(PilMenuRole record);

    List<PilMenuRole> selectByExample(PilMenuRoleExample example);

    PilMenuRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilMenuRole record, @Param("example") PilMenuRoleExample example);

    int updateByExample(@Param("record") PilMenuRole record, @Param("example") PilMenuRoleExample example);

    int updateByPrimaryKeySelective(PilMenuRole record);

    int updateByPrimaryKey(PilMenuRole record);
}