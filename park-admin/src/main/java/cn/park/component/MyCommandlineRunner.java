package cn.park.component;

import cn.park.mapper.PilInfoMapper;
import cn.park.mapper.PilNewPlaceMapper;
import cn.park.pojo.PilInfo;
import cn.park.service.RedisService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class MyCommandlineRunner implements CommandLineRunner {
    @Autowired
    PilInfoMapper pilInfoMapper;
    @Autowired
    PilNewPlaceMapper pilNewPlaceMapper;
    @Autowired
    RedisService redisService;

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper om = new ObjectMapper();
        List<PilInfo> pilInfoList = pilInfoMapper.selectByExample(null);
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
}
