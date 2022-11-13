package com.Practice_Day_04;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadDataFromExcel_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		//Getting Data From Excel Sheet
		FileInputStream file=new FileInputStream("D:\\ECLIPSE\\ddtest.xlsx");
		
		//Get the workbook instance for XSL File
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//Get First sheet from the workbook
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		//Get First Row from the sheet
		int noOfRows = sheet.getLastRowNum();
		
		System.out.println("No of Records in the Excel Sheet: "+noOfRows);
		
		for(int row=1; row<=noOfRows; row++)
		{
			XSSFRow current_row = sheet.getRow(row);
			
			String First_name = current_row.getCell(0).toString();
			String Last_name = current_row.getCell(1).toString();
			String Phone = current_row.getCell(2).toString();
			String Email = current_row.getCell(3).toString();
			String Address = current_row.getCell(4).toString();
			String City = current_row.getCell(5).toString();
			String State = current_row.getCell(6).toString();
			String PinCode = current_row.getCell(7).toString();
			String Country = current_row.getCell(8).toString();
			String UserName = current_row.getCell(9).toString();
			String Password = current_row.getCell(10).toString();
		
			//Registration Process
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			//Entering Contact Informations
			driver.findElement(By.name("firstName")).sendKeys(First_name);
			driver.findElement(By.name("lastName")).sendKeys(Last_name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			//Entering mailing Informations
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(PinCode);
			
			//Country Selection
			Select dropCountry = new Select(driver.findElement(By.name("country")));
			dropCountry.selectByVisibleText(Country);
			
			//Entering User Interface
			driver.findElement(By.name("email")).sendKeys(UserName);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			//Submitting Form
			driver.findElement(By.name("submit")).click();
			
			if(driver.getPageSource().contains("Thank you for registering"))
			{
				System.out.println("Registration Completed for  "+ row +" records");
			}
			else
			{
				System.out.println("Registration failed for "+ row + "record");
			}
			System.out.println("Data Driven Test Completed");
			
//			driver.close();
//			driver.quit();
			
			file.close();
		}
		
		
	}

}
