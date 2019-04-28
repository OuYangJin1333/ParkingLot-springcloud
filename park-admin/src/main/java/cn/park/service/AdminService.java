package cn.park.service;


import cn.park.pojo.Admin;

import java.util.List;

public interface AdminService {
     //遍历所以管理员信息
    public List<Admin> getAdminByMap(
            String username,
            String identification,
            String dname,
            String rname,
            String phone,
            String email,
            String logintime,
            String endtime,
            String address
    );
  /*  int addAdmin(Admin admin);*/

    int  update(Admin admin);

   public  List<Admin> getAllAdmin();

    int add2(Admin admin);
     //根据Id
    public List<Admin> getAdminById(int id);


}
