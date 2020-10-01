package com.framework.selenium.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByPage {

	@Test
	public void scrollThePage() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownload\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		//by pixcel
		JavascriptExecutor execute = (JavascriptExecutor) driver;
		//execute.executeScript("scrollBy(0,1000)");
		
		//To till element
		WebElement ele = driver.findElement(By.xpath("//button[@id='mousehover']"));
		execute.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		//To till end 
		//execute.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
}
