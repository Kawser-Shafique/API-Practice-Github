package com.home.testrun;

import com.home.practice.Baby;

public class HumanRun {
	public static void main(String[] args) {

		Baby obj = new Baby();
		obj.getName("This is Void Method");

		String name = obj.getLocation("This is Return or Non-Void Method");
		System.out.println(" and Return Value = " + name);

		Baby.getSalary("This is Static Method");

		String info = Baby.getInfo("This is Static With return Method");
		System.out.println(" and Return Value is = " + info);

		int money = obj.getMoney("This is Non-Static with Return Method");
		System.out.println(" and Return Value is = " + money);

		obj.getPayment("This is Abstract Method");

		Baby.getAddress("This is Non Abstract Method");
	}

}
