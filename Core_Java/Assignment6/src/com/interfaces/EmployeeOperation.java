package com.interfaces;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeOperation {
	
	 boolean addEmployee(Employee employee);
	 Employee updateEmployee(int id, String name);
	 Employee deleteEmployee(int id);
	 Employee findEmployeeById(int id);
	 List<Employee> findAllEmployees();

}
