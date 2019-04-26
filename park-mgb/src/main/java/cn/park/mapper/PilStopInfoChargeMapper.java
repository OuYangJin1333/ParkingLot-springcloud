package cn.park.mapper;

import cn.park.pojo.PilStopInfoCharge;
import cn.park.pojo.PilStopInfoChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilStopInfoChargeMapper {
    int countByExample(PilStopInfoChargeExample example);

    int deleteByExample(PilStopInfoChargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilStopInfoCharge record);

    int insertSelective(PilStopInfoCharge record);

    List<PilStopInfoCharge> selectByExample(PilStopInfoChargeExample example);

    PilStopInfoCharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilStopInfoCharge record, @Param("example") PilStopInfoChargeExample example);

    int updateByExample(@Param("record") PilStopInfoCharge record, @Param("example") PilStopInfoChargeExample example);

    int updateByPrimaryKeySelective(PilStopInfoCharge record);

    int updateByPrimaryKey(PilStopInfoCharge record);
}