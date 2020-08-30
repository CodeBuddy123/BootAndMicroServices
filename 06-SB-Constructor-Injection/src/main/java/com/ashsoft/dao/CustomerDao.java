package com.ashsoft.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
    
	public CustomerDao() {
		System.out.println("CustomerDao Constructor called.");
	}
	public String findNameById(Integer id)
	{
		return "Ashish";
	}
}
