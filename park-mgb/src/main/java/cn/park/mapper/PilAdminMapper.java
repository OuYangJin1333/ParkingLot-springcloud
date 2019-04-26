package cn.park.mapper;

import cn.park.pojo.PilAdmin;
import cn.park.pojo.PilAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilAdminMapper {
    int countByExample(PilAdminExample example);

    int deleteByExample(PilAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilAdmin record);

    int insertSelective(PilAdmin record);

    List<PilAdmin> selectByExample(PilAdminExample example);

    PilAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilAdmin record, @Param("example") PilAdminExample example);

    int updateByExample(@Param("record") PilAdmin record, @Param("example") PilAdminExample example);

    int updateByPrimaryKeySelective(PilAdmin record);

    int updateByPrimaryKey(PilAdmin record);
}