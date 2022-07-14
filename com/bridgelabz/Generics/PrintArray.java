package com.bridgelabz.Generics;

public class PrintArray<T> {

	public void toPrint(T[] arr) {
		System.out.println("Integer Array:");
		for (T t : arr) {
			System.out.print(t + "  ");
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		//printing welcome message
		MaximumTest max = new MaximumTest();
		System.out.println("Welcome to Java Generics Program.");
		Integer[] integerArr = new Integer[] { 1,2,3,4,6,7,8,9};
		PrintArray<Integer> printArr = new PrintArray<Integer>();
		printArr.toPrint(integerArr);
		max.findIntMax();
		max.findFloatMaximum();
		max.findStringMaximum();
		
	}

}
