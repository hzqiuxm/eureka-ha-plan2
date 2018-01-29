package com.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaHaPlan2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHaPlan2Application.class, args);
	}
}
