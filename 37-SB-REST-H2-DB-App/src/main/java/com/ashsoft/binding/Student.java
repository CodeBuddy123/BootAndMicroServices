package com.ashsoft.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@Entity
@Table(name = "STD_DETAILS")
public class Student {

	@Id
	@GeneratedValue
	private Integer sid;
	private String sname;
	private String saddr;
}
