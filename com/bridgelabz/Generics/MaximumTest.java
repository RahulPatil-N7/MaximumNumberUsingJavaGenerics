package com.bridgelabz.Generics;

import org.junit.Assert;
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
	
	/* Test Case for the Integer where
	 *  maximum value at first position
	 */
	@Test
	public void integerAtFirstPosition() {
		Maximum maximum = new Maximum();
		int result = maximum.findMax(30, 20, 10);
		System.out.println("First Position is: " + result);
		int expected = 16;
		Assert.assertEquals(expected,result);
	}
	
	/* Test Case for the Integer where
	 *  maximum value at second position
	 */
	@Test
	public void integerAtSecondPosition() {
		Maximum maximum = new Maximum();
		int result = maximum.findMax(10, 20, 15);
		System.out.println("Second Position is: " + result);
		int expected = 20;
		Assert.assertEquals(expected,result);
	}
}
