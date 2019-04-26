package cn.park.mapper;

import cn.park.pojo.PilVipUser;
import cn.park.pojo.PilVipUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilVipUserMapper {
    int countByExample(PilVipUserExample example);

    int deleteByExample(PilVipUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilVipUser record);

    int insertSelective(PilVipUser record);

    List<PilVipUser> selectByExample(PilVipUserExample example);

    PilVipUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilVipUser record, @Param("example") PilVipUserExample example);

    int updateByExample(@Param("record") PilVipUser record, @Param("example") PilVipUserExample example);

    int updateByPrimaryKeySelective(PilVipUser record);

    int updateByPrimaryKey(PilVipUser record);
}