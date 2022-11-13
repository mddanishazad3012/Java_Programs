package com.Practice_Day_01;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTML_Unit_Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("The title of the page is: "+driver.getTitle());
		System.out.println("The URl of the page is: "+driver.getCurrentUrl());
	}

}

