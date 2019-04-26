package cn.park.mapper;

import cn.park.pojo.PilAccounts;
import cn.park.pojo.PilAccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PilAccountsMapper {
    int countByExample(PilAccountsExample example);

    int deleteByExample(PilAccountsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PilAccounts record);

    int insertSelective(PilAccounts record);

    List<PilAccounts> selectByExample(PilAccountsExample example);

    PilAccounts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PilAccounts record, @Param("example") PilAccountsExample example);

    int updateByExample(@Param("record") PilAccounts record, @Param("example") PilAccountsExample example);

    int updateByPrimaryKeySelective(PilAccounts record);

    int updateByPrimaryKey(PilAccounts record);
}