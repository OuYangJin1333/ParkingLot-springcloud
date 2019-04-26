package cn.park.service;

import cn.park.pojo.PilVipUser;

import java.util.List;

public interface PilvipUserService {
    List<PilVipUser> AllPvu(String vid, String name, String sex, String identification, String phone, String carNumber, String star, String end);
}
