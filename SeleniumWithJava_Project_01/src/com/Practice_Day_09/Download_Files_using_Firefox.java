package com.Practice_Day_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Download_Files_using_Firefox {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","D:\\ECLIPSE\\Drivers\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
		
		//Create FireFox Profile Objects
//		FirefoxProfile profile=new FirefoxProfile();
		
		//Set Preference to not show file download confirmation dialogue using
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain");//Set MIME type
		//profile.setPreference("browser.downloaf.manager,showWhenStarting",false);
		
//		FirefoxOptions options=new FirefoxOptions();
//		options.setProfile(profile);
		
		//Initializing Firefox Driver
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("textbox")).sendKeys("Testing");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();

	}

}
