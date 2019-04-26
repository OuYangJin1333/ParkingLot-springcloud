package cn.park.mapper;

import cn.park.pojo.PilNewPlace;
import cn.park.pojo.PilNewPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilNewPlaceMapper {
    int addPilNewPlaceByPidList(Integer pid);
    int countByExample(PilNewPlaceExample example);

    int deleteByExample(PilNewPlaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilNewPlace record);

    int insertSelective(PilNewPlace record);

    List<PilNewPlace> selectByExample(PilNewPlaceExample example);

    PilNewPlace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilNewPlace record, @Param("example") PilNewPlaceExample example);

    int updateByExample(@Param("record") PilNewPlace record, @Param("example") PilNewPlaceExample example);

    int updateByPrimaryKeySelective(PilNewPlace record);

    int updateByPrimaryKey(PilNewPlace record);
}