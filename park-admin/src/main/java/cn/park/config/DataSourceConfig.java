package cn.park.config;

import cn.park.config.mybatis.DynamicDataSource;
import cn.park.config.mybatis.DynamicDataSourceGlobel;
import cn.park.config.mybatis.DynamicDataSourceTransactionManager;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 配置mysql主从数据源
 */
@Configuration
@PropertySource(value = { "classpath:application.yml" })
public class DataSourceConfig {
    /**
     * 主 写操作
     * @return
     */
    @Bean(name = "writeDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.master")
    DataSource writeDataSource(){
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

    /**
     * 从 读操作
     * @return
     */
    @Bean(name = "readDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    DataSource readDataSource(){
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

    @Bean(name = "dataSource")
    public DynamicDataSource getDynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> dataSourceMap = new HashMap<>();
        dataSourceMap.put(DynamicDataSourceGlobel.READ.name(), readDataSource());
        dataSourceMap.put(DynamicDataSourceGlobel.WRITE.name(), writeDataSource());
        // 传入数据源map，AbstractRoutingDataSource将以key来分配数据源
        //dynamicDataSource.setDefaultTargetDataSource(writeDataSource());
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        return dynamicDataSource;
    }

    /**
     * 直接数据源
     * @param dataSource
     * @return
     */
    @Bean
    public DynamicDataSourceTransactionManager getDynamicDataSourceTransactionManager(
            @Qualifier("dataSource") DynamicDataSource dataSource) {
        DynamicDataSourceTransactionManager transactionManager = new DynamicDataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

    @Bean
    public SqlSessionFactory getSqlSessionFactory(@Qualifier("dataSource") DynamicDataSource dataSource) {
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dataSource);
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate getSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
        return template;
    }

    protected SpringApplicationBuilder springApplicationBuilder(SpringApplicationBuilder builder) {
        return builder.sources(DataSourceConfig.class);
    }
}
