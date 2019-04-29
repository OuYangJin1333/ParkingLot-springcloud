package cn.park.controller;

import cn.park.bean.ViewPDF;
import cn.park.export.ExportPart;
import cn.park.pojo.Part;
import cn.park.service.PartService;
import cn.park.utils.RespBean;
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
@RequestMapping("/pil/part")
@Api(value = "停车统计")
public class PartController {
    @Autowired
    PartService partService;

    @PostMapping(value = "/partList",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "获取停车列表信息")
    public RespBean findPartByPage(@RequestBody Part part,
                                   @RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize){
        Page<Part> partPage=partService.findListByEs(pageIndex,pageSize,part);
        return new RespBean().pageSuccess(partPage);
    }

    @RequestMapping(value = "/exportPart",method = RequestMethod.GET)
    @ApiOperation(value = "导出数据")
    public ResponseEntity<byte[]> exportPart(){
        return ExportPart.exportExcel(partService.getAll());
    }

    @RequestMapping(value = "/exportpdf",method = RequestMethod.GET)
    @ApiOperation(value = "导出pdf数据")
    public ModelAndView printPdf() throws Exception{
        List<Part> dictionaryList=partService.getAll();
        Map<String, Object> model = new HashMap<>();
        model.put("sheet1", dictionaryList);
        return new ModelAndView(new ViewPDF(), model);
    }

    @PostMapping("/findAllName")
    @ApiOperation(value = "停车场名称")
    public Object findName(){
        return partService.getAllName();
    }

    @PostMapping("/findAllType")
    @ApiOperation(value = "停车场类型")
    public Object findType(){
        return partService.getAllType();
    }
}
