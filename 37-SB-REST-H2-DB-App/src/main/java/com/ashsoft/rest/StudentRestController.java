package com.ashsoft.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashsoft.binding.Student;
import com.ashsoft.binding.Students;
import com.ashsoft.repository.StudentRepository;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepo;

	@PostMapping(value = "/add", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> addStudent(@RequestBody Student std) {

		Student student = studentRepo.save(std);
		String response = "Student Saved with ID as: " + student.getSid();

		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@GetMapping(value = "/get/{sid}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Student> getStudent(@PathVariable Integer sid) {

		Student std = null;
		Optional<Student> findById = studentRepo.findById(sid);
		if (findById.isPresent()) {
			std = findById.get();
		}
		return new ResponseEntity<Student>(std, HttpStatus.OK);
	}

	@PutMapping(value = "/update", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> updateStudent(@RequestBody Student std) {

		studentRepo.save(std);
		String response = "Student Updated with ID: " + std.getSid() + " Successfully..";

		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{sid}", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> deleteStudent(@PathVariable Integer sid) {

		studentRepo.deleteById(sid);
		String response = "Student with ID: " + sid + " Deleted Successfully..";

		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getall", produces = { "application/json", "application/xml" })
	public ResponseEntity<Students> getStudents(){
		List<Student> stdList = studentRepo.findAll();
		
		Students stds = new Students();
		stds.setStudents(stdList);

		return new ResponseEntity<Students>(stds,HttpStatus.OK);
	}
}
