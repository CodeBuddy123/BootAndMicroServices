package com.ashsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashsoft.entity.BookEntity;
import com.ashsoft.respository.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository bookRepo;
	
	//logic to load form
	@GetMapping(value= {"/", "addBook"})
	public String getBookForm(Model model){
		
		BookEntity bookObj = new BookEntity();
		model.addAttribute("book", bookObj);
		return "addBook";
	}
	
	//logic to save book in H2 DB
	@PostMapping(value = "/saveBook")
	public String saveBook(Model model, @ModelAttribute("book") BookEntity book) {
		BookEntity savedEntity=bookRepo.save(book);
		
		if(savedEntity!=null && savedEntity.getBookId()!= null) {
			model.addAttribute("success", "Book Stored Successfully..");
		} else {
			model.addAttribute("fail", "Book Storing Failed...");
		}
		return "addBook";
	}
	
	//logic for viewing list of books
	@GetMapping(value = "/viewBooks")
	public String viewBooks(Model model){
		
		List<BookEntity> booksList=bookRepo.findAll();
		
		model.addAttribute("books",booksList);
		return "viewBooks";
	}
}
