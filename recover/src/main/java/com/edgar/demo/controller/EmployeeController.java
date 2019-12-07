package com.edgar.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.dependency.model.Employee;
import com.edgar.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> recoverEmployeeById(HttpServletRequest request, HttpServletResponse response, @PathVariable("id") String id){
		return new ResponseEntity<Employee>( employeeService.recoverEmployeeById(id) , HttpStatus.OK);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> recoverEmployeeById(HttpServletRequest request, HttpServletResponse response ){
		return new ResponseEntity<List<Employee>>( employeeService.recoverEmployee(), HttpStatus.OK);
	}
	
}
