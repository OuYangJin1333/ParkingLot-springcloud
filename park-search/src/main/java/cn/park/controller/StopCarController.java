package cn.park.controller;

import cn.park.bean.RespBean;
import cn.park.bean.StopCarPdf.ViewPDF2;
import cn.park.export.ExportStopCar;
import cn.park.pojo.StopCar;
import cn.park.service.StopCarService;
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
@RequestMapping("/pil/stopcar")
@Api(value = "停车记录统计")
public class StopCarController {
    @Autowired
    StopCarService stopCarService;

    @PostMapping(value = "/stopCarList",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "获取停车记录信息")
    public RespBean findPartByPage(@RequestBody StopCar stopCar,
                                   @RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize){
        Page<StopCar> stopCarPage=stopCarService.findAllByEs(pageIndex,pageSize,stopCar);
        return new RespBean().pageSuccess(stopCarPage);
    }

    @RequestMapping(value = "/exportCar",method = RequestMethod.GET)
    @ApiOperation(value = "导出停车记录数据")
    public ResponseEntity<byte[]> exportCar() {
        return ExportStopCar.exportExcel(stopCarService.findAllStop());
    }

    @RequestMapping(value = "/exportpdf",method = RequestMethod.GET)
    @ApiOperation(value = "导出pdf数据")
    public ModelAndView printPdf() throws Exception{
        List<StopCar> dictionaryList=stopCarService.findAllStop();
        Map<String, Object> model = new HashMap<>();
        model.put("sheet2", dictionaryList);
        return new ModelAndView(new ViewPDF2(), model);
    }
}
