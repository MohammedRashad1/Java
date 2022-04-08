package com.ibs.training.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="LITMUS2021")
public class Student {

	private int studentId;
	
	@Id
	@GenericGenerator(name="myGenerator",strategy="increment")
	@GeneratedValue(generator="myGenerator",strategy=GenerationType.AUTO)
	@Column(name="STUDENTID")
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

@Column(name="STUDENTNAME")
	public String getStduentName() {
		return stduentName;
	}

	public void setStduentName(String stduentName) {
		this.stduentName = stduentName;
	}
@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
@Column(name="STATE")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private String stduentName,address,state;
	
	
	
}
