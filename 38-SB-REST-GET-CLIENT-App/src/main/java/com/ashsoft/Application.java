package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ashsoft.binding.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		String endPointUrl="http://localhost:5341/user";
		
		RestTemplate rt= new RestTemplate();
		
		ResponseEntity<User> restEntity = rt.getForEntity(endPointUrl, User.class);
		
		if(restEntity.getStatusCodeValue()==200)
		{
			User body= restEntity.getBody();
			System.out.println(body);
		}
	}

}
