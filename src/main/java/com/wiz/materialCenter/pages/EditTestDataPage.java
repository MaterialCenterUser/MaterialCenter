package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class EditTestDataPage extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));
	MaterialSOD matsod = new MaterialSOD();

	public EditTestDataPage() {
		PageFactory.initElements(driver, this);
	}


	/* xpath under edit test data page */

	@FindBy(xpath = "//input[contains(@id,'CreateEditMaterial:submitBtn')]")
	WebElement submitButton;
	
	@FindBy(xpath = "//span[text()='Test Details']")
	WebElement testDatailsTab;
	
	@FindBy(xpath = "(//td[@class='MatEditorTableEvenRow']//span[text()='Clamped Length']/following::td/input)[1]")
	WebElement clampedLengthTextBox;
	
	

	public void clickOnTestDetailsTab(){
		
		action.moveToElement(clampedLengthTextBox).build().perform();
		action.click(clampedLengthTextBox).build().perform();
		//js.executeScript("arguments[0].click();", testDatailsTab);
		
	}
	public void enterValueForClampLength(String clampLength) {
		action.moveToElement(clampedLengthTextBox).build().perform();
		action.click(clampedLengthTextBox).build().perform();
		clampedLengthTextBox.sendKeys(clampLength);
		
	}
	
	public void clickSubmitButton() {
		js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
		js.executeScript("arguments[0].click();", submitButton);
	}
}
