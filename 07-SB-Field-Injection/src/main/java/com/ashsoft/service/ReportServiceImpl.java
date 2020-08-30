package com.ashsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashsoft.dao.ReportDao;

@Service
public class ReportServiceImpl implements ReportService {
	
	public ReportServiceImpl() {
		System.out.println("** ReportServiceImpl : Constructor**");
	}
	
	@Autowired
	private ReportDao reportDao;  //Field Injection
	
	@Override
	public void generateReport(Integer id) {
		
       String data=reportDao.findById(id);
       System.out.println(data);
	}

}
