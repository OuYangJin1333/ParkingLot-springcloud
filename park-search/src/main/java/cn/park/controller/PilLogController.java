package cn.park.controller;

import cn.park.bean.LogPdf.ViewPDF4;
import cn.park.bean.RespBean;
import cn.park.export.ExportLog;
import cn.park.pojo.PilLog;
import cn.park.service.PilLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pil/log")
@Api(value = "操作日志记录")
public class PilLogController {
    @Autowired
    PilLogService pilLogService;

    @PostMapping(value = "/pilLogList",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "获取操作日志信息")
    public RespBean findPartByPage(@RequestBody PilLog pilLog,
                                   @RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize){
        Page<PilLog> pilLogPage=pilLogService.findAllByEs(pageIndex,pageSize,pilLog);
        return new RespBean().pageSuccess(pilLogPage);
    }

    @RequestMapping(value = "/exportLog",method = RequestMethod.GET)
    @ApiOperation(value = "导出日志记录数据")
    public ResponseEntity<byte[]> exportPart(){
        return ExportLog.exportExcel(pilLogService.findByList());
    }

    @RequestMapping(value = "/exportpdf",method = RequestMethod.GET)
    @ApiOperation(value = "导出pdf数据")
    public ModelAndView printPdf() throws Exception{
        List<PilLog> pilLogList=pilLogService.findByList();
        Map<String, Object> model = new HashMap<>();
        model.put("sheet4", pilLogList);
        return new ModelAndView(new ViewPDF4(), model);
    }
    @RequestMapping(value = "/deletLog",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除日志记录")
    public Object deleteLog(Integer id){
        int result=pilLogService.delete(id);
        if(result>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败，未超过三个月");
        }
        return result;
    }

    @RequestMapping(value = "/deletLogs",method = RequestMethod.DELETE)
    @ApiOperation(value = "批量删除日志记录")
    public Object deleteLogs(Integer id){
       boolean flag=pilLogService.deletAllLog(id);
        if(flag){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return flag;
    }


}
