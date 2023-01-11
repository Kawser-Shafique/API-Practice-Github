package com.generic.code;



public class StringPractice {
	
	public static void main(String[] args) {
		
		String a ="United State of America";
		
		System.out.println(a.contains("United"));
		System.out.println(a.contains("State"));
		System.out.println(a.contains("of"));
		System.out.println(a.contains("America"));
		
		if(a.contains("America")) {
			System.out.println("My test is passed");
		}else {
			System.out.println("My Test is Failed");
		}
	}
	
	
	
	

}