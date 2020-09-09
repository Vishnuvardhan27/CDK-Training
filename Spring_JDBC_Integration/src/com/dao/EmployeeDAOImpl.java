package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pojo.Employee;



@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	DataSource dataSource;
	
	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int added = 0;
		String insertData = "insert into employee values(?,?,?,?)";

		try {
			PreparedStatement ps = dataSource.getConnection().prepareStatement(insertData);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getEmpId());
			ps.setString(3, employee.getTechnoogy());
			ps.setInt(4, employee.getSalary());

			added = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return added;
	}


	@Override
	public int addEmployee1(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		int added = 0;
		String insertData = "insert into employee values(?,?,?,?)";

			PreparedStatement ps = dataSource.getConnection().prepareStatement(insertData);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getEmpId());
			ps.setString(3, employee.getTechnoogy());
			ps.setInt(4, employee.getSalary());

			added = ps.executeUpdate();
		return added;
	}

	
	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean added = false;
		String updateData = "update employee set empName=?, salary=? ,technology=? where empId=?";

		try {
			PreparedStatement ps = dataSource.getConnection().prepareStatement(updateData);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getSalary());
			ps.setString(3, employee.getTechnoogy());
			ps.setInt(4, employee.getEmpId());

			int updated = ps.executeUpdate();
			if (updated > 0) {
				added = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return added;
	}

	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		int added = 0;
		String insertData = "delete from employee where empId=?";

		try {
			PreparedStatement ps = dataSource.getConnection().prepareStatement(insertData);
			ps.setInt(1, empId);
			added = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return added;

	}

	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Employee employee = null;
		String findData = "select * from employee where empId=?";

		try {
			PreparedStatement ps = dataSource.getConnection().prepareStatement(findData);
			ps.setInt(1, empId);

			ResultSet set = ps.executeQuery();

			while (set.next()) {
				String name = set.getString(1);
				int id = set.getInt("empId");
				int sal = set.getInt("salary");
				String tech = set.getString("technology");
				employee = new Employee(id, sal, name, tech);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;

	}

	@Override
	public List<Employee> findAllEMployees() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		String findData = "select * from employee";

		try {
			Statement s = dataSource.getConnection().createStatement();

			ResultSet set = s.executeQuery(findData);

			while (set.next()) {
				String name = set.getString(1);
				int id = set.getInt("empId");
				int sal = set.getInt("salary");
				String tech = set.getString("technology");
				Employee employee = new Employee(id, sal, name, tech);
				employees.add(employee);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;

	}

}
