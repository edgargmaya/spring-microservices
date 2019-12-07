package com.core.dependency.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmployeeEntity {

	@Id
	private String idEmployee;
	private String name;
	private String surName;
	private float salary;

	public EmployeeEntity() {
	}

	public EmployeeEntity(String idEmployee, String name, String surName, float salary) {
		this.name = name;
		this.surName = surName;
		this.idEmployee = idEmployee;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
