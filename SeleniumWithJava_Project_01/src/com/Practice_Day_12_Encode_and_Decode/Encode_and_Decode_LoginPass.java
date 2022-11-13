package com.Practice_Day_12_Encode_and_Decode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encode_and_Decode_LoginPass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gw-sign-in-button\"]/span/a")).click();
		driver.findElement(By.name("email")).sendKeys("danishazad001@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(decodeString("QXphZEAxMjM="));
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.quit();
	}
	static String decodeString(String password1)
	{
		byte[] decodedString=Base64.decodeBase64(password1);
		return(new String(decodedString));
	}
	
	
}
