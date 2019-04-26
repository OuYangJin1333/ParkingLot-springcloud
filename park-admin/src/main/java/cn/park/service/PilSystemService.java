package cn.park.service;

import cn.park.pojo.PilSystem;

import java.util.List;

public interface PilSystemService {
    List<PilSystem> pilSystemList(Integer id);

    PilSystem pilSystem(Integer id);
 }
