package com.generic.code;

public class Math {
	// Using Void, Non-Void (Return Method)Method,
	// Static method,Non-Static method
	// Passing Argument
	// Using Constructor

	static int a;
	static int b;
	static int total;

	public Math( int a,int b) {
		Math.a = a;
		Math.b = b; 

	}

	public static void sum() {
		System.out.println("The sum value is " + (a + b));
	}

	public int minus() {
		total = b - a;
		System.out.println("The Minus Value is " + (b - a));
		return total;
	}

	public int division() {
		total = b / a;
		System.out.println("The Division Value is  " + (b / a));
		return total;
	}

	public static int multiplication() {

		total = a * b;
		System.out.println("The Multiplication value is " + (a * b));
		return total;

	}

}
