package com.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ApiGatewayAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayAppApplication.class, args);
	}

}
