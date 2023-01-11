package com.online.video;

public class OnlineOne {

	public static void main(String[] args) {

		// enum
		// Need to create ENUM First then Call ENUM.
	
		Days today = Days.FRIDAY;

		String response = "";

		switch (today) {
		case MONDAY:
			response = "Get to Work ";
			break;
		case FRIDAY:
			response = "Time to Relax";
			break;
		default:
			response = "Practice Java ";
		}
		System.out.println(response);

	}

}
