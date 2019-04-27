package cn.park.Repository;

import cn.park.pojo.StopCar;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StopCarRepository extends ElasticsearchRepository<StopCar,Integer> {
}
