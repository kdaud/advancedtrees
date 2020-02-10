package com.software.gci;

import java.util.Random;

public class Testing implements Performance {
	
	@Override
	public void myGrades() {
		Random random = new Random();
		double age = random.nextDouble();
		System.out.println("Age is : " + age);
		
	}
	
	@Override
	public void name() {
		System.out.println("Am at Bugema University");
		
	}
	
	@Override
	public void myTests() {
		// TODO Auto-generated method stub
		
	}
	
}
