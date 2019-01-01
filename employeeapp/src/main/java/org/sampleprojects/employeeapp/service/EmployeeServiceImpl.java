package org.sampleprojects.employeeapp.service;

import java.util.List;

import org.sampleprojects.employeeapp.dao.EmployeeDAOImpl;
import org.sampleprojects.employeeapp.model.Employees;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

	@Override
	public void insertEmployee(Employees employee) {
		employeeDAO.insertEmployee(employee);	
	}

	@Override
	public void updateEmployee(Employees employee) {
		employeeDAO.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int employeeID) {
		employeeDAO.deleteEmployee(employeeID);
	}

	@Override
	public List<Employees> listEmployees() {
		return employeeDAO.listEmployees();		
	}
	
	

}
