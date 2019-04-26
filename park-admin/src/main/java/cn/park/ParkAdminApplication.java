package cn.park;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableCaching
@EnableScheduling
public class ParkAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkAdminApplication.class, args);
	}

}
