package com.ibs.training.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PRODUCTLIST")
public class Product {
	
	@Id
	@GenericGenerator(name="IncrementGenerator", strategy="increment")
	@GeneratedValue(generator="IncrementGenerator", strategy=GenerationType.AUTO)
	@Column(name="PRODUCTID")
	private int productId;
	@Column(name="PRODUCTNAME")
	private String productName;
	@Column(name="PRODUCTDESCRIPTION")
	private String description;
	@Column(name="PRODUCTPRICE")
	private double price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + "]";
	}

	
}
