package com.serializable;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	
	transient private String univ;
	
	private String name;
	
	/**
	 * @param id
	 * @param name
	 */
	public Employee(int id, String univ, String name) {
		super();
		this.id = id;
		this.univ = univ;
		this.name = name;
		
		System.out.println(" ID: " + id + " " + "\nUniversity: " + univ + "\nName: " + name);
	}
	
}
