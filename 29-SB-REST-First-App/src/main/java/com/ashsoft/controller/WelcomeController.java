package com.ashsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		
		return "Welcome to Ashsoft....!!";    //ResponseBody
		
	}

}
