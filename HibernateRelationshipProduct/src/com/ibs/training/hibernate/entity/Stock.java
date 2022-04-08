package com.ibs.training.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="LitmusNovemberStock")
public class Stock {
	
	@Id
	@GenericGenerator(name="stockIDGenerator",strategy="increment")
	@GeneratedValue(generator="stockIDGenerator",strategy=GenerationType.AUTO)
	@Column(name="StockId",length=4)
	private int stockId;
	
	@Column(name="QuantityInHAND", length=7)
	private int qntyInHand;
	
	@OneToOne
	@JoinColumn(name="PRODUCTID")
	private Product parentProduct;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getQntyInHand() {
		return qntyInHand;
	}
	public void setQntyInHand(int qntyInHand) {
		this.qntyInHand = qntyInHand;
	}
	public Product getParentProduct() {
		return parentProduct;
	}
	public void setParentProduct(Product parentProduct) {
		this.parentProduct = parentProduct;
	}
	

}
