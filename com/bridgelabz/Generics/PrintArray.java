package com.bridgelabz.Generics;

public class PrintArray<T> {

	public static void main(String[] args) {
		//printing welcome message
		
		System.out.println("Welcome to Java Generics Program.");
		
		MaximumTest max = new MaximumTest();
		//using MaximumTest object max to call functions
		max.findIntMax();
		max.findFloatMaximum();
		max.findStringMaximum();
		
	}

}
