package com.wyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WyhEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WyhEurekaApplication.class, args);
	}
}
