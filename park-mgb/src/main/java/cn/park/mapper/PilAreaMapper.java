package cn.park.mapper;

import cn.park.pojo.PilArea;
import cn.park.pojo.PilAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilAreaMapper {
    int countByExample(PilAreaExample example);

    int deleteByExample(PilAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilArea record);

    int insertSelective(PilArea record);

    List<PilArea> selectByExample(PilAreaExample example);

    PilArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilArea record, @Param("example") PilAreaExample example);

    int updateByExample(@Param("record") PilArea record, @Param("example") PilAreaExample example);

    int updateByPrimaryKeySelective(PilArea record);

    int updateByPrimaryKey(PilArea record);
}