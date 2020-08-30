package com.ashsoft.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    
	public UserDaoImpl() {
		System.out.println("*** UserDaoImpl Constructor ***");
	}
	@Override
	public String findNameById(Integer id) {
		if(id==101) {
			return "ASHISH";
		}
		else if (id==102) {
			return "RAJESH";
		}
		else
		{
			return null;
		}
		
	}

}
