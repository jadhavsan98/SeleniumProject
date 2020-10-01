package com.framework.selenium.findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownload\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		
		List <WebElement> list = driver.findElements(By.xpath("//input[@type='radio']"));
		int size = list.size();
		System.out.println(size);
		
		for (int i=0; i<size; i++) {
			list.get(i).click();
			Thread.sleep(2000);
			System.out.println("click on every element");
			
		}
		driver.close();
		
	}

}
