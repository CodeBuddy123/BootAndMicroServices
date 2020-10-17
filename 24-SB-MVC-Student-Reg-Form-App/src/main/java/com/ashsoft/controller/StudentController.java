package com.ashsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashsoft.binding.Student;
import com.ashsoft.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/student")
	public String loadForm(Model model) {
		
		Student s = new Student();
		
		model.addAttribute("student", s);
		
		model.addAttribute("genders", studentService.getGenders());
		
		model.addAttribute("courses", studentService.getCourses());
		
		model.addAttribute("timings", studentService.getTimings());
		
		
		return "registration";
	}
	
	
	@PostMapping("/studentReg")
	public String handleSubmitButton(Student student, Model model)
	{
		System.out.println(student);
		
		// TODO: Logic to store data in DB
		
		model.addAttribute("name", student.getFirstName()+" "+student.getLastName());
		return "success";
		
	}
}
