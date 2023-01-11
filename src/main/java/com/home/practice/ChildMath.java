package com.home.practice;

public class ChildMath extends Math {

	@Override
	public void sum(int a, int b, double c) {
		System.out.println("Sum Value is = " + (a + b + c));

	}

	@Override
	public void minus(int a, int b, double c) {
		System.out.println("Minus value is = " + ((a + b) - c));

	}

	@Override
	public void division(int a, int b, double c) {
		System.out.println("Division Value is = " + ((a + b) / c));

	}

	@Override
	public void multiplication(int a, int b, double c) {
		System.out.println("Multiplication Value is = " + (a * b * c));

	}

	@Override
	public void getLooping(String name) {
		System.out.print("Positive String Loop : ");
		for (int i = 0; i <= name.length() - 1; i++) {
			System.out.print(name.charAt(i));
		}

	}

}
