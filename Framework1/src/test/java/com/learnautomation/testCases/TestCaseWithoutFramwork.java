package com.learnautomation.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramwork {
	
	WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException {   //in this simple approach , if anything changes happen in the 
		            //locators, you have to update all the testcases. 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamed\\Desktop\\Drivers\\Chrome\\chromedriver.exe");
	
	
		driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Selenium_50");
		
		driver.findElement(By.name("password")).sendKeys("Abcd@123456");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();    
	}


}
