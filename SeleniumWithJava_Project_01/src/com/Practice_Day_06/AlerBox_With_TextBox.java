package com.Practice_Day_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerBox_With_TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//Click on Alert with TextBox
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		//Click on the other TextBox
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		//Accepting Alert Box
		
		driver.switchTo().alert().sendKeys("Danish");
		driver.switchTo().alert().accept();
		
		String ExpText="Hello Danish How are you today";
		String ActText=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		
		if(ExpText.equals(ActText)==true)
		{
			System.out.println("Test is Passed...");
		}
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		driver.switchTo().alert().dismiss();
	}
}
