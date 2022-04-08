package com.test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.ibs.training.hibernate.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		//configure hibernate environment 
		
				Configuration configuration = new Configuration().configure();//check for the hibernate.cfg.xml file in teh class path
				
				ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
				registry.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
				SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				//creating session Factory is heavy process and do this only once in life cycle of application
				
				
				Session session=sessionFactory.openSession();//opening DB connection
				
				Transaction tr=session.beginTransaction(); //starting transaction
				
				//your DB code??
				
				Employee employee=new Employee();
				
				employee.setEmployeeId(1005);
				employee.setEmployeeName("Adam");
				employee.setLocation("Kochin");
				employee.setState("Kerala");
				
//				session.save(employee);//save method helps to insert new row in the table
//				
				Query query=session.createQuery("from Employee where location=:location");
				
				query.setString("location","Kochin");
				
				List<Employee> employees=query.list();
				
				for(Employee emp:employees) {
					
					System.out.println(emp.getEmployeeId()+" : " +emp.getEmployeeName());
				}
//				

				
//				Employee searchEmployee=(Employee)session.load(Employee.class, 1003);
//				System.out.println(searchStudent.getEmployeeName());
//				searchEmployee.setLocation("Kochin");
//				session.update(searchEmployee);				
//				session.delete(searchEmployee);
//				

				
				
				
				
				tr.commit();
				session.close();
				

	}

}
