package com.Practice_Day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Calenders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
		
		driver.switchTo().alert().dismiss();
		
		Select year=new Select(driver.findElement(By.xpath("/html/body/app-root/app-home/div"
				+ "[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/"
				+ "app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar"
				+ "/span/div/div/div[1]/div/span[2]")));
		year.selectByVisibleText("September2022");
		
		for(int i=8; i>=1; i--)
		{
			driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span")).click();
			
			String m=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/div/span[1]")).getText();
			if(m.equals("September"))
			{
				driver.findElement(By.linkText("23")).click();
				break;
			}
		}
	}

}
