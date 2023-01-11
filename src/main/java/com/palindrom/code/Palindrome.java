package com.palindrom.code;

public class Palindrome {

	public void getData(String text) {

		StringBuffer word = new StringBuffer(text);

		String revText = word.reverse().toString();

		if (text.equals(revText)) {
			System.out.println("This is a Palindrome ");
		} else {
			System.out.println("This is not a Palindrome");
		}
	}
}
