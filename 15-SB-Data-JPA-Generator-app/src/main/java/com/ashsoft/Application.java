package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashsoft.entity.Order;
import com.ashsoft.entity.Student;
import com.ashsoft.repository.OrderRepository;
import com.ashsoft.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		Student entity = new Student();
		entity.setStudentName("Raghu");
		entity.setStudentGender("male");
		
		studentRepository.save(entity);
		
		OrderRepository orderRepository = context.getBean(OrderRepository.class);
		
		/*
		 * Order order = new Order(); order.setOrderBy("Rakul");
		 * order.setOrderStatus("Pending");
		 * 
		 * orderRepository.save(order);
		 */
		
		context.close();
	}

}
