package org.sampleprojects.employeeapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="dept_emp")
public class DepartmentEmployee {

	@Column(name="from_date")
	Date fromDate;
	
	@Column(name="to_date")
	Date toDate;
	
	public DepartmentEmployee() {
		super();
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	
	
	
}
