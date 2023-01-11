package com.encapsulation.testrun;

import com.encapsulation.code.EncapsulationPractice;

public class RunEncapsulation {

	public static void main(String[] args) {
		
		EncapsulationPractice obj = new EncapsulationPractice();
		
		obj.setName("Kawser");
		obj.setAge(35);
		obj.setLocation("Jackson Heights");
		
		obj.getName();
		obj.getAge();
		obj.getLocation();
	}
}
