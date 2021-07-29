/**
 * This page is covering the all parts of CAE process page
 * all elements xpath used are mentioned in starting 
 * following by methods used according to use cases
 * This is mainly designed for MaterialCenter 
 * @author vsiddhu
 */

package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class CAEProcessInput extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 20);
	public CAEProcessInput() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[contains(@id,'CreateMaterialModel') and @value='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//input[@value='OK' and contains(@id,'ConfirmDlg')]")
	WebElement caeRevisionDlg;
	
	@FindBy(xpath = "//img[@src='../../servlet/ilu?c=default&s=16&n=download']")
	WebElement downloadImage;
	
	
	
	public void clickOnSubmit() {
		js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		js.executeScript("arguments[0].click();", submitButton);
		
		wait.until(ExpectedConditions.visibilityOf(downloadImage));
		/*try {
			js.executeScript("arguments[0].click();", caeRevisionDlg);
		} catch(Exception e) {
			System.out.println("Revision dialog didn't come");
		}*/
	}

	public boolean verifyDownloadImage(){
		
		return downloadImage.isDisplayed();
	}
}
