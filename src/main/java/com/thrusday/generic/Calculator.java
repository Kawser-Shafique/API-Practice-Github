package com.thrusday.generic;

public abstract class Calculator {
	// Using Contractor in Abstract class
	// Different DataType with Abstract Method and Class

	int a;
	long b;
	float c;
	double d;
	float total;
	double result;

	public Calculator(int a, long b, float c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public void sum() {
		System.out.println("The Sum value is = " + (a + b + c));
	}

	public float minus() {
		total = (b + c) - a;
		System.out.println("The Minus Value is = " + ((b + c) - a));
		return total;
	}

	public double division() {
		result = (b + c) / d;
		System.out.println("The Division Value is = " + ((b + c) / d));
		return result;
	}

	public abstract void multiplication();

}