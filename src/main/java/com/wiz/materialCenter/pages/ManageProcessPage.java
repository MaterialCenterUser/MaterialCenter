package com.wiz.materialCenter.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class ManageProcessPage extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);

	public ManageProcessPage() {
		PageFactory.initElements(driver, this);
	}

	/* Xpaths manageProcess page */

	@FindBy(xpath = "//span[text()='Manage Process']")
	WebElement textManageProcess;

	@FindBy(xpath = "(//span[@class='Fixed'])[1]")
	WebElement textProject;

	@FindBy(xpath = "(//span[@class='Fixed'])[2]")
	WebElement textType;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:assemblyName']")
	WebElement textName;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:ManageProcess:matDataTypeDropDown_orDd']")
	WebElement processTypeDropdown;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:ManageProcess:matDataTypeDropDown_orDd']/option[@value='Composites']")
	WebElement processTypeDropdownCompositeOption;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:ManageProcess:matDataTypeDropDown_orDd']/option[@value='Metals']")
	WebElement processTypeDropdownMetalsOption;

	@FindBy(xpath = "//div[@class='RecentObjectsSelection']/img")
	WebElement processDropdownImage;

	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr/td/span[contains(text(),'Composites')])[1]")
	WebElement firstEleFromProcessDropdownForComposites;

	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr/td/span[contains(text(),'Metals')])[1]")
	WebElement firstElementFromProcessDropdownForMetals;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:materialDropDown_slt']")
	WebElement processSelectButton;

	@FindBy(xpath = "//span[@id='materialDropDown_osDlg_ttl']")
	WebElement textMaterialOnMatWondow;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:class']")
	WebElement classTextBox;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:cname']")
	WebElement commonNameTextBox;

	@FindBy(xpath = "(//input[contains(@value,'Composites')])[1]")
	WebElement compositesProcessPolulated;

	@FindBy(xpath = "(//input[contains(@value,'Metals')])[1]")
	WebElement metalsProcessPolulated;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:copyBtn']")
	WebElement processCopyButton;

	@FindBy(xpath = "//span[text()='Copy Material']")
	WebElement textCopyMatWindow;

	@FindBy(xpath = "//span[@class='rf-msg-det']")
	WebElement CopyErrorMessage;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:materialDropDown_clr']")
	WebElement processClearButton;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:okBtn' and @value='Add']")
	WebElement processAddButton;

	@FindBy(xpath = "//input[@value='Reset']")
	WebElement processResetButton;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:UISpecs_ConfigProperties:MatProcessComponent_time']")
	WebElement processTimeTextbox;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:ManageProcess:UISpecs_ConfigProperties:unit_MatProcessComponent_time']")
	WebElement timeUnitDropdown;
	
	@FindBy(xpath = "//span[text()='Material Data']")
	WebElement textMatData;
	
	//@FindBy(xpath = "//tr[@class='WTKROW']")
	@FindBy(xpath = "//div[@class='WTKTDiv']")
	WebElement processEntry;
	
	@FindBy(xpath = "//tr[@class='WTKROW ' and @row='2']")
	WebElement thirdProcessEntry;
	
	@FindBy(xpath = "//tr[@class='WTKROW ' and @row='1']")
	WebElement SecondProcessEntry;
	
	@FindBy(xpath = "//tr[@class='WTKROW ' and @row='0']")
	WebElement FirstProcessEntry;
	
	
	@FindBy(xpath = "//span[contains(text(),'Time=')]")
	WebElement linkPropertiesProcessEntry;
	
	@FindBy(xpath = "(//td[@class='wtk-table-cell   ']/span[contains(text(),'Composites')])[2]")
	WebElement processTypeCompProcessEntry;
	
	@FindBy(xpath = "(//td[@class='wtk-table-cell   ']/span[contains(text(),'Class=')])[1]")
	WebElement processPropertiesEntry;
	
	@FindBy(xpath = "(//td[@class='wtk-table-cell   ']/span[contains(text(),'Metals')])[2]")
	WebElement processTypeMetalsProcessEntry;
	
	@FindBy(xpath = "(//td[@class='wtk-table-cell   ']/span[text()='1'])")
	WebElement orderNumberEntry;
	
	@FindBy(xpath = "(//td[@class='wtk-table-cell   ']/span[text()='2'])")
	WebElement secondOrderNumberEntry;
	
	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:submitBtn']")
	WebElement processSubmitButton;
	
	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:cancelBtn']")
	WebElement processCancelButton;
	
	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:editComponentBtn']")
	WebElement processEditButton;
	
	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageProcess:okBtn' and @value='Update']")
	WebElement processUpdateButton;
	
	@FindBy(xpath = "//input[@value='First']")
	WebElement processFirstButton;
	
	@FindBy(xpath = "//input[@value='First']")
	WebElement processLastButton;
	
	@FindBy(xpath = "//input[@value='First']")
	WebElement processUpButton;
	
	@FindBy(xpath = "//input[@value='First']")
	WebElement processDownButton;
	
	@FindBy(xpath = "//input[@value='Remove']")
	WebElement processRemoveButton;
	
	@FindBy(xpath = "(//tr[@class='WTKROW' and @row='2']/td/span)[2]")
	WebElement matDataThirdEntry;
	
	@FindBy(xpath = "(//tr[@class='WTKROW' and @row='0']/td/span)[2]")
	WebElement matDataFirstEntry;
	
	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr)[1]")
	WebElement firstRowFromProcessDropDown;
	
	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr)[3]")
	WebElement thirdRowFromProcessDropDown;
	
	public boolean removeProcessDisplayed(){
		try {if(processTypeCompProcessEntry.isDisplayed());
		
		}
		catch
			(Throwable e)
		{
			return false;
		}
		return false;
		
		}
	public void selectFirstRowFromProcessDropdown(){
		js.executeScript("arguments[0].click();", firstRowFromProcessDropDown);
	}
	
	public boolean FirstEntryDisplayedClickingOnFirstButton(){
		return (processTypeMetalsProcessEntry.isDisplayed());
		
	}
	
	public boolean LastEntryDisplayedClickingOnFirstButton(){
		return (processTypeCompProcessEntry.isDisplayed());
		
	}
	
	
	public void clickOnFirstButton(){
		js.executeScript("arguments[0].click();", processFirstButton);
	}
	public void clickOnLastButton(){
		js.executeScript("arguments[0].click();", processLastButton);
	}
	public void clickOnUpButton(){
		js.executeScript("arguments[0].click();", processUpButton);
	}
	
	public void clickOnDownButton(){
		js.executeScript("arguments[0].click();", processDownButton);
	}
	
	public void clickOnRemoveButton(){
		js.executeScript("arguments[0].click();", processRemoveButton);
	}
	
	public boolean processUpdated(){
		
		return(processAddButton.isDisplayed());
	}
	
	public void clickOnUpdateButton(){
		js.executeScript("arguments[0].click();", processUpdateButton);
	}
	
	public boolean updateProcessButtonDisplayed(){
		
		return (processUpdateButton.isDisplayed());
	}
	
	public void selectFirstProcess(){
		js.executeScript("arguments[0].click();", FirstProcessEntry);
	}
	
	public void selectLastProcess(){
		js.executeScript("arguments[0].click();", thirdProcessEntry);
	}
	
	public void selectSecondProcess(){
		js.executeScript("arguments[0].click();", SecondProcessEntry);
	}
	
	public void selectFirstAddedProcess(){
		
		js.executeScript("arguments[0].click();", FirstProcessEntry);
	}
	
	public void clickOnEditButton(){
		js.executeScript("arguments[0].click();", processEditButton);
		
	}
	
	public String wrongValueTimeMessageText(){
		
		return (CopyErrorMessage.getText());
	}
	
