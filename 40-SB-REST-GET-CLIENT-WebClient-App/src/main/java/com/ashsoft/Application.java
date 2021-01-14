/*
 * WebClient is Provided in Spring 5.x Version to send HTTP request
 * for REST API.
 * Using RestTemplate, we can only send Synchronous requests.
 * Using WebClient, we can send both Synchronous and Asynchronous requests.
 * When we send Synchronous request, the rest of the program gets executed only
 * after getting the response from API, where in Asynchronous request the program
 * execution continues without waiting for response from API.
 */

package com.ashsoft;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		
		String endPointUrl = "http://localhost:5341/greet";
		
		WebClient webClient = WebClient.create();
		
		/* String response = webClient.get()
						  .uri(new URI(endPointUrl))
						  .retrieve()
						  .bodyToMono(String.class)
						  .block();  //used to send synchronous request
		
		System.out.println("Response ::"+response); */
		
		/*	   webClient.get()
		       .uri(new URI(endPointUrl))
		       .retrieve()
		       .bodyToMono(String.class)
		       .subscribe(Application::handleResponse); //used to send asynchronous request
	   
	   System.out.println("******* After Sending Request ***");*/ //this gets executed after sending request, without waiting for response
		
		
		String userData =  webClient.get()
						   .uri(new URI("http://localhost:5341/user"))
						   .retrieve()
						   .bodyToMono(String.class)
						   .block();
		
		System.out.println(userData);
	}
	public static void handleResponse(String msg) {
		System.out.println("Response ::"+msg);
	}

}
