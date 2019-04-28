package cn.park.service;

import cn.park.pojo.Charge;

import java.util.List;

/**
 * 收费查询
 */
public interface ChargeService {
    /**
     * 分页条件查询
     * @param name
     * @param aname
     * @param partName
     * @param carNumber
     * @param payType
     * @param beginTime
     * @param endTime
     * @return
     */
    List<Charge> findByParam(String name, String aname,
                             String partName, String carNumber,
                             String payType, String beginTime, String endTime);

    /**
     * 查询所有
     * @return
     */
    List<Charge> getAllCharge();
}
