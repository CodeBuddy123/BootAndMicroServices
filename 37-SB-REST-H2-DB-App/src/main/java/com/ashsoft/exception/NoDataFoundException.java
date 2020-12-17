package com.ashsoft.exception;

@SuppressWarnings("serial")
public class NoDataFoundException extends RuntimeException {

	public  NoDataFoundException(String msg) {
		super(msg);
	}
}
