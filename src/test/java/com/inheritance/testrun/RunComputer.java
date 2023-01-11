package com.inheritance.testrun;

import com.inheritance.code.Color;

public class RunComputer {

	public static void main(String[] args) {
		Color obj = new Color();
		
		obj.getBrand("HP");
		obj.getModel(2021);

		obj.getColor("Starry White");
		obj.getCategory("White");

		obj.getType("LED");
		obj.getSize(27);

		obj.getMemory(12);
		obj.getSpeed(8);
	}
}
