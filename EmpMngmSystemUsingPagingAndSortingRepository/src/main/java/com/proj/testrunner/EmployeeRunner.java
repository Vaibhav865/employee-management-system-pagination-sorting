	package com.proj.testrunner;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;
	
	import com.proj.entity.Employee;
	import com.proj.service.EmployeeService;
	
	@Component
	public class EmployeeRunner implements CommandLineRunner {
		
		@Autowired
		EmployeeService service;
			
		@Override
		public void run(String... args) throws Exception {
			service.saveEmployees(List.of(
	
	                new Employee(101,"Rahul","IT",45000.0),
	                new Employee(102,"Priya","HR",40000.0),
	                new Employee(103,"Amit","Finance",50000.0),
	                new Employee(104,"Neha","Testing",42000.0),
	                new Employee(105,"Arjun","IT",55000.0),
	                new Employee(106,"Kavya","HR",47000.0),
	                new Employee(107,"Rohan","Admin",38000.0),
	                new Employee(108,"Sneha","IT",60000.0),
	                new Employee(109,"Anjali","Finance",52000.0),
	                new Employee(110,"Vikas","Testing",44000.0)
	        ));
			
	        System.out.println("\n===== PAGE 1 =====");
	        
	        service.getEmployeesByPage(0, 3).forEach(IO::println);
	        
	        System.out.println("\n===== PAGE 2 =====");
	        service.getEmployeesByPage(1, 3).forEach(IO::println);
	        
	        System.out.println("\n===== PAGE 3 =====");
	        service.getEmployeesByPage(2, 3).forEach(IO::println);
	        
	        System.out.println("\n===== PAGE 4 =====");
	        service.getEmployeesByPage(3, 1).forEach(IO::println);
	        
	        
	        System.out.println("\n===== SORT BY SALARY =====");
	
	        service.getEmployeesSortedBySalary().forEach(IO::println);
	        
	        System.out.println("\n===== SORT BY NAME =====");
	
	        service.getEmployeesSortedByName().forEach(IO::println);
	        
		}
	
	}
