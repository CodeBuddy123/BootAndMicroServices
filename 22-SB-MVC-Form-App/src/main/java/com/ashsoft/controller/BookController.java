package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashsoft.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/loadForm")
	public String loadBookForm() {
		return "bookform";
	}
	
	@PostMapping("/saveBook")
	public String displayBookData(Model model, Book bookObj) {
		
		model.addAttribute("book", bookObj);
		
		return "display";
	}
}
