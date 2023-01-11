package com.generic.code;

public class Employee {
	
	static String name = "Kawser";
	int salary = 5000;
	static void name(){
		//System.out.println("Employee name is Kawser");
		//System.out.println("Employee name is = "+ name );
		System.out.println(name);
		
	}
	
	void salary(){
		//System.out.println("Kawser salary is 5000");
		//System.out.println("Kawser salary is = " + salary);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
		Employee.name();
		
		Employee obj = new Employee();
		obj.salary();
	}
}
