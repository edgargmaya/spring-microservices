package com.edgar.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.dependency.model.Employee;
import com.edgar.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeRepository;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> createEmployee(HttpServletRequest request, HttpServletResponse response, @Validated @RequestBody Employee employee){
		return new ResponseEntity<Employee>( employeeRepository.createEmployee(employee), HttpStatus.CREATED);
	}
	
}
