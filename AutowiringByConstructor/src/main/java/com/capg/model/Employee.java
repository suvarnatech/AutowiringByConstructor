package com.capg.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {
	private String empName;
	private Address address;
	public Employee(Address address) {
		super();
		this.address = address;
	}

// Only create parameterized constructor to Address parameter since value for empname is already provided in xml file	
}
