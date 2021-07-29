package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class SecurityProcess extends TestBase {
	
	Actions action = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	public SecurityProcess() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[contains(@id,'myWorkspaceActionDialog')]")
	WebElement targetLevel;
	
	@FindBy(xpath = "//select[contains(@id,'myWorkspaceActionDialog')]/option[text()='1-In-Review']")
	WebElement inReviewLevel;
	
	@FindBy(xpath = "//select[contains(@id,'myWorkspaceActionDialog')]/option[text()='2-Production']")
	WebElement productionLevel;
	
	@FindBy(xpath = "//input[@value='Next >']")
	WebElement nextButton;
	
	@FindBy(xpath = "//input[contains(@id,'myWorkspaceActionDialog') and @value='Submit']")
	WebElement submitButtom;
	
	/*Release levels in result*/
	
	@FindBy(xpath = "//td[@class='MatTableEvenRow']/span[text()='1-In-Review'] | //td[@class='MatTableEvenRow']/span[text()='0-In-Work']")
	WebElement inReviewStatus;
	
	@FindBy(xpath = "//div[@id='myWorkspaceActionDialog_content_scroller']")
	WebElement diaScrollbar;
	
	//@FindBy(xpath = "//td[@menu='global_myWorkspaceActionDialog-f_SetReleaseSimActivity_depObjs_root']/following-sibling::td/select']")
	@FindBy(xpath = "(//td[@class='ColumnActionImage ModMenu']/following-sibling::td/select)[1]")
	WebElement diaSelectMenu1;
	
	@FindBy(xpath = "//td[@class='ColumnActionImage ModMenu']/following-sibling::td/select/option[text()='3']")
	WebElement diaSelectoption3;
	
	
	@FindBy(xpath = "//td[@class='MatTableEvenRow']/span[text()='2-Production']")
	WebElement prodStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Dependent Objects')]")
	WebElement dependentObjects;
	
	public void clickOnTargetLevel() {
		action.click(targetLevel).build().perform();
	}
	
	public void selectProdLevel() {
		//action.click(productionLevel).build().perform();
		Select select = new Select(targetLevel);
		select.selectByValue("2");
	}
	
	public void clickOnNext() {
		action.moveToElement(nextButton).build().perform();
		action.click(nextButton).build().perform();
		wait.until(ExpectedConditions.visibilityOf(dependentObjects));
		
	}
	
	public void clickOnSelectdialog() {
		action.moveToElement(diaSelectMenu1).build().perform();
		action.click(diaSelectMenu1).build().perform();
	}
	
	public void clickOnSelectdialogoption() {
		Select select = new Select(diaSelectMenu1);
		select.selectByVisibleText("3");
		
	}
	
	public void clickOnSelectoption() {
		action.moveToElement(diaSelectoption3).build().perform();
		action.click(diaSelectoption3).build().perform();
	}
	
	public MyWorkspacePage clickOnSubmit() {
		//eventDriver.executeScript("document.")
	//Select select = new Select(diaSelectMenu1);
		//select.selectByVisibleText("3");
		
		//action.click(diaSelectMenu1).build().perform();
		//action.click(diaSelectoption3).build().perform();
				//driver.switchTo().frame("myWorkspaceActionDialogIFrame");
	//js.executeScript("arguments[0].scrollIntoView(true);", submitButtom);
	//	js.executeScript("arguments[0].scrollIntoView();", diaScrollbar);
		//js.executeScript("window.scrollBy(0,500)", "");
		//driver.switchTo().defaultContent();
		action.moveToElement(submitButtom).build().perform();
		action.click(submitButtom).build().perform();
		//js.executeScript("arguments[0].click();", submitButtom);
		
		return new MyWorkspacePage();
	
	}
	
	public void promoteResult() {
		if(prodStatus.isDisplayed()) {
			System.out.println("Release level is: Production");
		} else {
			System.out.println("Promote didn't happen");
		}
	}
	
	public void demoteResult() {
		if(inReviewStatus.isDisplayed()) {
			System.out.println("Release level is: In Review or In Work");
		} else {
			System.out.println("Promote didn't happen");
		}
	}

}
