package com.Practice_Day_13_CapturingImages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Compare_images {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qatechhub.com/mouse-hover-actions-selenium-webdriver/");
		
		BufferedImage expectedImage=ImageIO.read(new File("D:\\ECLIPSE\\Screenshots\\OrangeHRMlogo.png"));
		
		WebElement logoImageElement=driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/a/img"));
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver, logoImageElement);
		
		BufferedImage actualImage=logoImageScreenshot.getImage();
		
		ImageDiffer imgDiff=new ImageDiffer();
		ImageDiff diff=imgDiff.makeDiff(expectedImage, actualImage);
		
		if(diff.hasDiff()==true) //this will compare two images
		{
			System.out.println("Image are not same...");
		}
		else 
		{
			System.out.println("Images are same...");
		}
		driver.close();
	}

}
