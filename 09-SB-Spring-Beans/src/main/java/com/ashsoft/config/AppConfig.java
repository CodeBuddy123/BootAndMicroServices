package com.ashsoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashsoft.UiManager;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("App Config Constructor");
	}
	
	
	@Bean
	public UiManager instantiateManager() {
		return new UiManager();
	}
}
