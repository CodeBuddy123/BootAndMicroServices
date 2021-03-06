package com.ashsoft.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashsoft.entity.StockPrice;
import com.ashsoft.repository.StockPriceRepository;

@RestController
public class StockPriceRestController {
	@Autowired
	private StockPriceRepository repo;

	@GetMapping("/getCost/{companyName}")
	public ResponseEntity<Double> getCostByCompany(@PathVariable("companyName") String name) {
		StockPrice stockPriceObj = repo.findByCompanyName(name);
		Double stockCost = stockPriceObj.getStockCost();
		return new ResponseEntity<Double>(stockCost, HttpStatus.OK);
	}
}
