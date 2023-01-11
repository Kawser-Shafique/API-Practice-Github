package com.polymorphism.code;

public class ConstructorOverloading {
	// Constructor Overloading

	public String name;
	public String address;
	public int zipcode;
	public String position;
	public String trainer;

	public ConstructorOverloading(String name, String address, int zipcode) {
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
	}

	public ConstructorOverloading(String position, String trainer) {
		this.position = position;
		this.trainer = trainer;
	}

}
