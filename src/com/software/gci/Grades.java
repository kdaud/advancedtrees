package com.software.gci;

import java.text.DecimalFormat;

public class Grades {
	
	public double mygrade(double points, double credithours) {
		double calculate = points / credithours;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println(decimalFormat.format(calculate));
		return calculate;
	}
	
}
