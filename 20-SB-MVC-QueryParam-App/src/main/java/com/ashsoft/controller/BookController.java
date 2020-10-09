package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	
	@GetMapping("/getPrice")
	public String getBookPrice(@RequestParam("author") String authorName, @RequestParam("book")String bookName, Model model) {
		
		String msgText="Price of "+bookName+" Written by "+authorName+" is:5000 RS";
		
		model.addAttribute("msg",msgText);
		return "index";
	}
}
