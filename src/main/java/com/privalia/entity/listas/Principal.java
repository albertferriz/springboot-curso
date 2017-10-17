package com.privalia.entity.listas;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.privalia.entity.listas.Student;

public class Principal {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Student student = (Student) context.getBean("StudentWithTeachers");
		
		List<Teacher> teachers = student.getListTeacher();
		
		for(Teacher teacher : teachers) {
			System.out.println(teacher.toString());
		}
	}
	
}
