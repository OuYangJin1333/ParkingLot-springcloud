package cn.park;

import cn.park.pojo.PilSystem;
import cn.park.service.PilSystemAdminService;
import cn.park.service.RedisService;
import cn.park.template.RedisClientTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    /*@Autowired
    RedisService redisService;

    @Test
    public void Test(){
        redisService.set("ouyang","123");
        System.out.println(redisService.get("ouyang"));
        System.out.println(redisService.remove("ouyang"));
    }*/

    @Autowired
    PilSystemAdminService pilSystemAdminService;

    @Test
    public void mysqlMS(){
        PilSystem pilSystem = new PilSystem();
        pilSystem.setAid(1);
        pilSystem.setContent("测试内容");
        pilSystem.setCreateTime(new Date());
        pilSystem.setStatus("未发布");
        pilSystem.setTitle("测试标题");
        pilSystem.setTid(1);
        pilSystemAdminService.addPilSystem(pilSystem);
        PilSystem pil = pilSystemAdminService.getPilSystemById(14);
        System.out.println(pil);
    }
}
