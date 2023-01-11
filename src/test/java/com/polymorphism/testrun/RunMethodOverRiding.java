package com.polymorphism.testrun;

import com.polymorphism.code.MethodOverRidingOne;
import com.polymorphism.code.MethodOverRidingTwo;

public class RunMethodOverRiding {
public static void main(String[] args) {
	
	MethodOverRidingOne obj = new MethodOverRidingOne();
	System.out.println("These are the methods from MethodOverLodingOne");
	obj.getName("Smarttech");
	obj.getName("Kawser", 11372);
	
	MethodOverRidingTwo obj1 = new MethodOverRidingTwo();
	System.out.println("These are the Override method from MethodOverLodingOne");
	obj1.getName("Jackson Heights");
	obj1.getName("Sarower Ahmed",11372);
}
}
