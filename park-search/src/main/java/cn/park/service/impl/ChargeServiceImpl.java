package cn.park.service.impl;

import cn.park.mapper.ChargeMapper;
import cn.park.pojo.Charge;
import cn.park.service.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true)
public class ChargeServiceImpl implements ChargeService{
    @Autowired
    private ChargeMapper chargeMapper;

    @Override
    public List<Charge> findByParam(String name, String aname, String partName, String carNumber, String payType, String beginTime, String endTime) {
        return chargeMapper.getChargeByMap(name, aname, partName, carNumber, payType, beginTime, endTime);
    }

    @Override
    public List<Charge> getAllCharge() {
        return chargeMapper.getChargeByMap(null,null,null,null,null,null,null);
    }
}
