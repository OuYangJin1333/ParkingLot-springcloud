package cn.park.service.impl;

import cn.park.repository.PilLogRepository;
import cn.park.mapper.PilLogMapper;
import cn.park.pojo.PilLog;
import cn.park.service.PilLogService;
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
@Transactional
public class PilLogServiceImpl implements PilLogService {
    @Autowired
    PilLogMapper pilLogMapper;
    @Autowired
    PilLogRepository pilLogRepository;



    @Override
    public void deleteAll() {
        pilLogRepository.deleteAll();
    }

    @Override
    public void importAll() {
        List<PilLog> pilLogs=pilLogMapper.findAllLog();
        for(PilLog pilLog:pilLogs){
            pilLogRepository.save(pilLog);
        }
    }

    @Override
    public List<PilLog> findByList() {
        return pilLogMapper.findAllLog();
    }

    @Override
    public Page<PilLog> findAllByEs(Integer pageNumber, Integer pageSize, PilLog pilLog) {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        /*if(!StringUtils.isEmpty(pilLog.getAid())){
            builder.must(QueryBuilders.wildcardQuery("aid.keyword","*"+pilLog.getAid()+"*"));
        }*/
        if(!StringUtils.isEmpty(pilLog.getAid())) {
            builder.must(QueryBuilders.prefixQuery("aid.keyword", pilLog.getAid()));
        }
        if(!StringUtils.isEmpty(pilLog.getFunction())){
            builder.must(QueryBuilders.wildcardQuery("function.keyword","*"+pilLog.getFunction()+"*"));
        }
        if(!StringUtils.isEmpty(pilLog.getContent())){
            builder.must(QueryBuilders.wildcardQuery("content.keyword","*"+pilLog.getContent()+"*"));
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
        Page<PilLog> pilLogPage = pilLogRepository.search(query);
        return pilLogPage;
    }

    @Override
    public int delete(Integer id) {
        return pilLogMapper.deletLog(id);
    }

    /**
     * 批量删除
     * @param id
     * @return
     */
    @Override
    public boolean deletAllLog(Integer id) {
        List<PilLog> pilLogs=pilLogMapper.findAllLog();
        for(PilLog pilLog:pilLogs){
            pilLogMapper.deletLog(pilLog.getId());
            return true;
        }
        return false;
    }
}
