package org.sampleprojects.employeeapp.service;

import java.util.List;

import org.sampleprojects.employeeapp.model.Employees;

public interface EmployeeService {

	void insertEmployee(Employees employee);
	void updateEmployee(Employees employee);
	void deleteEmployee(int employeeID);
	List<Employees> listEmployees();
 
}
