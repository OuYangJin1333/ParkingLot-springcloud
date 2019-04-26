package cn.park.service.impl;

import cn.park.mapper.AreaMapper;
import cn.park.pojo.Area;
import cn.park.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaMapper areaMapper;

    @Override
    public List<Area> findAllArea() {
        return areaMapper.getAllArea();
    }
}
