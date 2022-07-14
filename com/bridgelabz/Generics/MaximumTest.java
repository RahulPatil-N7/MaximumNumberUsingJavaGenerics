package com.bridgelabz.Generics;

import org.junit.Test;

public class MaximumTest {
	/* Test method to find maximum
	 * number from 3 Integers   
	 */
	@Test
	public void findIntMax() {
		Maximum maximum = new Maximum();
		
		Integer a = (int) (Math.random() * 1000);
		Integer b = (int) (Math.random() * 1000);
		Integer c = (int) (Math.random() * 1000);
		System.out.println("The maximum Integer is :"+ maximum.findMax(a, b, c));

	}
}
