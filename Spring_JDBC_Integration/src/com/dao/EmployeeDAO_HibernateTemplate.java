package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pojo.Employee;

@Repository("hib_template")
public class EmployeeDAO_HibernateTemplate implements EmployeeDAO {

	@Autowired
	HibernateTemplate template;
	
	@Transactional
	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		template.save(employee);
		return 1;
	}

	@Override
	public int addEmployee1(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional
	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		template.update(employee);
		return false;
	}

	@Transactional
	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee employee = findEmployeeById(empId);
		template.delete(employee);

		return 1;
	}

	@Transactional(readOnly=true)
	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return template.get(Employee.class,empId);
	}

	@Override
	public List<Employee> findAllEMployees() {
		// TODO Auto-generated method stub
		return template.loadAll(Employee.class);
	}

}
