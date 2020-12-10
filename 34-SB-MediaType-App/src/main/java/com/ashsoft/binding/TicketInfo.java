package com.ashsoft.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
	
	private String ticketId;
	private String pnrstatus;
	private String from;
	private String to;
	private Double ticketPrice;
}
