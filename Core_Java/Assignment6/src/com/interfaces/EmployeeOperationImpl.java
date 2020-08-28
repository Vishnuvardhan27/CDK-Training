package com.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.io.EmpIOImpl;
import com.pojo.Employee;

public class EmployeeOperationImpl implements EmployeeOperation {

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		EmpIOImpl emp=new EmpIOImpl();
		List<Employee>empList=new ArrayList<>();
			empList=emp.readFromFile();
			empList.add(employee);
			emp.addToFile(empList);
			empList=emp.readFromFile();
		return true;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		EmpIOImpl emp=new EmpIOImpl();
		List<Employee>empList=emp.readFromFile();
		for(Employee e: empList){
			if(e.getEmpId()==id){
				e.setEmpName(name);
				emp.addToFile(empList);
				return e;
			}
		}
		return new Employee();
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		EmpIOImpl emp=new EmpIOImpl();
		List<Employee>empList=emp.readFromFile();
		for(Employee e: empList){
			if(e.getEmpId()==id){
				empList.remove(e);
				emp.addToFile(empList);
				return e;
			}
		}
		
		return new Employee();
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		EmpIOImpl emp=new EmpIOImpl();
		List<Employee>empList=emp.readFromFile();
		for(Employee e: empList){
			if(e.getEmpId()==id){
				return e;
			}
		}
			return new Employee();
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		EmpIOImpl emp=new EmpIOImpl();
		List<Employee>empList=emp.readFromFile();
		return empList;
	
	}

}
