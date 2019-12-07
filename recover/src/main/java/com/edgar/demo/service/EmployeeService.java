package com.edgar.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dependency.model.Employee;
import com.core.dependency.model.EmployeeEntity;
import com.core.dependency.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee recoverEmployeeById(String id) {
		return Employee.EntityToDto( employeeRepository.findById(id).isPresent() ? employeeRepository.findById(id).get() : null );
	}
	
	public List<Employee> recoverEmployee() {
		Iterator<EmployeeEntity> it = employeeRepository.findAll().iterator();
		List<EmployeeEntity> empList = new ArrayList<EmployeeEntity>();
		it.forEachRemaining(empList::add);
		return Employee.EntityToDto( empList );
	}
	
}
