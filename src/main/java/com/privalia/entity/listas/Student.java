package com.privalia.entity.listas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Student {
	
	protected int idStudent;
	protected String name;
	protected String surname;
	protected int age;
	private List<Teacher> listTeacher;
	
	public Student(){}
	
	public Student(int idStudent, String name, String surname, int age, List<Teacher> listTeacher) {
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.listTeacher = listTeacher;
	}
	
	
	/**
	 * @return the idStudent
	 */
	public int getIdStudent() {
		return idStudent;
	}

	/**
	 * @param idStudent the idStudent to set
	 */
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the listTeacher
	 */
	public List<Teacher> getListTeacher() {
		return listTeacher;
	}

	/**
	 * @param listTeacher the listTeacher to set
	 */
	public void setListTeacher(List<Teacher> listTeacher) {
		this.listTeacher = listTeacher;
	}

}
