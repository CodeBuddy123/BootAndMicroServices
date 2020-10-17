package com.ashsoft.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<String> getGenders(){
		
		List<String>genders = new ArrayList();
		genders.add("Male");
		genders.add("Female");	
		return genders;
	}
	
	public List<String> getCourses(){
		List<String>courses = new ArrayList();
		
		courses.add("Java");
		courses.add("Python");
		courses.add("Selenium");
		courses.add("Docker");
		return courses;
	}
	
	public List<String> getTimings(){
		List<String>timings = new ArrayList();
		
		timings.add("Morning");
		timings.add("Afternoon");
		timings.add("Evening");
		return timings;
	}
}
