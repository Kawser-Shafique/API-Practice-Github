package com.polymorphism.testrun;

import com.polymorphism.code.ConstructorOverloading;

public class RunConstructorOverloading {

	public static void main(String[] args) {

		ConstructorOverloading obj = new ConstructorOverloading("Smarttech", "Jackson Heights", 11372);
		ConstructorOverloading obj1 = new ConstructorOverloading("Sarower Ahmed", "Sarower Ahmed");

		System.out.println("Best IT School is " + obj.name);
		System.out.println("School Located at " + obj.address);
		System.out.println("Zipcode of the School " + obj.zipcode);
		System.out.println("CEO of the School " + obj1.position);
		System.out.println("Best Trainer of the School " + obj1.trainer);
	}
}
