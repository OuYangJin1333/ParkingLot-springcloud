package cn.park.mapper;

import cn.park.pojo.PilSystemWarn;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PilSysWMapper {
    /**
     * 查询所有告警
     * @return
     */
    List<PilSystemWarn> AllPilSysW();

    /**
     * 根据id查询告警详细信息
     * @param id
     * @return
     */
    PilSystemWarn pilSysW(@Param("id") Integer id);

    /**
     * 根据标题进行查询
     * @param title
     * @return
     */
    List<PilSystemWarn> pagingpilSysW(@Param("title")String title);
}
