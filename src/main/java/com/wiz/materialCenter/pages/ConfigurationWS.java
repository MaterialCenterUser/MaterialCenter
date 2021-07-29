package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class ConfigurationWS extends TestBase {
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	EditMatProcess editMat = new EditMatProcess();
	
	public ConfigurationWS() {
		PageFactory.initElements(driver, this);
	}
	
	/*Xpaths under Materials Configuration tab*/
	
	@FindBy(xpath = "//input[contains(@name,'expandcollapseAdminButton')]")
	WebElement toggleMatAdmin;
	
	@FindBy(xpath = "//a[text()='Property Categories']")
	WebElement propertyCategories;
	
	@FindBy(xpath = "//a[text()='Material Property Definitions']")
	WebElement matPropDef;
	
	@FindBy(xpath = "//a[text()='Material Schemas']")
	WebElement matSchemas;
	
	@FindBy(xpath = "//a[text()='Databank Mappings']")
	WebElement databankMappings;
	
	@FindBy(xpath = "//a[text()='Excel Mappings']")
	WebElement excelMappings;
	
	@FindBy(xpath = "//a[text()='Xml Mappings']")
	WebElement xmlMappings;
	
	@FindBy(xpath = "//a[text()='CAE Mappings']")
	WebElement caeMappings;
	
	@FindBy(xpath = "//a[text()='Curve Equations']")
	WebElement curveEqu;
	
	@FindBy(xpath = "//a[text()='Curve Equation Mappings']")
	WebElement curveEquMappings;
	
	@FindBy(xpath = "//a[text()='Specimen Definitions']")
	WebElement speciDef;
	
	@FindBy(xpath = "//a[text()='Test Definitions']")
	WebElement testDef;
	
	@FindBy(xpath = "//a[text()='Test Templates']")
	WebElement testTemplates;
	
	@FindBy(xpath = "//td[contains(text(),'Test Templates')]")
	WebElement textTestTemplates;
	
	@FindBy(xpath = "//a[text()='Approver Lists']")
	WebElement approverLists;
	
	@FindBy(xpath = "//a[text()='EMV Connections']")
	WebElement emvConnections;
	
	@FindBy(xpath = "//a[text()='Compliance Connector']")
	WebElement complianceConnector;
	
	@FindBy(xpath = "//a[text()='Create Compliance Connection']")
	WebElement createComplianceConnection;
	
	@FindBy(xpath = "//a[text()='Update Base Mapping']")
	WebElement updateBaseMapping;
	
	@FindBy(xpath = "//a[text()='Configure Material Attributes']")
	WebElement configMatAttributes;
	
	@FindBy(xpath = "//a[text()='Work Request Templates']")
	WebElement workReqTemp;
	
	@FindBy(xpath = "//a[text()='Material Displays']")
	WebElement matDisplays;
	
	@FindBy(xpath = "//option[text()='Class']")
	WebElement classificationClass;
	
	@FindBy(xpath = "//option[text()='Family']")
	WebElement classificationFamily;
	
	@FindBy(xpath = "//option[text()='Form']")
	WebElement classificationForm;
	
	@FindBy(xpath = "//option[text()='Sub Class']")
	WebElement classificationSubClass;
	
	@FindBy(xpath = "(//img[@class='right'])[1]")
	WebElement moveRight;
	
	@FindBy(xpath = "//input[@value='Submit' and contains(@id,'Materials')]")
	WebElement findSimilarSubmitButton;
	
	@FindBy(xpath = "//input[@id='cfsmsgDialogLoggOffInfo-f:msgDlgOkBtn']")
	WebElement okButtonAlert;
	
	
	
	/*Xpaths under Materials Data Owner tab*/
	
	@FindBy(xpath = "//input[contains(@name,'expandcollapseDataOwnerButton')]")
	WebElement toggleMatDataOwner;
	
	@FindBy(xpath = "//a[text()='Create Material']")
	WebElement createMat;
	
	@FindBy(xpath = "//a[text()='Import Excel File']")
	WebElement importExcel;
	
	@FindBy(xpath = "//a[text()='Import Text File']")
	WebElement importText;
	
	@FindBy(xpath = "//a[text()='Import Xml File']")
	WebElement importXml;
	
	@FindBy(xpath = "//a[text()='Data Sources']")
	WebElement dataSources;
	
	@FindBy(xpath = "//a[text()='Export Processes']")
	WebElement exportProcesses;
	
	@FindBy(xpath = "//a[text()='Submitted Approval Requests']")
	WebElement approvalRequest;
	
	@FindBy(xpath = "//a[text()='Disclaimers']")
	WebElement disclaimers;
	
	@FindBy(xpath = "//a[text()='Security Labels']")
	WebElement securityLabels;
	
	@FindBy(xpath = "//a[text()='Compliance Status Plot']")
	WebElement compliancePlot;
	
	/*Xpaths under All Materials Users tab*/
	
	@FindBy(xpath = "//input[contains(@name,'expandcollapseAllUsersButton')]")
	WebElement toggleMatUsers;
	
	@FindBy(xpath = "//a[text()='Libraries']")
	WebElement libraries;
	
	@FindBy(xpath = "//a[text()='Pending Approval Requests']")
	WebElement pendingApprovalReq;
	
	//@FindBy(xpath = "//a[text()='Configure Find Similar']")
	@FindBy(xpath = "//a[@id='f:w:wm:MaterialsWorkspace:widgetlink_findSimilarLink']")
	
	WebElement configFindSimilar;
	
	@FindBy(xpath = "//span[text()='All Materials Users']")
	WebElement textAllMatUsers;
	
	
	/*Xpaths under Specimen & Test Definitions*/
	
	@FindBy(xpath = "//a[text()='Pedigree Viewer']")
	WebElement pedigreeViewer;
	
	@FindBy(xpath = "//a[text()='Create Specimen Definition']")
	WebElement createSpecDef;
	
	@FindBy(xpath = "//a[text()='Create Test Definition']")
	WebElement createTestDef;
	
	@FindBy(xpath = "//a[text()='Create Test Template']")
	WebElement createTestTemplate;
	
	@FindBy(xpath = "//a[text()='Edit Test Definition']")
	WebElement editTestDef;
	
	@FindBy(xpath = "//a[text()='Edit Specimen Definition']")
	WebElement editSpecDef;
	
	@FindBy(xpath = "//a[text()='Edit Test Template']")
	WebElement editTestTemplate;
	
	@FindBy(xpath = "//a[text()='Edit Imported Mapping']")
	WebElement editImportMapping;
	
	@FindBy(xpath = "//a[text()='Assign Security Labels']")
	WebElement assignSecurityLabels;
	
	@FindBy(xpath = "//a[text()='Example Test Data Mapping']//parent::td")
	WebElement exTestDataMapping;
	
	@FindBy(xpath = "//td[contains(text(),'Excel Mappings')]")
	WebElement textExcelMappings;
	
	@FindBy(xpath = "//a[text()='Generic Materials Selector']//parent::td")
	WebElement excelMappingGenMatSelector;
	
	
	@FindBy(xpath = "//input[contains(@id,'TestTemplate:name')]")
	WebElement testTemplateName;
	
	@FindBy(xpath = "//input[contains(@id,'btnImportDesignMapping')]")
	WebElement importDesignDataMapping;
	
	@FindBy(xpath = "//div[contains(@id,'ImportExcelMapping:project')]")
	WebElement designDataProjectDropdown;
	
	@FindBy(xpath = "//span[text()='/Data']")
	WebElement designDataProjectData;
	
	@FindBy(xpath = "//input[contains(@id,'ImportExcelMapping:name')]")
	WebElement designDataMappingName;
	
	@FindBy(xpath = "//img[contains(@id,'materialsSchema')]")
	WebElement designDataSchemaDropdown;
	
	@FindBy(xpath = "//span[text()='Master']")
	WebElement schemaMaster;
	
	@FindBy(xpath = "//img[contains(@id,'testDataMapping')]")
	WebElement testDataMappingDropdown;
	
	@FindBy(xpath = "(//span[text()='Import Digimat-VA CompositeTests'])[2]")
	WebElement exampleTestDataMapping;
	
	@FindBy(xpath = "//img[contains(@id,'dynamicOneRefWidget')]")
	WebElement tensileRefDropdown;
	
	@FindBy(xpath = "//span[contains(text(),'ASTM')]")
	WebElement tensileRef;
	
	@FindBy(xpath = "//select[contains(@id,'designAllowableDropdown')]")
	WebElement designAllowableDropdown;
	
	@FindBy(xpath = "//select[contains(@id,'designAllowableDropdown')]/option[text()='Tensile Ultimate Strength']")
	WebElement tensileUltStrgth;
	
	@FindBy(xpath = "//select[contains(@id,'designAllowableDropdown')]/option[text()='Tensile Yield Strength']")
	WebElement tensileYieldStrgth;
	
	@FindBy(xpath = "//input[@value='Add']")
	WebElement addDesignAllowable;
	
	@FindBy(xpath = "//input[contains(@id,'url')]")
	WebElement serverUrl;
	
	@FindBy(xpath = "//input[contains(@id,'materialUser')]")
	WebElement matUser;
	
	@FindBy(xpath = "//input[contains(@id,'materialPassword')]")
	WebElement matPassword;
	
	@FindBy(xpath = "//input[contains(@id,'complianceUser')]")
	WebElement complianceUser;
	
	@FindBy(xpath = "//input[contains(@id,'compliancePassword')]")
	WebElement compliancePassword;
	
	@FindBy(xpath = "//input[contains(@id,'singleMatComplianceApi')]")
	WebElement singleMatApi;
	
	@FindBy(xpath = "//input[contains(@id,'multipleMatComplianceApi')]")
	WebElement multiMatApi;
	
	@FindBy(xpath = "//input[contains(@id,'ComplianceConnection:submitButton')]")
	WebElement complianceConnectionSubmit;
	
	@FindBy(xpath = "//td[@smcol='2']")
	WebElement matUserValue;
	
	@FindBy(xpath = "//td[@smcol='3']")
	WebElement complianceUserValue;
	
	
	/*Xpaths for import excel file*/
	
	@FindBy(xpath = "//label[text()=' Fixed'] | //input[@value='excelFixed']")
	WebElement fixedFormat;
	
	@FindBy(xpath = "(//img[contains(@id,'ImportFromExcel')])[1]")
	WebElement projectDropDown;
	
	@FindBy(xpath = "(//img[contains(@id,'ImportFromExcel')])[2]")
	WebElement schemaDropDown;
	
	@FindBy(xpath = "(//img[contains(@id,'ImportFromExcel')])[3]")
	WebElement schemaMappingDropDown;
	
	@FindBy(xpath = "//div[@id='RecentObjSel']/table/tbody/tr/td/span[text()='/Data'] | //div[@id='RecentObjSel']/table/tbody/tr/td/span[text()='/Data/Active/TASE']")
	WebElement dataProject;
	
	@FindBy(xpath = "//table[@class='RecentObjSelTbl']/tbody/tr/td/span[text()='MasterMetals']")
	WebElement masterMetalsSchema;
	
	@FindBy(xpath = "//table[@class='RecentObjSelTbl']/tbody/tr/td/span[text()='Generic Materials Selector']")
	WebElement genericMatSelector;
	
	@FindBy(xpath = "//input[@id='httpFile']")
	WebElement uploadExcel;
	
	@FindBy(xpath = "(//input[@id='httpFile'])[2]")
	WebElement uploadExcelOnExcelMapping;
	
	
	@FindBy(xpath = "(//input[@id='httpFile'])[1]")
	WebElement uploadExcel1;
	
	@FindBy(xpath = "//img[@class='BfsButton']")
	WebElement removeExcelButton;
	
	@FindBy(xpath = "//input[@value='Submit' and @title='Submit']")
	WebElement submitExcelButton;
	
	@FindBy(xpath = "//input[contains(@id,'ExcelMapping:submitButton')]")
	WebElement submitDesignDataButton;
	
	@FindBy(xpath = "//div[contains(@id,'objLabelDecPanel')]")
	WebElement verifyHeading;
	
	@FindBy(xpath = "//a[contains(text(),'TestDataReductionTemplate.xlsx')]")
	WebElement templateLink;
	
	@FindBy(xpath = "//input[@value='Ok']")
	WebElement infoDialogOkButton;
	
	@FindBy(xpath = "(//input[@value='Clear'])[2]")
	WebElement matToReviseClear;
	
	@FindBy(xpath = "//h2[contains(text(),'Material (Excel)   ')]")
	WebElement textMaterialtoImportExcel;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:CreateEditTestTemplate:generatedFromDropdown']")
	WebElement selectTestDataDropdown;
	
	
	public void clickOnImportExcel() {
		//action.moveToElement(importExcel).build().perform();
		//action.click(importExcel).build().perform();
		js.executeScript("arguments[0].click();", importExcel);
		wait.until(ExpectedConditions.visibilityOf(textMaterialtoImportExcel));
	}
	
	public void clickOnFixedFormat() {
		action.moveToElement(fixedFormat).build().perform();
		action.click(fixedFormat).build().perform();
		//wait.until(ExpectedConditions.elementToBeSelected(fixedFormat));
	}
	
	public void selectDataProject() {
		action.moveToElement(projectDropDown).build().perform();
		action.click(projectDropDown).build().perform();
		js.executeScript("arguments[0].click();", dataProject);
	}
	
	public void selectMasterMetalSchema() {
		action.moveToElement(schemaDropDown).build().perform();
		action.click(schemaDropDown).build().perform();
		js.executeScript("arguments[0].click();", masterMetalsSchema);
	}
	
	public void selectGenericMatSchema() {
		action.moveToElement(schemaMappingDropDown).build().perform();
		action.click(schemaMappingDropDown).build().perform();
		js.executeScript("arguments[0].click();", genericMatSelector);
		//wait.until(ExpectedConditions.elementToBeSelected(genericMatSelector));
	}
	
	public void clearMatToRevise() {
		action.moveToElement(matToReviseClear).build().perform();
		action.click(matToReviseClear).build().perform();
	}
	
	public ConfigurationWS uploadExcel(String excelSheet) {
		//action.click(uploadExcel).build().perform();
		uploadExcel.sendKeys(excelSheet);
		return new ConfigurationWS();
	}
	
	public ConfigurationWS uploadExcelOnExcelMapping(String excelSheet) {
		//action.click(uploadExcel).build().perform();
		uploadExcelOnExcelMapping.sendKeys(excelSheet);
		return new ConfigurationWS();
	}
	
	public ConfigurationWS uploadExcel1(String excelSheet) {
		//action.click(uploadExcel).build().perform();
		uploadExcel1.sendKeys(excelSheet);
		return new ConfigurationWS();
	}
	
	public void selectExcelToUplaod() {
		uploadExcel(prop.getProperty("excelPath"));
		if(removeExcelButton.isDisplayed()) {
			System.out.println("Excel file to upload is selected");
		} else { 
			System.out.println("Excel file to upload is not yet selected");
		}
	}
	
	public void selectExcelToUplaodMapped() {
		uploadExcel(prop.getProperty("excelPathMapped"));
		if(removeExcelButton.isDisplayed()) {
			System.out.println("Excel file to upload is selected");
		} else { 
			System.out.println("Excel file to upload is not yet selected");
		}
	}
	
	public void selectAlphaNumericCASExcelToUplaod() {
		uploadExcel(prop.getProperty("excelPathAlphaNumericCAS"));
		if(removeExcelButton.isDisplayed()) {
			System.out.println("Excel file to upload is selected");
		} else { 
			System.out.println("Excel file to upload is not yet selected");
		}
	}
	
	public void selectTestDataToUplaod() {
		uploadExcel(prop.getProperty("testDataPath"));
		if(removeExcelButton.isDisplayed()) {
			System.out.println("File to upload is selected");
		} else { 
			System.out.println("File to upload is not yet selected");
		}
	}
	
	public void clickOnSubmitExcel() {
		js.executeScript("arguments[0].click();", submitExcelButton);
		//action.moveToElement(submitExcelButton).build().perform();
		//action.click(submitExcelButton).build().perform();
	}
	
	public void selectTestDataToGenerateFromDropdown() {
			Select select = new Select(selectTestDataDropdown);
		
		select.selectByValue("compressiveModulusLdir_pctRTVsTemp");
	}
	
	public void clickOnFindSimilar() {
		js.executeScript("arguments[0].scrollIntoView(true);", configFindSimilar);
		//js.executeScript("arguments[0].scrollIntoView(true);", textAllMatUsers);
		action.moveToElement(configFindSimilar).build().perform();
		action.click(configFindSimilar).build().perform();
	}
	
	public void modifyFindSimilar() {
		action.keyDown(Keys.CONTROL).click(classificationClass).click(classificationFamily).click(classificationForm).click(classificationSubClass).keyUp(Keys.CONTROL).build().perform();
		action.moveToElement(moveRight).build().perform();
		action.click(moveRight).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", findSimilarSubmitButton);
		action.moveToElement(findSimilarSubmitButton).build().perform();
		action.click(findSimilarSubmitButton).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonAlert));
		action.moveToElement(okButtonAlert).build().perform();
		action.click(okButtonAlert).build().perform();
		
		//driver.switchTo().alert().accept();
	}
	
	public void selectSpecDef() {
		//action.moveToElement(speciDef).build().perform();
		//action.click(speciDef).build().perform();
		js.executeScript("arguments[0].click();", speciDef);
		wait.until(ExpectedConditions.elementToBeClickable(createSpecDef));
	}
	
	public void clickOnCreateSpecDef() {
		action.moveToElement(createSpecDef).build().perform();
		action.click(createSpecDef).build().perform();
	}
	
	public void selectTestDef() {
		action.click(testDef).build().perform();
	}
	
	public void clickOnCreateTestDef() {
		action.click(createTestDef).build().perform();
	}
	
	public void selectExcelMappings() {
		//action.moveToElement(excelMappings).build().perform();
		//action.click(excelMappings).build().perform();
		js.executeScript("arguments[0].click();", excelMappings);
		wait.until(ExpectedConditions.visibilityOf(textExcelMappings));
	}
	
	public void selectExTestDataMapping() {
		js.executeScript("arguments[0].click();", exTestDataMapping);
	}
	
	public void selectGenericMatSelector() { 
		js.executeScript("arguments[0].click();", excelMappingGenMatSelector);
	}
	public void clickOnEditImportedMapping() {
		action.moveToElement(editImportMapping).build().perform();
		action.click(editImportMapping).build().perform();
	}
	
	public void selectExcelTemplate() {
		uploadExcelOnExcelMapping(prop.getProperty("testDataReductionTemplate"));
	}
	
	public void submitExcelTemplate() {
		action.moveToElement(submitExcelButton).build().perform();
		action.click(submitExcelButton).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(verifyHeading));
		String text = verifyHeading.getText();
		if(text.contains("Example Test Data Mapping [ Excel Schema Mapping ]")) {
			System.out.println("Test Definition is created successfully");
		} else {
			System.out.println("Test Deifinition is not created successfully");
		}
	}
	
	public void verifyTheTemplate() {
		
		//String tempLink = templateLink.getText();
		if(templateLink.isDisplayed()) {
			System.out.println("Test Template is uploaded successfully");
		} else {
			System.out.println("Test Template is  not uploaded successfully");
		}
	}
	
	public void selectTestTemplates() {
		//action.click(testTemplates).build().perform();
		js.executeScript("arguments[0].click();", testTemplates);
		wait.until(ExpectedConditions.visibilityOf(textTestTemplates));
		
	}
	
	public void clickOncreateTestTemplate() {
		action.moveToElement(createTestTemplate).build().perform();
		action.click(createTestTemplate).build().perform();
	}
	
	public void provideTestTemplateName() {
		testTemplateName.click();
		testTemplateName.clear();
		testTemplateName.sendKeys("ExampleTestTemplate");
	}
	
	public void selectDesignDataMapping() {
		action.moveToElement(importDesignDataMapping).build().perform();
		action.click(importDesignDataMapping).build().perform();
	}
	public void provideImportDesignDataDetails() {
		action.moveToElement(designDataProjectDropdown).build().perform();
		action.click(designDataProjectDropdown).build().perform();
		js.executeScript("arguments[0].click();", designDataProjectData);
		designDataMappingName.click();
		designDataMappingName.clear();
		designDataMappingName.sendKeys("Example Design Data Mapping");
		action.moveToElement(designDataSchemaDropdown).build().perform();
		action.click(designDataSchemaDropdown).build().perform();
		js.executeScript("arguments[0].click();", schemaMaster);
		uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		action.moveToElement(submitDesignDataButton).build().perform();
		action.click(submitDesignDataButton).build().perform();
	}
	
	public void selectDesignDataProject() {
		action.moveToElement(designDataProjectDropdown).build().perform();
		action.click(designDataProjectDropdown).build().perform();
		js.executeScript("arguments[0].click();", designDataProjectData);
		/*designDataMappingName.click();
		designDataMappingName.clear();
		designDataMappingName.sendKeys("Example Design Data Mapping");
		action.moveToElement(designDataSchemaDropdown).build().perform();
		action.click(designDataSchemaDropdown).build().perform();
		js.executeScript("arguments[0].click();", schemaMaster);
		uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		action.moveToElement(submitDesignDataButton).build().perform();
		action.click(submitDesignDataButton).build().perform();*/
	}
	public void enterMappingNameSelectSchema() {
		//action.moveToElement(designDataProjectDropdown).build().perform();
		//action.click(designDataProjectDropdown).build().perform();
		//js.executeScript("arguments[0].click();", designDataProjectData);
		designDataMappingName.click();
		designDataMappingName.clear();
		designDataMappingName.sendKeys("Example Design Data Mapping22");
		action.moveToElement(designDataSchemaDropdown).build().perform();
		action.click(designDataSchemaDropdown).build().perform();
		js.executeScript("arguments[0].click();", schemaMaster);
		//uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		//action.moveToElement(submitDesignDataButton).build().perform();
		//action.click(submitDesignDataButton).build().perform();
	}
	
	public void uploadMappingFileAndSubmit() {
	
		uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		
	}
	public void designDataMappingSubmit() {
		
		//uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		action.moveToElement(submitDesignDataButton).build().perform();
		action.click(submitDesignDataButton).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(submitExcelButton));	
	}
	
	
	public void selectTestDataMapping() {
		action.moveToElement(testDataMappingDropdown).build().perform();
		action.click(testDataMappingDropdown).build().perform();
		js.executeScript("arguments[0].click();", exampleTestDataMapping);
	}
	
	public void selectTensileRef() {
		action.click(tensileRefDropdown).build().perform();
		action.click(tensileRef).build().perform();
		//js.executeScript("arguments[0].click();", tensileRef);
	}
	
	public void addTensileUltStrgth() {
		action.moveToElement(designAllowableDropdown).build().perform();
		action.click(designAllowableDropdown).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", tensileUltStrgth);
		js.executeScript("arguments[0].click();", tensileUltStrgth);
		action.moveToElement(addDesignAllowable).build().perform();
		action.click(addDesignAllowable).build().perform();
	}
	
	public void addTensileYieldStrgth() {
		action.click(designAllowableDropdown).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", tensileYieldStrgth);
		js.executeScript("arguments[0].click();", tensileYieldStrgth);
		action.click(addDesignAllowable).build().perform();
	}
	
	public void selectComplianceConnector() {
		action.click(complianceConnector).build().perform();
	}
	
	public void clickOnCreateComplianceConnection() {
		action.click(createComplianceConnection).build().perform();
	}
	
	public void complianceMatDetails() {
		serverUrl.click();
		serverUrl.clear();
		serverUrl.sendKeys("https://msc-dv.ipoint-systems.com/materialcenter-connector-service");
		matUser.click();
		matUser.clear();
		matUser.sendKeys("mcc-backend-demo");
		matPassword.click();
		matPassword.clear();
		matPassword.sendKeys("secret-demo");
	}
	
	public void complianceDetails() {
		complianceUser.click();
		complianceUser.clear();
		complianceUser.sendKeys("ipoint-backend-user");
		compliancePassword.click();
		compliancePassword.clear();
		compliancePassword.sendKeys("secret-pwd");
	}
	
	public void complianceApiDetails() {
		singleMatApi.click();
		singleMatApi.clear();
		singleMatApi.sendKeys("api/model/complianceInfo");
		multiMatApi.click();
		multiMatApi.clear();
		multiMatApi.sendKeys("api/model/complianceInfos");
	}
	
	public void provideComplianceConnection() {
		complianceMatDetails();
		complianceDetails();
		complianceApiDetails();
	}
	
	public void submitComplianceConnection() {
		action.click(complianceConnectionSubmit).build().perform();
		String text = matUserValue.getText();
		System.out.println("Material User used while creating the Compliance connection is : " + text);
		String text1 = complianceUserValue.getText();
		System.out.println("Compliance User used while creating the Compliance connection is : " + text1);
	}
	
	public void uploadAlphaNumericCASExcel() {
		selectDataProject();
		selectAlphaNumericCASExcelToUplaod();
		selectMasterMetalSchema();
	}
	
	public void clickOkInfoDialog() {
		action.click(infoDialogOkButton).build().perform();
	}
}
