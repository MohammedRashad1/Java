package com.Test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.ibs.training.hibernate.entity.Product;
import com.ibs.training.hibernate.entity.Sales;
import com.ibs.training.hibernate.entity.Stock;
import com.ibs.training.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProductName("Laptop");
		product.setProductPrice(75000);
		
		
		Sales sales1 = new Sales();
		sales1.setSaleQuantity(2000);
		sales1.setParentProduct(product);
		
		Sales sales2 = new Sales();
		sales2.setSaleQuantity(1000);
		sales2.setParentProduct(product);
		
		Sales sales3 = new Sales();
		sales3.setSaleQuantity(5000);
		sales3.setParentProduct(product);
		
		List<Sales> sales = new ArrayList<>();
		
		sales.add(sales1);
		sales.add(sales2);
		sales.add(sales3);
		
		product.setSales(sales);
		
		Stock stock = new Stock();
		stock.setQntyInHand(15000);
		stock.setParentProduct(product);

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		org.hibernate.Transaction tr=session.beginTransaction();
		session.save(product);
		session.save(stock);
		
		tr.commit();
		session.close();
		

	}

}
