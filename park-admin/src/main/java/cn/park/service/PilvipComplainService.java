package cn.park.service;

import cn.park.pojo.PilVipComplain;

import java.util.List;

public interface PilvipComplainService {
    List<PilVipComplain> Allpvc(String content, String name, String star, String end, String status, String username);

    /**
     * 根据当前id，显示当前选中的投诉信息
     */
    PilVipComplain pvc(Integer id);
    /**
     * 处理未处理投诉
     */
    int update(PilVipComplain pilvc);
}
