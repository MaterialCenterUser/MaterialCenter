package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class ManageProcessPage extends TestBase {
	
JavascriptExecutor js = (JavascriptExecutor) driver;
Actions action = new Actions(driver);
WebDriverWait wait = new WebDriverWait(driver, 20);
EditMatProcess editMat = new EditMatProcess();

public ManageProcessPage() {
	PageFactory.initElements(driver, this);
}

/*Xpaths under My Workspace tab*/

@FindBy(xpath = "//span[text()='Manage Process']")
WebElement textManageProcess;

public boolean manageProcessPageDisplayed(){
	
	return (textManageProcess.isDisplayed());
}


}
