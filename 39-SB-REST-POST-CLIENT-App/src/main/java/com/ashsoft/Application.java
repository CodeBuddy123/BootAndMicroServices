package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ashsoft.request.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		String endPointUrl = "http://localhost:5341/addBook";

		Book book = new Book();
		book.setBookId(2222);
		book.setBookName("Spring Boot by Ashish");
		book.setBookPrice(5000.0);

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> responseEntity = rt.postForEntity(endPointUrl, book, String.class);

		int statusCodeValue = responseEntity.getStatusCodeValue();

		if (statusCodeValue == 201) {
			String body = responseEntity.getBody();
			System.out.println(body);
		}

	}

}
