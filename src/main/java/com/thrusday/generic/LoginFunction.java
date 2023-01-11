package com.thrusday.generic;

public abstract class LoginFunction {

	// login = void & static
	// userName = sarower
	// passWord = smart123$
	
	static String  userName = "sarower";
	static String  passWord = "smart123";
	public static void login() {
		
		System.out.println("This is login method");
		
		
		System.out.println(userName);
		System.out.println(passWord);
	}
	
	public static void registration() {
		System.out.println("This is registration method");
		System.out.println(userName);
		System.out.println(passWord);
	}
}

// variable name = username & password
// type = local(inside the method)