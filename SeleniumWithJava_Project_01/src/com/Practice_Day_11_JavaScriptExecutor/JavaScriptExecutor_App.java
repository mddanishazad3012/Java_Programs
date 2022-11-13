package com.Practice_Day_11_JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor_App {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Flashing 
//		WebElement button=driver.findElement(By.xpath("//*[@id=\"demo-page\"]/body/div[7]/header/nav/div[2]/a/img"));
//		JavaScriptUtil.flash(button, driver);
		
		//Draw Border 
//		WebElement border=driver.findElement(By.xpath("//*[@id=\"demo-page\"]/body/div[7]/header/nav/div[2]/a/img"));
//		JavaScriptUtil.drawBorder(border, driver);
//		
		//Taking screenshot
//		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File tgt=new File("D:\\ECLIPSE\\imagescrshot.png");
//		FileUtils.copyFile(src, tgt);
		
		//Get Title of the page
		//System.out.println(driver.getTitle());
		
//		String title=JavaScriptUtil.getTitleByJS(driver);
//		System.out.println(title);
		
		//Click on some element
//		WebElement click=driver.findElement(By.xpath("//*[@id=\"gw-sign-in-button\"]/span/a"));
//		JavaScriptUtil.clickElementByJS(click, driver);
		
		//Generate Alert Pop up
//		JavaScriptUtil.generateAlert(driver, "You clicked on login button...");
		
		//Refresh Browser 
//		JavaScriptUtil.refreshBrowserByJS(driver);
		
		//Scroll into browser till the element found
//		WebElement image=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div"));
//		JavaScriptUtil.scrollIntoView(image, driver);
		
		//Scroll into browser till the end of the window
		JavaScriptUtil.scrollPageDown(driver);
	}

}
