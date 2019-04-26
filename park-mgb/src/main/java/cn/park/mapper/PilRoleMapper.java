package cn.park.mapper;

import cn.park.pojo.PilRole;
import cn.park.pojo.PilRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilRoleMapper {
    int countByExample(PilRoleExample example);

    int deleteByExample(PilRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilRole record);

    int insertSelective(PilRole record);

    List<PilRole> selectByExample(PilRoleExample example);

    PilRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilRole record, @Param("example") PilRoleExample example);

    int updateByExample(@Param("record") PilRole record, @Param("example") PilRoleExample example);

    int updateByPrimaryKeySelective(PilRole record);

    int updateByPrimaryKey(PilRole record);
}