package com.Practice_Day_05;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		System.out.println("Window is maximize...");
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
//		System.out.println(driver.getTitle());
		
		Set <String> s=driver.getWindowHandles();
		
		for(String i:s)
		{
			
//			System.out.println(i);
			String t=driver.switchTo().window(i).getTitle();
			/*if(t.contains("Frames & windows"))
			{
				driver.close();
			}*/
			if(t.contains("Selenium"))
			{
				driver.close();
			}
			System.out.println(t);
		}
//		driver.close();
	}

}
