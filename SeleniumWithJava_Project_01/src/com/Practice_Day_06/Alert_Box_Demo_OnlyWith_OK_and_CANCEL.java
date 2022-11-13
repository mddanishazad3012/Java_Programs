package com.Practice_Day_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Box_Demo_OnlyWith_OK_and_CANCEL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//Click on Alert with OK and Cancel
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		
		//Click on the confirm button box
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		
		//Storing Expected Text in a variable
		String ExpTextOK="You pressed Ok";
		
		//Switch to alert Box Window
		driver.switchTo().alert().accept();
		
		//Storing Actual text in a variable and get the text which is visible
		String ActText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		//Now Compairing if Expected Result is equal with Actual Result and Printing the value
		if(ExpTextOK.equals(ActText)==true)
		{
			System.out.println("Test is passed");
		}
		 //Again Repeat the same conditions as above mentioned
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		String ExpTextCancel="You Pressed Cancel";
		driver.switchTo().alert().dismiss();
		ActText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		if(ExpTextCancel.equals(ActText)==true)
		{
			System.out.println("Test is passed");
		}
	}
}
