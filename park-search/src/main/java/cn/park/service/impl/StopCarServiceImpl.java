package cn.park.service.impl;

import cn.park.repository.StopCarRepository;
import cn.park.mapper.StopMapper;
import cn.park.pojo.StopCar;
import cn.park.service.StopCarService;
import com.alibaba.druid.util.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class StopCarServiceImpl implements StopCarService {

    @Autowired
    private StopMapper stopMapper;
    @Autowired
    private StopCarRepository stopCarRepository;

    @Override
    public void deleteAll() {
        stopCarRepository.deleteAll();
    }

    @Override
    public void importAll() {
        List<StopCar> stopCarList=stopMapper.findAllStop();
        for(StopCar stopCar:stopCarList){
            stopCarRepository.save(stopCar);
        }
    }

    @Override
    public List<StopCar> findAllStop() {
        return stopMapper.findAllStop();
    }

    @Override
    public Page<StopCar> findAllByEs(Integer pageNumber, Integer pageSize, StopCar stopCar) {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        if(!StringUtils.isEmpty(stopCar.getCname())){
            builder.must(QueryBuilders.matchQuery("cname.keyword",stopCar.getCname()));
        }
        if(!StringUtils.isEmpty(stopCar.getAname())){
            builder.must(QueryBuilders.matchQuery("aname.keyword",stopCar.getAname()));
        }
        if(!StringUtils.isEmpty(stopCar.getPartName())){
            builder.must(QueryBuilders.matchQuery("partName.keyword",stopCar.getPartName()));
        }
        if(!StringUtils.isEmpty(stopCar.getCarNumber())){
            builder.must(QueryBuilders.wildcardQuery("carNumber.keyword","*"+stopCar.getCarNumber()+"*"));
        }
        if(!StringUtils.isEmpty(stopCar.getVid())){
            builder.must(QueryBuilders.wildcardQuery("vid.keyword","*"+stopCar.getVid()+"*"));
        }
        PageRequest page = new PageRequest(pageNumber-1, pageSize);
        //构建查询
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        //将搜索条件设置到构建中
        nativeSearchQueryBuilder.withQuery(builder);
        //将分页设置到构建
        nativeSearchQueryBuilder.withPageable(page);
        //生产NativeSearchQuery
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        Page<StopCar> carPage = stopCarRepository.search(query);
        return carPage;
    }
}
