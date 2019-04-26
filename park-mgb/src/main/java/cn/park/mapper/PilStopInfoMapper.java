package cn.park.mapper;

import cn.park.pojo.PilStopInfo;
import cn.park.pojo.PilStopInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilStopInfoMapper {
    int countByExample(PilStopInfoExample example);

    int deleteByExample(PilStopInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilStopInfo record);

    int insertSelective(PilStopInfo record);

    List<PilStopInfo> selectByExample(PilStopInfoExample example);

    PilStopInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilStopInfo record, @Param("example") PilStopInfoExample example);

    int updateByExample(@Param("record") PilStopInfo record, @Param("example") PilStopInfoExample example);

    int updateByPrimaryKeySelective(PilStopInfo record);

    int updateByPrimaryKey(PilStopInfo record);
}