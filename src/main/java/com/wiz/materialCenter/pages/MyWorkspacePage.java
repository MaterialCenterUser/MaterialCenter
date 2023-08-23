package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.openqa.selenium.By;
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
WebDriverWait wait = new WebDriverWait(driver,(30));
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


//@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td[@smcol='0']")
@FindBy(xpath = "(//a[text()='CAE Model (Auto)'])[1]")
WebElement caeProcess;

//@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td[@smcol='0']")
@FindBy(xpath = "(//a[text()='Manage Process'])[1]")
WebElement manageProcess;

//@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td[@smcol='0']/a[text()='Discard']")
@FindBy(xpath = "(//a[text()='Discard'])[1]")
WebElement discardStatus;

@FindBy(xpath = "//input[@type='checkbox']")
WebElement autoRefreshCheckbox;

@FindBy(xpath = "//img[@title='Home Workspace']")
WebElement dashboardPage;

@FindBy(xpath = "//a[@title='Configuration']")
WebElement config;

@FindBy(xpath = "//span[contains(text(),'Measures from equations affects')]")
WebElement textMeasureEqautionCreated;

@FindBy(xpath = "//span[contains(text(),'[ Approver List ]')]")
WebElement textApproverListCreated;

@FindBy(xpath = "//img[@title='New Work Request Template']")
WebElement createTemplateImage;

@FindBy(xpath = "//span[contains(@id, 'EditApprovalRequestWatchList:notifyUsers_noItemsMessage')]")
WebElement usersListTableWatchList;

@FindBy(xpath = "//span[text()='Edit']")
WebElement editMenu;


@FindBy(xpath = "//td[text()='Edit Watch List']")
WebElement editWatchListOption;

@FindBy(xpath = "//span[conains(@id, 'EditApprovalRequestWatchList:notifyUsers_selectbutton')]']")
WebElement selectButtonEditWatchList;

@FindBy(xpath = "//span[@id='notifyUsers_objectSelectionDialog_ttl']")
WebElement smObjectSelectionWindow;

@FindBy(xpath = "(//table[@class='ModBody']/tbody/tr[@smrow='0'])[1]")
WebElement firstUserObjectSelection;

@FindBy(xpath = "(//table[@class='ModBody']/tbody/tr[@smrow='1'])[1]")
WebElement secondUserObjectSelection;

@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:EditApprovalRequestWatchList:okBtn']")
WebElement editWatchListSubmitButton;

@FindBy(xpath = "//span[text()='Watch List']")
WebElement watchListTab;

@FindBy(xpath = "(//table[@class='wtk-table']/tbody/tr/td)[2]")
WebElement secondRowAddedUserWatchList;


@FindBy(xpath = "(//table[@class='wtk-table']/tbody/tr/td)[1]")
WebElement firstRowAddedUserWatchList;

@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:EditApprovalRequestWatchList:notifyUsers_removebutton']")
WebElement removeButtonWatchList;


@FindBy(xpath = "//span[contains(@id,'sod-ApprovalRequest46b:statusWidget:chargeNumberLabel')]")
WebElement chargeNumberFieldOnappReqPage;

@FindBy(xpath = "//img[contains(@id,'totalRefresh')]")
WebElement refreshIconImage;

@FindBy(xpath = "//span[contains(text(),\"Error: permissible string length for the attribute 'chargeNumber' is '120'\")]")
WebElement errMessageForLargeChargeNumber;

@FindBy(xpath = "//span[contains(text(),\" [ Approval Request ]\")]")
WebElement appReqCreatedText;

@FindBy(xpath = "(//span[contains(@id,'sod-ApprovalRequest46b:statusWidget:chargeNumber')])[2]")
WebElement createdChargeNumber;

@FindBy(xpath = "//div[@id='Node0']/child::div/div/div[@class='Details']/div/table/tbody/tr[2]/td[text()='(P)']")
WebElement pLegendStep1OnApproverDetailsPage;

@FindBy(xpath = "//input[@value='Approve']")
WebElement approvalRequestApproveButton;

@FindBy(xpath = "//input[@value='Reject']")
WebElement approvalRequestRejectButton;

@FindBy(xpath = "//input[@value='Refresh']")
WebElement approvalRequestRefreshButton;

@FindBy(xpath = "//td[text()='Promote']")
WebElement promoteAction;

@FindBy(xpath = "//span[text()='Security']")
WebElement security;

public void clickOnSecurity() {
	js.executeScript("arguments[0].click();", security);
	// action.moveToElement(security).build().perform();
	// action.click(security).build().perform();
}

