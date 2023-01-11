package com.testrun;

import com.generic.code.People;

public class RunPeople {

	public static void main(String[] args) {

		People personOne = new People("Neel", 35, 85.5);
		People personTwo = new People("Kawser", 38, 80.5);

		personOne.getData();
		personOne.eat();

		personTwo.getDataTwo();
		personTwo.drink();
	}

}
