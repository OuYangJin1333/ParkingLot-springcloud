package cn.park.service.impl;

import cn.park.mapper.CityMapper;
import cn.park.pojo.City;
import cn.park.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityMapper cityMapper;

    @Override
    public List<City> findAll() {
        return cityMapper.getAllCity();
    }
}
