package com.ashsoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionMapper {
	
	@ExceptionHandler
	public ResponseEntity<String> handleNoDataFoundException(Exception e){
		String message = e.getMessage();
		return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
	}
}
