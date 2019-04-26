package cn.park.mapper;

import cn.park.pojo.PilVipComplain;
import cn.park.pojo.PilVipComplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilVipComplainMapper {
    int countByExample(PilVipComplainExample example);

    int deleteByExample(PilVipComplainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilVipComplain record);

    int insertSelective(PilVipComplain record);

    List<PilVipComplain> selectByExampleWithBLOBs(PilVipComplainExample example);

    List<PilVipComplain> selectByExample(PilVipComplainExample example);

    PilVipComplain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilVipComplain record, @Param("example") PilVipComplainExample example);

    int updateByExampleWithBLOBs(@Param("record") PilVipComplain record, @Param("example") PilVipComplainExample example);

    int updateByExample(@Param("record") PilVipComplain record, @Param("example") PilVipComplainExample example);

    int updateByPrimaryKeySelective(PilVipComplain record);

    int updateByPrimaryKeyWithBLOBs(PilVipComplain record);

    int updateByPrimaryKey(PilVipComplain record);
}