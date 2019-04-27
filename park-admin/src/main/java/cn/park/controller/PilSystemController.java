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

    @GetMapping("/pilSystemlist")
    @ApiOperation(value = "获取系统公告信息")
    public List AllPilSystem(Integer id) {
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
    @GetMapping("/chaSystemlist")
    @ApiOperation(value = "获取详细公告信息")
    public PilSystem chaPilSystem(Integer id) {
        PilSystem system = pilSystemService.pilSystem(id);
        PilSystemType pilSystemType=pilSystemtypeService.pilSystemType(system.getTid());
        if(pilSystemType.getIsvip()==1){
            return system;
        }else{
            return null;
        }
    }
    @GetMapping(value="/fenyePilSystem")
    @ApiOperation(value = "获取公告列表信息")
    public RespBean fenyePilSystem(@RequestParam(value="tid",required=false)Integer tid,
                                   @RequestParam(value="title",required=false,defaultValue="") String title,
                                   @RequestParam(value = "pageIndex",required = false,defaultValue = "1") @ApiParam(value = "页数") Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "2") @ApiParam(value = "页面大小") Integer pageSize){
        int id=0;
        if(tid==2){
            id=1;
        }else if(tid==3){
            id=2;
        }else if(tid==4){
            id=2;
        }else {
            id=0;
        }
        PageHelper.startPage(pageIndex,pageSize);
        List<PilSystem> psList=pilSystemService.fenyepilSystem(id,title);
        return new RespBean().pageSuccess(psList);
    }
}
