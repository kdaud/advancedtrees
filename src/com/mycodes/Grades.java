package com.mycodes;

import java.text.DecimalFormat;
import java.util.Random;

public class Grades {
	
	private double points;
	
	private double crs;
	
	private double finaMarks;
	
	public Grades(double points, double crs) {
		finaMarks = points / crs;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Your current GPA for last semister is: " + decimalFormat.format(finaMarks));
		System.out.println("Random value is: " + getValue());
	}
	
	//@Override
	public int getValue() {
		Random random = new Random();
		int myChance = random.nextInt(7);
		return myChance;
	}
	
	public Grades(int ff) {
		Double ffDouble = 4324.3433f + 4634.0d;
		System.out.println(ffDouble);
	}

}
