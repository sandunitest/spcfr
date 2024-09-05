package com.newpro01.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logpage {
		
WebDriver ldriver;

public logpage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
		
//	@FindBy(name="uid")
//	@CacheLookup
//	WebElement txtUserName;
//	
///html/body/app-root/app-login/div/div/mat-card/mat-card-content/form/mat-form-field[1]/div/div[1]/div[3]/span	





    @FindBy(xpath="/html/body/app-root/app-login/div/div/mat-card/mat-card-content/form/mat-form-field[1]/div/div[1]/div[3]/input")
    @CacheLookup
    WebElement txtUserName;
	

//	@FindBy(name="password")
//	@CacheLookup
//	WebElement txtPassword;
    
  
  ///html/body/app-root/app-login/div/div/mat-card/mat-card-content/form/mat-form-field[2]  
    
 
    
    
	 @FindBy(xpath="/html/body/app-root/app-login/div/div/mat-card/mat-card-content/form/mat-form-field[2]/div/div[1]/div[3]/input")
	 @CacheLookup
	 WebElement txtPassword;
	
	
	
//	@FindBy(name="btnLogin")
//	@CacheLookup
//	WebElement btnLogin;
//	
	
	 ///html/body/app-root/app-login/div/div/mat-card/mat-card-content/form/button/span[1]
	// /html/body/app-root/app-login/div/div/mat-card/mat-card-content/form/button
	 
	@FindBy(xpath="/html/body/app-root/app-login/div/div/mat-card/mat-card-content/form/button/span[1]")
	@CacheLookup
	WebElement btnLogin;
	
	
//	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
//	@CacheLookup
//	WebElement lnkLogout;
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	
	
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
//	public void clickLogout()
//	{
//		lnkLogout.click();
//	}
	

}
