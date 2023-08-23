package com.wiz.materialCenter.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiz.materialCenter.util.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='form:userID']")
	WebElement username;
	
	@FindBy(xpath= "//input[@id='form:password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='form:login']")
	WebElement login;
	
	@FindBy(xpath = "//span[text()='Log Off']")
	WebElement logoff;
	
	
	public HomePage login(String uname, String pwd) throws InterruptedException{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		//login.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login);
		Thread.sleep(5000);
		return new HomePage();
	}
	
	public void logoff() {
		logoff.click();
	}

}
