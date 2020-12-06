package com.ashsoft.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashsoft.binding.User;
import com.ashsoft.binding.Users;

@RestController
public class UserRestController {
	
	@GetMapping(value = "/user", produces = {"application/xml", "application/json"})
	public ResponseEntity<User> getUser() {
		
		User user = new User();
		user.setUserId(111);
		user.setUserName("John");
		user.setUserEmail("John24@gmail.com");
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	

	@GetMapping(value = "/users", produces = {"application/xml", "application/json"})
	public ResponseEntity<Users> getUsers() {
		
		User user1 = new User();
		user1.setUserId(222);
		user1.setUserName("Ashish");
		user1.setUserEmail("ash@gmail.com");
		
		User user2 = new User();
		user2.setUserId(333);
		user2.setUserName("Raj");
		user2.setUserEmail("raj2@gmail.com");
		
		ArrayList<User>alist= new ArrayList<>();
		alist.add(user1);
		alist.add(user2);
		
		Users users = new  Users();
		users.setUser(alist);
		
       return new ResponseEntity<Users>(users,HttpStatus.OK);
	}
}
