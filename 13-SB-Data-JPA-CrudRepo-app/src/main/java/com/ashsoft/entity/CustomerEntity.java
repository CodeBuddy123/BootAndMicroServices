package com.ashsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CUST_TABLE")
public class CustomerEntity {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	private Integer customerId;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "CUSTOMER_EMAIL")
	private String customerEmail;

}
