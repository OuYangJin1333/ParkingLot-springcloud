package cn.park.mapper;

import cn.park.pojo.PilInfo;
import cn.park.pojo.PilInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilInfoMapper {
    List<PilInfo> selectAllByNow();

    int countByExample(PilInfoExample example);

    int deleteByExample(PilInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilInfo record);

    int insertSelective(PilInfo record);

    List<PilInfo> selectByExample(PilInfoExample example);

    PilInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilInfo record, @Param("example") PilInfoExample example);

    int updateByExample(@Param("record") PilInfo record, @Param("example") PilInfoExample example);

    int updateByPrimaryKeySelective(PilInfo record);

    int updateByPrimaryKey(PilInfo record);
}