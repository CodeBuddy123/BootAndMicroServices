package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String displayWelcomeMsg(Model model) {
		String msgText= "Welcome to Ashsoft!";
		model.addAttribute("msg", msgText);
		return "index";
	}
}
