package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {
	
	@GetMapping("/price/{bname}/{aname}")
	public String displayBookMsg(@PathVariable("bname") String bname, @PathVariable("aname") String aname,Model model) {
		
		String msgText= aname+"'s Book "+bname+" Price is:: 400 Dollars";
		
		model.addAttribute("msg", msgText);
		
		return "index";
	}

}
