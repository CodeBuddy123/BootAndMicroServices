package com.ashsoft;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.ashsoft.binding.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws URISyntaxException {
		SpringApplication.run(Application.class, args);
		
		Book book = new Book();
		book.setBookId(1234);
		book.setBookName("Spring 5.x by Rod Johnson");
		book.setBookPrice(5000.0);
		
		WebClient webClient = WebClient.create();
		
		String endPointUrl = "http://localhost:5341/addBook";
						
		String response =  webClient.post()
						  .uri(new URI(endPointUrl))
						  .bodyValue(book)
						  .retrieve()
						  .bodyToMono(String.class)
						  .block();
		
		System.out.println(response);
	}

}
