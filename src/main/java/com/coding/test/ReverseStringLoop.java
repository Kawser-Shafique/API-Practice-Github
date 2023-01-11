package com.coding.test;

public class ReverseStringLoop {

	public void getReverseData(String name) {

		String reverseText = "";
		
		for(int i = name.length()-1; i>=0;i--) {
			reverseText = reverseText + name.charAt(i);
		}
		
		if(name.equals(reverseText)) {
			System.out.println("This is a Palindrome ");
		}else {
			System.out.println("This is not a Palindrome");
		}
	}

}
