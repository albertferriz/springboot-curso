package com.privalia.entity;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student1 = (Student) context.getBean("studentSetter");
		
		StringBuilder texto = new StringBuilder();
		texto.append(student1.getIdStudent());
		texto.append(" , ");
		texto.append(student1.getName());
		texto.append(" , ");
		texto.append(student1.getSurname());
		texto.append(" , ");
		texto.append(student1.getAge());
		texto.append(" , ");
		texto.append(student1.getAddress().getIdAddress());
		texto.append(" , ");
		texto.append(student1.getAddress().getStreet());
		
		System.out.println(texto);
		
		
		
		Student student2 = (Student) context.getBean("studentConst");
		
		StringBuilder texto2 = new StringBuilder();
		texto2.append(student1.getIdStudent());
		texto2.append(" , ");
		texto2.append(student1.getName());
		texto2.append(" , ");
		texto2.append(student1.getSurname());
		texto2.append(" , ");
		texto2.append(student1.getAge());
		texto2.append(" , ");
		texto2.append(student1.getAddress().getIdAddress());
		texto2.append(" , ");
		texto2.append(student1.getAddress().getStreet());
		
		System.out.println(texto2);
		
		
	}

}
