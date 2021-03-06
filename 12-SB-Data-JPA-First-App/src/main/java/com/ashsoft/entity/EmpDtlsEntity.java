package com.ashsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "EMP_DTLS")
public class EmpDtlsEntity {
	
	@Id
	@Column(name = "E_ID")
	private int empId;
	
	@Column(name = "E_NAME")
	private String empName;
	
	@Column(name = "E_SAL")
	private double empSalary;

	
}
