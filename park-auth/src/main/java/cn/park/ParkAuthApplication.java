package cn.park;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@MapperScan("cn.park.mapper")
@EnableCaching
public class ParkAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkAuthApplication.class, args);
	}

}
