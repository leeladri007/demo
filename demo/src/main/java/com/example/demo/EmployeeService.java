package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee save(Employee emp) {
		return empRepo.save(emp);
	}
}
