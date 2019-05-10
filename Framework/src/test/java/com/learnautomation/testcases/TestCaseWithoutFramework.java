package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {
	
	WebDriver driver;
	
	@Test
	public void test1() {  //in this simple approach , if anything changes happen in the 
		            //locators, you have to update all the testcases. 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamed\\Desktop\\Drivers\\Chrome\\chromedriver.exe");
	
	
		driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("hamed_jumakhan@yahoo.com");
		
		driver.findElement(By.name("pass")).sendKeys("semron09");
		
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		
		driver.quit();
	}

}
