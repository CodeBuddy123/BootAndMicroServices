package com.ashsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashsoft.binding.Customer;

@Controller
public class CustomerController {
	
	@GetMapping("/customer")
	public String loadForm(Model model) {
		Customer cust = new Customer();
		model.addAttribute("customer", cust);
		return "customerform";
	}

	@PostMapping("/customer")
	public String displayCustomerDetails(Model model, Customer custObj) {
		
		model.addAttribute("customer", custObj);
		return "display";
	}
}
