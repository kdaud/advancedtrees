package com.serializable.save;

public class Main {
	
	static {
		System.out.println("From the main Class");
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("--------------");
		System.out.println();
		DOA.dosave();
	}
	
}
