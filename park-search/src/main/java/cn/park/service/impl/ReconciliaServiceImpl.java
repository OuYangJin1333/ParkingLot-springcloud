package cn.park.service.impl;

import cn.park.Repository.ReconciliaRepository;
import cn.park.mapper.ReconciliaMapper;
import cn.park.pojo.Reconcilia;
import cn.park.service.ReconciliaService;
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
public class ReconciliaServiceImpl implements ReconciliaService {
    @Autowired
    private ReconciliaMapper reconciliaMapper;
    @Autowired
    private ReconciliaRepository reconciliaRepository;



    @Override
    public void deleteAll() {
        reconciliaRepository.deleteAll();
    }

    @Override
    public void importAll() {
        List<Reconcilia> reconcilias=reconciliaMapper.getAllReconcilia();
        for(Reconcilia reconcilia : reconcilias){
            reconciliaRepository.save(reconcilia);
        }
        System.out.print(reconcilias);
    }

    @Override
    public List<Reconcilia> findAllReconcilia() {
        return reconciliaMapper.getAllReconcilia();
    }

    @Override
    public Page<Reconcilia> findAllByEs(Integer pageNumber, Integer pageSize, Reconcilia reconcilia) {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        if(!StringUtils.isEmpty(reconcilia.getCname())){
            builder.must(QueryBuilders.matchQuery("cname.keyword",reconcilia.getCname()));
        }
        if(!StringUtils.isEmpty(reconcilia.getAname())){
            builder.must(QueryBuilders.matchQuery("aname.keyword",reconcilia.getAname()));
        }
        if(!StringUtils.isEmpty(reconcilia.getPname())){
            builder.must(QueryBuilders.matchQuery("pname.keyword",reconcilia.getPname()));
        }
        if(!StringUtils.isEmpty(reconcilia.getPayType())){
            builder.must(QueryBuilders.wildcardQuery("payType.keyword","*"+reconcilia.getPayType()+"*"));
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
        Page<Reconcilia> carPage = reconciliaRepository.search(query);
        return carPage;

    }
}
