package com.polymorphism.testrun;

import com.polymorphism.code.MethodOverLoading;

public class RunMethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();

		obj.getData("Smarttech");
		obj.getData("Jackson Heights", 11372);
		obj.getData("Sarower Ahmed ", "Sarower Ahmed");
	}
}
