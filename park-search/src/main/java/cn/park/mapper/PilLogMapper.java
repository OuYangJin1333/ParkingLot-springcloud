package cn.park.mapper;

import cn.park.pojo.PilLog;

import java.util.List;

public interface PilLogMapper {
    public List<PilLog> findAllLog();

    public int deletLog(Integer id);
}
