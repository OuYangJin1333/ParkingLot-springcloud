package cn.park.controller;

import cn.park.pojo.PilVipUser;
import cn.park.service.PilvipUserService;
import cn.park.utils.RespBean;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/pil/vipUser")
@Api(value = "外部用户")
public class PilvipUserController {
    @Autowired
    PilvipUserService pilvipUserService;
    @GetMapping(value="/PilvipUsercha")
    @ApiOperation(value = "获取外部用户列表信息")
    public RespBean PilvipUsercha(@RequestParam( value = "vid",required = false)String vid, @RequestParam(value = "name",required = false)String name,
                                  @RequestParam( value = "sex",required = false)String sex, @RequestParam( value = "identification",required = false)String identification,
                                  @RequestParam( value = "phone",required = false)String phone, @RequestParam( value = "carNumber",required = false)String carNumber,
                                  @RequestParam( value = "star",required = false)String star, @RequestParam( value = "end",required = false)String end,
                                  @RequestParam(value = "pageIndex",required = false,defaultValue = "1") @ApiParam(value = "页数") Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "2") @ApiParam(value = "页面大小") Integer pageSize) throws ParseException {
        PageHelper.startPage(pageIndex,pageSize);
        List<PilVipUser> vip=pilvipUserService.AllPvu(vid,name,sex,identification,phone,carNumber,star,end);
        return new RespBean().pageSuccess(vip);
    }
}
