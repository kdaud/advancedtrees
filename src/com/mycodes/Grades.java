package com.mycodes;

import java.text.DecimalFormat;

public class Grades {
	
	private double points;
	
	private double crs;
	
	private double finaMarks;
	
	public Grades(double points, double crs) {
		finaMarks = points / crs;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Your current GPA for last semister is: " + decimalFormat.format(finaMarks));
	}

}
