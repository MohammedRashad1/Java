package com.ibs.training.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LitmusEmployee")
public class Employee {
	
	@Id
	@Column(name="EmployeeID",length=6)
	private int employeeId;
	@Column(name="EmployeeNAME",length=10,updatable=false)
	//its recomemnded to set column updatable property as 'false' if you are not intend to update through hibernate
	
	private String employeeName;
	@Column(name="STATE",length=8, updatable=false)
	private String state;
	@Column(name="ADDRESS",length=20)
	private String location;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
