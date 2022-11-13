package com.Practice_Day_13_CapturingImages;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Ashot_Image_Capture {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Url Accessing
		driver.get("https://qatechhub.com/mouse-hover-actions-selenium-webdriver/");
		driver.manage().window().maximize();
		
		WebElement logoimageelement=driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/a/img"));
		
		//Taking Screenshot by using AShot 
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoimageelement);
		
		//Taking screenshot, given its extention and location
		ImageIO.write(logoImageScreenshot.getImage(),"png",new File("D:\\ECLIPSE\\Screenshots\\OrangeHRMlogo.png"));
		
		//Confirmation location of the file
		File f=new File("D:\\\\ECLIPSE\\\\Screenshots\\\\OrangeHRMlogo.png");
		
		if(f.exists())
		{
			System.out.println("Image is captured...");
		}
		else
		{
			System.out.println("Image File not exist...");
		}
	}

}
