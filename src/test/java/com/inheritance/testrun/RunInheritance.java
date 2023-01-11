package com.inheritance.testrun;

import com.inheritance.code.Bicycle;
import com.inheritance.code.Car;

public class RunInheritance {
	public static void main(String[] args) {
		Car car = new Car();
		car.getSpeed(50.50);
		car.go();
		car.stop();
		car.getDoors(4);
		car.getWheels(4);

		System.out.println("");

		Bicycle bicycle = new Bicycle();
		bicycle.getSpeed(5.5);
		bicycle.go();
		bicycle.stop();
		bicycle.getWheels(2);
		bicycle.getPedals(2);
	}

}
