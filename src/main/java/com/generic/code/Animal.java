package com.generic.code;

public class Animal {
	
	//void salary(){
		
	//}
	
	static void income(){
		
	}
	
	static int login(){
	return 10;	
	}
	
	void run(){
		System.out.println("Run");
	}
	static void sleep(){
		System.out.println("Sleep");
	}
	static int salary(){
		return 10;
	}
	
	public static void main(String[] args) {
		
		Animal.sleep();
		
		Animal dog = new Animal();
		dog.run();
		
		Animal.salary();
	}
}
