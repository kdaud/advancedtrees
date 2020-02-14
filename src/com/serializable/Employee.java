package com.serializable;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	
	private String name;
	
	/**
	 * @param id
	 * @param name
	 */
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("ID: " + id + " " + "Name: " + name);
	}
	
}
