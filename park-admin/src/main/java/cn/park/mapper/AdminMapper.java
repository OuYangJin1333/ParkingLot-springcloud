package cn.park.mapper;


import cn.park.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface AdminMapper {
    //条件查询
public List<Admin> getAdminByMap(
        @Param("username") String username,
        @Param("identification") String identification,
        @Param("dname") String dname,
        @Param("rname") String rname,
        @Param("phone") String phone,
        @Param("email") String email,
        @Param("logintime") Date logintime,
        @Param("endtime") Date endtime,
        @Param("address") String address);

  int  addAdmin(Admin admin);

  int update(Admin admin);
}
