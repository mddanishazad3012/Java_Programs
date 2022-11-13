package com.Practice_Day_04;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadDataFromExcel_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:\\Downloads\\Book2.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");  //Providing Sheet name
//		XSSFSheet sheet=workbook.getSheetAt(0); //Providing Sheet name
		
		int rowcount=sheet.getLastRowNum(); //Returns the row count
		int colcount=sheet.getRow(0).getLastCellNum();//Returns column/cell count
		
		for(int i=0; i<rowcount; i++)
		{
			XSSFRow currentrow=sheet.getRow(i); //Focused on current row
					
				for(int j=0; j<colcount; j++)
				{
					String value=currentrow.getCell(j).toString();
					System.out.print("     "+value); //Read the value from cell
				}
			System.out.println();
		}
		
		
	}

}

