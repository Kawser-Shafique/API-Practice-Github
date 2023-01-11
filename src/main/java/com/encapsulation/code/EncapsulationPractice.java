package com.encapsulation.code;

public class EncapsulationPractice {
	
	private String name;
	private int age;
	private String location;
	
	
	public String getName() {
		System.out.println("My name is "+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("My age is "+age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		System.out.println("Employee lives in "+location);
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
