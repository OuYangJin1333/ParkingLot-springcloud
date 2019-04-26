package cn.park.service;

import cn.park.pojo.Admin;
import cn.park.utils.MD5;
import cn.park.utils.RedisUtil;
import com.alibaba.fastjson.JSONObject;
import nl.bitwalker.useragentutils.UserAgent;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class TokenService{
    @Resource
    private RedisUtil redisUtil;

    /*
    * 生成token方法
    * */
    public String generateToken(String userAgent, Admin admin)  {
        StringBuilder str=new StringBuilder();
        str.append("token:");
        UserAgent agent= UserAgent.parseUserAgentString(userAgent);
        if (agent.getOperatingSystem().isMobileDevice())
            str.append("MOBILE-");
        else
            str.append("PC-");
        str.append(MD5.getMd5(admin.getPhone(),32)+"-");
        str.append(admin.getId()+"-");
        str.append(new SimpleDateFormat("yyyyMMddHHmmsss").format(new Date())+"-");
        str.append(MD5.getMd5(userAgent,6));
        return str.toString();
    }

    /*
    * 保存token信息
    * */
    public void save(String token, Admin user)  {
        if (token.startsWith("token:PC")) {
            System.out.println(String.valueOf(user.getId()));
           // redisUtil.setex(String.valueOf(user.getId()), token, 2*60*60);
            redisUtil.setex(token, JSONObject.toJSONString(user), 2*60*60);
        } else {
            redisUtil.set(token, JSONObject.toJSONString(user));
        }
    }

    public void delete(String key){
        redisUtil.delete(key);
    }

}
