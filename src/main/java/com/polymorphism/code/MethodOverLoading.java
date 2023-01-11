package com.polymorphism.code;

public class MethodOverLoading {
	// Method name same but different number of parameter and data type

	public void getData(String name) {
		System.out.println("Best IT School is " + name);
	}

	public void getData(String address, int zipcode) {
		System.out.println("Located at " + address);
		System.out.println("School's zipcode is " + zipcode);
	}

	public void getData(String position, String trainer) {
		System.out.println("CEO of the School " + position);
		System.out.println("Best Trainer of the School " + trainer);
	}
}
