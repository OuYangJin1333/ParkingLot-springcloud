package cn.park.controller;

import cn.park.pojo.PilVipComplain;
import cn.park.service.PilvipComplainService;
import cn.park.utils.RespBean;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pil/VipComplain")
@Api(value = "用户投诉")
public class PilVipComplainController {
    @Autowired
    PilvipComplainService complainService;
    @GetMapping("/fengyeovc")
    @ApiOperation(value = "获取投诉列表信息")
    public RespBean fenyeComplain(@RequestParam(value="content",required = false)String content,
                                  @RequestParam(value="name",required = false)String name,
                                  @RequestParam(value="star",required = false)String star,
                                  @RequestParam(value="end",required = false)String end,
                                  @RequestParam(value="status",required = false)String status,
                                  @RequestParam(value="username",required = false)String username,
                                  @RequestParam(value = "pageIndex",required = false,defaultValue = "1") @ApiParam(value = "页数") Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "2") @ApiParam(value = "页面大小") Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<PilVipComplain> pvcList= complainService.Allpvc(content,name,star,end,status,username);
        return new RespBean().pageSuccess(pvcList);
    }
    @GetMapping("/getPvc")
    @ApiOperation(value = "获取投诉详细信息")
    public PilVipComplain pvc(Integer id){
        PilVipComplain pilVipComplain=complainService.pvc(id);
        return pilVipComplain;
    }
    @GetMapping(value="/updatepvc/{id}")
    @ApiOperation(value = "填写建议信息")
    public RespBean update(@RequestParam(value = "aid")Integer aid,@RequestParam(value = "status",required = false,defaultValue = "已处理")String status,@RequestParam(value = "advice")String advice,@PathVariable Integer id){
        PilVipComplain pvcs=new PilVipComplain();
        pvcs.setAid(aid);
        pvcs.setStatus(status);
        pvcs.setAdvice(advice);
        pvcs.setId(id);
        int rearue=complainService.update(pvcs);
        if(rearue>0){
            return RespBean.ok("修改成功");
        }else{
            return RespBean.error("出现错误,修改失败");
        }
    }
}
