package com.framework.selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertBox {

	public static void main(String[] args) throws InterruptedException {
           //enter url
		//enter driver
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownload\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("sanket");
		//driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		Thread.sleep(2000);
		//alert.accept();
		alert.dismiss();
		System.out.println("I dismiss thr alert");
		Thread.sleep(1000);
		driver.close();
		
		
		
	}

}
