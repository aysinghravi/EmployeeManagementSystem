package com.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Employees")
@Data
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String phonenumber;
	private String email;
}
