package com.abstraction.code;

public class Student extends Teacher {

	@Override
	public void getTeacher(String teacherName) {
		System.out.println("Name of the Teacher is " + teacherName);

	}

	@Override
	public void getStudent(String studentName) {
		System.out.println("Name of the Student is " + studentName);

	}

}
