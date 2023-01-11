package com.inheritance.code;

public class Bicycle extends Vehicle {

	public void getSpeed(double speed) {
		System.out.println("This Bicycle's Speed is " + speed + " miles per hour");
	}

	public void getWheels(int wheels) {
		System.out.print("This Bicycle has " + wheels + " Wheels");
	}

	public void getPedals(int pedals) {
		System.out.println(" and " + pedals + " Pedals");
	}
}
