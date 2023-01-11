package com.abstraction.code;

public class Computer implements Keyboard, Mouse {

	@Override
	public void getBrand(String brand) {
		System.out.println("Brand of the Keyboard is " + brand);

	}

	@Override
	public void getTask() {
		System.out.println("We can type by using Keyboard");

	}

	@Override
	public void getName(String name) {
		System.out.println("Brand name of the Mouse is " + name);

	}

	@Override
	public void getNature() {
		System.out.println("We can click by using Mouse ");

	}

}
