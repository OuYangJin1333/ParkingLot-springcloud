package cn.park.service;

import cn.park.pojo.PilInfo;

import java.util.List;

public interface PilInfoService {
    List<PilInfo> findAllPilInfo(Integer pageIndex, Integer pageSize);
    void flushCount();
    void addStopInfo();
}
