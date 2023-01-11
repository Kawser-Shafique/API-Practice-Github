package com.abstraction.code;

public abstract class Teacher {

	public void getName(String schoolName) {
		System.out.println("Name of the School is " + schoolName);
	}

	public abstract void getTeacher(String teacherName);

	public abstract void getStudent(String studentName);

}
