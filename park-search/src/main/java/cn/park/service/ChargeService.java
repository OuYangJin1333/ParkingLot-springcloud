package cn.park.service;

import cn.park.pojo.Charge;

import java.util.List;
import java.util.Map;

public interface ChargeService {
    List<Charge> findByParam(String name, String aname,
                             String partName, String carNumber,
                             String payType, String beginTime, String endTime);

    List<Charge> getAllCharge();
}
