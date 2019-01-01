package org.sampleprojects.employeeapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * https://dev.mysql.com/doc/employee/en/sakila-structure.html
 * https://www.boraji.com/spring-mvc-4-hibernate-5-restful-crud-operations-example
 * http://www.springboottutorial.com/spring-boot-rest-api-projects-with-code-examples
 */
@XmlRootElement
@Entity
@Table(name="employees")
public class Employees {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_no")
	int empNo;
	
	@Column(name="birth_date")
	Date birthDate;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="gender")
	char gender;
	
	@Column(name="hire_date")
	Date hireDate;
	
	public Employees() {
		super();
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	
}
