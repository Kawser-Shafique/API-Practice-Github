package com.generic.code;

public class People {

	public String name;
	public int age;
	public double weight;

	public People(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void getData() {
		System.out.print("First Person Name is " + name + ".");
		System.out.print(" His age is " + age + ".");
		System.out.println(" His Weight is " + weight + ".");

	}

	public void getDataTwo() {
		System.out.print("Second Person Name is " + name + ".");
		System.out.print(" His age is " + age + ".");
		System.out.println(" His Weight is " + weight + ".");
	}

	public void eat() {
		System.out.println(name + " likes eating Kabab.");
	}

	public void drink() {
		System.out.println(name + " likes drinking Coke.");
	}
}
