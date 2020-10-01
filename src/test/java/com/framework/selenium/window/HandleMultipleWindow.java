package com.framework.selenium.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
   
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownload\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com/");
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window name:"+parentwindow);
		
		Set<String>allwindowhandle = driver.getWindowHandles();
		
		for(String s: allwindowhandle) {
			//System.out.println(s);
			String name = driver.switchTo().window(s).getTitle();
			System.out.println(name);
			// System.out.println("Navigating to google.com");
			 driver.switchTo().window(s); //Switch to the desired window first and then execute commands using driver
			// driver.get("https://google.com");
			
			if(name.contains("Amazon")) {
				driver.close();
			System.out.println("Close window");
			}
		}
		

	}
}
