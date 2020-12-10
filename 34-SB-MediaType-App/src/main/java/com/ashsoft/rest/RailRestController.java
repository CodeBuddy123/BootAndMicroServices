package com.ashsoft.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashsoft.binding.PassengerInfo;
import com.ashsoft.binding.TicketInfo;

@RestController
public class RailRestController {
	
	@PostMapping(value = "/bookticket",
			     produces = { "application/json",
			    		       "application/xml"
	
			     } ,
			     consumes = {
			    		      "application/json",
			    		      "application/xml"
			     }
			)
	public ResponseEntity<TicketInfo> bookRailTicket(@RequestBody PassengerInfo pinfo){
		
		TicketInfo tinfo = new TicketInfo();
		
		
		tinfo.setPnrstatus("CONFIRMED...");
		tinfo.setFrom(pinfo.getFrom());
		tinfo.setTicketPrice(5500.00);
		tinfo.setTo(pinfo.getTo());
		tinfo.setTicketId("145785");
		
		//System.out.println(tinfo);
	
		return new ResponseEntity<>(tinfo,HttpStatus.CREATED);
	}
}
