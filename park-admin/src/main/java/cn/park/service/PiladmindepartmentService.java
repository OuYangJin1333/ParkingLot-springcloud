package cn.park.service;

public interface PiladmindepartmentService {
     /*
     * 添加部门外键表
     * */
     int addAdminDepartment(int aid, int did);

     /**
      * 修改部门外键表
      * */
        int  updateAdminDepartment(int aid, int did);
}
