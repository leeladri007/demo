package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empService.save(emp);
	}
}
