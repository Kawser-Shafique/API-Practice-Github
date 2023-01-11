package com.home.practice;

public abstract class Math {
	// Using Abstract class and  Method
	// Calculator 
	// Java String Loop (Positive and Negative)
	int a;
	int b;
	double c;

	public abstract void sum(int a, int b, double c);

	public abstract void minus(int a, int b, double c);

	public abstract void division(int a, int b, double c);

	public abstract void multiplication(int a, int b, double c);

	public abstract void getLooping(String name);

	public void getReverseLooping(String name) {
		System.out.println(" ");
		System.out.print("Reverse String Loop : ");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
