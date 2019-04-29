package cn.park.controller;

import cn.park.bean.ChargePdf.ViewPDF1;
import cn.park.export.ExportCharge;
import cn.park.pojo.Area;
import cn.park.pojo.Charge;
import cn.park.pojo.City;
import cn.park.service.AreaService;
import cn.park.service.ChargeService;
import cn.park.service.CityService;
import cn.park.utils.RespBean;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pil/charge")
@Api(value = "停车收费统计")
public class ChargeController {

    @Autowired
    ChargeService chargeService;
    @Autowired
    CityService cityService;
    @Autowired
    AreaService areaService;

    @RequestMapping(value="/findAllCharge",produces = "application/json", method = RequestMethod.POST)
    @ApiOperation(value = "获取停车收费列表信息")
    public RespBean findAllCharge(@RequestParam(value="name",required=false,defaultValue="") String name,
                                  @RequestParam(value="aname",required=false,defaultValue="") String aname,
                                  @RequestParam(value="partName",required=false,defaultValue="")String partName,
                                  @RequestParam(value="carNumber",required=false,defaultValue="")String carNumber,
                                  @RequestParam(value="payType",required=false,defaultValue="")String payType,
                                  @RequestParam(value="beginTime",required=false,defaultValue="")String beginTime,
                                  @RequestParam(value="endTime",required=false,defaultValue="")String endTime,
                                  @RequestParam(value = "pageIndex",required = false,defaultValue = "1") @ApiParam(value = "页数") Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "5") @ApiParam(value = "页面大小") Integer pageSize){
        PageHelper.startPage(pageIndex-1,pageSize);
        List<Charge> cList=chargeService.findByParam(name, aname, partName, carNumber, payType, beginTime, endTime);
        return new RespBean().pageSuccess(cList);
    }

    @RequestMapping(value="/findAllCity",method = RequestMethod.GET)
    @ApiOperation(value = "获取城市信息")
    public Object findAllCity(){
        List<City> cityList=cityService.findAll();
        return cityList;
    }

    @RequestMapping(value="/findAllArea",method = RequestMethod.GET)
    @ApiOperation(value = "获取区域信息")
    public Object findAllArea(){
        List<Area> areaList=areaService.findAllArea();
        return areaList;
    }

    @RequestMapping(value = "/exportCharge",method = RequestMethod.GET)
    @ApiOperation(value = "导出数据")
    public ResponseEntity<byte[]> exportCharge(){
        return ExportCharge.exportExcel(chargeService.getAllCharge());
    }

    @RequestMapping(value = "/exportpdf",method = RequestMethod.GET)
    @ApiOperation(value = "导出pdf数据")
    public ModelAndView printPdf() throws Exception{
        List<Charge> chargeList=chargeService.getAllCharge();
        Map<String, Object> model = new HashMap<>();
        model.put("sheet3", chargeList);
        return new ModelAndView(new ViewPDF1(), model);
    }

}