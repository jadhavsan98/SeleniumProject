package com.framework.selenium.cookie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieRead {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDownload\\chromedriverr.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		driver.manage().window().maximize();
		
		try{			
		     
	        File file = new File("Cookies.data");							
	        FileReader fileReader = new FileReader(file);							
	        BufferedReader Buffreader = new BufferedReader(fileReader);							
	        String strline;			
	        while((strline=Buffreader.readLine())!=null){									
	        StringTokenizer token = new StringTokenizer(strline,";");									
	        while(token.hasMoreTokens()){					
	        String name = token.nextToken();					
	        String value = token.nextToken();					
	        String domain = token.nextToken();					
	        String path = token.nextToken();					
	        Date expiry = null;					
	        		
	        String val;	
	        
	        if(!(val=token.nextToken()).equals("null"))
			{		
	        	SimpleDateFormat format =
	        	        new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
	        	    expiry = format.parse(val);				
	        }		
	        Boolean isSecure = new Boolean(token.nextToken()).								
	        booleanValue();		
	        Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
	        System.out.println(ck);
	        driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
	        }		
	        }		
	        }catch(Exception ex){					
	        ex.printStackTrace();			
	        }		
	        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");					


	}

}
