package cn.park.mapper;

import cn.park.pojo.PilVipUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PilvuMapper {
    List<PilVipUser> pagingPilvu(@Param("vid")String vid, @Param("name")String name, @Param("sex")String sex,
                                   @Param("identification")String identification, @Param("phone")String phone, @Param("carNumber")String carNumber,
                                   @Param("star")String star, @Param("end") String end);
}
