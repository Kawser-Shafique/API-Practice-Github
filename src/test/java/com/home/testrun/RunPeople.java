package com.home.testrun;

import com.home.practice.People;

public class RunPeople {
	public static void main(String[] args) {

		People clientOne = new People("Kawser", "Jackon Heights", 30, 80.50);
		People clientTwo = new People("Neel", "Queens", 35, 90.50);

		clientOne.getNameOne();
		clientOne.hobby();

		System.out.println(" ");

		clientTwo.getNameTwo();
		clientTwo.sports();
	}
}
