package com.edgar.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@DeleteMapping("employee/{id}")
	public ResponseEntity<Object> recoverEmployeeById(HttpServletRequest request, HttpServletResponse response, @PathVariable("id") String id){
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<Object>( null, HttpStatus.NO_CONTENT );
	}
	
}