package com.ashsoft.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STOCK-PRICE-API") 
public interface StockPriceClient {
	
	@GetMapping("/getCost/{companyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable("companyName") String companyName);
	
	/***
	 * Method Signature must be same as the method in StockPriceRestController
	 * except the method Name. Feign Client, sends a request by getting the details
	 * from Service Registry using name attribute mentioned in FeignClient Annotation
	 */
}
