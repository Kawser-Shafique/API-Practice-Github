package com.coding.test;

public class ReverseString {

	public void GetReverseValue(String name) {
		// Using StringBuffer or StringBuilder

		StringBuffer reverseData = new StringBuffer(name);
		// reverseData.reverse().toString();

		System.out.println("Before Reverse String value : " + name);
		
		String reverseText = reverseData.reverse().toString();
		
		System.out.println("After Reverse String Value : " + reverseText);

		if (name.equals(reverseText)) {
			System.out.println("This is Palindrome");
		} else {
			System.out.println("This is not a Palindrome");
		}

	}

}