public MaterialSOD clickOnSubmitButton(){
		
		js.executeScript("arguments[0].click();", processSubmitButton);
		
		return new MaterialSOD();
	}
	public void clickOnCancelButton(){
		
		js.executeScript("arguments[0].click();", processCancelButton);
	}
	public boolean cancelButtonDisplayed(){
		return (processSubmitButton.isDisplayed());
	}
	public boolean submitButtonDisplayed(){
		return (processSubmitButton.isDisplayed());
	}
	
	public boolean secondOrderNUmberEntryDisplayed(){
		return (secondOrderNumberEntry.isDisplayed());
	}
	public boolean orderNUmberEntryDisplayed(){
		return (orderNumberEntry.isDisplayed());
	}
	public boolean processPropetiesDisplayed(){
		
		return(processPropertiesEntry.isDisplayed());
	}
	public boolean compositesProcessTypeInEntryDisplayed(){
		return(processTypeCompProcessEntry.isDisplayed());
	}
	
	public boolean metalsProcessTypeInEntryDisplayed(){
		return(processTypeMetalsProcessEntry.isDisplayed());
	}
	
	
	public boolean linkPropertiesDisplayed(){
		return(linkPropertiesProcessEntry.isDisplayed());
	}
	
	public boolean processEntryDisplayed(){
		return(processEntry.isDisplayed());
	}
	public void clickAddButton() throws InterruptedException {

		js.executeScript("arguments[0].click();", processAddButton);
		//wait.until(ExpectedConditions.visibilityOf(processEntry));
		//Thread.sleep(2000);

	}

	public void enterValueinTimeTextBox() {

		processTimeTextbox.sendKeys(RandomStringUtils.randomNumeric(2));
	}

	public void enterNergativeValueinTimeTextBox() {

		processTimeTextbox.sendKeys("-20");
	}
	public void enterUnrealisticValueinTimeTextBox() {

		processTimeTextbox.sendKeys("100C");
	}
	public void clickClearButton() {

		js.executeScript("arguments[0].click();", processClearButton);
	}

	public String errorMessageCopyMatGetText() {

		return (CopyErrorMessage.getText());
	}

	public boolean copyMatWindowDsipalyed() {
		return (textCopyMatWindow.isDisplayed());
	}

	public boolean processCompoPrepopulatedInDropdown() {
		return (compositesProcessPolulated.isDisplayed());
	}

	public void clickOnCopyButton() {
		js.executeScript("arguments[0].click();", processCopyButton);
		//wait.until(ExpectedConditions.visibilityOf(textCopyMatWindow));
	}

	public boolean processMetalsPrepopulatedInDropdown() {
		return (metalsProcessPolulated.isDisplayed());
	}

	public boolean classTextBoxDisplayed() {

		return (classTextBox.isDisplayed());
	}

	public boolean commonNameTextBoxDisplayed() {

		return (commonNameTextBox.isDisplayed());
	}

	public boolean materialsSelectionWindowDisplayed() {
		return (textMaterialOnMatWondow.isDisplayed());
	}

	public void clickOnSelectButton() {

		js.executeScript("arguments[0].click();", processSelectButton);
		wait.until(ExpectedConditions.visibilityOf(textMaterialOnMatWondow));
	}

	public void selectCompositesFromProcessTypeDropdown() {

		Select select = new Select(processTypeDropdown);
		select.selectByIndex(0);
	}

	public void selectMetalsFromProcessTypeDropdown() {

		Select select = new Select(processTypeDropdown);
		select.selectByIndex(1);
	}

	public void clickProcessDropdownImage() {

		action.moveToElement(processDropdownImage).build().perform();
		action.click(processDropdownImage).build().perform();
	}

	public boolean verifyCompositesComponentsDisplayed() {

		return (firstEleFromProcessDropdownForComposites.isDisplayed());
	}

	public boolean verifyMetalsComponentsDisplayed() {

		return (firstElementFromProcessDropdownForMetals.isDisplayed());
	}

	public boolean manageProcessPageDisplayed() {

		return (textManageProcess.isDisplayed());
	}

	public String getProjectText() {

		return (textProject.getText());
	}

	public String getTextType() {

		return (textType.getText());
	}

	public boolean verifyNamePopulatedDisplayed() {

		return (textName.isDisplayed());
	}

	public String processTypeGetFirstOption() {

		return (processTypeDropdownCompositeOption.getText());
	}

	public String processTypeGetSecondOption() {

		return (processTypeDropdownMetalsOption.getText());
	}

	public void clickOnProcessTypeDropdown() {
		action.moveToElement(processTypeDropdown).build().perform();
		action.click(processTypeDropdown).build().perform();
	}
}
