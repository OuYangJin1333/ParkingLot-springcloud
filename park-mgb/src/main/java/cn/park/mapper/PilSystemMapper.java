package cn.park.mapper;

import cn.park.pojo.PilSystem;
import cn.park.pojo.PilSystemExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PilSystemMapper {
    int countByExample(PilSystemExample example);

    int deleteByExample(PilSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilSystem record);

    int insertSelective(PilSystem record);

    List<PilSystem> selectByExampleWithBLOBs(PilSystemExample example);

    List<PilSystem> selectByExample(PilSystemExample example);

    PilSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilSystem record, @Param("example") PilSystemExample example);

    int updateByExampleWithBLOBs(@Param("record") PilSystem record, @Param("example") PilSystemExample example);

    int updateByExample(@Param("record") PilSystem record, @Param("example") PilSystemExample example);

    int updateByPrimaryKeySelective(PilSystem record);

    int updateByPrimaryKeyWithBLOBs(PilSystem record);

    int updateByPrimaryKey(PilSystem record);

    List<PilSystem> pilSystemslist(@Param("tid") Integer tid);


    PilSystem gepilSystem(@Param("id") Integer id);

    List<PilSystem> pilSystemsListByParamAndAll(Map param);

    int updateStatusById(Integer id);
}