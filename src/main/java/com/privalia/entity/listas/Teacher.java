package com.privalia.entity.listas;

import java.util.List;

public class Teacher {

	private String name;
	private int id;

	public Teacher() {
		// TODO Auto-generated constructor stub
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teahcer Name: ");
		builder.append(this.name);
		builder.append(" ," );
		builder.append("Id: ");
		builder.append(this.id);
		
		return builder.toString();
	}
	
}
