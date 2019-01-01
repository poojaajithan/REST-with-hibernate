package org.sampleprojects.employeeapp.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sampleprojects.employeeapp.model.Employees;
import org.sampleprojects.employeeapp.service.EmployeeServiceImpl;

@Path("employeecrud")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeController {
	
	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	
	@GET
	public List<Employees> listEmployees(){
		return employeeService.listEmployees();
	}
	
	@POST
	public void insertEmployee(Employees employee) {
		employeeService.insertEmployee(employee);
	}
	
	@PUT
	@Path("{employeeID}")
	public void updateEmployee(@PathParam("employeeID") int employeeID, Employees employee) {
		employee.setEmpNo(employeeID);
		employeeService.updateEmployee(employee);
	}
	
	@DELETE
	@Path("{employeeID}")
	public void deleteEmployee(@PathParam("employeeID") int employeeID) {
		employeeService.deleteEmployee(employeeID);
	}

}
