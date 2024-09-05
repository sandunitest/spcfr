package com.newpro01.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.newpro01.pageObjects.logpage;


public class TC_LogingTest_001 extends BaseClass {
	
   @Test	
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		logpage lp=new logpage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password"); 
		
		
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		if(driver.getCurrentUrl().equals("https://spc-mms.azurewebsites.net/")) 
		
		//if(driver.getPageSource().equals("Manoj PO")) 
		
		//if(driver.getTitle().equals("HomePage"))
			
		
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}

}
