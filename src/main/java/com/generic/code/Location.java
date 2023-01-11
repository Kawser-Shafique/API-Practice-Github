package com.generic.code;

public class Location {
	// Using Constructor with different method parameter
	String name;
	String address;
	int zipCode;
	String position;
	String trainer;

	public Location(String name, String address, int zipCode, String position, String trainer) {
		this.name = name;
		this.address = address;
		this.zipCode = zipCode;
		this.position = position;
		this.trainer = trainer;
	}

	public void getData() {
		// System.out.println("Best IT School is " + name);
		System.out.println("Best IT School is " + name);
		System.out.println("Located at " + address);
		System.out.println("School's Zipcode is " + zipCode);
	}

	public void getEmployee() {
		System.out.println("CEO of the School " + position);
		System.out.println("Best Trainer of the School " + trainer);
	}
}
 