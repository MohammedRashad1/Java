package com.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.ibs.training.hibernate.Student;

public class MainTest {

	public static void main(String[] args) {

		//configure hibernate environment
		Configuration configuration = new Configuration().configure();  //check for the hibernate.cfg.xml file in the class path
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		//creating session Factory is heavy process and do this only once in life cycle of application
		
		Session session=sessionFactory.openSession();  //opening DB connection
		Transaction tr=session.beginTransaction();	//starting transaction
		
		Student student = new Student();
		
		student.setId(1003);
		student.setName("Shabeer");
		student.setState("Kerala");
		student.setLocation("Ernakulam");
		
		session.save(student);
		//update method? update row(s)
		//delete method? - delete a row
		//load method - load a row using primary key
		//Query - using query you can retrieve multiple rows from table
		
		tr.commit();
		session.close();

	}

}
