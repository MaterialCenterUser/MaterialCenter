package com.wiz.materialCenter.pages;

import java.time.Duration;
import java.util.List;
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

public class MaterialMOD extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	HomePage homePage = new HomePage();
	ProcessesPage process = new ProcessesPage();
	WebDriverWait wait = new WebDriverWait(driver,(30));

	public MaterialMOD() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@class='ModButton']")
	WebElement arrowButton;
	@FindBy(xpath = "//a[text()='Assign Security Labels']")
	WebElement assignSecLabelsLink;
	
	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/a[text()='Select Page']")
	WebElement selectPage;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/a[text()='Configure Columns']")
	WebElement configureColumn;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/a[text()='Select All']")
	WebElement selectAll;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Configure Columns']")
	WebElement configCol;

	@FindBy(xpath = "//span[text()='More']")
	WebElement moreButton;

	@FindBy(xpath = "//td[text()='Density']//parent::tr//td[@class='SwsShrink']/input")
	WebElement densityCheckbox;

	@FindBy(xpath = "//td[text()='Created At']//parent::tr//td[@class='SwsShrink']/input")
	WebElement createdAtCheckbox;

	@FindBy(xpath = "//td[text()='Overall Compliance Status']//parent::tr//td[@class='SwsShrink']/input")
	WebElement overallComplianceStatusCheckbox;

	@FindBy(xpath = "//td[text()='Density']")
	WebElement densityCol;

	@FindBy(xpath = "//td[text()='Overall Compliance Status']")
	WebElement overallComplianceStatusCol;

	@FindBy(xpath = "//span[text()='Ok']")
	WebElement okButton1;

	@FindBy(xpath = "//span[text()='OK']")
	WebElement okButton2;

	@FindBy(xpath = "//th[@title='Density']")
	WebElement densityColAdded;

	@FindBy(xpath = "//th[@title='RL']")
	WebElement releaseLevelCol;

	@FindBy(xpath = "//th[text()='User Name']")
	WebElement userNameCol;

	@FindBy(xpath = "//input[@id='1-In-Review']")
	WebElement inReviewCheckbox;

	@FindBy(xpath = "//input[@id='0-In-Work']")
	WebElement inWorkCheckbox;

	@FindBy(xpath = "//input[@id='2-Production']")
	WebElement prodCheckbox;

	@FindBy(xpath = "//th[@title='Created At']")
	WebElement createdAtColAdded;

	@FindBy(xpath = "//th[@title='Overall Compliance Status']")
	WebElement overallComplianceColAdded;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Filter']")
	WebElement filterOption;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Sort descending']")
	WebElement sortDescendingFilter;

	@FindBy(xpath = "//input[@id='range']")
	WebElement densityRangeFilter;

	@FindBy(xpath = "//div[@id='slider']")
	WebElement densitySlider;

	@FindBy(xpath = "//td[text()='Plot']")
	WebElement plotAction;

	@FindBy(xpath = "//img[@title='Pedigree Viewer']")
	WebElement pedigreeViewer;

	// @FindBy(xpath = "(//td[text()='Rows/Page :']//following::td/select)[1]")
	@FindBy(xpath = "//td[text()='Rows/Page :']//following::td/select")
	WebElement rowsPerPage;

	@FindBy(xpath = "//td[text()='Rows/Page :']//following::td/select/option[text()='50']")
	WebElement rowPerPage50;

	@FindBy(xpath = "(//td[text()='Rows/Page :']//following::td/select/option[text()='100'])[1]")
	WebElement rowPerPage100;

	@FindBy(xpath = "(//td[text()='Rows/Page :']//following::td/select/option[text()='250'])[1]")
	WebElement rowPerPage250;

	@FindBy(xpath = "//td[text()='Rows/Page :']//following::td/select/option[text()='500']")
	WebElement rowPerPage500;

	@FindBy(xpath = "//table[@class='ModBody']")
	WebElement modArea;

	@FindBy(xpath = "//span[text()='Classification']")
	WebElement sodNavConfirm;

	@FindBy(xpath = "//th[@title='Revision']")
	WebElement revisionTab;

	@FindBy(xpath = "(//a[text()='Sort descending'])[7]")
	WebElement sortDescending;

	@FindBy(xpath = "(//td[contains(text(),'378')])[1]")
	WebElement wroughtCount;

	@FindBy(xpath = "//th[@title='Heat Treatment']")
	WebElement heatTreatment;

	@FindBy(xpath = "//th[@title='RL']")
	WebElement releaseLevel;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Sort ascending']")
	WebElement heatTreatmentAscending;

	@FindBy(xpath = "//select[@id='availableCol']/option[text()='Created At']")
	WebElement availableCreatedAt;

	@FindBy(xpath = "//select[@id='availableCol']/option[text()='Created By']")
	WebElement availableCreatedBy;

	@FindBy(xpath = "//div[@id='MoveRight']")
	WebElement moveRightSymbol;

	@FindBy(xpath = "//select[@id='visibleCol']/option[text()='Created At']")
	WebElement visibleCreatedAt;

	@FindBy(xpath = "//select[@id='visibleCol']/option[text()='Created By']")
	WebElement visibleCreatedBy;

	@FindBy(xpath = "//span[text()='First']")
	WebElement moveAtFirst;

	@FindBy(xpath = "//td[text()='Created At']")
	WebElement createdAtCol;

	@FindBy(xpath = "//th[@title='Created By']")
	WebElement createdByCol;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Save Private View']")
	WebElement savePvtView;

	@FindBy(xpath = "//input[@id='viewNameText']")
	WebElement pvtViewText;

	@FindBy(xpath = "//input[@id='showAsDefaultViewCheckBox']")
	WebElement defaultViewCheckbox;

	@FindBy(xpath = "//td[text()='Views (My Views)']")
	WebElement savedPvtView;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Export']")
	WebElement export;

	@FindBy(xpath = "(//span[text()='Selected Rows']//parent::td/input)[3]")
	WebElement selectedRowsRadiobutton;

	/* Materials xpath in MOD */

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement firstEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='1']")
	WebElement secondEle;

	@FindBy(xpath = "(//table[@class='ModBody']/tbody/tr[@smrow='2']//following::td)[1]")
	WebElement thirdEle;

	@FindBy(xpath = "(//table[@class='ModBody']/tbody/tr[@smrow='2']//following::td)[1]")
	WebElement fourthEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='4']")
	WebElement fifthEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='5']")
	WebElement sixthEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='6']")
	WebElement seventhEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='7']")
	WebElement eightEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='8']")
	WebElement nineEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='9']")
	WebElement tenEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='10']")
	WebElement elevenEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='11']")
	WebElement twelveEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='12']")
	WebElement thirteenEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='13']")
	WebElement fourteenEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='14']")
	WebElement fifteenEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='21']")
	WebElement fourthLastEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='22']")
	WebElement thirdLastEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='23']")
	WebElement secondLastEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='24']")
	WebElement lastEle;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='25']")
	WebElement twentysixEle;

	@FindBy(xpath = "//span[text()='D-6A Alloy Steel']")
	WebElement alloySteelEle;

	@FindBy(xpath = "//span[text()='Finishes']")
	WebElement finishesEle;

	@FindBy(xpath = "(//span[text()='Ionomer'])[1]")
	WebElement IonomerEle;

	@FindBy(xpath = "(//span[text()='Industrial Glass'])[1]")
	WebElement industrialGlassEle;
	
	@FindBy(xpath = "(//span[text()='Joining and Sealing'])[1]")
	WebElement joiningSealingEle;
	

	@FindBy(xpath = "//span[text()='Stainless Steel PH14-8 Mo']")
	WebElement stainlessSteelPH14Mo;

	@FindBy(xpath = "//span[text()='Nitronic 32']")
	WebElement nitronic32;

	@FindBy(xpath = "//td[text()='Actions']")
	WebElement actions;

	@FindBy(xpath = "(//a[contains(text(),'Compare')])[1]")
	WebElement compare;

	@FindBy(xpath = "//td[text()='Compliance']")
	WebElement compliance;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Check Compliance']")
	WebElement checkCompliance;

	@FindBy(xpath = "//td[@class='voice']/a[text()='Compliance Status']")
	WebElement complianceStatus;

	@FindBy(xpath = "(//td[@class='voice']/a)[1]")
	WebElement verifyCheckComplianceOpt;

	@FindBy(xpath = "(//table[contains(@id,'Compliance')]/tbody/tr/td[@class='voice']/a)[1]")
	WebElement verifyCheckComplianceOptMOD;

	@FindBy(xpath = "(//td[@class='voice']/a)[2]")
	WebElement verifyComplianceStatusOpt;

	@FindBy(xpath = "(//table[contains(@id,'Compliance')]/tbody/tr/td[@class='voice']/a)[2]")
	WebElement verifyComplianceStatusOptMOD;

	@FindBy(xpath = "//td[text()='Create']")
	WebElement create;

	@FindBy(xpath = "//td[text()='Edit']")
	WebElement edit;

	@FindBy(xpath = "//td[text()='Export']")
	WebElement exportMenu;

	@FindBy(xpath = "//td[text()='Security']")
	WebElement security;

	@FindBy(xpath = "//td[text()='Tools']")
	WebElement tools;

	@FindBy(xpath = "//td/a[text()='To XML']")
	WebElement exportToXML;

	@FindBy(xpath = "(//span[@class='sr'])[1]")
	WebElement selectedRowsCount;

	@FindBy(xpath = "//span[text()='Material Compliance']")
	WebElement alreadyCompliantPopup;

	@FindBy(xpath = "//input[contains(@id,'confirmDialog') and @value='OK']")
	WebElement popupOkButton;

	@FindBy(xpath = "//input[contains(@id,'confirmDialog') and @value='Cancel']")
	WebElement popupCancelButton;

	@FindBy(xpath = "//span[contains(@id,'confirmDialog-msg')]")
	WebElement popupMsg;

	@FindBy(xpath = "//input[contains(@onclick,'includeProject')]")
	WebElement includeProjectCheckbox;

	// @FindBy(xpath = "//input[contains(@id,'ExportToXml') and
	// @title='Submit']")
	@FindBy(xpath = "(//input[@value='Submit'])[1]")
	WebElement exportXmlSubmit;

	@FindBy(xpath = "//span[contains(text(),'Export To Xml [ Export Process ]')]")
	WebElement exportProcessXml;

	@FindBy(xpath = "//span[text()='All Mat Datas']//parent::li/input")
	WebElement allMatDatasCheckbox;

	@FindBy(xpath = "//span[text()='CAE Model']//parent::li/input")
	WebElement caeModelCheckbox;

	/* Right click actions xpaths */

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/a[text()='Compare']")
	WebElement compareOption;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Actions']")
	WebElement actionsOption;

	@FindBy(xpath = "//table[@id='sub_Actions_3']//child::a")
	WebElement addToCompareOption;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Compliance']")
	WebElement complianceOption;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Create']")
	WebElement createOption;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Edit']")
	WebElement editOption;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Export']")
	WebElement exportOption;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Security']")
	WebElement securityOption;

	@FindBy(xpath = "//div[@class='menuContainer ']/table/tbody/tr/td/div/a[text()='Tools']")
	WebElement toolsOption;

	/* xpaths of edit sub options after right click on material */

	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Remove Materials From Library']")
	WebElement editRemoveLib;

	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Assign Analysis Result To Material']")
	WebElement editAnalysisResult;

	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Delete']")
	WebElement editdelete;

	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Change Project']")
	WebElement editProject;

	@FindBy(xpath = "//table[contains(@id,'sub_Edit')]/tbody/tr/td/a[text()='Change Owner']")
	WebElement editOwner;

	@FindBy(xpath = "//input[@value='Submit' and contains(@id,'nav')]")
	WebElement deleteSubmitButton;

	/* Materials in release level In-work */

	@FindBy(xpath = "(//table[@class='ModBody']/tbody/tr/td[text()='0-In-Work'])[1]")
	WebElement matInWork;

	@FindBy(xpath = "//table[@class='MOD']/tbody/tr[4]/td/table/tbody/tr/td/span[text()='AA 208.0'] | //table[@class='MOD']/tbody/tr[4]/td/table/tbody/tr/td/span[text()='AMS 4086']")
	WebElement matInProd;

	@FindBy(xpath = "//table[@class='MOD']/tbody/tr[4]/td/table/tbody/tr/td/span[text()='AA 518.0'] | //table[@class='MOD']/tbody/tr[4]/td/table/tbody/tr/td/span[text()='AMS 4152']")
	WebElement selectedMat;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement caeMatFord;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr")
	List<WebElement> countEle;

	@FindBy(xpath = "//table[@class='ModBody']/thead")
	WebElement matMODHeader;

	@FindBy(xpath = "//span[text()='Material Composition']")
	WebElement compositionWarningPopup;

	@FindBy(xpath = "//span[@class='rf-msg-det']")
	WebElement errorMsgPopup;

	@FindBy(xpath = "//td[contains(text(),'Displayed Rows: 1 - 50')]")

	WebElement displayedRows50;

	@FindBy(xpath = "///td[contains(text(),'Displayed Rows: 1 - 3')]")

	WebElement displayedRows3;

	@FindBy(xpath = "//td[contains(text(),'Displayed Rows: 1 - 500')]")

	WebElement displayedRows500;

	@FindBy(xpath = "//td[contains(text(),'Displayed Rows: 1 - 100')]")

	WebElement displayedRows100;

	@FindBy(xpath = "//td[contains(text(),'Displayed Rows: 1 - 250')]")

	WebElement displayedRows250;

	//@FindBy(xpath = "//div[@class='XPlotMenu']/select[@id='plotType']")
	//WebElement plotTypeDropDown;
	
	@FindBy(xpath = "(//a[text()='Scatter Chart'])[1]")
	WebElement scatterChartOption;
	

	@FindBy(xpath = "//span[contains(text(),'To XML')]")
	WebElement toXml;

	@FindBy(xpath = "(//a[text()='Subscribe'])[1]")
	WebElement subscribeAction;

	@FindBy(xpath = "(//a[text()='Unsubscribe'])[1]")
	WebElement unsubscribeAction;

	@FindBy(xpath = "(//a[text()='Add to Compare'])[1]")
	WebElement AddToCompareAction;

	@FindBy(xpath = "//img[@title='Home Workspace']")
	WebElement dashboardPage;

	// @FindBy(xpath = "//img[@title='Export Material to excel based on
	// properties or using mapping template']")
	// @FindBy(xpath = "//a[contains(text(),'Export To Excel')]")
	@FindBy(xpath = "//a[@procname='ExportToCustomExcel_MatMaterial']")
	WebElement exportExcelOption;

	@FindBy(xpath = "//span[contains(text(),'To Excel')]")
	WebElement toExcel;

	@FindBy(xpath = "//input[contains(@id,'ExportToCustomExcel') and @title='Submit']")
	WebElement exportExcelSubmit;

	@FindBy(xpath = "//span[contains(text(),'Export To Excel [ Export Process ]')]")
	WebElement exportProcessExcel;

	@FindBy(xpath = "//a[@title='Bar Chart']")
	WebElement barChartLink;
	
	@FindBy(xpath = "//a[@class='toollink toolbar-disable' and @title='Bar Chart']")
	WebElement disabledBarChartLink;
	
	@FindBy(xpath = "//a[@class='toollink toolbar-enable' and @title='Bar Chart']")
	WebElement enabledBarChartLink;


	@FindBy(xpath = "//span[text()='Ultra-High Strength']")
	WebElement ultraHighStrengthEle;

	@FindBy(xpath = "(//a[text()='Edit Material Data at RL 0'])[1]")
	WebElement editMatAtRL0FromEditMenu;

	@FindBy(xpath = "//td[text()='Edit']")
	WebElement editMenu;

	@FindBy(xpath = "//input[@id='searchTextBox']")
	WebElement filterSearchBox;

	@FindBy(xpath = "//input[@value='blank']")
	WebElement filterBlankCheckbox;

	@FindBy(xpath = "//input[@value='selectAll']")
	WebElement filterSelectAllCheckbox;

	@FindBy(xpath = "//button[@title='Close']")
	WebElement filterCloseButton;

	@FindBy(xpath = "//button/span[text()='OK']")
	WebElement filterOkButton;

	@FindBy(xpath = "//button/span[text()='Cancel']")
	WebElement filterCancelButton;

	@FindBy(xpath = "//span[text()='Filter']")
	WebElement filterUI;

	@FindBy(xpath = "(//a[text()='Clear column filter'])[2]")
	WebElement filterClearColumnFilterOption;

	@FindBy(xpath = "(//a[contains(text(),'Clear Filter')])[2]")
	WebElement clearFilterOption;

	@FindBy(xpath = "//img[@src='/MaterialCenter/themes/Default/images/table/quickFilter.gif']")
	WebElement filterImage;

	@FindBy(xpath = "//td[contains(text(),'No records found')]")
	WebElement noRecordsFoundResults;

	@FindBy(xpath = "//input[@type='checkbox']")

	List<WebElement> filterCheckBoxes;

	@FindBy(xpath = "(//a[text()='Set Default View'])[2]")
	WebElement setDefaultViewOption;
	
	@FindBy(xpath = "(//a[text()='Save Private View'])[2]")
	WebElement savePrivateViewOption;

	@FindBy(xpath = "//span[text()='Set Default View']")
	WebElement setDefaultViewBox;
	
	@FindBy(xpath = "//span[text()='Save Private View']")
	WebElement savePrivateViewBox;
	
	@FindBy(xpath = "//input[@type='radio' and @id='Default']")
	WebElement defaultViewRadioButton;
	
	@FindBy(xpath = "//input[@type='radio' and @id='TestView1']")
	WebElement privateViewRadioButton;
	
	@FindBy(xpath = "//input[@type='radio' and @id='modDetailed']")
	WebElement detailedViewRadioButton;

	@FindBy(xpath = "//input[@type='radio' and @id='ShareView']")
	WebElement shareViewRadioButton;
	
	@FindBy(xpath = "//td[text()='Views (Default)']")
	WebElement defaultViewtextOnMOD;
	
	@FindBy(xpath = "//td[text()='Views (Detailed)']")
	WebElement detailedViewtextOnMOD;
	
	@FindBy(xpath = "//td[text()='Views (Share View)']")
	WebElement shareViewtextOnMOD;

	@FindBy(xpath = "//input[@id='viewNameText']")
	WebElement viewNameTextbox;
	
	@FindBy(xpath = "//td[text()='Views (test12)']")
	WebElement privateViewtextOnMOD;
	
	@FindBy(xpath = "//td[text()='Create']")
	WebElement createMenu;
	
	@FindBy(xpath = "(//a[text()='Measure from Equations'])[1]")
	WebElement measureFromEquationsOption;
	
	
	@FindBy(xpath = "(//span[text()='Create Measure from Equations'])[2]")
	WebElement createMeasureFromEquationsWindow;
	
	@FindBy(xpath = "(//a[text()='Approval Request'])[1]")
	WebElement approvalRequestOption;
	
	@FindBy(xpath = "(//a[text()='Work Request'])[1]")
	WebElement workRequestOption;
	
	
	@FindBy(xpath = "//span[text()='Approval Request']")
	WebElement approvalRequestWindowText;
	
	@FindBy(xpath = "//span[text()='Work Request']")
	WebElement workRequestWindowText;
	
	public boolean workRequestWindowDisplayedMOD(){
		return ((workRequestWindowText).isDisplayed());
	}
	
	public boolean approvalWindowDisplayedMOD(){
		return ((approvalRequestWindowText).isDisplayed());
	}
	
	public void clickOnApprovalRequestMOD() {
		action.moveToElement(approvalRequestOption).build().perform();
		action.click(approvalRequestOption).build().perform();
	}
	
	public boolean workRequestOptionDisplayed(){
		return ((workRequestOption).isDisplayed());
	}
	
	public boolean approvalRequestOptionDisplayed(){
		return ((approvalRequestOption).isDisplayed());
	}
	
	public boolean measureFromEquationsWindowDisplayed(){
		return ((createMeasureFromEquationsWindow).isDisplayed());
	}
	public void clickOnMeasureFromEquations() {
		action.moveToElement(measureFromEquationsOption).build().perform();
		action.click(measureFromEquationsOption).build().perform();
		wait.until(ExpectedConditions.visibilityOf(createMeasureFromEquationsWindow));
	}
	
	
	public boolean measureFromEquationsOptionDisplayed() {
		return ((measureFromEquationsOption).isDisplayed());
	}
	
	public void clickOnCreate() {
		action.moveToElement(createMenu).build().perform();
		action.click(createMenu).build().perform();
	}
	
	public void enterViewName(String viewName) {
		action.moveToElement(viewNameTextbox).build().perform();
		action.click(viewNameTextbox).build().perform();
		viewNameTextbox.sendKeys(viewName);
		js.executeScript("arguments[0].click();", okButton2);
		wait.until(ExpectedConditions.visibilityOf(privateViewtextOnMOD));
	}
	
	
	public boolean verifySavePrivateViewActionDisplayed() {
		return ((savePrivateViewOption).isDisplayed());
	}
	
	public boolean defaultViewResultsDisplayed() {
		return ((defaultViewtextOnMOD).isDisplayed());
	}
	
	public boolean detailedViewResultsDisplayed() {
		return ((detailedViewtextOnMOD).isDisplayed());
	}
	
	public boolean privateViewResultsDisplayed() {
		return ((privateViewtextOnMOD).isDisplayed());
	}
	public boolean shareViewResultsDisplayed() {
		return ((shareViewtextOnMOD).isDisplayed());
	}
	
	public void selectDefaultView() {
		action.moveToElement(defaultViewRadioButton).build().perform();
		action.click(defaultViewRadioButton).build().perform();
		js.executeScript("arguments[0].click();", okButton2);
		wait.until(ExpectedConditions.visibilityOf(defaultViewtextOnMOD));
	}

	public void selectPrivateView() {
		action.moveToElement(privateViewRadioButton).build().perform();
		action.click(privateViewRadioButton).build().perform();
		js.executeScript("arguments[0].click();", okButton2);
		wait.until(ExpectedConditions.visibilityOf(privateViewtextOnMOD));
	}
	
	public void selectDetailedView() {
		action.moveToElement(detailedViewRadioButton).build().perform();
		action.click(detailedViewRadioButton).build().perform();
		js.executeScript("arguments[0].click();", okButton2);
		wait.until(ExpectedConditions.visibilityOf(detailedViewtextOnMOD));
	}

	public void selectShareView() {
		action.moveToElement(shareViewRadioButton).build().perform();
		action.click(shareViewRadioButton).build().perform();
		js.executeScript("arguments[0].click();", okButton2);
		wait.until(ExpectedConditions.visibilityOf(shareViewtextOnMOD));
	}

	public void clickSetDefaultViewOption() {
		action.moveToElement(setDefaultViewOption).build().perform();
		action.click(setDefaultViewOption).build().perform();
		wait.until(ExpectedConditions.visibilityOf(setDefaultViewBox));
	}
	public void clickSavePrivateViewOption() {
		action.moveToElement(savePrivateViewOption).build().perform();
		action.click(savePrivateViewOption).build().perform();
		wait.until(ExpectedConditions.visibilityOf(savePrivateViewBox));
	}

	public boolean defaultViewRadioButtonDisplayed() {
		return ((defaultViewRadioButton).isDisplayed());
	}
	
	public boolean privateViewRadioButtonDisplayed() {
		return ((privateViewRadioButton).isDisplayed());
	}
	
	public boolean detailedViewRadioButtonDisplayed() {
		return ((detailedViewRadioButton).isDisplayed());
	}

	public boolean shareViewRadioButtonDisplayed() {
		return ((shareViewRadioButton).isDisplayed());
	}

	public boolean verifySetDefaultViewActionDisplayed() {
		return ((setDefaultViewOption).isDisplayed());
	}

	public boolean clearFilterOptionDisplayed() {
		return ((clearFilterOption).isDisplayed());
	}

	public boolean verifyFilterIsRemoved() {
		try {
			if (filterImage.isDisplayed())
				;

		} catch (Throwable e) {
			return false;
		}
		return false;

	}

	public void clickClearColumnFilterOption() {
		action.moveToElement(filterClearColumnFilterOption).build().perform();
		action.click(filterClearColumnFilterOption).build().perform();

	}

	public void clickClearFilter() {
		action.moveToElement(clearFilterOption).build().perform();
		action.click(clearFilterOption).build().perform();

	}

	public boolean verifyAllCheckBoxesSelected() {

		for (WebElement checkBox : filterCheckBoxes) {
			if (checkBox.isSelected()) {

				// System.out.println("Checkbox is ON");
				return true;
			}
		}
		return false;
	}

	public boolean verifyBlankFilterApplied() {
		return ((noRecordsFoundResults).isDisplayed());
	}

	public boolean verifyFilterClearColumnFilterOption() {
		return ((filterClearColumnFilterOption).isDisplayed());
	}

	public boolean verifyFilterImageDisplayed() {
		return ((filterImage).isDisplayed());
	}

	public boolean verifyFilterUIDisplayed() {
		try {
			if (filterUI.isDisplayed())
				;

		} catch (Throwable e) {
			return false;
		}
		return false;

	}

	public boolean verifyFilterCancelButton() {
		return ((filterCancelButton).isDisplayed());
	}

	public boolean verifyFilterCloseButton() {
		return ((filterCloseButton).isDisplayed());
	}

	public boolean verifyFilterOkButton() {
		return ((filterOkButton).isDisplayed());
	}

	public boolean verifyFilterBlankCheckBox() {
		return ((filterBlankCheckbox).isDisplayed());
	}

	public boolean verifyFilterSelectAllCheckBox() {
		return ((filterSelectAllCheckbox).isDisplayed());
	}

	public boolean verifyFilterSearchBox() {
		return ((filterSearchBox).isDisplayed());
	}

	public void clickOnRLColumn() {
		js.executeScript("arguments[0].click();", releaseLevelCol);

	}

	public void clickEditOnMOD() {
		action.moveToElement(editMenu).build().perform();
		action.click(editMenu).build().perform();
	}

	public boolean verifyEditMatAtRL0OptionFromEditMenuNotDisplayed() {
		try {
			if (editMatAtRL0FromEditMenu.isDisplayed())
				;

		} catch (Throwable e) {
			return false;
		}
		return false;

	}

	public void selectUltraHighStrengthEle() {
		js.executeScript("arguments[0].click();", ultraHighStrengthEle);
	}

	public PlotProcessInput clickOnBarChart() throws InterruptedException {

		action.moveToElement(barChartLink).build().perform();
		action.click(barChartLink).build().perform();
		Thread.sleep(2000);
		return new PlotProcessInput();
	}
	public boolean verifyBarChartDisabled()
	{
		return(disabledBarChartLink.isDisplayed());
	}
	
	public boolean verifyBarChartEnabled()
	{
		return(enabledBarChartLink.isDisplayed());
	}

	
	public ProcessesPage exportXmlSubmit() {
		// js.executeScript("arguments[0].click();", exportExcelSubmit);
		action.moveToElement(exportXmlSubmit).build().perform();
		action.click(exportXmlSubmit).build().perform();
		// wait.until(ExpectedConditions.visibilityOf(exportProcessXml));
		return new ProcessesPage();
	}

	public ProcessesPage exportExcelSubmit() {
		// js.executeScript("arguments[0].click();", exportExcelSubmit);
		action.moveToElement(exportExcelSubmit).build().perform();
		action.click(exportExcelSubmit).build().perform();
		// wait.until(ExpectedConditions.visibilityOf(exportProcessExcel));
		return new ProcessesPage();
	}

	public void clickOnExportExcel() {
		// js.executeScript("arguments[0].click();", exportExcelOption);
		action.moveToElement(exportExcelOption).doubleClick(exportExcelOption).build().perform();
		// action.doubleClick(exportExcelOption).build().perform();
		wait.until(ExpectedConditions.visibilityOf(toExcel));

	}

	public void clickOnArrow() {
		// action.moveToElement(arrowButton).build().perform();
		// action.click(arrowButton).build().perform();

		js.executeScript("arguments[0].click();", arrowButton);
	}

	public void clickOnSelectPage() {

		action.moveToElement(selectPage).build().perform();
		action.click(selectPage).build().perform();
		// action.moveToElement(selectAll).build().perform();
		// action.click(selectAll).build().perform();
		//wait.until(ExpectedConditions.elementToBeClickable(plotAction));
		
		wait.until(ExpectedConditions.elementToBeClickable(assignSecLabelsLink));
		// wait.until(ExpectedConditions.elementToBeClickable(exportExcelOption));
		// js.executeScript("arguments[0].click();", selectPage);
	}

	public void clickOnSelectPageForMoreRows() throws InterruptedException {

		action.moveToElement(selectPage).build().perform();
		action.click(selectPage).build().perform();
		// action.moveToElement(selectAll).build().perform();
		// action.click(selectAll).build().perform();
		Thread.sleep(4000);
		// wait.until(ExpectedConditions.elementToBeClickable(exportExcelOption));
		// js.executeScript("arguments[0].click();", selectPage);
	}

	public void clickOnSelectPageFromCurveProperty() {

		action.moveToElement(selectPage).build().perform();
		action.click(selectPage).build().perform();
		// action.moveToElement(selectAll).build().perform();
		// action.click(selectAll).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(pedigreeViewer));
		// js.executeScript("arguments[0].click();", selectPage);
	}

	public void clickOnConfigureColumn() {

		action.moveToElement(configureColumn).build().perform();
		action.click(configureColumn).build().perform();
		// action.moveToElement(selectAll).build().perform();
		// action.click(selectAll).build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(plotAction));
		// js.executeScript("arguments[0].click();", selectPage);
	}

	public void clickOnPlotAction() {
		action.moveToElement(plotAction).build().perform();
		action.click(plotAction).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(scatterChartOption));

		// js.executeScript("arguments[0].click();", plotAction);
	}
	

	public void clickOnScatterPlot() {
		//action.moveToElement(scatterPlot).build().perform();
		//action.sendKeys(Keys.ENTER).click(scatterPlot).build().perform();
			//Select select = new Select(plotTypeDropDown);
		
				//select.selectByValue("xy");
				action.moveToElement(scatterChartOption).click(scatterChartOption).perform();
				
		//	wait.until(ExpectedConditions.elementToBeSelected(yValues));
		
	}
	

	public MaterialSOD clickOnMatToPromote() {
		action.moveToElement(caeMatFord).build().perform();
		action.doubleClick(caeMatFord).build().perform();
		return new MaterialSOD();
	}

	public void clickOnMatToDemote() {
		action.doubleClick(caeMatFord).build().perform();
	}

	public void doubleClickMat() {
		action.doubleClick(selectedMat).build().perform();
	}

	public void doubleClickMat_Ford() {
		action.moveToElement(firstEle).build().perform();
		action.doubleClick(firstEle).build().perform();
	}

	public void clickOnRowPerPage() {
		action.moveToElement(rowsPerPage).build().perform();
		action.click(rowsPerPage).build().perform();

	}

	public void clickOnRevisionTab() {
		action.click(revisionTab).build().perform();
	}

	public void clickOnSorting() {
		action.click(sortDescending).build().perform();
	}

	public void clickOnFirstMat() {
		action.click(firstEle).build().perform();
	}

	public void countMat() {
		int count = countEle.size();
		System.out.println("Number of materials displayed on MOD : " + count);
		/*
		 * for(int i=0; i<=count; i++) { WebElement clickonEle =
		 * countEle.get(i); action.doubleClick(clickonEle).build().perform();
		 * homePage.clickOnBackButton(); }
		 */
	}

	public void printMODData() {
		String text = matMODHeader.getText();
		System.out.println("Material MOD headings are : " + text);
		for (WebElement e : countEle) {
			System.out.println(e.getText());
		}
	}

	public void selectRowsPerPage50() {
		action.click(rowPerPage50).build().perform();
		countMat();
	}

	public void selectRowsPerPage100() {
		action.click(rowPerPage100).build().perform();
		countMat();
	}

	public void selectRowsPerPage250() {
		action.click(rowPerPage250).build().perform();
		countMat();
	}

	/*
	 * public void selectRowsPerPage500() {
	 * action.moveToElement(rowPerPage500).build().perform();
	 * action.click(rowPerPage500).build().perform(); countMat(); }
	 */
	public void selectRowsPerPage500() {
		Select selectRowsperpage = new Select(rowsPerPage);

		selectRowsperpage.selectByVisibleText("500");

	}

	public void selectRowsPerPageas50() {
		Select selectRowsperpage = new Select(rowsPerPage);

		selectRowsperpage.selectByVisibleText("50");

		wait.until(ExpectedConditions.visibilityOf(displayedRows50));

	}

	public void selectRowsPerPageas3() throws InterruptedException {
		Select selectRowsperpage = new Select(rowsPerPage);

		selectRowsperpage.selectByVisibleText("3");
		Thread.sleep(5000);

		// wait.until(ExpectedConditions.visibilityOf(displayedRows3));

	}

	public void selectRowsPerPageas500() throws InterruptedException {
		Select selectRowsperpage = new Select(rowsPerPage);

		selectRowsperpage.selectByVisibleText("500");

		wait.until(ExpectedConditions.visibilityOf(displayedRows500));
		Thread.sleep(3000);

	}

	public void selectRowsPerPageas100() throws InterruptedException {
		Select selectRowsperpage = new Select(rowsPerPage);

		selectRowsperpage.selectByVisibleText("100");

		wait.until(ExpectedConditions.visibilityOf(displayedRows100));
		Thread.sleep(3000);

	}

	public void selectRowsPerPageas250() {
		Select selectRowsperpage = new Select(rowsPerPage);

		selectRowsperpage.selectByVisibleText("250");

		wait.until(ExpectedConditions.visibilityOf(displayedRows250));

	}

	public void selectMultiMat() {
		action.keyDown(Keys.SHIFT).click(firstEle).click(fourteenEle).keyUp(Keys.SHIFT).perform();
	}

	public void selectLastEles() {
		js.executeScript("arguments[0].scrollIntoView(true);", lastEle);
		action.keyDown(Keys.SHIFT).click(fourthLastEle).click(thirdLastEle).click(secondLastEle).click(lastEle)
				.keyUp(Keys.SHIFT).perform();
	}

	public void selectTwoMat() {

		action.moveToElement(thirdEle).build().perform();
		action.keyDown(Keys.CONTROL).build().perform();
		// js.executeScript("arguments[0].click();", thirdEle);
		// js.executeScript("arguments[0].click();", fourthEle);
		action.clickAndHold(thirdEle).build().perform();
		action.moveToElement(fourthEle).build().perform();
		action.clickAndHold(fourthEle).build().perform();
		action.keyUp(Keys.CONTROL).build().perform();

	}

	public void selectDelete() {
		action.moveToElement(firstEle).build().perform();
		action.contextClick(firstEle).build().perform();
		action.moveToElement(editOption).build().perform();
		action.moveToElement(editdelete).build().perform();
		action.click(editdelete).build().perform();
	}

	public void deleteSubmit() {

		js.executeScript("arguments[0].scrollIntoView(true);", deleteSubmitButton);
		action.click(deleteSubmitButton).build().perform();
	}

	public void rightClickOnMats() {
		action.moveToElement(firstEle).build().perform();
		action.contextClick(firstEle).build().perform();
		System.out.println("Right click action performed");
	}

	public void clickOnMats() {
		// action.moveToElement(firstEle).build().perform();
		// action.click(firstEle).build().perform();
		action.click();
		js.executeScript("arguments[0].click();", firstEle);
		System.out.println("click action performed");
	}

	public CompareProcessPage moveToActionClickAddToCompare() {
		action.moveToElement(actionsOption).build().perform();
		action.moveToElement(addToCompareOption).build().perform();
		action.click(addToCompareOption).build().perform();
		return new CompareProcessPage();
	}

	public void moveToActions() {
		action.moveToElement(actionsOption).build().perform();

	}

	public void clickOnCompare() {
		action.click(compareOption).build().perform();
		System.out.println("Compare option clicked");
	}

	/*
	 * public void doubleClickOnSecondMat() { //
	 * action.moveToElement(secondEle).build().perform();
	 * action.doubleClick(secondEle).build().perform(); if
	 * (sodNavConfirm.isDisplayed()) {
	 * System.out.println("SOD of selected material is displayed"); } else {
	 * System.out.println("SOD of selected material didn't display"); } }
	 */
	public MaterialSOD doubleClickOnSecondMat() {
		// action.moveToElement(secondEle).build().perform();
		action.doubleClick(secondEle).build().perform();
		return new MaterialSOD();
	}

	public MaterialSOD doubleClickOnFirstMat() {
		// action.moveToElement(secondEle).build().perform();
		action.moveToElement(firstEle).build().perform();
		action.doubleClick(firstEle).build().perform();
		return new MaterialSOD();
	}

	public void sortReleaseLevelAscending() {
		action.click(releaseLevel).build().perform();
		action.click(heatTreatmentAscending).build().perform();
	}

	public void selectConfigCol() {
		js.executeScript("arguments[0].click();", configCol);
		action.click(moreButton).build().perform();
	}

	public void selectDensityCol() {
		js.executeScript("arguments[0].scrollIntoView(true);", densityCol);
		if (densityCol.isDisplayed()) {
			action.click(densityCheckbox).build().perform();
			System.out.println("Density checkbox selected successfully");
		} else {
			System.out.println("Density option not displayed");
		}
	}

	public void selectCreatedAtCol() {
		js.executeScript("arguments[0].scrollIntoView(true);", createdAtCol);
		if (createdAtCol.isDisplayed()) {
			action.click(createdAtCheckbox).build().perform();
			System.out.println("Density checkbox selected successfully");
		} else {
			System.out.println("Density option not displayed");
		}
	}

	public void clickOnOkButton() {
		action.click(okButton1).build().perform();
		action.click(okButton2).build().perform();
	}

	public void verifyDensityCol() {
		if (densityColAdded.isDisplayed()) {
			System.out.println("Density column added in MOD successfully");
		} else {
			System.out.println("Density column is not added on MOD");
		}
	}

	public void verifyCreatedAtCol() {
		if (createdAtColAdded.isDisplayed()) {
			System.out.println("Density column added in MOD successfully");
		} else {
			System.out.println("Density column is not added on MOD");
		}
	}

	/*
	 * public void verifySubscribeAction() { if(subscribeAction.isDisplayed()) {
	 * System.out.println("Subscribe is displayed under actions"); } else {
	 * System.out.println("Subscribe is not displayed under actions"); } }
	 * 
	 * public void verifyUnsubscribeAction() {
	 * if(unsubscribeAction.isDisplayed()) {
	 * System.out.println("Unsubscribe is displayed under actions"); } else {
	 * System.out.println("Unsubscribe is not displayed under actions"); } }
	 */

	public boolean verifySubscribeAction() {
		return ((subscribeAction).isDisplayed());
	}

	public boolean verifyUnsubscribeAction() {
		return ((unsubscribeAction).isDisplayed());
	}

	public boolean verifyAddToCompareAction() {
		return ((AddToCompareAction).isDisplayed());
	}

	public boolean verifyAddToCompareOption() {
		return ((addToCompareOption).isDisplayed());
	}

	public void clickSubscribeAction() throws InterruptedException {
		action.moveToElement(subscribeAction).build().perform();
		action.click(subscribeAction).build().perform();
		Thread.sleep(3000);// Thread.sleep has been put explicitly because after
		// clicking subscribe, application keeps showing loading the cursor
		// and homepage is not clickable. Resulting, it will give element not
		// intercepted exception. We can't use implicit ot explicit wait here
		// wait.until(ExpectedConditions.elementToBeClickable(dashboardPage));
	}

	public void clickUnsubscribeAction() throws InterruptedException {
		action.moveToElement(unsubscribeAction).build().perform();
		action.click(unsubscribeAction).build().perform();
		Thread.sleep(2000);
	}

	public CompareProcessPage clickAddToCompareAction() {
		action.moveToElement(AddToCompareAction).build().perform();
		action.click(AddToCompareAction).build().perform();
		return new CompareProcessPage();
	}

	public void selectDensityFilter() {
		js.executeScript("arguments[0].scrollIntoView(true);", densityColAdded);
		js.executeScript("arguments[0].click();", densityColAdded);
		action.click(filterOption).build().perform();
	}

	public void selectReleaseLevelFilter() {
		js.executeScript("arguments[0].click();", releaseLevelCol);
		action.click(filterOption).build().perform();
	}

	public void clickInReviewCheckbox() {
		js.executeScript("arguments[0].click();", inReviewCheckbox);
		action.moveToElement(okButton2).click(okButton2).build().perform();
	}

	public void clickInWorkCheckbox() {
		js.executeScript("arguments[0].click();", inWorkCheckbox);
		action.moveToElement(okButton2).click(okButton2).build().perform();
	}

	public void clickBlankCheckboxFilter() throws InterruptedException {
		js.executeScript("arguments[0].click();", filterBlankCheckbox);
		action.moveToElement(okButton2).click(okButton2).build().perform();
		Thread.sleep(2000);
	}

	public void clickSelectAllCheckbox() {
		js.executeScript("arguments[0].click();", filterSelectAllCheckbox);

	}

	public void clickSelectAllCheckboxFilter() {
		js.executeScript("arguments[0].click();", filterSelectAllCheckbox);
		action.moveToElement(okButton2).click(okButton2).build().perform();
	}

	public void clickProdCheckbox() {
		js.executeScript("arguments[0].click();", prodCheckbox);
		action.moveToElement(okButton2).click(okButton2).build().perform();
	}

	public EditMatProcess clickOnEditMatAtRL0OptionFromMOD() {
		action.moveToElement(editMatAtRL0FromEditMenu).build().perform();
		action.click(editMatAtRL0FromEditMenu).build().perform();
		return new EditMatProcess();
	}

	public void selectCreatedAtSortDescending() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView(true);", createdAtColAdded);
		js.executeScript("arguments[0].click();", createdAtColAdded);
		action.click(sortDescendingFilter).build().perform();
		Thread.sleep(2000);
	}

	public void setDensityRange() {
		action.click(densityRangeFilter).build().perform();
		js.executeScript("arguments[0].setAttribute('style', 'left: 30%');", densitySlider);
		action.click(okButton2).build().perform();
		// action.dragAndDropBy(densitySlider, 0, -40).build().perform();
	}

	public void verifyWroughtCount() {
		String text = wroughtCount.getText();
		System.out.println("Text present is :" + text);
		if (text.contains("Displayed Rows: 1 - 25 of 378")) {
			System.out.println("Wrought metals count is correct");
		} else {
			System.out.println("Wrought metals count is not correct");
		}
	}

	public void sortHeatTreatment() {
		action.click(heatTreatment).build().perform();
		action.click(heatTreatmentAscending).build().perform();
	}

	public void configColumns() {
		// action.click(arrowButton).build().perform();
		// action.click(configCol).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", availableCreatedAt);
		action.keyDown(Keys.CONTROL).click(availableCreatedAt).click(availableCreatedBy).keyUp(Keys.CONTROL).perform();
		action.moveToElement(moveRightSymbol).build().perform();
		action.click(moveRightSymbol).build().perform();
		action.keyDown(Keys.CONTROL).click(visibleCreatedAt).click(visibleCreatedBy).keyUp(Keys.CONTROL).perform();
		action.moveToElement(moveAtFirst).build().perform();
		action.click(moveAtFirst).build().perform();
		action.moveToElement(okButton2).build().perform();
		action.click(okButton2).build().perform();
		if (createdAtCol.isDisplayed() | createdByCol.isDisplayed()) {
			System.out.println("Created at and Create by columns has been added successfully");
		} else {
			System.out.println("Columns didn't add successfully");
		}
	}

	public void savePrivateView() {
		action.click(arrowButton).build().perform();
		action.click(savePvtView).build().perform();
		pvtViewText.click();
		pvtViewText.clear();
		pvtViewText.sendKeys("My Views");
		action.click(defaultViewCheckbox).build().perform();
		action.click(okButton2).build().perform();
		String saveView = savedPvtView.getText();
		System.out.println("Private view saved name is:" + saveView);
		if (saveView.contains("Views (My Views)")) {
			System.out.println("Private view saved successfully");
		} else {
			System.out.println("Private view didn't save successfully");
		}
	}

	public void okButton() {
		action.click(okButton2).build().perform();
	}

	public void exportMat() {
		action.click(export).build().perform();
		action.click(selectedRowsRadiobutton).build().perform();
	}

	public void selectAlloySteelEle() {
		// action.doubleClick(alloySteelEle).build().perform();

		js.executeScript("arguments[0].click();", alloySteelEle);
	}

	public void selectFinishesEle() {
		// action.doubleClick(alloySteelEle).build().perform();

		js.executeScript("arguments[0].click();", finishesEle);
	}

	public void selectIonomer() {
		// action.doubleClick(alloySteelEle).build().perform();

		js.executeScript("arguments[0].click();", IonomerEle);
	}

	public void selectIndustrialGlass() {
		// action.doubleClick(alloySteelEle).build().perform();

		js.executeScript("arguments[0].click();", industrialGlassEle);
	}
	public void selectJoiningSealing() {
		// action.doubleClick(alloySteelEle).build().perform();

		js.executeScript("arguments[0].click();", joiningSealingEle);
	}
	
	public void selectStainlessSteelPH14Ele() {
		// action.doubleClick(alloySteelEle).build().perform();

		js.executeScript("arguments[0].click();", stainlessSteelPH14Mo);
	}

	public void selectnitronic32Ele() {
		// action.doubleClick(alloySteelEle).build().perform();

		js.executeScript("arguments[0].click();", nitronic32);
	}

	public void performCompare() {
		action.moveToElement(actions).build().perform();
		action.click(actions).build().perform();
		// js.executeScript("arguments[0].click();", compare);
		action.moveToElement(compare).build().perform();
		action.click(compare).build().perform();
	}

	public void clickActions() {
		action.moveToElement(actions).build().perform();
		action.click(actions).build().perform();
		wait.until(ExpectedConditions.visibilityOf(subscribeAction));
	}

	public void selectMatForCurveCompare() {
		action.keyDown(Keys.CONTROL).click(firstEle).click(thirdEle).keyUp(Keys.CONTROL).build().perform();
	}

	public void clickComplianceOption() {
		action.click(compliance).build().perform();
	}

	public void clickComplianceOptionOnMOD() {
		// js.executeScript("arguments[0].click();", complianceOption);
		action.click(complianceOption).build().perform();
	}

	public void clickCheckComplianceOnMOD() {
		// js.executeScript("arguments[0].click();", checkCompliance);
		action.click(checkCompliance).build().perform();
	}

	public void selectCheckCompliance() {
		clickComplianceOption();
		clickCheckComplianceOnMOD();
		try {
			okOnPopup();
		} catch (Exception e) {
			System.out.println("Already compliance status dialog didn't come.");
		}
	}

	public void selectComplianceStatus() {
		clickComplianceOption();
		action.click(complianceStatus).build().perform();
	}

	public void complianceOpt() {
		String text = verifyCheckComplianceOpt.getText();
		System.out.println("SA under Complaince option " + text + " is displayed");
		if (text.contains("Check Compliance")) {
			System.out.println("Check Compliance SA is correctly displayed under compliance option");
		} else {
			System.out.println("Check Compliance SA is not displayed correctly under compliance option");
		}
		String text1 = verifyComplianceStatusOpt.getText();
		System.out.println("SA under Compliance option " + text1 + " is displayed");
		if (text1.contains("Compliance Status")) {
			System.out.println("Compliance Status SA is correctly displayed under compliance option");
		} else {
			System.out.println("Compliance Status SA is not displayed correctly under compliance option");
		}
	}

	public void complianceOptMOD() {
		String text = verifyCheckComplianceOptMOD.getText();
		System.out.println("SA under Complaince option " + text + " is displayed");
		if (text.contains("Check Compliance")) {
			System.out.println("Check Compliance SA is correctly displayed under compliance option of MOD");
		} else {
			System.out.println("Check Compliance SA is not displayed correctly under compliance option of MOD");
		}
		String text1 = verifyComplianceStatusOptMOD.getText();
		System.out.println("SA under Compliance option " + text1 + " is displayed");
		if (text1.contains("Compliance Status")) {
			System.out.println("Compliance Status SA is correctly displayed under compliance option of MOD");
		} else {
			System.out.println("Compliance Status SA is not displayed correctly under compliance option of MOD");
		}
	}

	public void mouseOverComplianceOptMOD() {
		action.moveToElement(complianceOption).build().perform();
	}

	public void verifyComplianceOptionMOD() {
		clickComplianceOption();
		complianceOpt();
		clickComplianceOption();
	}

	public void verifyComplianceOptionOnRightClick() {
		rightClickOnMats();
		// mouseOverComplianceOptMOD();
		clickComplianceOptionOnMOD();
		complianceOptMOD();
	}

	public void selectMultiMatForCheckCompliance() {
		action.keyDown(Keys.SHIFT).click(firstEle).click(twentysixEle).keyUp(Keys.SHIFT).build().perform();
		String text = selectedRowsCount.getText();
		System.out.println("Total number of rows selected are : " + text);
	}

	public void selectCheckComplianceOnRightClick() {
		rightClickOnMats();
		clickComplianceOptionOnMOD();
		clickCheckComplianceOnMOD();
		try {
			okOnPopup();
		} catch (Exception e) {
			System.out.println("Already compliance status dialog didn't come.");
		}
	}

	public void verifyMODDisplayed() {
		if (modArea.isDisplayed()) {
			System.out.println("MOD is displayed successfully");
		} else {
			System.out.println("MOD is not displayed successfully");
		}
	}

	public void verifyAlreadyCompliantMultiMatWarningMsgMOD() {
		if (alreadyCompliantPopup.isDisplayed()) {
			System.out.println("Material Compliance popup heading displayed correctly");
		} else {
			System.out.println("Material Compliance popup heading is missing");
		}
		String text = popupMsg.getText();
		Assert.assertEquals(text, "Compliance information is already due for at least one or more material" + "\n"
				+ "from selected list. Click Ok to continue, or Cancel to abort");
		System.out.println("Warning msg displayed as : " + text);
	}

	public void verifyAlreadyCompliantSingleMatWarningMsgMOD() {
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

	public void verifyAlreadyPendingSingleMatWarningMsgMOD() {
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

	public void okOnPopup() {
		action.click(popupOkButton).build().perform();
	}

	public void complianceStatusSelection() {
		js.executeScript("arguments[0].scrollIntoView(true);", overallComplianceStatusCol);
		if (overallComplianceStatusCol.isDisplayed()) {
			action.click(overallComplianceStatusCheckbox).build().perform();
			System.out.println("Overall Compliance Status checkbox selected successfully");
		} else {
			System.out.println("Overall Compliance Status option not displayed");
		}
	}

	public void verifyMultiMatCompliancePopupDialogMOD() {
		verifyAlreadyCompliantMultiMatWarningMsgMOD();
		cancelOnPopup();
		verifyMODDisplayed();
		selectCheckCompliance();
		okOnPopup();
		process.verifyProcessStatus();
	}

	public void verifySingleMatCompliancePopupDialogMOD() {
		verifyAlreadyCompliantSingleMatWarningMsgMOD();
		cancelOnPopup();
		verifyMODDisplayed();
		selectCheckCompliance();
		okOnPopup();
		process.verifyProcessStatus();
	}

	public void verifySingleMatPendingCompliantPopupDialogMOD() {
		verifyAlreadyPendingSingleMatWarningMsgMOD();
		cancelOnPopup();
		verifyMODDisplayed();
		selectCheckCompliance();
		okOnPopup();
		process.verifyProcessStatus();
	}

	public void selectOverallComplianceStatus() {
		complianceStatusSelection();
		clickOnOkButton();
	}

	public void verifyOverallComplianceStatusCol() {
		if (overallComplianceColAdded.isDisplayed()) {
			System.out.println("Overall Compliance Status column added successfully");
		} else {
			System.out.println("Overall Compliance Status column is not displayed");
		}
	}

	public void verifyNoCompositionWarningMsgMOD() {
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

	public void clickOnExportMenu() {
		action.click(exportMenu).build().perform();
	}

	public void clickOnXMLOption() {
		action.click(exportToXML).build().perform();
	}

	public void selectExportToXML() {
		clickOnExportMenu();
		clickOnXMLOption();
		wait.until(ExpectedConditions.visibilityOf(toXml));
	}

	public void selectCheckbox() throws InterruptedException {
		action.click(includeProjectCheckbox).build().perform();
		action.click(allMatDatasCheckbox).build().perform();
		Thread.sleep(3000);
		// wait.until(ExpectedConditions.elementToBeSelected(caeModelCheckbox));

	}
}
