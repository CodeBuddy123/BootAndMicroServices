package com.ashsoft.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {
	
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String doj;
}
