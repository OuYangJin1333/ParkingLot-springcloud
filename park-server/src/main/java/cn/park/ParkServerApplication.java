package cn.park;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ParkServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkServerApplication.class, args);
	}

}
