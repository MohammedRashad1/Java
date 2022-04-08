package com.ibs.training.SpringDependencyInjectionObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Bean Xml file is loaded");
		Student student = context.getBean("stud", Student.class);
		student.cheating();
		
		Student2 student2 = context.getBean("Student2", Student2.class);
		student2.startCheating();

	}

}
