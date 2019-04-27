package cn.park.Repository;

import cn.park.pojo.PilLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PilLogRepository extends ElasticsearchRepository<PilLog,Integer> {
}
