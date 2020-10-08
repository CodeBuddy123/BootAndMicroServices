package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashsoft.domain.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String getUserData(Model model) {
		
		User userObj = new User();
		userObj.setUserId(2222);
		userObj.setFirstName("Mike");
		userObj.setLastName("Hudson");
		userObj.setGender("Male");
		userObj.setDob("31-12-1992");
		
		model.addAttribute("userdata", userObj);
		
		return "user";
	}
}
