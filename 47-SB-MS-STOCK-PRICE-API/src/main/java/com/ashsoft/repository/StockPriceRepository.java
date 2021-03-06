package com.ashsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashsoft.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {
	
	StockPrice findByCompanyName(String name);

}
