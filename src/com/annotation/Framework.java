package com.annotation;


public class Framework extends MobilePhone {
	

	@Override
	public void code() {
		System.out.println("Am in my way to over there in the glory land");
	}
	
	@Deprecated
	public void mycodes() {
		System.out.println("Am in deprecated method");
	}
	
}
