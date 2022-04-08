package com.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibs.training.hibernate.entity.Student;
import com.ibs.training.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		Student student = new Student();
		student.setAddress("Kottayam");
		student.setStduentName("Sani");
		student.setState("Kerala");
		
		session.save(student);
		
		tr.commit();
		session.close();
	}

}
