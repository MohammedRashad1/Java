package com.ibs.training.hibernate.dao;

import java.util.List;
import com.ibs.training.hibernate.entity.Product;


public interface ShoppingCartDAO {
	
	public boolean createProduct(Product product);
	
	public boolean removeProduct(int id);
	
	public List<Product> listProducts();
	
	public boolean updateProduct(Product product);
	
	public boolean checkProductAvailable(int productId);
	
	public Product findProduct(int productId);
	

}
