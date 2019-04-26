package cn.park.service;


import cn.park.pojo.Admin;

import java.util.Date;
import java.util.List;

public interface AdminService {
    public List<Admin> getAdminByMap(
            String username,
            String identification,
            String dname,
            String rname,
            String phone,
            String email,
            Date logintime,
            Date endtime,
            String address
    );
    int addAdmin(Admin admin);

    int  update(Admin admin);
}
