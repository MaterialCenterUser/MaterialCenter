package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.junit.Assert;
import com.wiz.materialCenter.util.TestBase;

public class ProcessesPage extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));

	public ProcessesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Inputs / Outputs']")
	WebElement inputOutputTab;

	@FindBy(xpath = "//div[@class='SMObjectsLink']/a[text()='promotedObjects']")
	WebElement promotedObj;

	@FindBy(xpath = "//div[@class='SMObjectsLink']/a[text()='demotedObjects']")
	WebElement demotedObj;

	@FindBy(xpath = "//a[@class='DownloadLinkDocument']")
	WebElement exportExcelLink;

	@FindBy(xpath = "//input[@title='Discard']")
	WebElement discardButton;

	@FindBy(xpath = "(//input[@value='Submit'])[1]")
	WebElement discardSubmit;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement autoRefreshCheckbox;

	@FindBy(xpath = "(//span[text()='Done'])[1]")
	WebElement doneStatus;

	@FindBy(xpath = "//span[text()='Subscribe for Revision Change Notification [ Process ]']")
	WebElement textSubscribeForRevisionProcess;

	@FindBy(xpath = "//span[text()='Unsubscribe for Revision Change Notification [ Process ]']")
	WebElement textUnsubscribeForRevisionProcess;
	@FindBy(xpath = "(//span[text()='Failed'])[1]")
	WebElement failedStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Export To Xml [ Export Process ]')]")
	WebElement exportProcessXml;

	@FindBy(xpath = "//tr[@smrow='0']/td[@smcol='1']/span")
	WebElement ErrorMsgValue;
	
	@FindBy(xpath = "//h2[text()='Import Measure Equation   ']")
	WebElement textImportMeasureEquation;
	
	@FindBy(xpath = "//h2[text()='Import Mapping   ']")
	WebElement textImportMappings;

	@FindBy(xpath = "//img[@class='BfsButton']")
	WebElement removeXmlButton;
	
	@FindBy(xpath = "//input[@id='httpFile']")
	WebElement uploadXml;
	
	@FindBy(xpath = "//input[@title='Submit']")
	WebElement submitMeasureEquation;
	
	@FindBy(xpath = "//span[@class='rf-msg-det']")
	WebElement msgErrorCreateMeasureEquation;
	
	@FindBy(xpath = "//input[contains(@id,'CreateEditMeasureEquation:measureEquationName')]")
	WebElement measureEqautionNameTextbox;
	
	@FindBy(xpath = "//img[contains(@id,'measureEquationMappingMeasureEquation_recentObjectListDropDownArrowImage')]")
	WebElement measureEqautionDropdown;
	
	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr/td/span)[1]")
	WebElement measureEqautionSelection;
	
	@FindBy(xpath = "//img[contains(@id,'measureEquationMappingSchema_recentObjectListDropDownArrowImage')]")
	WebElement schemaDropDown;

	@FindBy(xpath = "//img[contains(@id,'measureEquationMappingPropertyDef_recentObjectListDropDownArrowImage')]")
	WebElement measurePropertyDown;
	
	@FindBy(xpath = "//table[@class='RecentObjSelTbl']/tbody/tr/td/span[text()='MasterMetals']")
	WebElement masterMetalsSchema;
	
	
	@FindBy(xpath = "//table[@class='RecentObjSelTbl']/tbody/tr/td/span[text()='Shear Modulus, 12-Plane']")
	WebElement shearMeasureProperty;
	
	@FindBy(xpath = "//input[@id='httpFile']")
	WebElement chooseFileButtonWorkReqTemplate;
	
	@FindBy(xpath = "//input[@id='ConfirmTemplateChange-f:ConfirmTemplateChange_yes']")
	WebElement confirmOkButtonToUploadCustomTemplate;
	
	@FindBy(xpath = "//input[contains(@id, 'CreateWorkRequestTemplate:okBtn')]")
	WebElement createWorkReqTemplateSubmitButton;
	
	public MyWorkspacePage clickSubmitButtonToCreateWorkReqTemplate() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView(true);", createWorkReqTemplateSubmitButton);
		action.moveToElement(createWorkReqTemplateSubmitButton).build().perform();
		action.click(createWorkReqTemplateSubmitButton).build().perform();
		Thread.sleep(2000);
		return new MyWorkspacePage();
	
	}
	
	
	public void uploadTemplate(String customTemplate) {
		//action.click(uploadExcel).build().perform();
		chooseFileButtonWorkReqTemplate.sendKeys(customTemplate);
		//wait.until(ExpectedConditions.visibilityOf(confirmOkButtonToUploadCustomTemplate));
		
		
	}
	
	public void selectTemplateFileToUplaod() throws InterruptedException {
		uploadTemplate(prop.getProperty("customWrkReqTemplate"));
		wait.until(ExpectedConditions.visibilityOf(confirmOkButtonToUploadCustomTemplate));
		action.moveToElement(confirmOkButtonToUploadCustomTemplate).build().perform();
		action.click(confirmOkButtonToUploadCustomTemplate).build().perform();
		Thread.sleep(2000);
	}
	
	public void selectTemplateFileToUplaodForOneRefAttr() throws InterruptedException {
		uploadTemplate(prop.getProperty("oneRefAttrWrkReqTemplate"));
		wait.until(ExpectedConditions.visibilityOf(confirmOkButtonToUploadCustomTemplate));
		action.moveToElement(confirmOkButtonToUploadCustomTemplate).build().perform();
		action.click(confirmOkButtonToUploadCustomTemplate).build().perform();
		Thread.sleep(2000);
	}
	
	public void clickOnChooseFileOptionOnWrkReqTemplate() throws InterruptedException{
		action.moveToElement(chooseFileButtonWorkReqTemplate).build().perform();
		action.click(chooseFileButtonWorkReqTemplate).build().perform();
		
	}
	
	public void selectMeaureEquationFromDropdown() throws InterruptedException{
		action.moveToElement(measureEqautionDropdown).build().perform();
		action.click(measureEqautionDropdown).build().perform();
		js.executeScript("arguments[0].click();", measureEqautionSelection);
		Thread.sleep(2000);
		
	}
