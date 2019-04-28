package cn.park.controller;

import cn.park.pojo.PilSystem;
import cn.park.pojo.PilSystemType;
import cn.park.service.PilSystemService;
import cn.park.service.PilSystemtypeService;
import cn.park.utils.RespBean;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pil/System")
@Api(value = "车位信息监控")
public class PilSystemController {
    @Autowired
    PilSystemService pilSystemService;
    @Autowired
    PilSystemtypeService pilSystemtypeService;

    @GetMapping("/pilSystemlist/{id}")
    @ApiOperation(value = "获取系统公告信息")
    public List AllPilSystem(@PathVariable Integer id) {
        int tid=0;
        if(id==2){
            tid=1;
        }else if(id==3){
            tid=2;
        }else if(id==4){
            tid=3;
        }else{
            tid=0;
        }
        List<PilSystem> allPilInfo = pilSystemService.pilSystemList(tid);
        return allPilInfo;
    }
    @GetMapping("/chaSystemlist/{id}")
    @ApiOperation(value = "获取详细公告信息")
    public PilSystem chaPilSystem(@PathVariable Integer id) {
        PilSystem system = pilSystemService.pilSystem(id);
        PilSystemType pilSystemType=pilSystemtypeService.pilSystemType(system.getTid());
        if(pilSystemType.getIsvip()==1){
            return system;
        }else{
            return null;
        }
    }
    @GetMapping(value="/fenyePilSystem/{id}")
    @ApiOperation(value = "获取公告列表信息")
    public RespBean fenyePilSystem(@PathVariable Integer id,
                                   @RequestParam(value="title",required=false,defaultValue="") String title,
                                   @RequestParam(value = "pageIndex",required = false,defaultValue = "1") @ApiParam(value = "页数") Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "2") @ApiParam(value = "页面大小") Integer pageSize){
        int tid=0;
        if(id==2){
            tid=1;
        }else if(id==3){
            tid=2;
        }else if(id==4){
            tid=3;
        }else{
            tid=0;
        }
        PageHelper.startPage(pageIndex,pageSize);
        List<PilSystem> psList=pilSystemService.fenyepilSystem(tid,title);
        return new RespBean().pageSuccess(psList);
    }
}
