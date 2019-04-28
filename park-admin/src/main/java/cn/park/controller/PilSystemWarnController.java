package cn.park.controller;

import cn.park.pojo.PilSystemWarn;
import cn.park.service.PilSystemWarnService;
import cn.park.utils.RespBean;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pil/SystemWarn")
@Api(value = "车位信息监控")
public class PilSystemWarnController {
    @Autowired
    PilSystemWarnService pilSystemWarnService;
    @GetMapping("/pilSystemWarnlist")
    @ApiOperation(value = "获取系统告警列表信息")
    public List AllPilSystemWarn() {
        return pilSystemWarnService.AllPilSystemWarn();
    }
    @GetMapping("/pilSystemWarnxiang/{id}")
    @ApiOperation(value = "获取系统告警详细信息")
    public PilSystemWarn AllPilSystemWarn(@PathVariable Integer id) {
        return pilSystemWarnService.pilSystemWarn(id);
    }
    @GetMapping("/fenyePilSystemWarn")
    @ApiOperation(value = "获取全部告警列表信息")
    public RespBean fenyePilSystem(@RequestParam(value="title",required=false,defaultValue="") String title,
                                   @RequestParam(value = "pageIndex",required = false,defaultValue = "1") @ApiParam(value = "页数") Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "2") @ApiParam(value = "页面大小") Integer pageSize){

        PageHelper.startPage(pageIndex,pageSize);
        List<PilSystemWarn> pswList= pilSystemWarnService.AllpilSystemWarnfy(title);
        return new RespBean().pageSuccess(pswList);
    }
}
