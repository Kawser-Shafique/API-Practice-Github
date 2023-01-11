package com.polymorphism.code;

public class MethodOverRidingTwo extends MethodOverRidingOne {

	@override
	public void getName(String address) {
		System.out.println("School located at  "+ address);
	}
	@override
	public void getName(String data,int zipcode) {
		System.out.println("CEO of the School  "+ data);
		System.out.println("School's Zipcode "+zipcode);
	}
}
