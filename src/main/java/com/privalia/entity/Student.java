package com.privalia.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Student {
	
	protected int idStudent;
	protected String name;
	protected String surname;
	protected int age;
	protected Address address;
	
	public Student(){}
	
	public Student(int idStudent, String name, String surname, int age, Address address) {
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
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
	 * @return the addres
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param addres the addres to set
	 */
	public void setAddress(Address addres) {
		this.address = addres;
	}

}
