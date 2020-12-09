package com.ashsoft.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashsoft.binding.Book;

@RestController
public class BookRestController {
	
	@PostMapping(value = "/addBook",
				consumes = {
						    "application/json",
						    "application/xml"
				           }
			    )
	public ResponseEntity<String> addBook(@RequestBody Book book){
		//logic to store book in db
		System.out.println(book);
		String responseMessage = "Book Stored Successfully..";
		return new ResponseEntity<>(responseMessage,HttpStatus.CREATED);
	}
}
