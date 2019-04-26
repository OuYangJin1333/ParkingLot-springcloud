package cn.park.service;

import cn.park.pojo.PilSystem;

import java.util.List;

public interface PilSystemAdminService {
    List<PilSystem> getAllListByPage(String title, String publisher, String status, String beginTime, String endTime, Integer pageIndex, Integer pageSize);
    int updatePilSystemStatus(Integer id);
    int addPilSystem(PilSystem pilSystem);
    int deltePilSystemById(Integer id);
    PilSystem getPilSystemById(Integer id);
}
