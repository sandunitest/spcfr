package com.newpro01.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Newemail {

	WebDriver ldriver;

	public Newemail(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	

	@FindBy(how = How.XPATH, using ="/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/span")
	@CacheLookup
	WebElement linknewmail;
	
	
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/div/app-mail-request/div[2]/mat-card/mat-card-content/form/div[1]/app-initiate/div/div/mat-form-field[3]/div/div[1]/div[3]/input")
	@CacheLookup
	WebElement txtrefNo;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/div/app-mail-request/div[2]/mat-card/mat-card-content/form/div[1]/app-initiate/div/div/mat-form-field[4]/div/div[1]/div[3]/input")
	@CacheLookup
	WebElement txtfrom;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/div/app-mail-request/div[2]/mat-card/mat-card-content/form/div[1]/app-initiate/div/div/mat-form-field[5]/div/div[1]/div[3]/input")
	@CacheLookup
	WebElement txtheader_subject;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/div/app-mail-request/div[2]/mat-card/mat-card-content/form/div[1]/app-initiate/div/div/mat-form-field[7]/div/div[1]/div[3]/mat-select/div/div[1]/span")
	
	@CacheLookup
	WebElement ddtypeofemail;
	 
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/div/app-mail-request/div[2]/mat-card/mat-card-content/form/div[1]/app-initiate/div/div/mat-form-field[5]/div/div[1]/div[3]/input")
	@CacheLookup
	WebElement ddmethodofreceival;
	
//	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/div/app-mail-request/div[2]/mat-card/mat-card-content/form/div[1]/app-initiate/div/div/mat-form-field[5]/div/div[1]/div[3]/input")
//	@CacheLookup
//	WebElement ddmethodofreceival;
//	
	
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/div/app-mail-request/div[2]/mat-card/mat-card-content/form/div[1]/app-initiate/div/div/mat-form-field[10]/div/div[1]/div[3]/div/mat-toolbar/button")
	@CacheLookup
	WebElement attachment;
	
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/div/app-mail-request/div[2]/mat-card/mat-card-content/form/div[2]/button[2]")
	WebElement btnSubmit;

	
	public void clicknewmail() {
	linknewmail.click();
			
	}
	
	
	
	public void refNumber(String refNo) {
		txtrefNo.sendKeys(refNo);
		
	}

	
	public void fromperson(String from) {
		txtfrom.sendKeys(from);
		
	}
	
	public void header_subject(String headerorsubject) {
		txtheader_subject.sendKeys(headerorsubject);
		
	}
	
	
	
	public void dropdtypeofemail(String typeofemail) {
	ddtypeofemail.click();	
		
	
	// Wait for options to be visible (optional, depending on your application)
    WebElement optionToSelect = ldriver.findElement(By.xpath("//mat-option//span[text()='" + type + "']"));

    // Click the desired option
    optionToSelect.click();
	
	/*
	 * Select ddtypeofemail = new Select(dropdtypeofemail):
	 * ddtypeofemail.selectByVisibleText("Option 1");
	 * 
	 * Select selectFirstDropdown = new Select(firstDropdown);
	 * selectFirstDropdown.selectByVisibleText("Option 1");
	 */
	}
	
	public void dropdmethodofreceival(String methodofreceival) {
		ddmethodofreceival.click();
		
	}
	
	 
		
	
	public void btnattachment(String attachmentdoc) {
		attachment.sendKeys();
		
	}
	
	
	public void Submitbtn(String Submitbutton) {
		btnSubmit.click();
		
	}
	
	
}
