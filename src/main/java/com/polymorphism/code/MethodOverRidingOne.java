package com.polymorphism.code;

public class MethodOverRidingOne {

	public void getName(String name) {
		System.out.println("Name of the School is "+ name);
	}
	
	public void getName(String data, int zipcode) {
		System.out.println("Name of the Student "+data);
		System.out.println("Zipcode of Student "+zipcode+"\n");
	}
}
