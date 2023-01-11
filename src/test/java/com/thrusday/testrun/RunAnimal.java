package com.thrusday.testrun;

import com.thrusday.generic.Animal;
import com.thrusday.generic.Human;

public class RunAnimal {

	public static void main(String[] args) {
		// call the method to main method
		// cannot create object
		// Need to make relation with normal class to create object
		Human obj = new Human();
		obj.getSalary("This is Void Method");
		
		String name = obj.getName("This is non-void Method ");
		System.out.println("and Return value is = " + name);

		Animal.getPayment("This is Static Method");

		String location = Animal.getLocation("This is Static with Return Method ");
		System.out.println("and Return Value is = " + location);

		int payment = obj.getMoney("This is Non-Static with Return Method ");
		System.out.println("and Retrun value is = " + payment);

		obj.getInfo("This is Overriden Abstract method");

		obj.getLogin("This is Non-Abstract Method");

	}

}
