package cn.park.controller;

import cn.park.pojo.PilInfo;
import cn.park.service.PilInfoService;
import cn.park.utils.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pil/monit")
@Api(value = "车位信息监控")
public class PiInformationMonitoring {
    @Autowired
    PilInfoService pilInfoService;

    @GetMapping("/findAllPilInfo")
    @ApiOperation(value = "获取停车场列表信息")
    public RespBean findAllPilInfo(@RequestParam(value = "pageIndex",required = false) @ApiParam(value = "页数") Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "5") @ApiParam(value = "页面大小") Integer pageSize){
        //获取停车场列表集合
        List<PilInfo> allPilInfo = pilInfoService.findAllPilInfo(pageIndex,pageSize);
        return new RespBean().pageSuccess(allPilInfo);
    }
}