public void selectMasterMetalsSchemaFromDropdown() throws InterruptedException{
		
	action.moveToElement(schemaDropDown).build().perform();
	action.click(schemaDropDown).build().perform();
	js.executeScript("arguments[0].click();", masterMetalsSchema);
	Thread.sleep(2000);
	}
public void selectMeasurePRopertyFromDropdown() throws InterruptedException{
	
	action.moveToElement(measurePropertyDown).build().perform();
	action.click(measurePropertyDown).build().perform();
	js.executeScript("arguments[0].click();", shearMeasureProperty);
	Thread.sleep(2000);
}

	public void enterInvalidMeasureEquationName(String measureEquationName) {
		action.click(measureEqautionNameTextbox).build().perform();
		measureEqautionNameTextbox.clear();
		measureEqautionNameTextbox.sendKeys(measureEquationName);
	}
	
	public String msgInvalidMeasureEquationName() {

		return (msgErrorCreateMeasureEquation.getText());
	}
		
	public String msgCreateMeasureEquationError() {

		return (msgErrorCreateMeasureEquation.getText());
	}
	
	
	public ProcessesPage uploadXml(String xml) {
		//action.click(uploadExcel).build().perform();
		uploadXml.sendKeys(xml);
		return new ProcessesPage();
	}
	
	public void selectMeasureEquationFileToUpload() {
		uploadXml(prop.getProperty("measureEquationPath"));
		wait.until(ExpectedConditions.visibilityOf(removeXmlButton));
	}
	public void clickRemoveButton() {
		js.executeScript("arguments[0].click();", removeXmlButton);
		wait.until(ExpectedConditions.visibilityOf(uploadXml));
	}
	
	
	public void selectMappingFileToUpload() {
		uploadXml(prop.getProperty("mappingFilePath"));
		wait.until(ExpectedConditions.visibilityOf(removeXmlButton));
	}
	public void selectWrongMeasureEquationFileToUpload() {
		uploadXml(prop.getProperty("wrongMeasureEquationPath"));
			}
	
	public void selectWrongMeasureEquationMappingsFileToUpload() {
		uploadXml(prop.getProperty("wrongMeasureEquationMappingsPath"));
			}
	
	public boolean importMeasureEquationDisplayed() {
		return ((textImportMeasureEquation).isDisplayed());
	}

	public boolean importMappingsDisplayed() {
		return ((textImportMappings).isDisplayed());
	}

	public MyWorkspacePage clickOnSubmitMeasureEquation() throws InterruptedException {
		js.executeScript("arguments[0].click();", submitMeasureEquation);
		Thread.sleep(3000);	
	return new MyWorkspacePage();
	}
	
	public MyWorkspacePage clickOnSubmitMeasureEquationMappings() throws InterruptedException {
		js.executeScript("arguments[0].click();", submitMeasureEquation);
		Thread.sleep(3000);	
	return new MyWorkspacePage();
	}
	

	public void clickOnDiscard() {
		js.executeScript("arguments[0].click();", discardButton);
	}

	public HomePage clickOnDiscardSubmit() {
		js.executeScript("arguments[0].click();", discardSubmit);
		
		return new HomePage();
	}

	public void clickOnIOTab() {
		js.executeScript("arguments[0].click();", inputOutputTab);
	}

	public void clickOnPromotedObj() {
		js.executeScript("arguments[0].click();", promotedObj);
	}

	public void clickOnDemotedObj() {
		js.executeScript("arguments[0].click();", demotedObj);
	}

	public void exportExcelSuccess() {
		if (exportExcelLink.isDisplayed()) {
			System.out.println("Download Excel document link is available");
		} else {
			System.out.println("Download Excel document link is not available");
		}
		js.executeScript("arguments[0].click();", exportExcelLink);

	}

	public void verifyDoneStatus() {
		if (doneStatus.isDisplayed()) {
			System.out.println("Process is completed");
		} else {
			System.out.println("Process is not completed");
		}
	}

	public boolean verifyDoneStatusOnProcess() {
		return ((doneStatus).isDisplayed());
	}

	public boolean verifyTextSubscribeForRevisionProcess() {
		return ((textSubscribeForRevisionProcess).isDisplayed());
	}

	public boolean verifyTextUnsubscribeForRevisionProcess() {
		return ((textUnsubscribeForRevisionProcess).isDisplayed());
	}

	public void verifyProcessStatus() {
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
		if (doneStatus.isDisplayed()) {
			System.out.println("Process is completed");
		} else {
			System.out.println("Process is not completed");
		}
	}
	
	public void verifyProcessStatusxml() {
		/*
		 * if(autoRefreshCheckbox.isEnabled()) {
		 * action.click(autoRefreshCheckbox).build().perform();
		 * wait.until(ExpectedConditions.visibilityOf(doneStatus));
		 * if(doneStatus.isDisplayed()) {
		 * System.out.println("Process is completed"); } } else {
		 * System.out.println("Process is not completed"); } }
		 */
		// js.executeScript("arguments[0].click();", autoRefreshCheckbox);
		wait.until(ExpectedConditions.visibilityOf(exportProcessXml));
		action.moveToElement(autoRefreshCheckbox).build().perform();
		action.click(autoRefreshCheckbox).build().perform();
		wait.until(ExpectedConditions.visibilityOf(doneStatus));
		if (doneStatus.isDisplayed()) {
			System.out.println("Process is completed");
		} else {
			System.out.println("Process is not completed");
		}
	}

	public void verifyFailedStatus() {
		if (failedStatus.isDisplayed()) {
			System.out.println("Process is failed");
		} else {
			System.out.println("Process is not completed");
		}
	}

	public void verifyFailedProcessStatus() {
		if (autoRefreshCheckbox.isEnabled()) {
			action.click(autoRefreshCheckbox).build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(failedStatus));
			if (failedStatus.isDisplayed()) {
				System.out.println("Process is Failed");
			}
		} else {
			System.out.println("Process is not completed");
		}
	}

	public void batchSizeError() {
		Assert.assertEquals(ErrorMsgValue.getText(),
				"Exceeded maximum batch size - Max allowed batch size for async is '50'. "
						+ "Please update batch properties in compliance.properties file to adjust the batch size to expected one. "
						+ "[property name - materials.compliance.rest.batch.size.async]");
		System.out.println("Error msg displayed on screen is : " + ErrorMsgValue.getText());
	}

	public void CASNumberError() {
		String text = ErrorMsgValue.getText();
		if (text.contains("CAS Number format Error")) {
			System.out.println("Error msg is displayed related to CAS number");
		} else {
			System.out.println("Error msg displayed is not related to CAS number");
		}
		System.out.println("Error msg displayed on screen is : " + ErrorMsgValue.getText());
	}

}
