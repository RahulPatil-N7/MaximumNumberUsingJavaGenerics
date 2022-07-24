package com.bridgelabz.Generics;

public class Maximum {
	//generic method to find maximum number
	public <T extends Comparable<T>> T findMax(T a, T b, T c) {
		System.out.println("\nThe Numbers/Strings are : " + a + ","+ b + "," + c);
		T max = a;
		if (max.compareTo(b) < 0) {
			max = b;
		}
		if (max.compareTo(c) < 0) {
			max = c;
		}
		return max;
	}
	
	/* method to find maximum
	 * number from 3 Integers   
	 */
	public void findIntMax() {
		Maximum maximum = new Maximum();
		
		Integer a = (int) (Math.random() * 1000);
		Integer b = (int) (Math.random() * 1000);
		Integer c = (int) (Math.random() * 1000);
		System.out.println("The maximum Integer is :\n"+ maximum.findMax(a, b, c));
	}
	
	/* method to find maximum
	 * number from 3 float numbers   
	 */
	public void findFloatMaximum() {
		Maximum maximum = new Maximum();
		
		Float num1 = (float) (Math.random() * 1000);
		Float num2 = (float) (Math.random() * 1000);
		Float num3 = (float) (Math.random() * 1000);
		System.out.println("The maximum float number is :\n"+ maximum.findMax(num1,num2,num3));
	}
	
	/* method to find maximum
	 * String from 3 strings   
	 */
	public void findStringMaximum() {
		Maximum maximum = new Maximum();
		
		String fruit1 = "Apple";
		String fruit2 = "Peach";
		String fruit3 = "Banana";
		System.out.println("The maximum string is :\n"+ maximum.findMax(fruit1,fruit2,fruit3));
	}
}
