package cn.park.mapper;

import cn.park.pojo.Admin;
import cn.park.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    //判断用户信息
    Admin getAdminByUsername(String username);
    //获取用户权限
    List<Role> getRolesByHrId(Long id);
    //修改用户信息
    int putAdmin(Admin admin);

    //查询用户信息
    Admin getAdminById(int id);
}
