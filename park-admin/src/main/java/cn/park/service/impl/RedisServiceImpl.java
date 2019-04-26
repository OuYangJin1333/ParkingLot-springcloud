package cn.park.service.impl;

import cn.park.config.JedisClusterConfig;
import cn.park.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl implements RedisService{
    @Autowired
    private JedisClusterConfig jedisClusterConfig;
    @Override
    public boolean set(String key, String value) {
        try {
            String str = jedisClusterConfig.getJedisCluster().set(key,String.valueOf(value));
            if("ok".equals(str)){
                return true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public String get(String key) {
        String str = null;
        try {
            str = jedisClusterConfig.getJedisCluster().get(key);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return str;
    }

    @Override
    public boolean expire(String key, long expire) {
        try {
            Long str = jedisClusterConfig.getJedisCluster().expire(key,new Long(expire).intValue());
            if(str==1){
                return true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(String key) {
        try {
            Long str = jedisClusterConfig.getJedisCluster().del(key);
            if (str==1){
                return true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Long increment(String key, long delta) {
        try {
            Long str = jedisClusterConfig.getJedisCluster().incrBy(key,delta);
            return str;
        }catch (Exception ex){
            ex.printStackTrace();
            return -1L;
        }
    }
}
