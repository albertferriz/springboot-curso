package com.privalia.condiciones.dao;

import com.privalia.condiciones.util.DataSource;

import java.util.List;

import com.privalia.condiciones.model.Employee;

public class EmployeeDAO {
	
	private DataSource dataSource;
	
	public EmployeeDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Employee> getEmployeeDetails() {
		return dataSource.getEmployeeDetails();
		
	}
	
}
