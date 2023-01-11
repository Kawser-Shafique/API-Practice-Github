package com.home.practice;

public class People {

	static String name;
	static String location;
	int age;
	double weight;

	public People(String name, String location, int age, double weight) {
		People.name = name;
		People.location = location;
		this.age = age;
		this.weight = weight;
	}

	public void getNameOne() {
		System.out.print("First Client Name is " + name + " . ");
		System.out.print("He lives in " + location + " . ");
		System.out.print("His Age is " + age + " . ");
		System.out.print(" And his Weight is " + weight + "kg. ");
	}

	public void getNameTwo() {
		System.out.print("Second Client Name is " + name + " . ");
		System.out.print("He lives in " + location + " . ");
		System.out.print("His Age is " + age + " . ");
		System.out.print(" And his Weight is " + weight + "kg. ");
	}

	public void hobby() {
		System.out.print(name + " likes to play Cricket .");
	}

	public void sports() {
		System.out.print(name + " likes to play Football .");

	}
}
