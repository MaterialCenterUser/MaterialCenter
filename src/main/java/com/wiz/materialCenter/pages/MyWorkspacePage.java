package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class MyWorkspacePage extends TestBase {
	
JavascriptExecutor js = (JavascriptExecutor) driver;
Actions action = new Actions(driver);
WebDriverWait wait = new WebDriverWait(driver, 20);
EditMatProcess editMat = new EditMatProcess();

public MyWorkspacePage() {
	PageFactory.initElements(driver, this);
}

/*Xpaths under My Workspace tab*/

@FindBy(xpath = "//td[contains(text(),'[ User ]')]")
WebElement textUserCreated;

@FindBy(xpath = "//th[text()='E-mail']/following::span[1]")
WebElement emailIdDisplayed;

/*@FindBy(xpath = "//th[@title='Common Name']/following::span[1]")
WebElement MaterialLInk;*/

@FindBy(xpath = "//span[text()='Metals']")
WebElement MaterialLInk;

@FindBy(xpath = "(//td[contains(text(),'Material')])[1]")
WebElement textMaterials;

@FindBy(xpath = "(//span[text()='Done'])[1]")
WebElement doneStatus;

@FindBy(xpath = "//td[text()='Curve Property']")
WebElement textCurveProperty;


@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td[@smcol='0']")
WebElement caeProcess;

@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td[@smcol='0']")
WebElement manageProcess;

@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td[@smcol='0']/a[text()='Discard']")
WebElement discardStatus;


public boolean discardStatusDisplayed(){
	
	return(discardStatus.isDisplayed());
}
public void clickFirstMaterialLink() {
	action.moveToElement(MaterialLInk).build().perform();
	action.doubleClick(MaterialLInk).build().perform();
}


public boolean verifyUserCreated() {
	return ((textUserCreated).isDisplayed());
}

public boolean verifyMaterialsDisplayed() {
	return ((textMaterials).isDisplayed());
}
public boolean verifyCurvePropertiesDisplayed() {
	return ((textCurveProperty).isDisplayed());
}

public boolean verifyDoneStatus() {
	return ((doneStatus).isDisplayed());
}

public String verifyEmailID(){
	
	return (emailIdDisplayed.getText());
}
public ProcessesPage clickOnCaeProcess() {

	// js.executeScript("arguments[0].click();", caeProcess);
	//wait.until(ExpectedConditions.elementToBeClickable(caeProcess));
	 action.moveToElement(caeProcess).build().perform();
	action.doubleClick(caeProcess).build().perform();
	// action.moveToElement(caeProcess).build().perform();
	 //action.click(caeProcess).build().perform();
	// action.doubleClick(caeProcess).build().perform();
	
	return new ProcessesPage();
}

public ProcessesPage clickOnManageProcess() {

	// js.executeScript("arguments[0].click();", caeProcess);
	//wait.until(ExpectedConditions.elementToBeClickable(caeProcess));
	 action.moveToElement(manageProcess).build().perform();
	action.doubleClick(manageProcess).build().perform();
	// action.moveToElement(caeProcess).build().perform();
	 //action.click(caeProcess).build().perform();
	// action.doubleClick(caeProcess).build().perform();
	
	return new ProcessesPage();
}
}
