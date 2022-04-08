package com.main.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.ibs.hibernate.test.Laptop;
import com.ibs.hibernate.test.Student;

public class MainTester {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		
		Laptop laptop = new Laptop();
		laptop.setId(1003);
		laptop.setBrandname("MacBook");
		laptop.setPrice(150000);
		
		session.save(laptop);
		
		Student student = new Student();
		student.setRollno(22);
		student.setName("Shabeer");
		student.setPhone(812345675);
		student.setId(1002);
		session.save(student);
		
		tr.commit();
		session.close();

	}

}
