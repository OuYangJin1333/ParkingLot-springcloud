package cn.park.service;

import cn.park.pojo.PilSystem;

import java.util.List;

public interface PilSystemService {
    /**
     * 根据当前权限显示公告
     * @param id
     * @return
     */
    List<PilSystem> pilSystemList(Integer id);

    /**
     * 根据当前id查询公告信息
     * @param id
     * @return
     */
    PilSystem pilSystem(Integer id);
    /**
     * 标题分页查询
     */
    List<PilSystem> fenyepilSystem(Integer tid,String title);
 }
