package cn.park.service.impl;

import cn.park.mapper.PilSystemTypeMapper;
import cn.park.pojo.PilSystemType;
import cn.park.service.PilSystemtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PilSystemtypeServiceImpl implements PilSystemtypeService {

    @Autowired
    PilSystemTypeMapper pilSystemTypeMapper;

    @Transactional(readOnly = true)
    @Override
    public PilSystemType pilSystemType(Integer id) {
        return pilSystemTypeMapper.AllpilSystemType(id);
    }
}
