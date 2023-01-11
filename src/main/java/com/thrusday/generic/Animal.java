package com.thrusday.generic;

public abstract class Animal {
	// Abstract Class can handle All types of Method including Abstract method
	// Void Method
	public void getSalary(String methodTypeOne) {
		System.out.println(methodTypeOne);
	}
	// Non-Void method or Return Method
	public String getName(String methodTypeTwo) {
		System.out.print(methodTypeTwo);
		return "Kawser";
	}
	// static method
	public static void getPayment(String methodTypeThree) {
		System.out.println(methodTypeThree);
	}
	// Static with Return method
	public static String getLocation(String methodTypeFour) {
		System.out.print(methodTypeFour);
		return "Jackson Heights";
	}
	// Non-Static with Return Method
	public int getMoney(String methodTypeFive) {
		System.out.print(methodTypeFive);
		return 100;
	}
	// Abstract method >> no body
	public abstract void getInfo(String methodTypeSix);

	// Non Abstract Method >> with Body >> regular method
	public void getLogin(String login) {
		System.out.println(login);
	}
}
