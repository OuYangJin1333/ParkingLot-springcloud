package cn.park.mapper;

import cn.park.pojo.PilLog;
import cn.park.pojo.PilLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilLogMapper {
    int countByExample(PilLogExample example);

    int deleteByExample(PilLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilLog record);

    int insertSelective(PilLog record);

    List<PilLog> selectByExample(PilLogExample example);

    PilLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilLog record, @Param("example") PilLogExample example);

    int updateByExample(@Param("record") PilLog record, @Param("example") PilLogExample example);

    int updateByPrimaryKeySelective(PilLog record);

    int updateByPrimaryKey(PilLog record);
}