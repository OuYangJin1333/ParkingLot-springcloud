package cn.park.service.impl;

import cn.park.mapper.PilSysWMapper;
import cn.park.mapper.PilSystemWarnMapper;
import cn.park.pojo.PilSystemWarn;
import cn.park.service.PilSystemWarnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PilSystemWarnServiceImpl implements PilSystemWarnService {

    @Autowired
    PilSysWMapper pilSysWMapper;
    @Transactional(readOnly = true)
    @Override
    public List<PilSystemWarn> AllPilSystemWarn() {
        return pilSysWMapper.AllPilSysW();
    }

    @Transactional(readOnly = true)
    @Override
    public PilSystemWarn pilSystemWarn(Integer id) {
        return pilSysWMapper.pilSysW(id);
    }

    @Override
    public List<PilSystemWarn> AllpilSystemWarnfy(String title) {
        return pilSysWMapper.pagingpilSysW(title);
    }

}
