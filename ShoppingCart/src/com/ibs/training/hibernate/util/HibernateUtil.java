package com.ibs.training.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

private static SessionFactory sessionFactory=null;
	
	private HibernateUtil() {}//private default constructor
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			Configuration configuration = new Configuration().configure();//check for the hibernate.cfg.xml file in teh class path
			
			ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
			registry.applySettings(configuration.getProperties());
			ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			//creating session Factory is heavy process and do this only once in life cycle of application
			
			
		}
		return sessionFactory;
	}

}
