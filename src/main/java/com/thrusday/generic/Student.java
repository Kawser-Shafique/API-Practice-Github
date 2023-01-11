package com.thrusday.generic;

public class Student {
	// Different Types of Variable

	// Global Variable
	String name;// Instance Variable
	double gas;// Instance Variable
	static double data;// Static Variable

	public void getData(String name, double gas, double data) {
		// Using Global Variable
		System.out.print("Name of the car " + name +".");
		System.out.print("Fuel cost is per gallon $" + gas +".");
		System.out.println("Average Fuel Cost Per Gallon is " + data +".");

	}

	public void getPayment(String name, double gas, double data) {
	// Using Global Variable, This method also can use same Global Variable
		System.out.print("Name of the car " + name +".");
		System.out.print("Fuel cost is per gallon $" + gas +".");
		System.out.println("Average Fuel Cost Per Gallon is " + data +".");
		// Using Local Variable
		String userName = "Neel";
		String passWord = "Neel123%";

		System.out.println("This is Payment Section");

		System.out.println("Username of this Section is " + userName);

		System.out.println("Password of this section is " + passWord);

	}

}
