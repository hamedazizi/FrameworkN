package com.learnautomation.testcases;



import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;

public class LoginTestCRM extends BaseClass {
	
	
	
	@Test
	public void loginApp() {
		
		ExcelDataProvider excel = new ExcelDataProvider();
		excel.getStringData("Login", 0, 0);

		LoginPage loginPage =PageFactory.initElements(driver, LoginPage.class);
		
	     loginPage.loginToCRM(excel.getStringData("Login",0, 0),excel.getStringData("Login", 0, 1));
		
		
		
	}

	// this is the basic example of abstraction, which is showing the essential
	// features and hiding the background details



}
