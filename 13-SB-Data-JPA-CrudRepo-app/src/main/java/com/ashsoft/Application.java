package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashsoft.entity.CustomerEntity;
import com.ashsoft.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
		
		System.out.println(customerRepository.getClass().getName());
		
		CustomerEntity entity = new CustomerEntity();
		
		entity.setCustomerId(222);
		entity.setCustomerName("Jason");
		entity.setCustomerEmail("jasdss@gmail.com");
		
		customerRepository.save(entity);
	}

}
