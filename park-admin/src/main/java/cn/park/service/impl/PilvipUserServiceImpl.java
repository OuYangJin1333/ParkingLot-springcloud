package cn.park.service.impl;

import cn.park.mapper.PilVipUserMapper;
import cn.park.pojo.PilVipUser;
import cn.park.service.PilvipUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilvipUserServiceImpl implements PilvipUserService {
//    @Autowired
//    PilVipUserMapper pilVipUserMapper;
    @Override
    public List<PilVipUser> AllPvu(String vid, String name, String sex, String identification, String phone, String carNumber, String star, String end) {
//        return pilVipUserMapper.getPilVipUser(vid,name,sex,identification,phone,carNumber,star,end);
        return null;
    }
}
