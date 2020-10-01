package com.framework.selenium.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
        File src = new File("E:\\ExcelWorkbook\\Readfile.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		   
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("login");
		
		sheet.getRow(0).createCell(3).setCellValue("pass");
		
		sheet.getRow(1).createCell(3).setCellValue("fail");
		
		FileOutputStream out = new FileOutputStream(src);
		
		wb.write(out);
		
		wb.close();

	}

}
