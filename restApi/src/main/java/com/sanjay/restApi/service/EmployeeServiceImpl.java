package com.sanjay.restApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.restApi.dao.EmployeeRepo;
import com.sanjay.restApi.entity.Employees;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employees> getAllEmployees() {
		
		return employeeRepo.findAll();
	}

	@Override
	public void saveEmployee(Employees employee) {
		
		this.employeeRepo.save(employee);
		
	}

	@Override
	public Employees getEmployeeById(long id) {
		Optional<Employees> optional = employeeRepo.findById(id);
		Employees employee = null;
		if(optional.isPresent())
			
		{
			employee=optional.get();
		}
		else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		
		this.employeeRepo.deleteById(id);
	}

}
