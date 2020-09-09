package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Employee;

@Repository(value="template")
public class EmployeeDAO_jdbcTemplate implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int added = 0;
		String insertData = "insert into employee values(?,?,?,?)";

		added = jdbcTemplate.update(insertData,employee.getName(),employee.getEmpId(),employee.getTechnoogy(),employee.getSalary());
		return added;
	}

	@Override
	public int addEmployee1(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
		return 0;
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean added = false;
		String updateData = "update employee set empName=?, salary=? ,technology=? where empId=?";
		
		int num=jdbcTemplate.update(updateData,employee.getName(),employee.getSalary(),
				employee.getTechnoogy(),employee.getEmpId());
		
		if(num>0)
			added = true;
		
		return added;
	}

	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		int added = 0;
		String insertData = "delete from employee where empId=?";

		added = jdbcTemplate.update(insertData,empId);
				
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


		
		employee=(Employee) jdbcTemplate.queryForObject(findData,new Integer[] {empId} ,(set,count)->
		{
			return new Employee(set.getInt("empId"),set.getInt("salary"),set.getString("empName"),set.getString("technology"));
		});
//		
		
		
	
		return employee;
	}

	@Override
	public List<Employee> findAllEMployees() {
		// TODO Auto-generated method stub
		
		List<Employee> employees = jdbcTemplate.query("select * from employee", new RowMapper<Employee>()
		{

			@Override
			public Employee mapRow(ResultSet set, int arg1) throws SQLException 
			{
				
				Employee emp = new Employee();
				emp.setEmpId(set.getInt("empid"));
				emp.setName(set.getString("empname"));
				emp.setSalary(set.getInt("salary"));
				emp.setTechnoogy(set.getString("technology"));
				
				return emp;
			}
			
		});
		return employees;
		
	}
}


