package cn.park.controller;


import cn.park.pojo.Admin;
import cn.park.pojo.Pildepartment;
import cn.park.pojo.Role;
import cn.park.service.AdminService;
import cn.park.service.PildepartmentService;
import cn.park.service.RoleService;
import cn.park.utils.RespBean;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("pil/admin")
@Api("管理人员列表")
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    PildepartmentService pildepartmentService;
    @Autowired
    RoleService roleService;
    @RequestMapping(value="/findAllAdmin",produces = "application/json",method = RequestMethod.GET)
    @ApiOperation(value = "获取管理人员列表信息")
    public RespBean findAllAdmin(@RequestParam(value="username",required=false,defaultValue="") String username,
                                 @RequestParam(value="identification",required=false,defaultValue="") String identification,
                                 @RequestParam(value="dname",required=false,defaultValue="")String dname,
                                 @RequestParam(value="rname",required=false,defaultValue="")String rname,
                                 @RequestParam(value="phone",required=false,defaultValue="")String phone,
                                 @RequestParam(value="email",required=false,defaultValue="")String email,
                                 @RequestParam(value="logintime",required=false,defaultValue="")Date logintime,
                                 @RequestParam(value="entrytime",required=false,defaultValue="")Date entrytime,
                                 @RequestParam(value="address",required=false,defaultValue="")String address,
                                 @RequestParam(value = "pageIndex",required = false,defaultValue = "1") @ApiParam(value = "页数") Integer pageIndex,
                                 @RequestParam(value = "pageSize",defaultValue = "5") @ApiParam(value = "页面大小") Integer pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<Admin> aList = adminService.getAdminByMap(username,identification,dname,rname,phone,email,logintime,entrytime,address);
        return  new RespBean().pageSuccess(aList);
    }
    @RequestMapping(value="/findAllCity",method = RequestMethod.GET)
    @ApiOperation(value = "获取全部部门信息")
    public Object findAllCity(){
        List<Role> adminList= roleService.getAllRole();
        return adminList;
    }

    @RequestMapping(value="/findAllArea",method = RequestMethod.GET)
    @ApiOperation(value = "获取全部角色信息")
    public Object findAllArea(){
        List<Pildepartment> dList=pildepartmentService.getAll();
        return dList;
    }
    @RequestMapping(value="/addAdmin",method = RequestMethod.POST)
    @ApiOperation(value = "添加管理人员信息")
    public RespBean add(
                        Admin admin,
                        @RequestParam(value = "dname",required = false) String dname,
                        @RequestParam(value = "rname",required = false) String  rname ){
        if(dname=="运维部"){
            admin.setDepartmentId(1);
        }else if(dname=="设备管理部"){
            admin.setDepartmentId(2);
        }else  if(dname=="研发部"){
            admin.setDepartmentId(3);
        }else if (dname=="市场部"){
            admin.setDepartmentId(4);
        }
        if(rname=="ROLE_admin"){
         admin.setRoleId(1);
        }else if(rname=="ROLE_manager"){
            admin.setRoleId(2);
        }else if(rname=="ROLE_recruiter"){
            admin.setRoleId(3);
        }else  if (rname=="ROLE_train"){
            admin.setRoleId(4);
        }
        if(adminService.addAdmin(admin) ==1){
            return RespBean.ok("添加成功");
        }
        return  RespBean.error("添加失败");
    }
    @RequestMapping(value="/updateAdmin",method = RequestMethod.PUT)
    @ApiOperation(value = "添加管理人员信息")
    public RespBean update(
            Admin admin,
            @RequestParam(value = "dname",required = false) String dname,
            @RequestParam(value = "rname",required = false) String  rname){
        if(dname=="运维部"){
            admin.setDepartmentId(1);
        }else if(dname=="设备管理部"){
            admin.setDepartmentId(2);
        }else  if(dname=="研发部"){
            admin.setDepartmentId(3);
        }else if (dname=="市场部"){
            admin.setDepartmentId(4);
        }
        if(rname=="ROLE_admin"){
            admin.setRoleId(1);
        }else if(rname=="ROLE_manager"){
            admin.setRoleId(2);
        }else if(rname=="ROLE_recruiter"){
            admin.setRoleId(3);
        }else  if (rname=="ROLE_train"){
            admin.setRoleId(4);
        }

        if(adminService.update(admin) ==1){
            return RespBean.ok("修改成功");
        }
        return  RespBean.error("修改失败");
    }
}
