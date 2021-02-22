package com.ashsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String greetMessage() {
		
		return "Hello Everybody! Welcome to Eureka Client...";
	}
}
