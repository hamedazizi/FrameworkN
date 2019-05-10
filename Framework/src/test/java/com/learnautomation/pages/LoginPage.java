package com.learnautomation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage { 
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {// this constructor help us initialize webdriver
		
		this.driver=ldriver;
		
	}


	@FindBy(name="username") WebElement uname;
	
	
	@FindBy (name="password") public WebElement pass;
	
	
	
	@FindBy(xpath="//input[@value='Login']") public WebElement loginButton;
	


	public void loginToCRM(String usernameApplication, String passwordApplication) {
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		uname.sendKeys(usernameApplication);
		
		pass.sendKeys(passwordApplication);
		//uname.sendKeys(usernameApplication);
		//pass.sendKeys(passwordApplication);
		
		loginButton.click();

		
		
	}
}
