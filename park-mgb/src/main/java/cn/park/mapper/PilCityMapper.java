package cn.park.mapper;

import cn.park.pojo.PilCity;
import cn.park.pojo.PilCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilCityMapper {
    int countByExample(PilCityExample example);

    int deleteByExample(PilCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilCity record);

    int insertSelective(PilCity record);

    List<PilCity> selectByExample(PilCityExample example);

    PilCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilCity record, @Param("example") PilCityExample example);

    int updateByExample(@Param("record") PilCity record, @Param("example") PilCityExample example);

    int updateByPrimaryKeySelective(PilCity record);

    int updateByPrimaryKey(PilCity record);
}