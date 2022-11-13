package com.Practice_Day_11_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor_Example01 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Flasing
		WebElement searchbtn=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		JavaScriptUtil.flash(searchbtn, driver);
		
	}

}
