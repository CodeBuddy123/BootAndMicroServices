package com.ashsoft.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ashsoft.binding.Book;

@RestController
public class BookRestController {
	
	@GetMapping("/price")
	public ResponseEntity<String> getPrice(@RequestParam String isbn){
		
		String message = "Book Price for " +isbn+" :450 $";
		
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	@GetMapping("/check")
	public ResponseEntity<String> checkAvailability(@RequestParam("type") String type,@RequestParam("author") String author){
		
		String message = type+ "Book By "+ author +" :: Available ";
		
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	@GetMapping( value="/book",
				 produces= {
						 "application/json",
						 "application/xml"
				 }
			)
	public ResponseEntity<Book> getBookDetails(@RequestParam("isbn") String isbn){
		Book b = new Book();
		
		b.setIsbn(isbn);
		b.setBookName("Spring");
		b.setBookPrice("5000 $");
		
		return new ResponseEntity<Book>(b,HttpStatus.OK);
	}
}
