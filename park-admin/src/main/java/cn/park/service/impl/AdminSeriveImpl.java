package cn.park.service.impl;

import cn.park.mapper.AdminMapper;
import cn.park.pojo.Admin;
import cn.park.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminSeriveImpl implements AdminService {
     @Autowired
     AdminMapper adminMapper;

  /*  @Override
    public int addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }*/

    @Override
    public int update( Admin admin) {
        return adminMapper.update(admin);
    }


    @Override
    public List<Admin> getAllAdmin() {
        return adminMapper.getAdminByMap(null,null,null,null,null,null,null,null,null);
    }

    @Override
    public List<Admin> getAdminByMap(String username, String identification, String dname, String rname, String phone, String email, String logintime, String endtime, String address) {
        return adminMapper.getAdminByMap(username,identification,dname,rname,phone,email,logintime,endtime,address);
    }

    @Override
    public int add2(Admin admin) {
        return adminMapper.add2(admin);
    }

    @Override
    public List<Admin> getAdminById(int id) {
        return adminMapper.getAdminById(id);
    }
}
