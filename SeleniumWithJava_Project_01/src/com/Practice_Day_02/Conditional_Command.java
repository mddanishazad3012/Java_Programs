package com.Practice_Day_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement f_name=driver.findElement(By.name("firstname"));
		WebElement sur_name=driver.findElement(By.name("lastname"));
		
		if(f_name.isDisplayed() && f_name.isEnabled())
		{
			f_name.sendKeys("Danish");
		}
		if(sur_name.isDisplayed() && sur_name.isEnabled())
		{
			sur_name.sendKeys("Azad");
		}
		//Female
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).isSelected());
		
		//Male
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).isSelected());
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).isSelected()==false)
		{
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")).click();
		}
		driver.close();
	}

}
