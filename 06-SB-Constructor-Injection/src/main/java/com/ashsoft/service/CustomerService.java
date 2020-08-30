package com.ashsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashsoft.dao.CustomerDao;

@Service
public class CustomerService {
        private CustomerDao customerDao;
        
        public CustomerService() {
        	System.out.println("CustomerService  Zero-Constructor Called.");
		}
        @Autowired
        CustomerService(CustomerDao customerDao){
        	System.out.println("CustomerService  Param-Constructor Called.");
        	this.customerDao=customerDao;
        }
        public void display(Integer id) {
     	String name= customerDao.findNameById(id);
         System.out.println(name);
        }
}
