package com.Practice_Day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Table_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		int row=driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/table[1]/tbody/tr")).size();
		System.out.println("Number of rows in a table: "+row);
		
		int col=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td")).size();
		System.out.println("Number of columns in a table: "+col);
		
		for(int i=1; i<row; i++)
		{
			for(int j=1; j<col; j++)
			{
				System.out.print(driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
			}
			System.out.println();
		}
		driver.close();
	}
}
