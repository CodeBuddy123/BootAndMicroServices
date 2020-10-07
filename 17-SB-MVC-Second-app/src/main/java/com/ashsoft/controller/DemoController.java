package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/demos")
public class DemoController {
	
	@GetMapping(value = "/work")
	public String doWork(Model model) {
		model.addAttribute("text", "This message from Demo controller");
		return "display";
	}
}
