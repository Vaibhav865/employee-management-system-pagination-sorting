package com.proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.proj.entity.Employee;
import com.proj.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> getEmployeesByPage(int pageNo, int pageSize) {
		return employeeRepository.findAll(PageRequest.of(pageNo, pageSize , Sort.by("employeeId"))).getContent();	
	}

	@Override
	public List<Employee> getEmployeesSortedBySalary() {
		return (List<Employee>) employeeRepository.findAll(Sort.by("salary"));
	}

	@Override
	public List<Employee> getEmployeesSortedByName() {
		return (List<Employee>) employeeRepository.findAll(Sort.by("employeeName"));
	}

	@Override
	public void saveEmployees(List<Employee> employees) {
		employeeRepository.saveAll(employees);
	}

}
