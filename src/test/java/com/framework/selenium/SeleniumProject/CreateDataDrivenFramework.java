package com.framework.selenium.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateDataDrivenFramework {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownload\\chromedriverr.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
	}
	
	//@BeforeMethod
	// void getTileOfPage() {
	//.out.println(driver.getTitle());
	//}
	
	@Test(dataProvider="testdata")
	public void loginToFlight(String username, String password) throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	@DataProvider(name="testdata")
	 public Object[][] TestDataFeed()
	 {
	  
      ReadExcelFile config = new ReadExcelFile("E:\\ExcelWorkbook\\Readfile.xlsx");

	  
	 int rows = config.getRowCount(0);
	  
	 Object[][] credentials = new Object[rows][2];
	 
	for(int i=0;i<rows;i++)
	 {
	 credentials[i][0] = config.getData(0, i, 0);
	 credentials[i][1] = config.getData(0, i, 1);
	 }
	  
	 return credentials;
	 }

}
