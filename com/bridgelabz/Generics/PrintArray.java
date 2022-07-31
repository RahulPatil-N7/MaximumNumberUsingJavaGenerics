package com.bridgelabz.Generics;

import java.util.Arrays;

public class PrintArray<T> {

	public static void main(String[] args) {
		//printing welcome message
		System.out.println("Welcome to Java Generics Program.");
		Maximum max = new Maximum();
		
		//using Maximum object max to call functions
		System.out.println("The Maximum integer num is:" + max.findMaxList(Arrays.asList(39, 57, 88, 65, 12, 98)));
		System.out.println("The Maximum float num is:" + max.findMaxList(Arrays.asList(5.4, 3.7, 8.9, 1.9, 9.9, 4.2)));
		System.out.println("The Maximum String  is:" + max.findMaxList(Arrays.asList("Banana", "Apple", "Peach", "Mango", "Orange")));
	}

}
