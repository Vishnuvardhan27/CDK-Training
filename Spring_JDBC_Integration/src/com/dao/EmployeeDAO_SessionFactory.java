package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Employee;


@Repository(value="factory")
public class EmployeeDAO_SessionFactory implements EmployeeDAO {
	
	@Autowired
	SessionFactory factory ;
	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction= session.beginTransaction();
		session.save(employee);
		transaction.commit();
		return 1;
	}

	@Override
	public int addEmployee1(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
		return 0;
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		
	return false;
		
	}

	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		int added = 0;
		
		return added;
	}

	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Employee employee = null;
		String findData = "Select * from employee where empid = ?";
		
//		employee = jdbcTemplate.queryForObject(findData , new Integer[] {empId} , new RowMapper<Employee>() {

//			@Override
//			public Employee mapRow(ResultSet set, int arg1) throws SQLException {
//				
//				Employee emp = new Employee();
//				emp.setEmpId(set.getInt(1));
//				emp.setName(set.getString(2));
//				emp.setSalary(set.getInt(3));
//				emp.setTechnoogy(set.getString(4));
//				return emp;
//			}
//			
//			
//		});

//		
		
		
	
		return employee;
	}

	@Override
	public List<Employee> findAllEMployees() {
		// TODO Auto-generated method stub
		
		
		return null;
		
	}
}


