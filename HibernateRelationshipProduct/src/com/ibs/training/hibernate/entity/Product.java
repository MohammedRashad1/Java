package com.ibs.training.hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="LitmusNovemberProduct")
public class Product {
	
	@Id
	@GenericGenerator(name="productIDGenerator",strategy="increment")
	@GeneratedValue(generator="productIDGenerator",strategy=GenerationType.AUTO)
	@Column(name="PRODUCTID",length=4 )
	private int productId;
	
	@Column(name="PRODUCTNAME",length=20)
	private String productName;
	
	@Column(name="PRODUCTPRICE", precision=7,scale=2)
	private int productPrice;
	
	@OneToMany(mappedBy="parentProduct",cascade=CascadeType.ALL)
	private List<Sales>sales;
	
	@OneToOne(mappedBy="parentProduct",cascade=CascadeType.ALL)
	private Stock stock;

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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public List<Sales> getSales() {
		return sales;
	}

	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}

}
