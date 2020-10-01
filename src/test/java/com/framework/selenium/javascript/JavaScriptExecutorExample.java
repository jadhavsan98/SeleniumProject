package com.framework.selenium.javascript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorExample {
	
	@Test
	public void testTheExecutor() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownload\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		//execute.executeScript("alert('Hello')");
		 // checkbox
		//execute.executeScript("document.querySelectorAll('input[id=benzcheck]')[0].click()");
		//Type the test
		execute.executeScript("document.getElementById('name').value='sanket';");
		
	}

}
