package cn.park.service;

public interface PiladminroleService {
         /**
          * 添加角色外键表
          * */
    int  addAdminRole(int aid, int rid);

    /**
     * 修改角色外键表
     * */
    int  updateAdminRole(int aid, int rid);

}
