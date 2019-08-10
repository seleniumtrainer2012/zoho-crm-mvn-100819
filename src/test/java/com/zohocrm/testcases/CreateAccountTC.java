package com.zohocrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.zohocrm.basetest.BaseTest;
import com.zohocrm.util.ExtentManager;

public class CreateAccountTC extends BaseTest{	
	String TCName="CreateAccountTestCase";
	
	@Test
	public void CreateAccountTestCase() {
		report=ExtentManager.getInstance();
		test=report.startTest(TCName);
		
		test.log(LogStatus.INFO, "Started excuting testcase -"+TCName);
		
		test.log(LogStatus.INFO, "Loading config file");
		loadConfig();
		
		/*
		 * selenium  code
		 */
		test.log(LogStatus.INFO, "Launching execution browser");
		launchBrowser();
		
		test.log(LogStatus.INFO, "Navigating to url");
		navigateTo();		
		
		setText("FullName_ID","Amit");
		setText("Email_NAME","amit@gmail.com");
		setText("Password_XPATH","amit@123");
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
		report.endTest(test);
		report.flush();
	}
	
	
	

}



