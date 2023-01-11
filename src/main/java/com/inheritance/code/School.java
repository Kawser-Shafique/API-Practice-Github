package com.inheritance.code;

public class School {

	protected String name = "Smarttech";
	protected String data = "Jackson Heights";
	protected int location = 11372;

	public void getName() {
		System.out.println("School name is " + name);
	}

	public void getData() {
		System.out.println("School located at " + data);
	}

	public void getLocation() {
		System.out.println("Zipcode of the School is " + location);
	}

}
