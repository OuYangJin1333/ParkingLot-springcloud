package cn.park.service.impl;

import cn.park.mapper.PilVipComplainMapper;
import cn.park.mapper.PilvcMapper;
import cn.park.pojo.PilVipComplain;
import cn.park.service.PilvipComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilVipComplainServiceImpl implements PilvipComplainService {
    @Autowired
    PilvcMapper pilvcMapper;

    @Override
    public List<PilVipComplain> Allpvc(String content, String name, String star, String end, String status, String username) {
        return pilvcMapper.Allpilvp(content,name,star,end,status,username);
    }

    @Override
    public PilVipComplain pvc(Integer id) {
        return pilvcMapper.getpvc(id);
    }

    @Override
    public int update(PilVipComplain pilvc) {
        int xiu=pilvcMapper.updatepvc(pilvc);
        return xiu;
    }
}
