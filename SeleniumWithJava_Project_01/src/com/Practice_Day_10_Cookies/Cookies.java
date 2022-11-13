package com.Practice_Day_10_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Set <Cookie>cookies = driver.manage().getCookies(); //Capture all the cookies from browser
		System.out.println("Size of the cookies: "+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			//Print all the name and value of the cookies
			System.out.println(cookie.getName()+":"+cookie.getValue());
			
		}
		
		
		//Print the specific cookies based on name we give
//		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		
		Cookie cobj=new Cookie("Cookie123","12345886");
		driver.manage().addCookie(cobj);
		cookies=driver.manage().getCookies();
		System.out.println("Size of the cookies: "+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			//Print all the name and value of the cookies
			System.out.println(cookie.getName()+":"+cookie.getValue());
			
		}
		//delete specific cookie
		driver.manage().deleteCookie(cobj);
		cookies=driver.manage().getCookies();
		System.out.println("Size of the cookies: "+cookies.size());
		for(Cookie cookie:cookies)
		{
			//Print all the name and value of the cookies
			System.out.println(cookie.getName()+":"+cookie.getValue());
			
		}
		//Delete all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of the cookies: "+cookies.size());
		driver.quit();
	}

}
