package com.proj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.proj.entity.Employee;

@Component
public interface EmployeeRepository  extends PagingAndSortingRepository<Employee, Integer>,CrudRepository<Employee, Integer>{

}
