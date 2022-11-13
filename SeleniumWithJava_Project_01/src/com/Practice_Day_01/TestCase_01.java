package com.Practice_Day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String exp_title ="Login: Mercury Tours";
		String act_title = driver.getTitle();
		if (exp_title.equals(act_title)==true) 
		{
			System.out.println("Test is passed...");
		}
		else
		{
			System.out.println("Test is failed...");
		}
		driver.close();
	}

}
