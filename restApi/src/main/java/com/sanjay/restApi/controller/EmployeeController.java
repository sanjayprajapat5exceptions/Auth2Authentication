package com.sanjay.restApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.restApi.entity.Employees;
import com.sanjay.restApi.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employees> showAllList()
	{
		return employeeService.getAllEmployees();
	}
	@GetMapping("/employee/{id}")
	public Employees findByEmployee (@PathVariable long id ) 
	{
		return this.employeeService.getEmployeeById(id);
	}
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable long id )
	{
		this.employeeService.deleteEmployeeById(id);
	}
	@PostMapping("/employee")
	public void employeeSave(@RequestBody Employees employee )
	{
		this.employeeService.saveEmployee(employee);
	}
	@PutMapping("/employee")
	public void insertEmployee(@RequestBody Employees employee)
	{
		this.employeeService.saveEmployee(employee);
	}
	
}
