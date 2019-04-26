package cn.park.mapper;

import cn.park.pojo.PilInfoBigcharge;
import cn.park.pojo.PilInfoBigchargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilInfoBigchargeMapper {
    int countByExample(PilInfoBigchargeExample example);

    int deleteByExample(PilInfoBigchargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilInfoBigcharge record);

    int insertSelective(PilInfoBigcharge record);

    List<PilInfoBigcharge> selectByExample(PilInfoBigchargeExample example);

    PilInfoBigcharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilInfoBigcharge record, @Param("example") PilInfoBigchargeExample example);

    int updateByExample(@Param("record") PilInfoBigcharge record, @Param("example") PilInfoBigchargeExample example);

    int updateByPrimaryKeySelective(PilInfoBigcharge record);

    int updateByPrimaryKey(PilInfoBigcharge record);
}