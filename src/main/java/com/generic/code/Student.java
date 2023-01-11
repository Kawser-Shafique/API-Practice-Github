package com.generic.code;

public class Student {

	//static String name = "Kawser";
	//int salary = 5000;

	static void name() {
		String name = "Kawser";
		System.out.println("Student name is " + name);
	}

	void salary() {
		int salary = 5000;
		System.out.println("Kawser salary is " + salary);
	}

	public static void main(String[] args) {

		Student.name();

		Student obj = new Student();
		obj.salary();
	}
}
