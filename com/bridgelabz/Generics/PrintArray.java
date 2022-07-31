package com.bridgelabz.Generics;

import java.util.Arrays;

public class PrintArray<T> {

	public static void main(String[] args) {
		//printing welcome message
		System.out.println("Welcome to Java Generics Program.");
		Maximum max = new Maximum();
		
		//using Maximum object max to call functions
		max.printMax();
	}

}
