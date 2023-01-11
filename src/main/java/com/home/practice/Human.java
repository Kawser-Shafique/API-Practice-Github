package com.home.practice;

public abstract class Human {
	// All Types of Method

	public void getName(String methodTypeOne) {
		System.out.println(methodTypeOne);
	}

	public String getLocation(String methodTypeTwo) {
		System.out.print(methodTypeTwo);
		return "Kawser";
	}

	public static void getSalary(String methodTypeThree) {
		System.out.println(methodTypeThree);
	}

	public static String getInfo(String methodTypeFour) {
		System.out.print(methodTypeFour);
		return "Jackson Heights";
	}

	public int getMoney(String methodTypeFive) {
		System.out.print(methodTypeFive);
		return 5000;
	}

	public abstract void getPayment(String methodTypeSix);

	public static void getAddress(String methodTypeSeven) {
		System.out.println(methodTypeSeven);
	}
}
