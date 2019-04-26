package cn.park.controller;

import cn.park.pojo.PilSystem;
import cn.park.service.PilSystemAdminService;
import cn.park.utils.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pil/systemadmin")
@Api(value = "系统公告管理")
public class PilSystemAdminController {
    @Autowired
    PilSystemAdminService pilSystemAdminService;

    @GetMapping("/list")
    @ApiOperation(value = "模糊查询系统消息列表")
    public RespBean findList(@RequestParam(value = "title",required = false) String title,
                             @RequestParam(value = "publisher",required = false) String publisher,
                             @RequestParam(value = "status",required = false)String status,
                             @RequestParam(value = "beginTime",required = false)String beginTime,
                             @RequestParam(value = "endTime",required = false)String endTime,
                             @RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                             @RequestParam(value = "pageSize",defaultValue = "2")Integer pageSize){
        List<PilSystem> list = pilSystemAdminService.getAllListByPage(title, publisher, status, beginTime, endTime, pageIndex, pageSize);
        return new RespBean().pageSuccess(list);
    }
    @PutMapping("/updatestatus/{id}")
    @ApiOperation("修改公告发布状态")
    public RespBean updateStatus(@PathVariable Integer id){
        int result = pilSystemAdminService.updatePilSystemStatus(id);
        if(result>0){
            return RespBean.ok("发布成功");
        }else{
            return RespBean.error("出现错误,发布失败");
        }
    }

    @PostMapping("/addpilsystem")
    @ApiOperation("添加公告")
    public RespBean addPilSystem(PilSystem pilSystem){
        pilSystem.setStatus("未发布");
        pilSystem.setCreateTime(new Date());
        //为当前登录的管理员id
        pilSystem.setAid(1);
        int result = pilSystemAdminService.addPilSystem(pilSystem);
        if(result>0){
            return RespBean.ok("保存成功");
        }else{
            return RespBean.error("保存失败");
        }
    }

    @DeleteMapping("/deletepilsystem/{id}")
    @ApiOperation("删除公告")
    public RespBean deletePilSystem(@PathVariable Integer id){
        int result = pilSystemAdminService.deltePilSystemById(id);
        if(result>0){
            return RespBean.ok("删除成功");
        }else{
            return RespBean.error("删除失败");
        }
    }

    @GetMapping("/getpilsystembyid/{id}")
    @ApiOperation("查看公告")
    public RespBean getPilSystemById(@PathVariable Integer id){
        PilSystem pilSystem = pilSystemAdminService.getPilSystemById(id);
        return RespBean.ok("",pilSystem);
    }
}
