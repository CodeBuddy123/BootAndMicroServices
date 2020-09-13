package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashsoft.service.EmpDtlsService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpDtlsService service = context.getBean(EmpDtlsService.class);
		service.saveEmp();
		
		
		//service.getEmpById();
		
		//service.getAllEmps();
		
		//service.deleteEmp();
		
		//service.updateEmp();
		
		context.close();
	}

}
