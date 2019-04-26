package cn.park.Repository;
import cn.park.pojo.Part;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PartRepository extends ElasticsearchRepository<Part,Integer> {
}
