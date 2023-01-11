package com.sunday.generic;

public class LoginFunction {
	// Swap variable value
	// How to swap two different variable value 

	public void getData(int a,int b ) {

		System.out.println("Before Swap a value = " +a);
		System.out.println("Before Swao b Value = " +b);
		
		a = a + b;// 20 + 30 = 50
		System.out.println("Current a value  = " +a);
		b = a - b;// 50 - 30 = 20
		System.out.println("After Swap b value  = " +b);
		a = a - b;// 50 - 20 = 30
		System.out.println("After Swap a value = " +a);
		
	}


}
