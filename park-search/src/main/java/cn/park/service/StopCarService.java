package cn.park.service;

import cn.park.pojo.StopCar;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StopCarService {
    public void deleteAll();

    public void importAll();

    public List<StopCar> findAllStop();

    public Page<StopCar> findAllByEs(Integer pageNumber, Integer pageSize, StopCar stopCar);
}
