package com.deepak.demo.modal;

import io.swagger.annotations.ApiModelProperty;

public class User {
	
	@ApiModelProperty(notes="User Name of the User")
	private String name;
	
	@ApiModelProperty(notes="Salary of the User")
	private Double salary;

	public User() {
		super();
	}

	public User(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
