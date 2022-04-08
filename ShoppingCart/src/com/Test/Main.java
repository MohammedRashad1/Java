package com.Test;

import com.ibs.training.hibernate.dao.ShoppingCartDAO;
import com.ibs.training.hibernate.dao.ShoppingCartDAOImpl;
import com.ibs.training.hibernate.entity.Product;



public class Main {


	public static void main(String[] args) {
		
		ShoppingCartDAO shopping = new ShoppingCartDAOImpl();
		
		
		Product product1 = new Product();
		product1.setProductName("Shirts");
		product1.setDescription("Shirts & T-shirts");
		product1.setPrice(500);
		
		//shopping.createProduct(product1);
		//shopping.removeProduct(1004);
		//shopping.listProducts();
		//shopping.updateProduct(product1);
		//shopping.checkProductAvailable(1002);
		shopping.findProduct(1005);
		
	


	}


}
