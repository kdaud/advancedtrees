package com.annotation;

@interface kdaud {
	
	String name();
	
	String email();
}

@kdaud(name = "Kdaud", email = "dkakumirizii@gmail.com")
public class MobilePhone {
	
}
