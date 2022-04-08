package com.ibs.hibernate.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTDETAILS") 
public class Student {
	
	@Id
	@Column(name="ID",length=4)
	private int rollno;
	@Column(name="StudentName", length=20)
	private String name;
	@Column(name="PhoneNo",length=12)
	private double phone;
	@Column(name="BrandID",length=5)
	private int id;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
