package cn.park.service;

import cn.park.pojo.PilSystemWarn;

import java.util.List;

public interface PilSystemWarnService {

    List<PilSystemWarn> AllPilSystemWarn();

    PilSystemWarn pilSystemWarn(Integer id);

    List<PilSystemWarn> AllpilSystemWarnfy(String title);
}
