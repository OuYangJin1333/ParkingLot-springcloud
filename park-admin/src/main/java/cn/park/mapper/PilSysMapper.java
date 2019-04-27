package cn.park.mapper;

import cn.park.pojo.PilSystem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PilSysMapper {
    /**
     * 根据当前权限进行公告显示
     * @param tid
     * @return
     */
    List<PilSystem> pilSyslist(@Param("tid")Integer tid);

    /**
     * 根据公告id查询详细信息
     * @param id
     * @return
     */
    PilSystem gepilSys(@Param("id")Integer id);

    /**
     * 根据权限以及标题进行分页查询
     * @param tid
     * @param title
     * @return
     */
    List<PilSystem> pagingpilSys(@Param("tid") Integer tid,@Param("title")String title);
}
