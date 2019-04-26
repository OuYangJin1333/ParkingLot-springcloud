package cn.park.mapper;

import cn.park.pojo.PilInfoSmallcharge;
import cn.park.pojo.PilInfoSmallchargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilInfoSmallchargeMapper {
    int countByExample(PilInfoSmallchargeExample example);

    int deleteByExample(PilInfoSmallchargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilInfoSmallcharge record);

    int insertSelective(PilInfoSmallcharge record);

    List<PilInfoSmallcharge> selectByExample(PilInfoSmallchargeExample example);

    PilInfoSmallcharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilInfoSmallcharge record, @Param("example") PilInfoSmallchargeExample example);

    int updateByExample(@Param("record") PilInfoSmallcharge record, @Param("example") PilInfoSmallchargeExample example);

    int updateByPrimaryKeySelective(PilInfoSmallcharge record);

    int updateByPrimaryKey(PilInfoSmallcharge record);
}