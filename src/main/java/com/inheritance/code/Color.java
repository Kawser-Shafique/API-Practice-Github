package com.inheritance.code;

public class Color extends Computer implements Screen, Memory {

	public void getColor(String color) {
		System.out.println("Computer Color = " + color);
	}
	public void getCategory(String category) {
		System.out.println("Computer Color Category = " + category);
	}
	
	@Override
	public void getType(String type) {
		System.out.println("Computer Display Type = " + type);
	}
	@Override
	public void getSize(int size) {
		System.out.println("Computer Screen Size = " + size + " inches");
	}
	@Override
	public void getMemory(int memory) {
		System.out.println("Computer System Memory (RAM) = " + memory + " gigabytes");
	}
	@Override
	public void getSpeed(int speed) {
		System.out.println("Computer Memory(RAM) Speed = " + speed + " gigabytes");

	}

}
