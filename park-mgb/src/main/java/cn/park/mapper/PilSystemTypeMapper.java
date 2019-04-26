package cn.park.mapper;

import cn.park.pojo.PilSystemType;
import cn.park.pojo.PilSystemTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilSystemTypeMapper {
    int countByExample(PilSystemTypeExample example);

    int deleteByExample(PilSystemTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilSystemType record);

    int insertSelective(PilSystemType record);

    List<PilSystemType> selectByExample(PilSystemTypeExample example);

    PilSystemType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilSystemType record, @Param("example") PilSystemTypeExample example);

    int updateByExample(@Param("record") PilSystemType record, @Param("example") PilSystemTypeExample example);

    int updateByPrimaryKeySelective(PilSystemType record);

    int updateByPrimaryKey(PilSystemType record);

     PilSystemType AllpilSystemType(@Param("id") Integer id);
}