package cn.park.mapper;

import cn.park.pojo.Charge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ChargeMapper {
    public List<Charge> getChargeByMap(@Param("name") String name, @Param("aname") String aname, @Param("partName") String partName, @Param("carNumber") String carNumber, @Param("payType") String payType, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

}
