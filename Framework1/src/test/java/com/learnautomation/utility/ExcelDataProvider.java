package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {//to feed/load data from excel as soon as we create obj

	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		File src =new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);	

		} catch (Exception e) {
			
			System.out.println("Unable to read Excel File "+e.getMessage());
			
		}
	}
	//actual methods to help us read the data is as bellow
	
	public String getStringData(int sheetIndex, int row, int column)
	{
		
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetName, int row, int column)
	{
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();//this will return the data
	}////first library is done
	
	public double getNumericData(String sheetName, int row, int column)
	{
		
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}
