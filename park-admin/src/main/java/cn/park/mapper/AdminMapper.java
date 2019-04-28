package cn.park.mapper;


import cn.park.pojo.Admin;
import org.apache.ibatis.annotations.Param;

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
        @Param("logintime") String logintime,
        @Param("endtime") String endtime,
        @Param("address") String address);

 /* int  addAdmin(Admin admin);*/

 /*
 * 修改管理员用户
 * */
  int update(Admin admin);

    /**
     * 添加管理员用户
     * */
    int add2(Admin admin);

     /**
      * 根据id查询信息
      * */
   public List<Admin> getAdminById(@Param("id") int id);



}
