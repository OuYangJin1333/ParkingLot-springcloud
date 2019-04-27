package cn.park.mapper;

import cn.park.pojo.StopCar;

import java.util.List;

public interface StopMapper {
    List<StopCar> findAllStop();
}
