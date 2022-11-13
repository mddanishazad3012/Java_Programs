package com.Practice_Day_04;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadDataFromExcel_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
		
//		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div[11]/div[2]/div[3]/button[1]")).click();
		//Getting Data From Excel Sheet
		FileInputStream file=new FileInputStream("D:\\ECLIPSE\\ddtest.xlsx");
		
		//Get the workbook instance for XSL File
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//Get First sheet from the workbook
		XSSFSheet sheet= workbook.getSheet("Sheet2");
		
		//Get First Row from the sheet
		int rowcount = sheet.getLastRowNum();
		
		System.out.println("No of Records in the Excel Sheet: "+rowcount);
		
		for(int i=1; i<=rowcount; i++)
		{
			XSSFRow row=sheet.getRow(i);
			
//			XSSFCell princeplecell=row.getCell(0);
//			int princ=(int)princeplecell.getNumericCellValue(); // Type Casting
			
			int princ =(int)row.getCell(0).getNumericCellValue(); //Type Casting
			
			XSSFCell roi=row.getCell(1);
			int rateofinterest=(int)roi.getNumericCellValue();
			
			XSSFCell period=row.getCell(2);
			int per=(int)period.getNumericCellValue();
			
			XSSFCell Frequency=row.getCell(3);
			String Freq=Frequency.getStringCellValue();
			
			XSSFCell MaturityValue=row.getCell(4);
			int Exp_mvalue=(int)MaturityValue.getNumericCellValue();
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));
			
			Select periodcombo=new Select(driver.findElement(By.id("tenurePeriod")));
			periodcombo.selectByVisibleText("year(s)");
			
			Select frequency=new Select(driver.findElement(By.id("frequency")));
			frequency.selectByVisibleText("Simple Interest");
			
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[5]/div/div[1]/div[3]/form/div[2]/a[1]/img")).click();
			
			String act_mvalue=driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[5]/div/div[1]/div[4]/div/div[2]/span[2]/strong")).getText();
			
			if(Double.parseDouble(act_mvalue)==Exp_mvalue)
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
			driver.findElement(By.id("principal")).clear();
			driver.findElement(By.id("interest")).clear();
			driver.findElement(By.id("tenure")).clear();
			
			driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[5]/div/div[1]/div[3]/form/div[2]/a[2]/img")).click();
		}
			driver.close();
			driver.quit();
	}
}
