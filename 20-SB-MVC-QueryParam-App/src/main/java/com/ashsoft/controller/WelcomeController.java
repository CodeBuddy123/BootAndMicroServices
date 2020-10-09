package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String displayWelcomeMsg(@RequestParam("name") String name, Model model) {
		
		String message=name.concat(", Welcome to Ashsoft....!!");
		
		model.addAttribute("msg", message);
		
		return "index";
	}
}
