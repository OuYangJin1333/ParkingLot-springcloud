package cn.park.controller;

import cn.park.bean.ReconciliaPdf.ViewPDF5;
import cn.park.bean.RespBean;
import cn.park.export.ExportReconcilia;
import cn.park.pojo.Reconcilia;
import cn.park.service.ReconciliaService;
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
@RequestMapping("/pil/reconcilia")
@Api(value = "对账统计")
public class ReconciliaController {
    @Autowired
    ReconciliaService reconciliaService;

    @PostMapping(value = "/reconList",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="对账统计")
    public RespBean findByPage(@RequestBody Reconcilia reconcilia,
                               @RequestParam(value = "pageIndex",defaultValue = "1")Integer pageIndex,
                               @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize){
        Page<Reconcilia> reconciliaPage=reconciliaService.findAllByEs(pageIndex,pageSize,reconcilia);
        return new RespBean().pageSuccess(reconciliaPage);
    }

    /**
     * 导出对账统计
     * @return
     */
    @RequestMapping(value = "/exportRecon",method = RequestMethod.GET)
    public ResponseEntity<byte[]> exportReconcilia(){
        return ExportReconcilia.exportExcel(reconciliaService.findAllReconcilia());
    }

    @RequestMapping(value = "/exportpdf",method = RequestMethod.GET)
    @ApiOperation(value = "导出pdf数据")
    public ModelAndView printPdf() throws Exception{
        List<Reconcilia> reconciliaList=reconciliaService.findAllReconcilia();
        Map<String, Object> model = new HashMap<>();
        model.put("sheet5", reconciliaList);
        return new ModelAndView(new ViewPDF5(), model);
    }
}
