package com.thrusday.generic;

public class Man implements People,Women{

	@Override
	public void getAddress(String address) {
		System.out.println(address);
		
	}

	@Override
	public void getPeople(String name) {
		System.out.println(name);
		
	}

	@Override
	public void getData(String data) {
		System.out.println(data);
		
	}


	

}
