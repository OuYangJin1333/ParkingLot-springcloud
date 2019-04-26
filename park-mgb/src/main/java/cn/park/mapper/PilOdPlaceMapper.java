package cn.park.mapper;

import cn.park.pojo.PilOdPlace;
import cn.park.pojo.PilOdPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilOdPlaceMapper {
    int countByExample(PilOdPlaceExample example);

    int deleteByExample(PilOdPlaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilOdPlace record);

    int insertSelective(PilOdPlace record);

    List<PilOdPlace> selectByExample(PilOdPlaceExample example);

    PilOdPlace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilOdPlace record, @Param("example") PilOdPlaceExample example);

    int updateByExample(@Param("record") PilOdPlace record, @Param("example") PilOdPlaceExample example);

    int updateByPrimaryKeySelective(PilOdPlace record);

    int updateByPrimaryKey(PilOdPlace record);
}