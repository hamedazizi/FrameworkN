package com.learnautomation.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass {
	
	
    
	
	
	@Test(priority=1)
	public void loginApp() {
		
		logger=report.createTest("Login to CRM");
		
		
		//ExcelDataProvider excel=new ExcelDataProvider();//you can also create this obj in base class, it will do the same thng 
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginPage.loginToCRM(excel.getStringData("login", 0, 0), excel.getStringData("login", 0, 1));
	
		logger.pass("Login Successfully");
		
		Helper.captureScreenshot(driver);
		
		
	}
}


