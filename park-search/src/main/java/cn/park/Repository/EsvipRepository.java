package cn.park.Repository;

import cn.park.pojo.PilVipUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsvipRepository extends ElasticsearchRepository<PilVipUser, Integer> {

}
