package cn.park.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/22.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"cn.park.mapper"})
public class MyBatisConfig {
}
