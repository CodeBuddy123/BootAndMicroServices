package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView sayWelcome()
	{
		ModelAndView mv= new ModelAndView();
		
		mv.addObject("msg","Welcome to AshSoft!");
		mv.setViewName("index");
		return mv;
	}

}
