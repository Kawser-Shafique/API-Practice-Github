package com.home.testrun;

import com.home.practice.ChildMath;

public class RunMath {

	public static void main(String[] args) {

		ChildMath obj = new ChildMath();

		obj.sum(10, 20, 30.50);
		obj.minus(15, 25, 35.50);
		obj.division(30, 40, 20.50);
		obj.multiplication(5, 10, 10.50);
		obj.getLooping("United States of America");
		obj.getReverseLooping("United States of America");
	}
}
