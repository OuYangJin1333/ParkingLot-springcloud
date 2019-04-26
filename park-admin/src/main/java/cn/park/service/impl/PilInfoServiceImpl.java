package cn.park.service.impl;

import cn.park.mapper.*;
import cn.park.pojo.PilInfo;
import cn.park.pojo.PilStopInfo;
import cn.park.pojo.PilStopInfoCharge;
import cn.park.pojo.PilVipUser;
import cn.park.service.PilInfoService;
import cn.park.service.RedisService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 停车场信息
 */
@Service
@Transactional
public class PilInfoServiceImpl implements PilInfoService {
    @Autowired
    PilInfoMapper pilInfoMapper;
    @Autowired
    PilNewPlaceMapper pilNewPlaceMapper;
    @Autowired
    RedisService redisService;
    @Autowired
    PilStopInfoMapper pilStopInfoMapper;
    @Autowired
    PilVipUserMapper pilVipUserMapper;
    @Autowired
    PilStopInfoChargeMapper pilStopInfoChargeMapper;

    /**
     * 实时的车位信息列表（实时车位数判断，调用存储过程添加实时车位数）
     * @return
     */
    @Transactional(readOnly = true)
    @Override
    public List<PilInfo> findAllPilInfo(Integer pageIndex, Integer pageSize) {
        ObjectMapper om = new ObjectMapper();
        //设置分页
        PageHelper.startPage(pageIndex, pageSize);
        List<PilInfo> pilInfoList = pilInfoMapper.selectAllByNow();
        return pilInfoList;
    }

    /**
     * 每个一个小时更新实时停车位
     */
    //@Scheduled(cron = "0 0/1 * * * ?")
    public void flushCount(){
        //jackson
        ObjectMapper om = new ObjectMapper();
        List<PilInfo> pilInfoList = null;
        CollectionType listType = om.getTypeFactory().constructCollectionType(ArrayList.class, PilInfo.class);
        try {
            pilInfoList = om.readValue(redisService.get("pilInfoList"),listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (PilInfo pilInfo : pilInfoList) {
            //根据id调用添加的存储过程
            pilNewPlaceMapper.addPilNewPlaceByPidList(pilInfo.getId());
        }
        pilInfoList = pilInfoMapper.selectAllByNow();
        try {
            redisService.set("pilInfoList", om.writeValueAsString(pilInfoList));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


    //@Scheduled(cron = "0 0/1 * * * ?")
    public void addStopInfo(){
        List<PilVipUser> pilVipUsers = pilVipUserMapper.selectByExample(null);
        PilStopInfo pilStopInfo = new PilStopInfo();
        List<Integer> num = new ArrayList<>();
        for (int i=1;i<=7;i++){
            boolean flag = false;
            List<PilInfo> pilInfoList = pilInfoMapper.selectAllByNow();
            if(pilInfoList.get(i-1).getNewCount()==0){
                System.out.println(pilInfoList.get(i+1).getName()+"停车场库存已满");
                continue;
            }
            pilStopInfo.setPid(i);
            pilStopInfo.setBeginTime(new Date());
            long currentTime = System.currentTimeMillis() + 60 * 60 * 1000;
            Date date = new Date(currentTime);
            pilStopInfo.setEndTime(date);
            pilStopInfo.setIsvip(1);
            int random = (int)(Math.random()*pilVipUsers.size());
            for (Integer integer : num) {
                if(random==random)
                    flag = true;
            }
            if(!flag) {
                pilStopInfo.setVid(pilVipUsers.get(random).getVid());
                pilStopInfo.setCartype("小车");
                pilStopInfoMapper.insert(pilStopInfo);
                PilStopInfoCharge pilStopInfoCharge = new PilStopInfoCharge();
                pilStopInfoCharge.setSiid(pilStopInfo.getId());
                pilStopInfoCharge.setPrice(5d);
                pilStopInfoCharge.setPaytype("App支付");
                pilStopInfoChargeMapper.insert(pilStopInfoCharge);
            }
        }

    }
}
