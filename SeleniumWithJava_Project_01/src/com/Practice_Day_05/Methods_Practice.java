package com.Practice_Day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Danish");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Azad");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Alamganj");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("danishazad01@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("12345566");
		System.out.println(driver.findElement(By.name("radiooptions")).isSelected());
		driver.findElement(By.name("radiooptions")).click();
		
		driver.findElement(By.id("checkbox1")).click();
//		WebElement drptime=
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).sendKeys("Danish");
//		Select t=new Select(drptime);
//		t.selectByIndex(1); //Selecting by Index Value
//		t.selectByValue("Danish"); //Selecting by Text value
//		t.selectByVisibleText("English"); //Selecting by Visible Text
		
//		System.out.println(t.getOptions().size());// No of items
		
	}

}
