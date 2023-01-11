package com.thrusday.generic;

public class Math extends Calculator {

	public Math(int a, long b, float c, double d) {
		super(a, b, c, d);

	}

	@Override
	public void multiplication() {

		result = (a + b) * d;
System.out.println("The Multiplication value = " + ((a + b) * d));

	}

}
