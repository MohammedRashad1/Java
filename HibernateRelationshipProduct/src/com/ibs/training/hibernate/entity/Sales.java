package com.ibs.training.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="LitmusNovemberSales")
public class Sales {
	
	@Id
	@GenericGenerator(name="saleIDGenerator",strategy="increment")
	@GeneratedValue(generator="saleIDGenerator",strategy=GenerationType.AUTO)
	@Column(name="SALEID",length=5)
	private int saleId;
	
	@Column(name="SALEQUANTITY", length=6)
	private int saleQuantity;
	
	@ManyToOne
	@JoinColumn(name="PRODUCTID")
	private Product parentProduct;

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getSaleQuantity() {
		return saleQuantity;
	}

	public void setSaleQuantity(int saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public Product getParentProduct() {
		return parentProduct;
	}

	public void setParentProduct(Product parentProduct) {
		this.parentProduct = parentProduct;
	}
	
	
	
	

}
