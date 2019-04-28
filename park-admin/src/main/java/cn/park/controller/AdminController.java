package cn.park.controller;

import cn.park.export.ExportAdmin;
import cn.park.pojo.Admin;
import cn.park.pojo.Pildepartment;
import cn.park.pojo.Role;
import cn.park.service.*;
import cn.park.utils.RespBean;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    PiladmindepartmentService piladmindepartmentService;
    @Autowired
    PiladminroleService piladminroleService;

    @RequestMapping(value="/findAllAdmin",produces = "application/json",method = RequestMethod.GET)
    @ApiOperation(value = "获取管理人员列表信息")
    public RespBean findAllAdmin(@RequestParam(value="username",required=false,defaultValue="") String username,
                                 @RequestParam(value="identification",required=false,defaultValue="") String identification,
                                 @RequestParam(value="dname",required=false,defaultValue="")String dname,
                                 @RequestParam(value="rname",required=false,defaultValue="")String rname,
                                 @RequestParam(value="phone",required=false,defaultValue="")String phone,
                                 @RequestParam(value="email",required=false,defaultValue="")String email,
                                 @RequestParam(value="logintime",required=false,defaultValue="")String logintime,
                                 @RequestParam(value="entrytime",required=false,defaultValue="")String entrytime,
                                 @RequestParam(value="address",required=false,defaultValue="")String address,
                                 @RequestParam(value = "pageIndex",required = false,defaultValue = "1") @ApiParam(value = "页数") Integer pageIndex,
                                 @RequestParam(value = "pageSize",defaultValue = "5") @ApiParam(value = "页面大小") Integer pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<Admin> aList = adminService.getAdminByMap(username,identification,dname,rname,phone,email,logintime,entrytime,address);
        return  new RespBean().pageSuccess(aList);
    }
    @RequestMapping(value="/findAllRole",method = RequestMethod.GET)
    @ApiOperation(value = "获取全部角色信息")
    public Object findAllrole(/*@RequestParam(value = "rname" ,required = false)String rname*/){
        List<Role> adminList= roleService.getRole();
        return adminList;
    }

    @RequestMapping(value="/findAlldepartment",method = RequestMethod.GET)
    @ApiOperation(value = "获取全部部门信息")
    public Object findAlldepartment(){
        List<Pildepartment> dList=pildepartmentService.getAll();
        return dList;
    }

    @RequestMapping(value="/updateAdmin",method = RequestMethod.PUT)
    @ApiOperation(value = "修改管理人员信息")
    public RespBean update(
             @RequestBody  Admin admin,
            @RequestParam(value = "dname",required = false) String dname,
            @RequestParam(value = "rname",required = false) String  rname){
        int  num  = adminService.update(admin);
        int  id = admin.getId();
        System.out.println("主键回填id"+id);
        if(dname!=null&&dname.equals("运维部")){
            admin.setDepartmentId(1);
        } if(dname!=null&&dname.equals("设备管理部")){
            admin.setDepartmentId(2);
        } if(dname!=null&&dname.equals("研发部")){
            admin.setDepartmentId(3);
        } if (dname!=null&&dname.equals("市场部")){
            admin.setDepartmentId(4);
        }
        if(dname!=null&&rname.equals("ROLE_admin")){
            admin.setRoleId(1);
        }if(dname!=null&&rname.equals("ROLE_manager")){
            admin.setRoleId(2);
        } if(dname!=null&&rname.equals("ROLE_recruiter")){
            admin.setRoleId(3);
        }  if (dname!=null&&rname.equals("ROLE_train")){
            admin.setRoleId(4);
        }
        int sum = piladmindepartmentService.updateAdminDepartment(id,admin.getDepartmentId());
        int biu = piladminroleService.updateAdminRole(id,admin.getRoleId());
        System.out.println(admin.getDepartmentId());
        System.out.println(admin.getRoleId());
        if(num>0&& sum>0 && biu>0){
            return RespBean.ok("添加成功");
        }
        return  RespBean.error("修改失败");
    }


    @RequestMapping(value = "/exportAdmin",method = RequestMethod.GET)
    @ApiOperation(value = "导出数据")
    public ResponseEntity<byte[]> exportCharge(){
        return ExportAdmin.exportExcel(adminService.getAllAdmin());

    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ApiOperation(value = "添加管理人员信息")
    public RespBean add1(
            Admin admin,
            @RequestParam(value = "dname",required = false) String dname,
            @RequestParam(value = "rname",required = false) String  rname ){
           int  num  = adminService.add2(admin);
            int  id = admin.getId();
            System.out.println("主键回填id"+id);
        if(dname.equals("运维部")){
            admin.setDepartmentId(1);
        }else if(dname.equals("设备管理部")){
            admin.setDepartmentId(2);
        }else  if(dname.equals("研发部")){
            admin.setDepartmentId(3);
        }else if (dname.equals("市场部")){
            admin.setDepartmentId(4);
        }
        if(rname.equals("ROLE_admin")){
            admin.setRoleId(1);
        }else if(rname.equals("ROLE_manager")){
            admin.setRoleId(2);
        }else if(rname.equals("ROLE_recruiter")){
            admin.setRoleId(3);
        }else  if (rname.equals("ROLE_train")){
            admin.setRoleId(4);
        }
            int sum = piladmindepartmentService.addAdminDepartment(id,admin.getDepartmentId());
            int biu = piladminroleService.addAdminRole(id,admin.getRoleId());
            if(num>0&& sum>0 && biu>0){
                return RespBean.ok("添加成功");
            }
            return  RespBean.error("修改失败");
            }


    @RequestMapping(value="/getAdminById",method = RequestMethod.GET)
    @ApiOperation(value = "根据Id获得信息")
       public  Object getAdminById(@RequestParam (value = "id")Integer id){
                List<Admin> byIdAdmin = adminService.getAdminById(id);
                return  byIdAdmin;
    }

    }


