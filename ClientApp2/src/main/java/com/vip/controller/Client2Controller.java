package com.vip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {
	
	@GetMapping("/getdata")
	public String getClient2Details() {
		return "welcome to Clien2 App...";
	}

}
