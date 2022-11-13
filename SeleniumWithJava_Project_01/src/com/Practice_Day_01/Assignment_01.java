package com.Practice_Day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		
		String exp_title ="Facebook – log in or sign up";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		if (exp_title.equals(act_title)==true)
		{
			System.out.println("Test is Passed... ");
		}
		else
		{
			System.out.println("Test is Failed...");
		}
		driver.close();
	}

}
