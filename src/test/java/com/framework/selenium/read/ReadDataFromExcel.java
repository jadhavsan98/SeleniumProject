package com.framework.selenium.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		File src = new File("E:\\ExcelWorkbook\\Readfile.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		   
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("login");
		
		    /* Using index also
		
		//XSSFSheet sheet = wb.getSheetAt(1);
		
		      Read the single data
		      
		//String data=sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data);*/
		
		int rowSize = sheet.getLastRowNum();
		
		System.out.println(rowSize);
		
         for (int i = 0; i <rowSize+1 ; i++) {
			
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			//int data = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
			System.out.println(data);
		}
		
		wb.close();

}
}