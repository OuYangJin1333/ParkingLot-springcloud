package cn.park.controller;

import cn.park.pojo.PilSystemWarn;
import cn.park.service.PilSystemWarnService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/pilSystemWarnxiang")
    @ApiOperation(value = "获取系统告警列表信息")
    public PilSystemWarn AllPilSystemWarn(Integer id) {
        return pilSystemWarnService.pilSystemWarn(id);
    }
}
