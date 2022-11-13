package com.Practice_Day_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Upload_Files {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(""));
		
		String imagesFilepath="D:\\ECLIPSE\\SnipFiles";
		String inputFilepath="D:\\ECLIPSE\\PhotoforSelenium";
		
		Screen s=new Screen();
		Pattern fileInputTextBox=new Pattern(imagesFilepath +"FileName.png");
		Pattern openButton=new Pattern(imagesFilepath +"OpenBtn.png");
		Thread.sleep(5000);
		
		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox,inputFilepath+"spiderman.png");
		s.click();
		

	}

}
