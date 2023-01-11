package com.coding.test;

public class SwapValue {

	public void getSwapValue(int a , int b) {
		System.out.println("Before Swap a Value = "+a);
		System.out.println("Before Swap b Value = "+b);
		
		a = a + b;
		b = a - b;
		System.out.println("After Swap b Value = "+b);
		a = a - b;
		System.out.println("After Swap a Value = "+a);
		
	}
}
