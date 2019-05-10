package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		File src=new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis =new FileInputStream(src);
			
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		
			
		} catch (Exception e) {
			
			System.out.println("Unable to read excel file "+e.getMessage());
		}
	}
		//real time example of method overloading , same method name , same num of param, but differnt type of parameter
	public String getStringData(int sheetIndex,int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	
	}
	
	public String getStringData(String SheetName,int row, int column ) {
		
		return wb.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();//this will return data
		
		
		
	}
	
	public double getNumericData(String sheetName, int row,int column) {
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		
	 
		
	}

}
