package com.ashsoft.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ashsoft.client.StockPriceClient;

@RestController
public class StockCalculationRestController {
    
	@Autowired
	private StockPriceClient client;
	@GetMapping("/calculate/{name}/{qty}")
	public ResponseEntity<String> calculate(@PathVariable("name") String companyName,
			@PathVariable("qty") Integer qty) {
		
		/*String endPointurl = "http://localhost:1111/getCost/{companyName}";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Double> forEntity = rt.getForEntity(endPointurl, Double.class, companyName);
      */
		 ResponseEntity<Double> forEntity = client.getStockPrice(companyName);
		
		if (forEntity.getStatusCodeValue() == 200) {
			Double body = forEntity.getBody();
			String response = "Total Cost is: " + body * qty;
			return new ResponseEntity<String>(response, HttpStatus.OK);
		}

		return null;
	}
}