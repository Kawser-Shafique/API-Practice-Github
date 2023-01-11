package com.generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunction {

	void login(){
		// open browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
	}
	
	public static void main(String[] args) {
		
		LoginFunction obj = new LoginFunction();
		obj.login();
	}
}
