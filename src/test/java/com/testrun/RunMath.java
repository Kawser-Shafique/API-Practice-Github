package com.testrun;

import com.generic.code.Math;

public class RunMath {

	public static void main(String[] args) {

		Math obj = new Math(10, 20);
		Math.sum();

		obj.minus();
		obj.division();

		Math.multiplication();
	}
}
 