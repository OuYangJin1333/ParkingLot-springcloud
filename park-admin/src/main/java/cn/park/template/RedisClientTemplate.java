package cn.park.template;

import cn.park.config.JedisClusterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

@Service
public class RedisClientTemplate {
    @Autowired
    private JedisClusterConfig jedisClusterConfig;
    public boolean setToRedis(String key,Object value){
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
    public Object getRedis(String key){
        String str = null;
        try {
            str = jedisClusterConfig.getJedisCluster().get(key);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return str;
    }
}
