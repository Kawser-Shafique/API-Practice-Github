package com.abstraction.testrun;

import com.abstraction.code.Computer;

public class RunComputer {
	public static void main(String[] args) {

		Computer obj = new Computer();
		obj.getBrand("HP");
		obj.getTask();
		obj.getName("Apple");
		obj.getNature();

	}
}
