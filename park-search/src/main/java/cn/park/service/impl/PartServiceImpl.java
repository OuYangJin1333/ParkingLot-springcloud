package cn.park.service.impl;

import cn.park.Repository.PartRepository;
import cn.park.mapper.PartMapper;
import cn.park.pojo.Part;
import cn.park.service.PartService;
import com.alibaba.druid.util.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceImpl implements PartService {
    @Autowired
    PartMapper partMapper;
    @Autowired
    PartRepository partRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public void deleteAll() {
        partRepository.deleteAll();
    }

    @Override
    public void importAll() {
        List<Part> partList=partMapper.findAllPart();
        System.out.println(partList);
        for(Part part:partList){
            partRepository.save(part);
        }
    }

    @Override
    public Page<Part> findListByEs(Integer pageNumber,Integer pageSize,Part part) {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        if(!StringUtils.isEmpty(part.getCname())){
            builder.must(QueryBuilders.matchQuery("cname.keyword", part.getCname()));
        }
        if(!StringUtils.isEmpty(part.getAname())){
            builder.must(QueryBuilders.matchQuery("aname.keyword", part.getAname()));
        }
        if(!StringUtils.isEmpty(part.getPartName())){
            builder.must(QueryBuilders.matchQuery("partName.keyword", part.getPartName()));
        }
        if(!StringUtils.isEmpty(part.getType())){
            builder.must(QueryBuilders.matchQuery("type.keyword", part.getType()));
        }
        PageRequest page = new PageRequest(pageNumber-1, pageSize);
        //构建查询
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        //将搜索条件设置到构建中
        nativeSearchQueryBuilder.withQuery(builder);
        //将分页设置到构建中
        nativeSearchQueryBuilder.withPageable(page);
        //生产NativeSearchQuery
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        Page<Part> chargePage = partRepository.search(query);
        return chargePage;
    }

    @Override
    public List<Part> getAll() {
        return partMapper.findAllPart();
    }

    @Override
    public List<Part> getAllName() {
        return partMapper.findAllName();
    }

    @Override
    public List<Part> getAllType() {
        return partMapper.findAllType();
    }

}
