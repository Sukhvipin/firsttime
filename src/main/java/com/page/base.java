package com.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class base {
	
	
	 public static void main(String[] args)  throws Exception
	
	{
		 WebDriverManager.chromedriver().setup();
		 
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		  
		 driver.navigate().to("https://www.javatpoint.com/selenium-webdriver-first-test-case");
		 
	}
	
	
}
