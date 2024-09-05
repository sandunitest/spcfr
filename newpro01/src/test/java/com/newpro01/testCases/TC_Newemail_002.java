package com.newpro01.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.newpro01.pageObjects.Newemail;
import com.newpro01.pageObjects.logpage;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_Newemail_002 extends BaseClass {
	
	@Test
	
	public void addNewEmail() throws InterruptedException, IOException
	
	{
		logpage lp=new logpage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		Newemail addnewemail=new Newemail(driver);
		
		addnewemail.clicknewmail();
		logger.info("new email form open");
		
		Thread.sleep(3000);
		
		
		addnewemail.refNumber("357435");
		logger.info("enter ref no");
		Thread.sleep(5000);
		
		
		addnewemail.fromperson("person01");
		logger.info("enter from person");
		Thread.sleep(5000); 
		
		
		addnewemail.header_subject("subject0123");
		logger.info("enter header");
		Thread.sleep(5000);
		
		addnewemail.dropdtypeofemail("None");
		logger.info("select first drop down value as None");
		
		Thread.sleep(5000);
		
		addnewemail.dropdmethodofreceival("None");
		logger.info("select second  drop down value as None");
		
		Thread.sleep(5000);
		
		 // Create instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 1000 pixels vertically
        js.executeScript("window.scrollBy(0,1000)");
		
        Thread.sleep(5000);
		
		addnewemail.btnattachment("C:/Users/Sanduni(SanduniAnura/Desktop/auto/doc1.pdf");
		logger.info("add atachement");
		Thread.sleep(5000);

		
		
		/*
		 * // Scroll down to make the attachment button visible JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,1000)");
		 * logger.info("Page scrolled");
		 * 
		 * // Add an attachment
		 * addnewemail.addAttachment("C:/Users/Sanduni/Desktop/auto/doc1.pdf");
		 * logger.info("Attachment added");
		 */
		
		
		
		//addnewemail.Submitbtn("");
		
		
     Thread.sleep(3000);

	}	
	
	
}
