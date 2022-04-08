package com.ibs.training.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Litmus2021")
public class Student {
	
	@Id
	@Column(name="STUDENTID",length=6)
	private int id;
	@Column(name="STUDENTNAME",length=10)
	private String name;
	@Column(name="STATE",length=8)
	private String state;
	@Column(name="ADDRESS",length=20)
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
