package com.Practice_Day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess_ChromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);		//This makes the Chrome as a Headless Browser.
		options.addArguments("--headless"); //This makes the Chrome as a Headless Browser.
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		System.out.println("Title of the page is: "+driver.getTitle());
		
		
		
	}

}
