package com.Practice_Day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless_FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\ECLIPSE\\Drivers\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
		
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		System.out.println("Title of the page is: "+driver.getTitle());
	}

}
