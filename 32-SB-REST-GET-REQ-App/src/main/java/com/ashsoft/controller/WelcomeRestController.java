package com.ashsoft.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMessage() {
		String msg= "Welcome to Ashsoft..!!";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> greet(){
		String msg= "Hello Good Morning..";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