public void clickOnPromoteAction() {
	// js.executeScript("arguments[0].click();", promoteAction);
	action.moveToElement(promoteAction).build().perform();
	action.click(promoteAction).build().perform();
	//wait.until(ExpectedConditions.visibilityOf(targetLevel));nn
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[contains(@id,'myWorkspaceActionDialog')]")));
	
}
public boolean approveButtonDisplayed(){
	return(approvalRequestApproveButton.isDisplayed());
	
}
public boolean rejectButtonDisplayed(){
	return(approvalRequestRejectButton.isDisplayed());
	
}
public boolean  refreshButtonDisplayed(){
	return(approvalRequestRefreshButton.isDisplayed());
	
}

public boolean  pLegendOnStep1OnApprovalRequestDetailsPage(){
	return(pLegendStep1OnApproverDetailsPage.isDisplayed());
	
}
public String blankChargeNumberDisplayed() {

	return (createdChargeNumber.getText());
}


public boolean  approvalRequestIsCreated(){
	return(appReqCreatedText.isDisplayed());
	
}

public boolean errMessageForChargeNumberLargerThanLImitDisplayed() {
	return ((errMessageForLargeChargeNumber).isDisplayed());
	
}

public void clickOnRefreshIcon() {
	
	action.moveToElement(refreshIconImage).build().perform();
	action.click(refreshIconImage).build().perform();
}

public boolean chargeNumberOnCreateAppReqDetailsPageDisplayed() {
	return ((chargeNumberFieldOnappReqPage).isDisplayed());
	
}

public boolean removeButtonIsDisabledInWatchList() {

	
	if (removeButtonWatchList.isEnabled() == true) {
		return true;
	} else {
		return false;
	}
}
public void clickRemoveButtonOnWatchList() {
	action.moveToElement(removeButtonWatchList).build().perform();
	action.click(removeButtonWatchList).build().perform();
	
}


public void clickOnSubmitButtonToSubWatchList() {
	action.moveToElement(editWatchListSubmitButton).build().perform();
	action.click(editWatchListSubmitButton).build().perform();
	wait.until(ExpectedConditions.visibilityOf(watchListTab));
}
public void selectFirstUserObjectSelection() {
	
	action.moveToElement(firstUserObjectSelection).build().perform();
	action.doubleClick(firstUserObjectSelection).build().perform();
}

public void selectSecondUserObjectSelection() {
	
	action.moveToElement(secondUserObjectSelection).build().perform();
	action.doubleClick(secondUserObjectSelection).build().perform();
}


//span[@id='notifyUsers_objectSelectionDialog_ttl']
public void clickOnSelectButtonEditWatchList() {
	action.moveToElement(selectButtonEditWatchList).build().perform();
	action.click(selectButtonEditWatchList).build().perform();
	wait.until(ExpectedConditions.visibilityOf(smObjectSelectionWindow));
	
}
public boolean  editWatchListOptionDisplayed(){
	return(editWatchListOption.isDisplayed());
	
}

public void clickEditMenu() {
	js.executeScript("arguments[0].click();", editMenu);

}

public void clickEditWatchListOption() {
	
	action.moveToElement(editWatchListOption).build().perform();
	action.click(editWatchListOption).build().perform();
}
public void selectTheFirstAddedUserWatchList() {
	
	action.moveToElement(firstRowAddedUserWatchList).build().perform();
	action.click(firstRowAddedUserWatchList).build().perform();
}


public boolean newAddedUserDisplayedInWatchList() {
	return(secondRowAddedUserWatchList.isDisplayed());
}

public String getUsersList() {
	
	return (usersListTableWatchList.getText());
}

public boolean  createTemplateDisplayed(){
	return(createTemplateImage.isDisplayed());
	
}


public boolean  approverListCreated(){
	return(textApproverListCreated.isDisplayed());
	
}

public boolean  measureFromEquationsCreated(){
	return(textMeasureEqautionCreated.isDisplayed());
	
}
public ConfigurationWS clickOnConfiguration() throws InterruptedException {
	action.moveToElement(config).build().perform();
	action.click(config).build().perform();
	Thread.sleep(2000);
	return new ConfigurationWS();
}

public void clickOnDashboard() throws InterruptedException {
	js.executeScript("arguments[0].click();", dashboardPage);
	Thread.sleep(3000);
}
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


public void clickOnAutomRefresh() {
	/*
	 * if(autoRefreshCheckbox.isEnabled()) {
	 * action.click(autoRefreshCheckbox).build().perform();
	 * wait.until(ExpectedConditions.visibilityOf(doneStatus));
	 * if(doneStatus.isDisplayed()) {
	 * System.out.println("Process is completed"); } } else {
	 * System.out.println("Process is not completed"); } }
	 */
	// js.executeScript("arguments[0].click();", autoRefreshCheckbox);
	//wait.until(ExpectedConditions.visibilityOf(exportProcessXml));
	action.moveToElement(autoRefreshCheckbox).build().perform();
	action.click(autoRefreshCheckbox).build().perform();
	wait.until(ExpectedConditions.visibilityOf(doneStatus));

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
