package com.edgar.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dependency.model.Employee;
import com.core.dependency.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee employee) {
		return Employee.EntityToDto( employeeRepository.save( Employee.DtoToEntity(employee) ) );
	}
	
}
