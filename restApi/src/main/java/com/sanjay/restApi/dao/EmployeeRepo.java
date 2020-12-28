package com.sanjay.restApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjay.restApi.entity.Employees;

@Repository
public interface EmployeeRepo extends JpaRepository<Employees, Long> {

}
