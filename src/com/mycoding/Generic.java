package com.mycoding;


public class Generic {
	
	public static <E> void printArray(E[] array) {
		for (E element : array) {
			System.out.printf("%s", element);
		}
	}
	
}
