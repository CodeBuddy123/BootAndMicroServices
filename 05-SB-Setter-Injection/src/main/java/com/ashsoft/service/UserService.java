package com.ashsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashsoft.dao.UserDao;

@Service
public class UserService {
	public UserService() {
		System.out.println("*** UserService Constructor ***");
	}
	
	private UserDao userDao;
	
	@Autowired // setter method is called and dependency injection is performed
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void getName(Integer id) {
		String name= userDao.findNameById(id);
		System.out.println(name);
	}
}
