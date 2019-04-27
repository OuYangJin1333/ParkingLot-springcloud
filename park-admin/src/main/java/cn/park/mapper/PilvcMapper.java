package cn.park.mapper;

import cn.park.pojo.PilVipComplain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PilvcMapper {
    /**
     * 根据条件进行查询
     * @param content
     * @param name
     * @param star
     * @param end
     * @param status
     * @param username
     * @return
     */
    List<PilVipComplain> Allpilvp(@Param("content")String content, @Param("name")String name, @Param("star")String star, @Param("end")String end, @Param("status")String status, @Param("username")String username);
    /**
     * 根据当前id，显示当前选中的投诉信息
     */
    PilVipComplain getpvc(@Param("id") Integer id);
    /**
     * 处理未处理投诉
     */
    int updatepvc(PilVipComplain pilvc);
}
