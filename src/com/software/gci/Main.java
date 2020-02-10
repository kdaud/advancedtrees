package com.software.gci;


public class Main {
	
	public static void main(String[] args) {
	Grades grades=new Grades();
		System.out.println(grades.mygrade((519.5), (107)));
		System.out.println("------------------------");
		System.out.println(grades.mygrade((519.5 + 105), (107 + 21)));
	}
}
