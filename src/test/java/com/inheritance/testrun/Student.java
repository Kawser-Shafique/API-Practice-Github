package com.inheritance.testrun;

import com.inheritance.code.School;

public class Student extends School {

	public static void main(String[] args) {

		School obj = new Student();
		obj.getName();
		obj.getData();
		obj.getLocation();
	}
}
