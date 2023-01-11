package com.calculator;

public class Math {

	int a = 20;
	int b = 30;
	int total;

	int sum() {

		total = a + b;
		System.out.println("The Sum is =" + total);
		return total;
	}

	void minus() {
		total = b - a;
		System.out.println("The Minus Result is =" + total);
	}

	public static void main(String[] args) {

		Math obj = new Math();
		obj.sum();
		obj.minus();

	}
}
