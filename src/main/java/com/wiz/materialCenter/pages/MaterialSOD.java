package com.wiz.materialCenter.pages;

import java.util.List;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.wiz.materialCenter.util.TestBase;

public class MaterialSOD extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	MaterialMOD matmod = new MaterialMOD();
	ProcessesPage processPage = new ProcessesPage();

	public MaterialSOD() {
		PageFactory.initElements(driver, this);
	}

	public String tempValueSOD;
	public String modulusValueSOD;
	public String poissonRatioSOD;
	public String tempValueCAEModel;
	public String modulusValueCAEModel;
	public String poissonRatioCAEModel;

	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Actions']")
	WebElement actions;

	@FindBy(xpath = "//td[contains(text(),'Export')]")
	WebElement exportAction;
	@FindBy(xpath = "(//a[text()='To Excel'])[1]")
	WebElement toExcelFromExport;

	@FindBy(xpath = "//span[text()='Compliance']")
	WebElement complianceOptSOD;

	/*
	 * @FindBy(xpath =
	 * "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Create']")
	 * WebElement create;
	 */

	@FindBy(xpath = "//span[text()='Create']")
	WebElement create;

	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Edit']")
	WebElement edit;

	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Export']")
	WebElement export;

	@FindBy(xpath = "//table[contains(@id,'MenuBar')]/tbody/tr/td/div/span[text()='Security']")
	WebElement security;

	@FindBy(xpath = "//span[text()='Tools']")
	WebElement toolstab;

	// @FindBy(xpath = "//a[text()='Export To Excel']")
	@FindBy(xpath = "//img[@title='Export Material to excel based on properties or using mapping template']")
	// @FindBy(xpath = "//a[contains(text(),'Export To Excel')]")

	WebElement exportExcelOption;

	@FindBy(xpath = "(//a[text()='Export To Excel'])[2]")
	WebElement exportTestDataExcel;

	@FindBy(xpath = "//input[contains(@id,'ExportToCustomExcel') and @title='Submit']")
	WebElement exportExcelSubmit;
	@FindBy(xpath = "//input[contains(@id,'ExportToXml') and @title='Submit']")
	WebElement exportXmlSubmit;

	@FindBy(xpath = "//input[contains(@id,'Import') and @title='Submit']")
	WebElement importExcelSubmit;

	@FindBy(xpath = "//a[text()='Edit Material']")
	WebElement editMatOption;
	@FindBy(xpath = "//input[@title='Edit Material']")
	WebElement editMaterial;

	@FindBy(xpath = "//span[text()='Property Set']")
	WebElement propertySetFilter;

	@FindBy(xpath = "//td[contains(@class,'sod-dialog')]/input[@value='Show All']")
	WebElement selectAllCheckbox;

	@FindBy(xpath = "//span[text()='OK']")
	WebElement filterOkButton;

	@FindBy(xpath = "//span[@class='noPropSet']")
	WebElement noPropSet;

	@FindBy(xpath = "//span[text()='Test Data']")
	WebElement testDataTab;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement firstTestData;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='6']")
	WebElement lastTestData;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='49']")
	WebElement fiftyEle;

	@FindBy(xpath = "//span[text()='Mapping']")
	WebElement mappingTab;

	@FindBy(xpath = "//div[contains(@id,'schemaMapping')]/img")
	WebElement schemaMappingDropDown;

	@FindBy(xpath = "//span[text()='FMD Migration Test Data']")
	WebElement fmdschemaMapping;

	@FindBy(xpath = "(//img[@title='Collapse Thumbnail'])[1]")
	WebElement collapseButton;

	@FindBy(xpath = "(//img[@title='Expand Thumbnail'])[1]")
	WebElement expandButton;

	@FindBy(xpath = "(//img[contains(@id,'Mechanical_Curves_Table_value_0')])[1]")
	WebElement verifyCollapseExpand;

	@FindBy(xpath = "//div[@class='CarPlotArea']")
	WebElement curveApplet;

	/*
	 * @FindBy(xpath = "//span[text()='Revisions']") WebElement revisionsTab;
	 */
	@FindBy(xpath = "//td[@data-tabname='revisionTab']")
	WebElement revisionsTab;
	@FindBy(xpath = "//th[text()='Release Level']")
	WebElement textReleaseLevel;

	@FindBy(xpath = "//img[contains(@id,'testTemplate')]")
	WebElement testTemplateDropDown;

	@FindBy(xpath = "(//a[text()='[185000 : 284000]'])[1] | (//a[text()='[185.00 : 284.00]'])[1]")
	WebElement tensileUltStrgValue;

	@FindBy(xpath = "//span[contains(@id,'Mechanical_Table_value_0_8:content')]")
	WebElement mechTooltipContent;

	@FindBy(xpath = "//img[contains(@id,'tensileStrengthUlt')]")
	WebElement magnifyingGlass;

	@FindBy(xpath = "//span[text()='Classification' and @class='MatLabelBold']")
	WebElement popupClassificationTag;

	@FindBy(xpath = "(//span[text()='Tensile Ultimate Strength ( psi ) '])[1] | (//span[text()='Tensile Ultimate Strength ( ksi ) '])[1]")
	WebElement tensileUtlStrgTag1;

	@FindBy(xpath = "(//span[text()='Tensile Ultimate Strength ( psi ) '])[2] | (//span[text()='Tensile Ultimate Strength ( ksi ) '])[2]")
	WebElement tensileUtlStrgTag2;

	@FindBy(xpath = "//input[@value='Close']")
	WebElement popupCloseButton;

	@FindBy(xpath = "//span[text()='284000'] | //span[text()='284.00']")
	WebElement tensileUltStrgValue1;

	@FindBy(xpath = "//span[text()='185000'] | //span[text()='185.00']")
	WebElement tensileUltStrgValue2;

	@FindBy(xpath = "(//img[contains(@id,'Mechanical_Table_Type_Btn')])[1]")
	WebElement expandCollapseTestTemp;

	@FindBy(xpath = "//span[text()='800' and contains(@id,'Mech')]")
	WebElement testTempRangevalue;

	@FindBy(xpath = "//a[text()='2.3700E7']")
	WebElement rangeValueVerify;

	@FindBy(xpath = "//select[contains(@id,'Display_DropDown')]")
	WebElement displayDropdown;

	@FindBy(xpath = "//select[contains(@id,'Display_DropDown')]/option[text()='Expand Parameters']")
	WebElement expandParameters;

	@FindBy(xpath = "//span[text()='Parameters']")
	WebElement parametersButton;

	@FindBy(xpath = "//select[@class='selected']/option[text()='800 °F']")
	WebElement testTemp800;

	@FindBy(xpath = "//select[@class='selected']/option[text()='900 °F']")
	WebElement testTemp900;

	@FindBy(xpath = "(//img[@class='left'])[1]")
	WebElement moveLeft;

	@FindBy(xpath = "//input[@value='Ok']")
	WebElement parameterFilterOkButton;

	@FindBy(xpath = "//span[text()='70' and contains(@id,'Mech')]")
	WebElement filterTestTemp;

	@FindBy(xpath = "//select[contains(@id,'Display_DropDown')]/option[text()='Display Source']")
	WebElement displaySource;

	@FindBy(xpath = "//option[text()='Source Databank']")
	WebElement sourceDatabank;

	@FindBy(xpath = "//option[text()='Source Document Publisher']")
	WebElement sourceDocPublisher;

	@FindBy(xpath = "//img[@class='right']")
	WebElement moveRight;

	@FindBy(xpath = "//span[text()='Materials Selector Q2 2013 1.1']")
	List<WebElement> sourceDatabankValue;

	@FindBy(xpath = "//span[text()='Machine Design/MSC.Software Corporation']")
	List<WebElement> sourceDocPublisherValue;

	@FindBy(xpath = "//option[text()='Clear Source and Parameter Filter']")
	WebElement clearSourceParameter;

	@FindBy(xpath = "(//span[@class='MatLabelItalic'])[4]']")
	WebElement footnoteTooltip;

	@FindBy(xpath = "(//span[contains(@id,'Mechanical_Table_Footnote_0_4_2')])[4]")
	WebElement footnoteTooltipContent;

	@FindBy(xpath = "//img[@class='userMenu']")
	WebElement userMenuButton;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Options']")
	WebElement userMenuOptions;

	@FindBy(xpath = "//input[contains(@onclick,'FootNoteInlineCheckbox')]")
	WebElement footnoteInlineCheckbox;

	@FindBy(xpath = "(//input[@value='Submit' and contains(@id,'Options')])")
	WebElement optionsSubmitButton;

	@FindBy(xpath = "//table[contains(@id,'Fatigue_Table_FootNotePanel')]")
	WebElement footnoteInline;

	@FindBy(xpath = "//th[@title='Created At']")
	WebElement createdAtCol;

	@FindBy(xpath = "//th[@title='Created By']")
	WebElement createdByCol;

	@FindBy(xpath = "//th[@title='Project']")
	WebElement projectCol;

	@FindBy(xpath = "//td[@smcol='2']")
	WebElement createdAtValue;

	@FindBy(xpath = "//td[@smcol='3']")
	WebElement createdByValue;

	@FindBy(xpath = "//td[@smcol='4']")
	WebElement projectValue;

	@FindBy(xpath = "//td[contains(@id,'commentsTab')]/span[text()='Comments']")
	WebElement commentsTab;

	@FindBy(xpath = "//a[text()='Add']")
	WebElement addCommentsButton;

	@FindBy(xpath = "//input[contains(@id,'CreateComment') and contains(@name,'title')]")
	WebElement subjectText;

	@FindBy(xpath = "//textarea[@title='Detailed Comments']")
	WebElement detailedCommentsText;

	@FindBy(xpath = "//input[@value='Submit' and contains(@id,'Comment')]")
	WebElement commentSubmitButton;

	@FindBy(xpath = "//span[text()='Process Viewer']")
	WebElement processViewerTab;

	@FindBy(xpath = "//img[@id='graph']")
	WebElement processViewerImage;

	@FindBy(xpath = "(//img[contains(@id,'PedigreeWorkspace')])[2]")
	WebElement pedigreeWorkspace;

	@FindBy(xpath = "//area[contains(@href,'MatMeasureProperty')]")
	WebElement measureProperty;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr")
	List<WebElement> measurePropertyMod;

	@FindBy(xpath = "(//td[@class='MenuActionCol'])[1]")
	WebElement verifyCheckComplianceOptSOD;

	@FindBy(xpath = "(//td[@class='MenuActionCol'])[2]")
	WebElement verifyCompliaceStatusOptSOD;

	@FindBy(xpath = "(//table[contains(@id,'Composition_Table')])[1]")
	WebElement compositionValues;

	@FindBy(xpath = "//td[text()='Check Compliance']")
	WebElement checkComplianceOpt;

	@FindBy(xpath = "(//span[text()='Compliance'])[2]")
	WebElement complianceTag;

	@FindBy(xpath = "(//a[contains(@id,'Compliance_Table_value')])[1]")
	WebElement overallComplianceStatus;

	@FindBy(xpath = "//span[contains(@id,'CompositionWarningLabel')]")
	WebElement CASWarningMsg;

	@FindBy(xpath = "//span[text()='Material Compliance']")
	WebElement alreadyCompliantPopup;

	@FindBy(xpath = "//span[text()='Material Composition']")
	WebElement compositionWarningPopup;

	@FindBy(xpath = "//input[contains(@id,'confirmDialog') and @value='OK']")
	WebElement popupOkButton;

	@FindBy(xpath = "//input[contains(@id,'confirmDialog') and @value='Cancel']")
	WebElement popupCancelButton;

	@FindBy(xpath = "//span[contains(@id,'confirmDialog-msg')]")
	WebElement popupMsg;

	@FindBy(xpath = "//span[@class='rf-msg-det']")
	WebElement errorMsgPopup;

	@FindBy(xpath = "(//span[contains(text(),'Temperature') and contains(@id,'Mech')]//following::span)[1]")
	WebElement testTempValue;

	@FindBy(xpath = "(//span[contains(text(),'Modulus') and contains(@id,'Mech')]//following::a)[1]")
	WebElement elasticModulusValue;

	@FindBy(xpath = "(//span[contains(text(),'Poisson') and contains(@id,'Mech')]//following::a)[1]")
	WebElement poissonRatioValue;

	@FindBy(xpath = "(//span[contains(text(),'Test Temperature')]//following::span)[1]")
	WebElement caeModelTempValue;

	@FindBy(xpath = "(//span[contains(text(),'Modulus')]//following::a)[1]")
	WebElement caeModelModulusValue;

	@FindBy(xpath = "(//span[contains(text(),'Poisson')]//following::a)[1]")
	WebElement caeModelpoissonRatioValue;

	@FindBy(xpath = "(//span[contains(text(),'File')]//following::a)[1]")
	WebElement solverFile;

	@FindBy(xpath = "//code[@id='file']")
	WebElement textFile;

	@FindBy(xpath = "(//span[text()='Class']//following::span)[1]")
	WebElement classValueSOD;

	@FindBy(xpath = "(//span[text()='Sub Class']//following::span)[1]")
	WebElement subClassValueSOD;

	@FindBy(xpath = "(//span[text()='Material Type']//following::span)[1]")
	WebElement matTypeValueSOD;

	@FindBy(xpath = "(//span[text()='Common Name']//following::span)[1]")
	WebElement commonNameValueSOD;

	@FindBy(xpath = "(//div[contains(@id,'Composition_Table_Type')]/span)[1]")
	WebElement composition1;

	@FindBy(xpath = "(//div[contains(@id,'Composition_Table_Type')]/span)[2]")
	WebElement composition2;

	@FindBy(xpath = "(//div[contains(@id,'Composition_Table_Type')]/span)[3]")
	WebElement composition3;

	@FindBy(xpath = "(//div[contains(@id,'Composition_Table_Type')]/span)[4]")
	WebElement composition4;

	@FindBy(xpath = "(//a[contains(@id,'Composition_Table_value')])[1]")
	WebElement compositionValue1;

	@FindBy(xpath = "(//a[contains(@id,'Composition_Table_value')])[2]")
	WebElement compositionValue2;

	@FindBy(xpath = "(//a[contains(@id,'Composition_Table_value')])[3]")
	WebElement compositionValue3;

	@FindBy(xpath = "(//a[contains(@id,'Composition_Table_value')])[4]")
	WebElement compositionValue4;

	@FindBy(xpath = "(//span[text()='Rupture Strength ( psi )']//following::a)[1]")
	WebElement ruptureStrengthValue;

	@FindBy(xpath = "(//span[text()='Strength ( psi )']//following::a)[1]")
	WebElement strengthValue;

	@FindBy(xpath = "(//span[text()='Tensile Ultimate Elongation ( in/in )']//following::a)[1]")
	WebElement tensileUltimateElongationValue;

	@FindBy(xpath = "(//span[text()='Tensile Ultimate Strength ( psi )']//following::a)[1]")
	WebElement tensileUltimateStrengthValue;

	@FindBy(xpath = "(//span[text()='Tensile Yield Strength ( psi )']//following::a)[1]")
	WebElement tensileYieldStrengthValue;

	@FindBy(xpath = "(//span[text()='Ultimate Strength ( psi )']//following::a)[1]")
	WebElement ultimateStrengthValue;

	@FindBy(xpath = "(//span[text()='Yield Strength ( psi )']//following::a)[1]")
	WebElement yieldStrengthValue;

	@FindBy(xpath = "(//span[text()='Density ( slinches/in³ )']//following::a)[1]")
	WebElement densityValue;

	@FindBy(xpath = "(//span[text()='Coeff of Thermal Conductivity ( Btu/s-in-°F )']//following::a)[1]")
	WebElement coeffThermalConductivityValue;

	@FindBy(xpath = "(//span[text()='Specific Heat at Constant Pressure ( Btu/sl-°F )']//following::a)[1]")
	WebElement specificHeatValue;

	@FindBy(xpath = "(//span[text()='Coeff of Linear Thermal Expansion ( in/in/°F )']//following::a)[1]")
	WebElement coeffLinearThermalExpansionValue;

	/* Actions to be performed under Create section */

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Material']")
	WebElement createMat;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Revise MatData For Testing Scenarios']")
	WebElement reviseMat;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Material (Excel)']")
	WebElement matExcel;

	@FindBy(xpath = "//td[text()='CAE Model (Auto)']")
	WebElement caeAutoModel;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='CAE Model (Manual)']")
	WebElement caeManualModel;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='CAE Models (Bulk)']")
	WebElement caeBulkModel;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Test Data']")
	WebElement testData;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Approval Request']")
	WebElement approvalReq;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Curve from Equations']")
	WebElement curveEqu;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Comment']")
	WebElement comment;

	/* Actions to be performed under Security section */

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Promote']")
	WebElement promoteAction;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Demote']")
	WebElement demoteAction;

	@FindBy(xpath = "//div[@id='maindiv']/table/tbody/tr/td[text()='Assign Security Labels']")
	WebElement assignSecurityLabels;

	/* Actions to be performed under tools section */

	@FindBy(xpath = "//td[text()='Fix Invalid File Based Attributes Properties SimProcess']")
	WebElement fixAttributes;

	@FindBy(xpath = "//td[text()='Import Design Data']")
	WebElement importDesignData;

	@FindBy(xpath = "//td[text()='Import Test Data']")
	WebElement importTestData;

	@FindBy(xpath = "//input[@title='Pedigree Viewer']")
	WebElement pedigreeViewer;

	@FindBy(xpath = "//td[text()='Send Email']")
	WebElement sendEmail;

	@FindBy(xpath = "//a[text()='Find Similar']")
	WebElement findSimilar;

	/* CAE AUTO model result xpaths */

	@FindBy(xpath = "//table[contains(@id,'PropertyDocumentSOD')]/tbody/tr/td/div")
	WebElement caeDocFile;

	@FindBy(xpath = "//span[contains(text(),'To Excel')]")
	WebElement toExcel;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement autoRefreshCheckbox;

	@FindBy(xpath = "//span[contains(text(),'Export To Excel [ Export Process ]')]")
	WebElement exportProcessExcel;

	@FindBy(xpath = "//span[contains(text(),'Export To Xml [ Export Process ]')]")
	WebElement exportProcessXml;

	@FindBy(xpath = "//input[@value='Subscribe']")
	WebElement subscribeButton;

	@FindBy(xpath = "//input[@value='Unsubscribe']")
	WebElement unSubscribeButton;

	@FindBy(xpath = "//td[text()='Subscribe']")
	WebElement subscribeAction;

	@FindBy(xpath = "//td[text()='Add to Compare']")
	WebElement AddToCompareAction;

	@FindBy(xpath = "//td[text()='Unsubscribe']")
	WebElement unSubscribeAction;

	@FindBy(xpath = "//img[@title='Refresh']")
	WebElement refreshImage;

	@FindBy(xpath = "(//td[text()='0-In-Work'])[1]")
	WebElement InWorkRevision1;

	@FindBy(xpath = "(//td[text()='0-In-Work'])[1]")
	WebElement InWorkRevision2;

	@FindBy(xpath = "//span[text()='Details']")
	WebElement textDetailsTab;

	@FindBy(xpath = "//span[text()='Edit']")
	WebElement editMenu;

	@FindBy(xpath = "//td[text()='Delete']")
	WebElement deleteAction;
	
	@FindBy(xpath = "//td[text()='Manage Process']")
	WebElement manageProcessAction;
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement textDeleteWindow;

	@FindBy(xpath = "//span[text()='Classification']")
	WebElement classificationTag;

	@FindBy(xpath = "//span[text()='Assembly']")
	WebElement assemblyTag;

	@FindBy(xpath = "//span[text()='Composition']")
	WebElement compositionTag;

	@FindBy(xpath = "//span[text()='Thermal']")
	WebElement thermalTag;

	@FindBy(xpath = "//span[text()='Mechanical']")
	WebElement mechanicalTag;

	@FindBy(xpath = "(//input[@name='selectCB'])[1]")
	WebElement curvePropertyChkBox1;

	@FindBy(xpath = "(//input[@name='selectCB'])[2]")
	WebElement curvePropertyChkBox2;

	@FindBy(xpath = "//select[contains(@id,'Action_DropDown')]")
	WebElement actionsDropdown;

	@FindBy(xpath = "//option[@value='Add To ClipBoard']")
	WebElement addToClipBoardOption;

	@FindBy(xpath = "//select[@class='DBObjectListManyList']")
	WebElement manyRefObjectsDropdown;
	@FindBy(xpath = "(//select[@class='DBObjectListManyList']//following::option)[2]")
	WebElement opt1manyRefObjectsDropdown;

	@FindBy(xpath = "//span[contains(text(),'[ Curve Property ]')]")
	WebElement txtCurveProperty;
	
	@FindBy(xpath = "//td[text()='Manage Process']")
	WebElement manageProcessFromEditMenu;
	
	public void clickOnAnyMatRefObject() {

		// Select select = new Select(manyRefObjectsDropdown);
		// select.selectByIndex(1);
		// js.executeScript("arguments[0].click();",
		// opt1manyRefObjectsDropdown);
		action.moveToElement(opt1manyRefObjectsDropdown).build().perform();
		action.doubleClick(opt1manyRefObjectsDropdown).build().perform();
	}

	public boolean verifyManyRefObjectsDisplayed() {

		return (manyRefObjectsDropdown.isDisplayed());
	}

	public CompareProcessPage selectCompareOptionFromActionDropdown() {
		Select select = new Select(actionsDropdown);
		select.selectByValue("Compare");
		return new CompareProcessPage();
	}

	public CompareProcessPage selectAddToCompareOptionFromActionDropdown() {
		Select select = new Select(actionsDropdown);
		select.selectByValue("Add To Compare");
		return new CompareProcessPage();
	}

	public void selectAddPropToClipOptionFromActionDropdown() throws InterruptedException {
		Select select = new Select(actionsDropdown);
		select.selectByValue("Add To ClipBoard");
		Thread.sleep(2000);
	}

	public void selectCheckBoxesForProperties() {
		js.executeScript("arguments[0].click();", curvePropertyChkBox1);
		js.executeScript("arguments[0].scrollIntoView(true);", curvePropertyChkBox2);
		js.executeScript("arguments[0].click();", curvePropertyChkBox2);
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// actionsDropdown);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

	public boolean verifyAddPropertiesToClipboardAction() {
		action.moveToElement(actionsDropdown).build().perform();
		action.click(actionsDropdown).build().perform();
		return (addToClipBoardOption.isDisplayed());
	}

	public boolean verifyMatSODPageDisplayed() {

		return (actions.isDisplayed());
	}

	public boolean verifyCurvePropSODPageDisplayed() {

		return (txtCurveProperty.isDisplayed());
	}

	public String getTextClassificationTag() {

		return classificationTag.getText();

	}

	public String getTextAssemblyTag() {

		return assemblyTag.getText();

	}

	public String getTextCompositionTag() {

		return compositionTag.getText();

	}

	public void clickOnActions() {
		js.executeScript("arguments[0].click();", actions);
	}

	public void clickOnCreate() {
		js.executeScript("arguments[0].click();", create);
	}

	public void clickOnEdit() {
		js.executeScript("arguments[0].click();", edit);
	}

	public void clickOnExport() {
		js.executeScript("arguments[0].click();", export);
	}

	public void clickOnSecurity() {
		js.executeScript("arguments[0].click();", security);
	}

	public void clickOnCreateMat() {
		js.executeScript("arguments[0].click();", createMat);
	}

	public void clickOnReviseMat() {
		js.executeScript("arguments[0].click();", reviseMat);
	}

	public void clickOnMatExcel() {
		js.executeScript("arguments[0].click();", matExcel);
	}

	public CAEProcessInput clickOnCAEAuto() {
		js.executeScript("arguments[0].click();", caeAutoModel);
		return new CAEProcessInput();
	}

	public void clickOnCAEManual() {
		js.executeScript("arguments[0].click();", caeManualModel);
	}

	public void clickOnCAEBulk() {
		js.executeScript("arguments[0].click();", caeBulkModel);
	}

	public void clickOnTestData() {
		js.executeScript("arguments[0].click();", testData);
	}

	public void clickOnApprovalReq() {
		js.executeScript("arguments[0].click();", approvalReq);
	}

	public void clickOnCurveEqu() {
		js.executeScript("arguments[0].click();", curveEqu);
	}

	public void clickOnComment() {
		js.executeScript("arguments[0].click();", comment);
	}

	public void clickOnPromoteAction() {
		js.executeScript("arguments[0].click();", promoteAction);
	}

	public void clickOnDemoteAction() {
		js.executeScript("arguments[0].click();", demoteAction);
	}

	public EditMatProcess clickOnEditMat() {
		js.executeScript("arguments[0].click();", editMaterial);
		// action.moveToElement(editMatOption).build().perform();
		// action.click(editMatOption).build().perform();
		return new EditMatProcess();
	}

	public void clickOnMappingTab() {
		action.click(mappingTab).build().perform();
	}

	public void clickOnExportExcel() {
		// js.executeScript("arguments[0].click();", exportExcelOption);
		action.moveToElement(exportExcelOption).build().perform();
		action.click(exportExcelOption).build().perform();
		wait.until(ExpectedConditions.visibilityOf(toExcel));

	}

	public void performExportExcel() {
		action.moveToElement(exportAction).build().perform();
		action.click(exportAction).build().perform();
		// js.executeScript("arguments[0].click();", compare);
		action.moveToElement(toExcelFromExport).build().perform();
		action.click(toExcelFromExport).build().perform();
	}

	public void exportExcelSubmit() {
		// js.executeScript("arguments[0].click();", exportExcelSubmit);
		action.moveToElement(exportExcelSubmit).build().perform();
		action.click(exportExcelSubmit).build().perform();
		wait.until(ExpectedConditions.visibilityOf(exportProcessExcel));
	}

	public void exportXmlSubmit() {
		// js.executeScript("arguments[0].click();", exportExcelSubmit);
		action.moveToElement(exportXmlSubmit).build().perform();
		action.click(exportXmlSubmit).build().perform();
		wait.until(ExpectedConditions.visibilityOf(exportProcessXml));
	}

	public void importTestDataSubmit() {
		action.click(importExcelSubmit).build().perform();
	}

	public void clickOnRevisionsTab() {
		// action.moveToElement(revisionsTab).build().perform();
		// action.click(revisionsTab).build().perform();
		js.executeScript("arguments[0].click();", revisionsTab);
		wait.until(ExpectedConditions.visibilityOf(textReleaseLevel));
	}

	public void selectImportTestData() {
		action.click(toolstab).build().perform();
		action.click(importTestData).build().perform();
	}

	public void propSetSelect() {
		js.executeScript("arguments[0].click();", propertySetFilter);
		action.click(selectAllCheckbox).build().perform();
		action.click(filterOkButton).build().perform();
	}
	
	public void clickOnPropertySet() {
		js.executeScript("arguments[0].click();", propertySetFilter);
			}

	public void selectTestData() {
		action.click(testDataTab).build().perform();
		action.keyDown(Keys.SHIFT).click(firstTestData).click(lastTestData).keyUp(Keys.SHIFT).build().perform();
	}

	public void selectMatRevisions() {
		action.keyDown(Keys.SHIFT).click(firstTestData).click(fiftyEle).keyUp(Keys.SHIFT).build().perform();
	}

	public void performComapreAction() {
		matmod.rightClickOnMats();
		matmod.clickOnCompare();
	}

	public void selectExportTestDataExcel() {
		action.click(exportTestDataExcel).build().perform();
	}

	public void selectSchemaMapping() {
		action.click(schemaMappingDropDown).build().perform();
		action.click(fmdschemaMapping).build().perform();
	}

	public void selectTestTemplate() {
		action.click(testTemplateDropDown).build().perform();
		action.click(fmdschemaMapping).build().perform();
	}

	public void verifyNoPropMsg() {
		if (noPropSet.isDisplayed()) {
			System.out.println("No property set selected msg displayed");
		} else {
			System.out.println("Msg doesn't display");
		}
	}

	public void verifyPropSetDisplay() {
		if (classificationTag.isDisplayed()) {
			System.out.println("Property set filter applied successfully");
		} else {
			System.out.println("Property set filter not applied successfully");
		}
	}

	public void selectCollapseCurve() {
		js.executeScript("arguments[0].scrollIntoView(true);", collapseButton);
		action.click(collapseButton).build().perform();
		if (verifyCollapseExpand.isDisplayed()) {
			System.out.println("Curve has been collapsed successfully");
		} else {
			System.out.println("Curve didn't collapse");
		}
	}

	public void selectExpandCurve() {
		action.click(expandButton).build().perform();
		if (verifyCollapseExpand.isDisplayed()) {
			System.out.println("Curve has been expanded successfully");
		} else {
			System.out.println("Curve didn't expand");
		}
	}

	public void openCurveApplet() {
		action.click(verifyCollapseExpand).build().perform();
		if (curveApplet.isDisplayed()) {
			System.out.println("Curve applet is opened successfully");
		} else {
			System.out.println("Curve applet didn't open");
		}
	}

	public void verifyPropSets() {
		if (classificationTag.isDisplayed() | assemblyTag.isDisplayed() | compositionTag.isDisplayed()
				| mechanicalTag.isDisplayed() | thermalTag.isDisplayed()) {
			System.out.println("All required properties set are displayed");
		} else {
			System.out.println("Few property sets are missing on SOD");
		}
	}

	public void verifytooltipContent() {
		js.executeScript("arguments[0].scrollIntoView(true);", mechanicalTag);
		action.moveToElement(tensileUltStrgValue).build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(mechTooltipContent));
		wait.until(ExpectedConditions.visibilityOf(mechTooltipContent));
		if (mechTooltipContent.isDisplayed()) {
			System.out.println("Tool tip content is displayed");
		} else {
			System.out.println("Tool tip content didn't display");
		}
	}

	public void clickOnMagnifyingGlass() {
		action.click(magnifyingGlass).build().perform();
	}

	public void verifyPopupContent() {
		wait.until(ExpectedConditions.elementToBeClickable(popupClassificationTag));
		if (popupClassificationTag.isDisplayed() | tensileUtlStrgTag1.isDisplayed()
				| tensileUtlStrgTag2.isDisplayed()) {
			System.out.println("All tags are present on Popup window");
		} else {
			System.out.println("Tags are missing on Popup window");
		}
		String value1 = tensileUltStrgValue1.getText();
		System.out.println("Tensile ultimate strength (psi) value at test temp. 70F : " + value1);
		String value2 = tensileUltStrgValue2.getText();
		System.out.println("Tensile ultimate strength (psi) value at test temp. 800F : " + value2);
		action.click(popupCloseButton).build().perform();
	}

	public void verifyRangeValues() {
		js.executeScript("arguments[0].scrollIntoView(true);", mechanicalTag);
		js.executeScript("arguments[0].click();", expandCollapseTestTemp);
		// action.moveToElement(expandCollapseTestTemp).build().perform();
		// action.click(expandCollapseTestTemp).build().perform();
		wait.until(ExpectedConditions.visibilityOf(testTempRangevalue));
		// if(testTempRangevalue.isDisplayed() | rangeValueVerify.isDisplayed())
		// {
		if (testTempRangevalue.isDisplayed()) {
			System.out.println("The parameter ranges and corresponding values are displayed sucessfully");
		} else {
			System.out.println("Expand parameter didn't work properly");
		}
		// action.click(expandCollapseTestTemp).build().perform();
		js.executeScript("arguments[0].click();", expandCollapseTestTemp);
	}

	public void displayDropdownParameters() {
		js.executeScript("arguments[0].scrollIntoView(true);", displayDropdown);
		// action.moveToElement(displayDropdown).build().perform();
		/*
		 * displayDropdown.sendKeys("e"); displayDropdown.click();
		 */
		Select select = new Select(displayDropdown);

		select.selectByValue("Display_Expand_Parameter");
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// expandParameters);
		// action.click(expandParameters).build().perform();
		// js.executeScript("arguments[0].click();", expandParameters);
		js.executeScript("arguments[0].scrollIntoView(true);", mechanicalTag);
		wait.until(ExpectedConditions.visibilityOf(testTempRangevalue));
		// if(testTempRangevalue.isDisplayed() | rangeValueVerify.isDisplayed())
		// {
		if (testTempRangevalue.isDisplayed()) {
			System.out.println("The parameter ranges and corresponding values are displayed sucessfully");
		} else {
			System.out.println("Expand parameter didn't work properly");
		}
	}

	public void filterTestTempParameter() {
		action.click(parametersButton).build().perform();
		action.keyDown(Keys.CONTROL).click(testTemp800).click(testTemp900).keyUp(Keys.CONTROL).build().perform();
		js.executeScript("arguments[0].click();", moveLeft);
		js.executeScript("arguments[0].click();", parameterFilterOkButton);
	}

	public void verifySingleTestTemp() {
		wait.until(ExpectedConditions.visibilityOf(filterTestTemp));
		String testTempValue = filterTestTemp.getText();
		System.out.println("Test temp under mechanical tab after filter parameter is : " + testTempValue);
		if (testTempValue.contains("70")) {
			System.out.println("Test temp filter parameter is applied successfully");
		} else {
			System.out.println("Test temp filter parameter is not applied successfully");
		}
	}

	public void displayDropdownSources() {
		// action.moveToElement(displayDropdown).build().perform();
		/*
		 * displayDropdown.sendKeys("d"); displayDropdown.click();
		 */
		Select select = new Select(displayDropdown);
		select.selectByValue("Display_Source");
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// displaySource);
		// action.click(displaySource).build().perform();
	}

	public void addDisplaySource() {
		action.keyDown(Keys.CONTROL).click(sourceDatabank).click(sourceDocPublisher).keyUp(Keys.CONTROL).build()
				.perform();
		action.click(moveRight).build().perform();
		action.click(parameterFilterOkButton).build().perform();
	}

	public void verifyDatabankValues() {
		wait.until(ExpectedConditions.visibilityOfAllElements(sourceDatabankValue));
		int count1 = sourceDatabankValue.size();
		System.out.println(
				"Source Databank value as 'Materials Selector Q2 2013 1.1' is displayed " + count1 + " times ");
		int count2 = sourceDocPublisherValue.size();
		System.out.println("Source document publisher value as 'Machine Design/MSC.Software Corporation' is displayed "
				+ count2 + " times ");
	}

	public void clearSourceParameters() {
		js.executeScript("arguments[0].scrollIntoView(true);", displayDropdown);
		// action.moveToElement(displayDropdown).build().perform();
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// clearSourceParameter);
		// action.click(clearSourceParameter).build().perform();
		Select select = new Select(displayDropdown);
		select.selectByValue("Display_Clear_Filter");
	}

	public void mouseOverFootnote() {
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// mechanicalTag);
		// wait.until(ExpectedConditions.visibilityOf(mechanicalTag));
		action.moveToElement(footnoteTooltip).build().perform();
		wait.until(ExpectedConditions.visibilityOf(footnoteTooltipContent));
		String text = footnoteTooltipContent.getText();
		System.out.println("Footnote tooltip content is : " + text);
	}

	public void scrollToMechanicalTag() {
		js.executeScript("arguments[0].scrollIntoView(true);", mechanicalTag);
		wait.until(ExpectedConditions.visibilityOf(mechanicalTag));
		/*
		 * action.moveToElement(footnoteTooltip).build().perform();
		 * wait.until(ExpectedConditions.visibilityOf(footnoteTooltipContent));
		 * String text = footnoteTooltipContent.getText();
		 * System.out.println("Footnote tooltip content is : " + text);
		 */
	}

	public void footnoteInlineOptions() {
		js.executeScript("arguments[0].scrollIntoView(true);", userMenuButton);
		// wait.until(ExpectedConditions.elementToBeClickable(userMenuButton));
		js.executeScript("arguments[0].click();", userMenuButton);
		// action.click(userMenuButton).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", userMenuOptions);
		action.click(userMenuOptions).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", footnoteInlineCheckbox);
		action.moveToElement(footnoteInlineCheckbox).build().perform();
		action.click(footnoteInlineCheckbox).build().perform();
		// js.executeScript("arguments[0].click();", optionsSubmitButton);
		action.moveToElement(optionsSubmitButton).build().perform();
		action.click(optionsSubmitButton).build().perform();
		// driver.switchTo().alert().accept();
	}

	public void verifyFootnoteInline() {
		String text = footnoteInline.getText();
		System.out.println("Footnote inline value is displayed as : " + text);
	}

	public void verifyRevisionsTab() {
		action.moveToElement(revisionsTab).build().perform();
		action.click(revisionsTab).build().perform();
		wait.until(ExpectedConditions.visibilityOf(createdAtCol));
		if (createdAtCol.isDisplayed() | createdByCol.isDisplayed() | projectCol.isDisplayed()) {
			System.out.println("All columns are present under revisions tab");
		} else {
			System.out.println("Few columns are missing under revisions tab");
		}
		String text1 = createdAtValue.getText();
		System.out.println("Material created at : " + text1);
		String text2 = createdByValue.getText();
		System.out.println("Material created by : " + text2);
		String text3 = projectValue.getText();
		System.out.println("Project : " + text3);
	}

	public void addNewComment() {
		action.moveToElement(commentsTab).build().perform();
		action.click(commentsTab).build().perform();
		action.click(addCommentsButton).build().perform();
		subjectText.click();
		subjectText.clear();
		subjectText.sendKeys("My comment");
		subjectText.sendKeys(RandomStringUtils.randomNumeric(2));
		detailedCommentsText.click();
		detailedCommentsText.clear();
		detailedCommentsText.sendKeys("Here is my comment");
		detailedCommentsText.sendKeys(RandomStringUtils.randomNumeric(2));
		action.click(commentSubmitButton).build().perform();
	}

	public void verifyProcessViewerTab() {
		action.moveToElement(processViewerTab).build().perform();
		action.click(processViewerTab).build().perform();
		wait.until(ExpectedConditions.visibilityOf(processViewerImage));
		if (processViewerImage.isDisplayed()) {
			System.out.println("Process viewer is displayed successfully");
		} else {
			System.out.println("Process viewer didn't open successfully");
		}
	}

	public void verifyPedigreeWorkspace() {
		action.moveToElement(pedigreeViewer).build().perform();
		action.click(pedigreeViewer).build().perform();
		/*
		 * if(pedigreeWorkspace.isDisplayed()) {
		 * System.out.println("Pedigree workspace is displayed successfully"); }
		 * else {
		 * System.out.println("Pedigree workspace is not displayed successfully"
		 * ); }
		 */
		/*
		 * if(processViewerImage.isDisplayed()) {
		 * System.out.println("Pedigree viewer is displayed successfully"); }
		 * else {
		 * System.out.println("Pedigree viewer didn't open successfully"); }
		 */
		/*
		 * action.moveToElement(measureProperty).build().perform();
		 * js.executeScript("arguments[0].click();", measureProperty); int count
		 * = measurePropertyMod.size(); System.out.
		 * println("Measure property displayed on MOD on first page are : " +
		 * count);
		 */
	}

	public void clickOnFindSimilar() {
		action.moveToElement(findSimilar).build().perform();
		action.click(findSimilar).build().perform();
	}

	public void clickOnComplianceOpt() {
		action.click(complianceOptSOD).build().perform();
	}

	public void verifyComplianceOptSOD() {
		String text = verifyCheckComplianceOptSOD.getText();
		System.out.println("SA under Complaince option " + text + " is displayed");
		if (text.contains("Check Compliance")) {
			System.out.println("Check Compliance SA is correctly displayed under compliance option of SOD");
		} else {
			System.out.println("Check Compliance SA is not displayed correctly under compliance option of SOD");
		}
		String text1 = verifyCompliaceStatusOptSOD.getText();
		System.out.println("SA under Compliance option " + text1 + " is displayed");
		if (text1.contains("Compliance Status")) {
			System.out.println("Compliance Status SA is correctly displayed under compliance option of SOD");
		} else {
			System.out.println("Compliance Status SA is not displayed correctly under compliance option of SOD");
		}
	}

	public void verifyComplianceSAOnSOD() {
		clickOnComplianceOpt();
		verifyComplianceOptSOD();
	}

	public void verifyCompositionTagAndValues() {
		if (compositionTag.isDisplayed()) {
			System.out.println("Composition section is present on material SOD");
		} else {
			System.out.println("Composition section is missing on material SOD");
		}
		String text = compositionValues.getText();
		System.out.println("Composition values are : " + text);
	}

	public void performCheckCompliance() {
		action.click(checkComplianceOpt).build().perform();
	}

	public void verifyCompositionDataAndPerformCheckCompliance() {
		verifyCompositionTagAndValues();
		clickOnComplianceOpt();
		performCheckCompliance();
		try {
			okOnPopup();
		} catch (Exception e) {
			System.out.println("Already compliance status dialog didn't come.");
		}
		processPage.verifyProcessStatus();
	}

	public void verifyComplianceTag() {
		if (complianceTag.isDisplayed()) {
			System.out.println("Compliance section is displayed on material SOD");
		} else {
			System.out.println("Compliance section is missing on material SOD");
		}
	}

	public void overallComplianceStatusValue() {
		String text = overallComplianceStatus.getText();
		System.out.println("Overall Compliance status value of material is : " + text);
	}

	public void verifyOverallComplianceStatus() {
		verifyComplianceTag();
		overallComplianceStatusValue();
	}

	public void verifyCASWarningMsg() {
		String text = CASWarningMsg.getText();
		Assert.assertEquals(text, "Warning! CAS numbers are missing for composition properties. "
				+ "Hence, compliance could not be checked for this material");
		System.out.println("Warning msg displayed as : " + text);
	}

	public void verifyOverallComplianceAndPerformCheckCompliance() {
		verifyOverallComplianceStatus();
		clickOnComplianceOpt();
		performCheckCompliance();
	}

	public void verifyAlreadyCompliantWarningMsgSOD() {
		if (alreadyCompliantPopup.isDisplayed()) {
			System.out.println("Material Compliance popup heading displayed correctly");
		} else {
			System.out.println("Material Compliance popup heading is missing");
		}
		String text = popupMsg.getText();
		Assert.assertEquals(text, "Compliance information is already available for this material. Click Ok to" + "\n"
				+ "continue, or Cancel to abort");
		System.out.println("Warning msg displayed as : " + text);
	}

	public void verifyAlreadyPendingWarningMsgSOD() {
		if (alreadyCompliantPopup.isDisplayed()) {
			System.out.println("Material Compliance popup heading displayed correctly");
		} else {
			System.out.println("Material Compliance popup heading is missing");
		}
		String text = popupMsg.getText();
		Assert.assertEquals(text, "Compliance information is already due for this material. Click Ok to" + "\n"
				+ "continue, or Cancel to abort");
		System.out.println("Warning msg displayed as : " + text);
	}

	public void cancelOnPopup() {
		action.click(popupCancelButton).build().perform();
		System.out.println("Cancel button clicked on Popupdialog");
	}

	public void clickCancelOnPopupDialog() {
		cancelOnPopup();
		verifyOverallComplianceStatus();
	}

	public void okOnPopup() {
		action.click(popupOkButton).build().perform();
	}

	public void clickComplianceOnSOD() {
		clickOnComplianceOpt();
		performCheckCompliance();
	}

	public void verifyCompliantMatCompliancePopupDialogSOD() {
		verifyAlreadyCompliantWarningMsgSOD();
		clickCancelOnPopupDialog();
		clickComplianceOnSOD();
		okOnPopup();
		processPage.verifyProcessStatus();
	}

	public void verifyPendingMatCompliancePopupDialogSOD() {
		verifyAlreadyPendingWarningMsgSOD();
		clickCancelOnPopupDialog();
		clickComplianceOnSOD();
		okOnPopup();
		processPage.verifyProcessStatus();
	}

	public void compositionChangeWarningMsg() {
		String text = CASWarningMsg.getText();
		Assert.assertEquals(text,
				"Warning! Composition data has been changed for this material, compliance data is now out of date."
						+ " You need to check compliance again for this material");
		System.out.println("Warning msg displayed on SOD is : " + text);
	}

	public void verifyWarningCompositionDataChanged() {
		compositionChangeWarningMsg();
	}

	public void verifyCompositionTagNotDisplayed() {
		try {
			compositionTag.isDisplayed();
			System.out.println("Composition section is displayed on material SOD");
		} catch (Exception e) {
			System.out.println("Composition section is not present on material SOD");
		}
	}

	public boolean verifySubscribeButton() {
		return ((subscribeButton).isDisplayed());
	}

	public void verifyNoCompositionWarningMsgSOD() {
		if (compositionWarningPopup.isDisplayed()) {
			System.out.println("Material Composition popup heading displayed correctly");
		} else {
			System.out.println("Material Composition popup heading is missing");
		}
		String text = errorMsgPopup.getText();
		Assert.assertEquals(text,
				"Compliance could not be checked as material does not have composition data available");
		System.out.println("Warning msg displayed as : " + text);
	}

	public void storeMechPropSOD() {
		tempValueSOD = testTempValue.getText();
		System.out.println("Test Temperature value on SOD is :" + tempValueSOD);
		modulusValueSOD = elasticModulusValue.getText();
		System.out.println("Tensile Elastic Modulus value on SOD is :" + modulusValueSOD);
		poissonRatioSOD = poissonRatioValue.getText();
		System.out.println("Poisson's Ratio value on SOD is :" + poissonRatioSOD);
	}

	public void storeMechPropCAEModel() {
		tempValueCAEModel = caeModelTempValue.getText();
		System.out.println("Test Temperature value on CAE model is :" + tempValueCAEModel);
		modulusValueCAEModel = caeModelModulusValue.getText();
		System.out.println("Tensile Elastic Modulus value on CAE model is :" + modulusValueCAEModel);
		/*
		 * poissonRatioCAEModel = caeModelpoissonRatioValue.getText();
		 * System.out.println("Poisson's Ratio value on CAE model is :" +
		 * poissonRatioCAEModel);
		 */
		wait.until(ExpectedConditions.visibilityOf(solverFile));
		if (solverFile.isDisplayed()) {
			System.out.println("Solver file is created successfully");
		} else {
			System.out.println("Solver file is missing on CAE model");
		}
		String file = textFile.getText();
		System.out.println("CAE model is : " + file);
	}

	public void comparePropValuesCAEModel() {
		if (tempValueSOD.equals(tempValueCAEModel) && modulusValueSOD.equals(modulusValueCAEModel)) {
			System.out.println("CAE model is successfully created with valid values");
		} else {
			System.out.println("CAE model property values are not same as present on SOD");
		}
	}

	public void storeClassificationValuesBeforeEdit() {
		String beforeEditS1 = matTypeValueSOD.getText();
		System.out.println("Material Type value before editing the material is : " + beforeEditS1);
		String beforeEditS2 = classValueSOD.getText();
		System.out.println("Class value before editing the material is : " + beforeEditS2);
		String beforeEditS3 = subClassValueSOD.getText();
		System.out.println("Sub Class value before editing the material is : " + beforeEditS3);
	}

	public void verifyEditValuesOnSOD() {
		String afterEditS1 = matTypeValueSOD.getText();
		System.out.println("Material Type value after editing the material is : " + afterEditS1);
		String afterEditS2 = classValueSOD.getText();
		System.out.println("Class value after editing the material is : " + afterEditS2);
		String afterEditS3 = subClassValueSOD.getText();
		System.out.println("Sub Class value after editing the material is : " + afterEditS3);
	}

	public void compareClassificationDetailsFixed() {
		Assert.assertEquals(matTypeValueSOD.getText(), "Metals444");
		System.out.println("Material type value is correct uploaded : " + matTypeValueSOD.getText());
		Assert.assertEquals(classValueSOD.getText(), "Class1");
		System.out.println("Class value is correct uploaded : " + classValueSOD.getText());
		Assert.assertEquals(subClassValueSOD.getText(), "SubClass1");
		System.out.println("Sub Class value is correct uploaded : " + subClassValueSOD.getText());
		// Assert.assertEquals(commonNameValueSOD.getText(), "Common201");
		// System.out.println("Common name value is correct uploaded : " +
		// commonNameValueSOD.getText());
		/*
		 * if(beforeEditS1.contains("Metals444") &&
		 * beforeEditS2.contains("Class201") &&
		 * beforeEditS3.contains("Subclass201")) {
		 * System.out.println("All classification details are correct"); }
		 */
	}

	public void compareCompositionDetailsFixed() {
		Assert.assertEquals(composition1.getText(), "Aluminum Composition ( % )");
		System.out.println("Composition 1 is correct uploaded : " + composition1.getText());
		Assert.assertEquals(composition2.getText(), "1,3-ISOBENZOFURANDIONE, 3A,4,7,7A-TETRAHYDRO-DIANHYDRIDE ( % )");
		System.out.println("Composition 2 is correct uploaded : " + composition2.getText());
		Assert.assertEquals(composition3.getText(), "Antimony Composition ( % )");
		System.out.println("Composition 3 is correct uploaded : " + composition3.getText());
		Assert.assertEquals(composition4.getText(), "Boron Composition ( % )");
		System.out.println("Composition 4 is correct uploaded : " + composition4.getText());
	}

	public void compareCompositionValuesFixed() {
		Assert.assertEquals(compositionValue1.getText(), "38.0 [0 : 40.0]");
		System.out.println("Composition value 1 is correct uploaded : " + compositionValue1.getText());
		Assert.assertEquals(compositionValue2.getText(), "27.0 [25.0 : 30.0]");
		System.out.println("Composition value 2 is correct uploaded : " + compositionValue2.getText());
		Assert.assertEquals(compositionValue3.getText(), "15.0 [10.0 : 20.0]");
		System.out.println("Composition value 3 is correct uploaded : " + compositionValue3.getText());
		Assert.assertEquals(compositionValue4.getText(), "20.0 [0 : 30.0]");
		System.out.println("Composition value 4 is correct uploaded : " + compositionValue4.getText());
	}

	public void compareMechanicalValuesMapped() {
		Assert.assertEquals(elasticModulusValue.getText(), "[2.1900E7 : 3.00000E7]");
		System.out.println("Tensile Elastic Modulus value is correct uploaded : " + elasticModulusValue.getText());
		Assert.assertEquals(poissonRatioValue.getText(), "0.270");
		System.out.println("Poisson's Ratio value is correct uploaded : " + poissonRatioValue.getText());
		Assert.assertEquals(ruptureStrengthValue.getText(), "[145000 : 211000]");
		System.out.println("Rupture Strength value is correct uploaded : " + ruptureStrengthValue.getText());
		Assert.assertEquals(strengthValue.getText(), "[199000 : 241000]");
		System.out.println("Strength value is correct uploaded : " + strengthValue.getText());
		Assert.assertEquals(tensileUltimateElongationValue.getText(), "[6.600E-6 : 1.200E-5]");
		System.out.println(
				"Tensile Ultimate Elongation value is correct uploaded : " + tensileUltimateElongationValue.getText());
		Assert.assertEquals(tensileUltimateStrengthValue.getText(), "[252000 : 311000]");
		System.out.println(
				"Tensile Ultimate Strength value is correct uploaded : " + tensileUltimateStrengthValue.getText());
		Assert.assertEquals(tensileYieldStrengthValue.getText(), "[199000 : 247000]");
		System.out.println("Tensile Yield Strength value is correct uploaded : " + tensileYieldStrengthValue.getText());
		Assert.assertEquals(ultimateStrengthValue.getText(), "[252000 : 295000]");
		System.out.println("Ultimate Strength value is correct uploaded : " + ultimateStrengthValue.getText());
		Assert.assertEquals(yieldStrengthValue.getText(), "[199000 : 241000]");
		System.out.println("Yield Strength value is correct uploaded : " + yieldStrengthValue.getText());
	}

	public void comparePhysicalValuesMapped() {
		Assert.assertEquals(densityValue.getText(), "[7.2781E-4 : 0.25300]");
		System.out.println("Density value is correct uploaded : " + densityValue.getText());
	}

	public void compareThermalValuesMapped() {
		Assert.assertEquals(coeffThermalConductivityValue.getText(), "[3.9351E-4 : 3.93511E-4]");
		System.out.println(
				"Coeff of Thermal Conductivity value is correct uploaded : " + coeffThermalConductivityValue.getText());
		Assert.assertEquals(specificHeatValue.getText(), "42.5");
		System.out.println("Specific Heat value is correct uploaded : " + specificHeatValue.getText());
		Assert.assertEquals(coeffLinearThermalExpansionValue.getText(), "7.40E-6");
		System.out.println("Coeff of Linear Thermal Expansion value is correct uploaded : "
				+ coeffLinearThermalExpansionValue.getText());
	}

	public void verifyFixedImportMatValuesOnSOD() {
		compareClassificationDetailsFixed();
		compareCompositionDetailsFixed();
		compareCompositionValuesFixed();
	}

	public void verifyMappedImportMatValuesOnSOD() {
		compareMechanicalValuesMapped();
		comparePhysicalValuesMapped();
		compareThermalValuesMapped();
	}

	public void verifyBarChartPlottingValues() {
		Assert.assertEquals(compositionValue1.getText(), "0.460");
		System.out.println("Bar chart plotted value of carbon composition is : " + compositionValue1.getText());
		Assert.assertEquals(coeffLinearThermalExpansionValue.getText(), "7.30E-6");
		System.out.println("Bar chart plotted value of coeff of linear thermal expansion is : "
				+ coeffLinearThermalExpansionValue.getText());
	}

	public void verifyScatterPlottingValues() {
		Assert.assertEquals(densityValue.getText(), "7.2781E-4");
		System.out.println("Scatter plotted value of density is : " + densityValue.getText());
		Assert.assertEquals(ultimateStrengthValue.getText(), "[252000 : 295000]");
		System.out.println("Scatter plotted value of ultimate strength is : " + ultimateStrengthValue.getText());
	}

	public void verifyScatterPlottingValuesUI() {
		Assert.assertEquals(densityValue.getText(), "7.3299E-4");
		System.out.println("Scatter plotted value of density is : " + densityValue.getText());
		Assert.assertEquals(ultimateStrengthValue.getText(), "[185000 : 284000]");
		System.out.println("Scatter plotted value of ultimate strength is : " + ultimateStrengthValue.getText());
	}

	public void verifyPieChartPlottingValues() {
		Assert.assertEquals(densityValue.getText(), "7.3299E-4");
		System.out.println("Scatter plotted value of density is : " + densityValue.getText());
	}

	public void clickOnSubscribeButton() throws InterruptedException {
		action.moveToElement(subscribeButton).build().perform();
		action.click(subscribeButton).build().perform();
		Thread.sleep(3000);
	}

	public void clickOnUnsubscribeButton() {
		action.moveToElement(unSubscribeButton).build().perform();
		action.click(unSubscribeButton).build().perform();
	}

	public boolean verifyLableUnSubscribe() {
		return ((unSubscribeButton).isDisplayed());
	}

	public boolean verifyRevisionsCreated() {
		return ((InWorkRevision1).isDisplayed());
	}

	public void clickFirstRevision() {
		action.moveToElement(InWorkRevision1).build().perform();
		action.doubleClick(InWorkRevision1).build().perform();
		wait.until(ExpectedConditions.visibilityOf(textDetailsTab));

	}

	public void clickSecondRevision() {
		action.moveToElement(InWorkRevision2).build().perform();
		action.doubleClick(InWorkRevision2).build().perform();
		wait.until(ExpectedConditions.visibilityOf(textDetailsTab));
	}

	public boolean verifyLableSubscribe() {
		return ((subscribeButton).isDisplayed());
	}

	public void selectSubscribeAction() {
		action.moveToElement(subscribeAction).build().perform();
		action.click(subscribeAction).build().perform();
	}

	public CompareProcessPage selectAddToCompareAction() {
		action.moveToElement(AddToCompareAction).build().perform();
		action.click(AddToCompareAction).build().perform();
		return new CompareProcessPage();
	}

	public void selectUnSubscribeAction() {
		action.moveToElement(unSubscribeAction).build().perform();
		action.click(unSubscribeAction).build().perform();
	}

	public void clickRefreshButton() {
		js.executeScript("arguments[0].click();", refreshImage);
	}

	public void clickEditMenu() {
		js.executeScript("arguments[0].click();", editMenu);

	}

	public void selectDeleteAction() {
		action.moveToElement(deleteAction).build().perform();
		action.click(deleteAction).build().perform();
		wait.until(ExpectedConditions.visibilityOf(textDeleteWindow));

	}
	
	public boolean verifyManageProcessOptionFromSODDisplayed(){
		return manageProcessAction.isDisplayed();
	}
	
	public ManageProcessPage clickOnManageProcessFromSOD(){
		
		action.moveToElement(manageProcessFromEditMenu).build().perform();
		action.click(manageProcessFromEditMenu).build().perform();
		return new ManageProcessPage();
		
	}
	
}
