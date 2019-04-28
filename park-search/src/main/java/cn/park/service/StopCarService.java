package cn.park.service;

import cn.park.pojo.StopCar;
import org.springframework.data.domain.Page;

import java.util.List;


public interface StopCarService {
    public void deleteAll();

    public void importAll();

    /**
     * 查询所有
     * @return
     */
    public List<StopCar> findAllStop();

    /**
     * 条件查询
     * @param pageNumber
     * @param pageSize
     * @param stopCar
     * @return
     */
    public Page<StopCar> findAllByEs(Integer pageNumber, Integer pageSize, StopCar stopCar);
}
