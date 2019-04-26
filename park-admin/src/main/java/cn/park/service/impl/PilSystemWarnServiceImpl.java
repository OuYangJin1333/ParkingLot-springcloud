package cn.park.service.impl;

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
    PilSystemWarnMapper pilSystemWarnMapper;
    @Transactional(readOnly = true)
    @Override
    public List<PilSystemWarn> AllPilSystemWarn() {
        return pilSystemWarnMapper.AllPilSystemWarn();
    }

    @Transactional(readOnly = true)
    @Override
    public PilSystemWarn pilSystemWarn(Integer id) {
        return pilSystemWarnMapper.pilSystemWarn(id);
    }
}
