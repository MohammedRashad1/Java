package com.ibs.training.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibs.training.hibernate.entity.Product;
import com.ibs.training.hibernate.util.HibernateUtil;

public class ShoppingCartDAOImpl implements ShoppingCartDAO {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction tr = session.beginTransaction();

	@Override
	public boolean createProduct(Product product) {
		
		session.save(product);
		
		tr.commit();
		session.close();
		
		
		return false;
	}

	@Override
	public boolean removeProduct(int id) {
		
		Product searchProduct = (Product) session.load(Product.class, id);
		session.delete(searchProduct);
		tr.commit();
		session.close();
	
		return false;
	}
	

	@Override
	public List<Product> listProducts() {
		
		Query query=session.createQuery("from Product");
		
		List<Product> products=query.list();
		
		for(Product pds:products) {
			
			System.out.println(pds.getProductId()+" : " +pds.getProductName());
		}
		tr.commit();
		session.close();
		return null;
		
		
	}

	@Override
	public boolean updateProduct(Product product) {
		Product searchProduct = (Product) session.load(Product.class, 1001);
		searchProduct.setProductName("Mobile Phone" );
		session.update(searchProduct);
		tr.commit();
		session.close();
		
		return false;
	}

	@Override
	public boolean checkProductAvailable(int productId) {
		
		Product searchProduct = (Product) session.get(Product.class, productId);
		try{
			if (session.contains(searchProduct)==true){
			System.out.println("Product Available");
			}
			else{
				System.out.println("Product Not Available");
			}
		}
		catch(Exception e){
			System.out.println("Exception Occured");
		}
		
		return false;
	}

	@Override
	public Product findProduct(int productId) {
		Product searchProduct=(Product) session.get(Product.class, productId);
		if(searchProduct!=null){
			System.out.println(searchProduct);
		}
		else{
			System.out.println("Product Not Found");
		}
		
		return null;
	}

}
