package cn.park.mapper;

import cn.park.pojo.PilMenu;
import cn.park.pojo.PilMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilMenuMapper {
    int countByExample(PilMenuExample example);

    int deleteByExample(PilMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilMenu record);

    int insertSelective(PilMenu record);

    List<PilMenu> selectByExample(PilMenuExample example);

    PilMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilMenu record, @Param("example") PilMenuExample example);

    int updateByExample(@Param("record") PilMenu record, @Param("example") PilMenuExample example);

    int updateByPrimaryKeySelective(PilMenu record);

    int updateByPrimaryKey(PilMenu record);
}