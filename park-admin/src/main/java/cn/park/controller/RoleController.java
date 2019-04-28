package cn.park.controller;

import cn.park.pojo.Role;
import cn.park.service.RoleService;
import cn.park.utils.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
@Api("角色管理信息")
public class RoleController {
        @Autowired
    RoleService roleService;

        @RequestMapping (value = "findAllRole" ,produces = "application/json",method = RequestMethod.GET)
        @ApiOperation(value = "获取角色管理列表信息")
       public Object Role(@RequestParam (value ="rname",required = false) String rname){
            Role role = new Role();
            List<Role> rList = roleService.getAllRole(rname);
            return  rList;
        }

    @RequestMapping(value="/addRole",method = RequestMethod.POST)
    @ApiOperation(value = "添加角色信息")
    public RespBean add(
            Role role,
            @RequestParam(value = "dname",required = false) String dname,
            @RequestParam(value = "statu",required = false) String  statu ){
        if(dname.equals("运维部")){
            role.setDepartmentId(1);
        }else if(dname.equals("设备管理部")){
            role.setDepartmentId(2);
        }else  if(dname.equals("研发部")){
            role.setDepartmentId(3);
        }else if (dname.equals("市场部")){
            role.setDepartmentId(4);
        }
         if(statu.equals("启用")){
             role.setStatus(1);
         }else {
            role.setStatus(0);
         }
        if(roleService.add(role) ==1){
            return RespBean.ok("添加成功");
        }
        return  RespBean.error("添加失败");
    }

      @DeleteMapping("/deleteRole/{id}")
      @ApiOperation(value = "删除角色信息")
      public cn.park.util.RespBean deleteRole(@PathVariable Integer id){
          int result = roleService.delete(id);
          if(result>0){
              return cn.park.util.RespBean.ok("删除成功");
          }else{
              return cn.park.util.RespBean.error("删除失败");
          }
      }

}
