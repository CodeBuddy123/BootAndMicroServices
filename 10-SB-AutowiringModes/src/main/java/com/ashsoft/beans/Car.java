package com.ashsoft.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	@Qualifier("diesel")
	private Engine engine;
	
	public void startJourney() {
		int i = engine.startEngine();
		if(i==0) {
			System.out.println("Journey Started");
		}
	}
}
