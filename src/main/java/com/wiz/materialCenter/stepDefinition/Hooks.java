package com.wiz.materialCenter.stepDefinition;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.LoginPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hooks extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	

	@FindBy(xpath = "//input[@value='Ok']")
	//@FindBy(xpath = "//input[@id='materialsDisclaimerDlgOnLogin-f:MaterialsDisclaimerWidgeta:okBtn']")
	
	//@FindBy(xpath = "//input[@id='materialsDisclaimerDlgOnLogin-f:MaterialsDisclaimerWidgeta:okBtn']")
	WebElement okButton;
	
	@FindBy(xpath = "//img[@src='/MaterialCenter/themes/Default/images/close.gif']")
		WebElement closeButton;
	
	
	@Before("@old")
	public void before() throws InterruptedException {
		TestBase.initialization();
		loginPage = new LoginPage();
	//	homePage =  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		try {
		//	action.click(okButton).build().perform();
			
			//driver.switchTo().alert().accept();
			//driver.switchTo().frame("materialsDisclaimerDlgOnLoginIFrame");
			//Thread.sleep(2000);
			
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("arguments[0].click();", okButton);
			//okButton.click();
		//driver.switchTo().defaultContent();
			//action.moveToElement(closeButton).build().perform();
		//	action.click(closeButton).build().perform();
			homePage.closeDisclaimer();
			//Thread.sleep(100);
		} catch (Exception e) {
			System.out.println("Disclaimer popup didn't come");
		}
	}
	
	@After
	public void after(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.write("Please look below for failed step screenshot:");
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		} 
		driver.quit();
	}

}
