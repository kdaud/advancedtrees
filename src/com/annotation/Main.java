package com.annotation;


public class Main {
	
	public static void main(String[] args) {
		Framework obj = new Framework();
		obj.code();
		//obj.notify();
		obj.mycodes();
		System.out.println(Math.abs(-567.8));
		System.out.println(Math.ceil(27.12));
		System.out.println(Math.floor(39.999));
		System.out.println(Math.max(29, 13));
		System.out.println(Math.min(34, 27));
		System.out.println(Math.sqrt(47));
		System.out.println(Math.pow(7, 2));
		exam();
	}
	public static void exam() {
		int y = 60;
		@SuppressWarnings("deprecation")
		Integer ii = Integer.valueOf(y);
		System.out.println(ii);
		Integer obj = Integer.valueOf(32);
		
		int jj = obj.intValue();
		System.out.println(jj);
	}
	
}
