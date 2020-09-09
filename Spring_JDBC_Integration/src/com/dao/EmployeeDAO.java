package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.pojo.Employee;

public interface EmployeeDAO {
	int addEmployee(Employee employee);
	int addEmployee1(Employee employee) throws SQLException;
	boolean updateEmployee(Employee employee);
	int deleteEmployee(int empId);
	Employee findEmployeeById(int empId);
	List<Employee>findAllEMployees();

}
