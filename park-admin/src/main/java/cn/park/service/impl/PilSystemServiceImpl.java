package cn.park.service.impl;

import cn.park.mapper.PilSysMapper;
import cn.park.pojo.PilSystem;
import cn.park.service.PilSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PilSystemServiceImpl implements PilSystemService{
    @Autowired
    PilSysMapper pilSysMapper;
    @Override
    public List<PilSystem> pilSystemList(Integer id) {
        return pilSysMapper.pilSyslist(id);
    }

    @Override
    public PilSystem pilSystem(Integer id) {
        return pilSysMapper.gepilSys(id);
    }

    @Override
    public List<PilSystem> fenyepilSystem(Integer tid, String title) {
        return pilSysMapper.pagingpilSys(tid,title);
    }
}
