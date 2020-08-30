package com.ashsoft.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements ReportDao {
	
	public ReportDaoImpl() {
		System.out.println("** ReportDaoImpl :: Constructor **");
	}
	@Override
	public String findById(Integer id) {
		
		return "This is data of user: "+id;
	}

}
