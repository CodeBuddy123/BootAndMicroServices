package com.ashsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ORDERS_TBL")
public class Order {
	@Id
	@GeneratedValue(generator = "OID-SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "OID-SEQ",sequenceName = "ORDER_ID_SEQ", allocationSize =1 )
	@Column(name = "ORDER_ID")
	private Integer orderId;
	
	@Column(name = "ORDER_BY")
	private String orderBy;
	
	@Column(name = "ORDER_STATUS")
	private String orderStatus;
}
