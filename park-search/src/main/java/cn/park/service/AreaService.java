package cn.park.service;

import cn.park.pojo.Area;

import java.util.List;

public interface AreaService {
    /**
     * 查询所有区域
     * @return
     */
    List<Area> findAllArea();
}
