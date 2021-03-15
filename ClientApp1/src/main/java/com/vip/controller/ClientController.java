package com.vip.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableEurekaClient
@RestController
public class ClientController {
	/**
	 * This method is used to return the client details 
	 * @return
	 */
	@GetMapping("/getclientdetails")
	public String clientDetails(){
		return "Welcome to Client App....";
		
	}

}
