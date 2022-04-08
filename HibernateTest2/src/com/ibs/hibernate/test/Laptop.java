package com.ibs.hibernate.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LitmusLaptop2021")
public class Laptop {
	
	@Id
	@Column(name="BrandID", length=5)
	private int id;
	@Column(name="BrandName", length=20)
	private String brandname;
	@Column(name="Price", length=6)
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
