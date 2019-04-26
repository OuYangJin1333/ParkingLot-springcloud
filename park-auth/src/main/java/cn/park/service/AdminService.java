package cn.park.service;

import cn.park.mapper.AdminMapper;
import cn.park.pojo.Admin;
import cn.park.utils.AdminUtils;
import cn.park.utils.EmptyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminService implements UserDetailsService {
    @Autowired
    AdminMapper adminMapper;

    /*验证用户信息*/
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Admin admin = adminMapper.getAdminByUsername(s);
        if (EmptyUtils.isNotEmpty(admin)){
            return admin;
        }else
            throw new UsernameNotFoundException("用户名不对");
    }
    /*
    * 修改用户信息
    * */
    public int putAdmin(Admin admin){
        return adminMapper.putAdmin(admin);
    }

    public Admin getAdminById(int id){
        return adminMapper.getAdminById(id);
    }
}
