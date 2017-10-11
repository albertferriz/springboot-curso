package com.privalia.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student1 = (Student) context.getBean("studentSetter");
		System.out.println(student1.getName());
		
		Student student2 = (Student) context.getBean("studentConst");
		System.out.println(student2.getName());

	}

}
