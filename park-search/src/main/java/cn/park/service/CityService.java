package cn.park.service;

import cn.park.pojo.City;

import java.util.List;

public interface CityService {
    /**
     * 查询所有城市
     * @return
     */
    List<City> findAll();
}
