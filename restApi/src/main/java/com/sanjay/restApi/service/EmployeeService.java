package com.sanjay.restApi.service;

import java.util.List;

import com.sanjay.restApi.entity.Employees;

public interface EmployeeService {
	
	public List<Employees> getAllEmployees();
	public void saveEmployee(Employees employee);
	public Employees getEmployeeById(long id);
	public void deleteEmployeeById(long id);
}
