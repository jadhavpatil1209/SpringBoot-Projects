package com.vip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ClientApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(ClientApp1Application.class, args);
	}

}
