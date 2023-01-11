package com.inheritance.code;

public class Car extends Vehicle {

	public void getSpeed(double speed) {
		System.out.println("This Car's Speed is " + speed + " miles per hour");
	}

	public void getDoors(int doors) {
		System.out.print("This Car has " + doors + " Doors");
	}

	public void getWheels(int wheels) {
		System.out.println(" and " + wheels + " Wheels");
	}
}
