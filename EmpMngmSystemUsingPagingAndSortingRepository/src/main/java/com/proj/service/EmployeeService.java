package com.proj.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.proj.entity.Employee;

@Component

public interface EmployeeService {
		
		List<Employee> getEmployeesByPage(int pageNo , int pageSize);
		List<Employee> getEmployeesSortedBySalary();
		List<Employee> getEmployeesSortedByName();
	    void saveEmployees(List<Employee> employees);

}
