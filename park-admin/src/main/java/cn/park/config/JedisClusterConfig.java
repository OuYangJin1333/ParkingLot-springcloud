package cn.park.config;

import cn.park.component.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class JedisClusterConfig {
    @Autowired
    private RedisProperties redisProperties;
    public JedisCluster getJedisCluster(){
        String[] serverArray = redisProperties.getClusterNodes().split(",");
        Set<HostAndPort> nodes = new HashSet<>();
        for (String ipPort : serverArray) {
            String[] isPortPair = ipPort.split(":");
            nodes.add(new HostAndPort(isPortPair[0].trim(),Integer.valueOf(isPortPair[1].trim())));
        }
        return new JedisCluster(nodes,redisProperties.getCommandTimeout());
    }
}
