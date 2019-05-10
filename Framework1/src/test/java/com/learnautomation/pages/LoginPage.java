package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) 
	{
		
		this.driver=ldriver;
	}


		
		@FindBy(xpath="//input[@name='username']") WebElement uname;////*[@id="loginForm"]/div/input[1]
		
		
		@FindBy(name="password") WebElement pass;
		
		@FindBy(css="#loginForm > div > div > input") WebElement loginButton;
		
		
	
		
		public void loginToCRM(String usernameApplication, String passwordApplication)
		{
			
			try {
				Thread.sleep(2000);
				
			}catch(InterruptedException e) {
				
			}
			uname.sendKeys(usernameApplication);
			
			pass.sendKeys(passwordApplication);
			
			loginButton.click();
		}
		
	

}
