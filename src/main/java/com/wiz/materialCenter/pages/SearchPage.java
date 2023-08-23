package com.wiz.materialCenter.pages;


import java.time.Duration;
import java.util.List;
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
//import org.testng.Assert;
import org.junit.Assert;


import com.wiz.materialCenter.util.TestBase;

public class SearchPage extends TestBase {
	
	//String saveName = UUID.randomUUID().toString();
	Actions action = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver,(30));
	HomePage homePage = new HomePage();
	
	public String storeName;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*Xpaths under Search WS tab*/
	
	@FindBy(xpath = "//a[text()='Material']")
	WebElement materialSearch;
	
	@FindBy(xpath = "//a[text()='Curve Property']")
	WebElement curvePropertySearch;

	@FindBy(xpath = "//a[text()='Test']")
	WebElement testSearch;
	

	@FindBy(xpath = "(//td[text()='Test'])[1]")
	WebElement testText;
	
	@FindBy(xpath = "//a[text()='Batch']")
	WebElement batchSearch;
	
	@FindBy(xpath = "//a[text()='Analysis Result']")
	WebElement analysisResultSearch;
	
	
	
	@FindBy(xpath = "//a[text()='String Property']")
	WebElement stringPropSearch;
	
	@FindBy(xpath = "//a[text()='Measure Property']")
	WebElement measurePropSearch;
	
	@FindBy(xpath = "//a[text()='Curve Property']")
	WebElement curvePropSearch;
	
	@FindBy(xpath = "//a[text()='Image Property']")
	WebElement imagePropSearch;
	
	@FindBy(xpath = "//a[text()='Matrix Property']")
	WebElement matrixPropSearch;
	
	@FindBy(xpath = "//a[text()='Document Property']")
	WebElement docPropSearch;
	
	@FindBy(xpath = "//a[text()='Library']")
	WebElement librarySearch;
	
	@FindBy(xpath = "//a[text()='Approval Request']")
	WebElement approvalReqSearch;
	//a[@title='Approval Request']
	
	@FindBy(xpath = "//a[text()='Work Request']")
	WebElement workReqSearch;
	
	@FindBy(xpath = "//a[text()='More...']")
	WebElement moreSearch;
	
	@FindBy(xpath = "//table[@id='searchMenuDiv']")
	WebElement searchDropDown;
	
	@FindBy(xpath = "//td[@class='voice']/a[text()='Test' and @img='MatTest']")
	WebElement testDataSearch;
	
	@FindBy(xpath = "///td[@class='voice']/a[text()='CAE Model' and @img='MatMaterialModel']")
	WebElement CAEModelSearch;
	
	/*Xpaths on Search result page*/
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement easySearch;
	
	@FindBy(xpath = "//td/img[@id='search']")
	WebElement searchButton;
	
	@FindBy(xpath = "//td[@class='MODComp']/table[@class='ModBody']")
	WebElement searchResult;
	
	@FindBy(xpath = "//img[@title='Save Search']")
	WebElement saveSearch;
	
	@FindBy(xpath = "//input[@class='name']")
	WebElement saveByName;
	
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement okButton;
	
	@FindBy(xpath = "(//span[text()='Ok'])[2]")
	WebElement okButton1;
	
	@FindBy(xpath = "//a[text()='My Searches']")
	WebElement mySearches;
	
	@FindBy(xpath = "//td[text()='My Searches']")
	WebElement textMySearches;
	
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement latestSearch;
	
	@FindBy(xpath = "//div[text()=' Add Condition']")
	WebElement addCondition;
	
	@FindBy(xpath = "//input[@id='nameFilter']")
	WebElement filterText;
	
	@FindBy(xpath = "//td[text()='Density']//parent::tr//td[@class='SwsShrink']/input")
	WebElement densityCheckbox;					
	
	@FindBy(xpath = "//td[text()='Yield Strength']//parent::tr//td[@class='SwsShrink']/input")
	WebElement yieldStrengthCheckbox;			
	
	@FindBy(xpath = "//td[text()='Density']")
	WebElement densityAttrAdded;
	
	@FindBy(xpath = "//td[text()='Yield Strength']")
	WebElement yieldStrengthAdded;
	
	@FindBy(xpath = "//td[text()='Density']//parent::tr//td/img[@id='edit']")
	WebElement expandDensityAttr;
	
	@FindBy(xpath = "//td[text()='Density']//parent::tr//td/img[@id='close']")
	WebElement collapseDensityAttr;
	
	@FindBy(xpath = "//img[@title='Show historgram']")
	WebElement historgram;
	
	@FindBy(xpath = "//div[@id='slider']")
	WebElement densitySlider;
	
	@FindBy(xpath = "//td[@id='units']")
	WebElement unitsDropDown;
	
	@FindBy(xpath = "//option[text()='lb/in³']")
	WebElement lbinchesUnit;
	
	@FindBy(xpath = "(//div[@class='SwsHistoBar'])[1]")
	WebElement histrogramGraph;
	
	@FindBy(xpath = "//img[@title='Show histogram']//following-sibling::img[@title='Apply the changes']")
	WebElement histoApplyChanges;
	
	@FindBy(xpath = "//td[text()='Density']//following::img[@id='clear']")
	WebElement densityConditionRemoveButton;
	
	@FindBy(xpath = "(//input[@id='input'])[11]")
	WebElement densityTextbox;;
	
	@FindBy(xpath = "//td[text()='Material Type']//parent::tr/td/img[@id='edit']")
	WebElement expandMatType;
	
	@FindBy(xpath = "//select[@id='reSizeSws']/option")
	List<WebElement> matTypeOptions;
	
	@FindBy(xpath = "//option[@value='Metals']")
	WebElement metalsMatTypeOption;
	
	@FindBy(xpath = "(//img[@id='apply'])[1]")
	WebElement applyMatTypeChanges;
	
	@FindBy(xpath = "//select[@id='reSizeSws']")
	WebElement selectMaterialType;
	
	@FindBy(xpath = "(//td[contains(text(),'of 1628')])[1]")
	WebElement matCount;
	
	@FindBy(xpath = "//td[text()='Property Def']//parent::tr/td/img[@id='edit']")
	WebElement expandPropDef;
	
	@FindBy(xpath = "//option[text()='Compressive Stress in LT-dir. vs Strain']")
	WebElement propDefOption;
	
	@FindBy(xpath = "//td[@smcol='5']")
	WebElement commonNameValueMOD;
	
	@FindBy(xpath = "(//select[contains(@onchange,'Page')]//following::td)[2]")
	WebElement resultDisplayCount;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr/td[@smcol='4']")
	List<WebElement> familyColCount;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr")
	List<WebElement> countEle;
	
	@FindBy(xpath = "//tr[@cmenu='ctx']")
	List<WebElement> savedSearchList;
	
	@FindBy(xpath = "//img[@class='GlobalBCEnable']")
	WebElement backButton;
	
	@FindBy(xpath = "//th[@title='RL']")
	WebElement releaseLevel;
	
	@FindBy(xpath = "//td[@class='voice']/a[text()='Sort ascending']")
	WebElement sortAscending;
	
	@FindBy(xpath = "//input[@title='Search Home']")
	WebElement searchHome;
	
	@FindBy(xpath = "(//tr[@class='ModBodyRowEven']//following::a)[1]")
	WebElement HomeSearchTemplatelink;
	
	@FindBy(xpath = "(//td[contains(text(),'Curve Base Property')])[2]")
	WebElement txtCurveBaseProperty;
	
	@FindBy(xpath = "(//tr[@class='ModBodyRowEven'])[1]/td[@smcol='1']/child::a")
	WebElement firstlinkFromSearchResult;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement firstEle;
	
	@FindBy(xpath = "(//table[@class='ModBody']/tbody/tr/td[@smcol='0'])[1]")
	WebElement firstMat;
	
	@FindBy(xpath = "(//td[text()='Test'])[1]")
	WebElement textTest;
	
	@FindBy(xpath = "(//a[text()='Open'])[1]")
	WebElement openLinkOnRightClick;
	
	@FindBy(xpath = "(//td[text()='CAE Model'])[1]")
	WebElement textCAE;

	@FindBy(xpath = "(//td[contains(text(),'Material')])[1]")
	WebElement textMaterial;
	
	@FindBy(xpath = "//td[text()='Curves']/preceding-sibling::td/img[@id='edit']")
	WebElement expandCurveAttr;
	
	@FindBy(xpath = "//td[text()='Curves']/preceding-sibling::td/img[@id='close']")
	WebElement collapseCurveAttr;
	
	@FindBy(xpath = "(//td[text()='Curves']/following::select[@id='op'])[1]")
	WebElement curvesAttrSelectOptions;

	@FindBy(xpath = "//select[@id='reSizeSws']")
	WebElement curveAttributesDropdown;
	@FindBy(xpath = "(//td[text()='Curves']/following::img[@title='Apply the changes'])[1]")
	WebElement curveApplyChanges;
	
	@FindBy(xpath = "(//td[text()='Curve Base Property'])[1]")
	WebElement txtCurveProperty;
	
	@FindBy(xpath = "//td[text()='Edit']")
	WebElement editMenu;
	
	@FindBy(xpath = "(//a[text()='Manage Process'])[1]")
	WebElement manageProcessFromEditMenu;
	
	@FindBy(xpath = "(//a[text()='Edit Material Data at RL 0'])[1]")
	WebElement editMatAtRL0FromEditMenu;
	
	@FindBy(xpath = "(//a[text()='Manage Layup'])[1]")
	WebElement manageLayupFromEditMenu;
	
	@FindBy(xpath = "(//a[text()='Actions'])[1]")
	WebElement actionMenuOnRightClick;
	
	@FindBy(xpath = "(//a[text()='Delegate Approver'])[1]")
	WebElement delegateApproverOption;
	
	@FindBy(xpath = "//span[text()='Delegate Approver']")
	WebElement delegateApproverDialog;
	
	@FindBy(xpath = "//img[@id='searchActionDialog-f:DelegateApprover:SMRecentObjectsSelection_delegate_recentObjectListDropDownArrowImage']")
	WebElement delegateDropdownImage;
	
	@FindBy(xpath = "//span[text()='Adrian Administrator']")
	WebElement adrianAdminUser;
	
	@FindBy(xpath = "//span[text()='Molly Manager']")
	WebElement mollyManagerUser;
	
	
	@FindBy(xpath = "//input[@id='searchActionDialog-f:DelegateApprover:changeReason']")
	WebElement changeReasonTextbox;
	
	@FindBy(xpath = "//input[@id='delegateEndDate_dt']")
	WebElement delegateEndDateTextBox;
	
	@FindBy(xpath = "//td[@data-year='2023']/a[text()='30']")
	WebElement thirtyDateOfMonth;
	
	@FindBy(xpath = "//input[@id='searchActionDialog-f:DelegateApprover:addApprover']")
	WebElement addDelegateButton;
	
	@FindBy(xpath = "//input[@value='X']")
	WebElement revokeDelegateButton;
	
	@FindBy(xpath = "//input[@value='X' and @style='text-decoration: line-through;']")
	WebElement ScratchedRevokeDelegateButton;
	
	@FindBy(xpath = "//input[@id='searchActionDialog-f:DelegateApprover:submitButton']")
	WebElement delegateApproverSubmitButton;
	
	@FindBy(xpath = "//td[text()='Approval Request' and @class='ModTypeLabel']")
	WebElement approvalRequestText;
	
	@FindBy(xpath = "//img[@title='Home Workspace']")
	WebElement dashboardPage;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td/a[text()='Delegate Approver']")
	WebElement delegateApproverHome;
	
	@FindBy(xpath = "(//span[@style='text-decoration: line-through;'])[1]")
	WebElement strikedTextApproverRequest;
	
	@FindBy(xpath = "//span[@class='rf-msg-det']")
	WebElement addDelegateErrorMessageText;
	
	@FindBy(xpath = "//input[@id='searchActionDialog-f:DelegateApprover:approver_slt' and @disabled ='disabled']")
	WebElement disabledApprovrSelectButton;
	
	@FindBy(xpath = "//input[@id='searchActionDialog-f:DelegateApprover:approver_clr' and @disabled ='disabled']")
	WebElement disabledApprovrClearButton;
	
	
public boolean verifyScratchRevokeButtonIsDisplayed() {
		
		return(ScratchedRevokeDelegateButton.isDisplayed());
		
}
	
public boolean verifyRevokeButtonIsDisplayed() {
		
		return(revokeDelegateButton.isDisplayed());
	}
	
	public boolean selectButtonAgainstApproverIsDisabled() {
		
		return(disabledApprovrSelectButton.isDisplayed());
	}
public boolean clearButtonAgainstApproverIsDisabled() {
		
		return(disabledApprovrClearButton.isDisplayed());
	}
	
	public String errToaddDelegateAlreadyFilled() {

		return (addDelegateErrorMessageText.getText());
	}
	
	
	public HomePage clickOnDashboard() throws InterruptedException {
		// Thread.sleep(1000);
		// wait.until(ExpectedConditions.elementToBeClickable(dashboardPage));
		// action.moveToElement(dashboardPage).build().perform();
		// action.click(dashboardPage).build().perform();
		// dashboardPage.click();
		js.executeScript("arguments[0].click();", dashboardPage);
		return new HomePage();
	}
	
	public void clickDelegateApproverSubmitButton() {
		action.moveToElement(delegateApproverSubmitButton).build().perform();
		action.click(delegateApproverSubmitButton).build().perform();

	}
	public void clickRevokeButton() {
		action.moveToElement(revokeDelegateButton).build().perform();
		action.click(revokeDelegateButton).build().perform();
		wait.until(ExpectedConditions.visibilityOf(ScratchedRevokeDelegateButton));
	}
	
	public void clickAddDelegateButton() {
		action.moveToElement(addDelegateButton).build().perform();
		action.click(addDelegateButton).build().perform();
		wait.until(ExpectedConditions.visibilityOf(revokeDelegateButton));
	}
	public void clickrevokeDelegateButton() {
		action.moveToElement(revokeDelegateButton).build().perform();
		action.click(revokeDelegateButton).build().perform();
		wait.until(ExpectedConditions.visibilityOf(strikedTextApproverRequest));
	}
	
	public void enterChangeReson() {
		action.moveToElement(changeReasonTextbox).build().perform();
		action.click(changeReasonTextbox).build().perform();
		String storeName = RandomStringUtils.randomAlphanumeric(10);
		changeReasonTextbox.sendKeys(storeName);
	}

	
	public void selectEndDateFromDatePicker() {
		action.moveToElement(delegateEndDateTextBox).build().perform();
		action.click(delegateEndDateTextBox).build().perform();
		action.moveToElement(thirtyDateOfMonth).build().perform();
		action.click(thirtyDateOfMonth).build().perform();
	}

	public void clickDelegateDropdownSelectApprover() {
		action.moveToElement(delegateDropdownImage).build().perform();
		action.click(delegateDropdownImage).build().perform();
		action.moveToElement(adrianAdminUser).build().perform();
		action.click(adrianAdminUser).build().perform();
	}
	public void clickDelegateDropdownSelectApproverMollyManager() {
		action.moveToElement(delegateDropdownImage).build().perform();
		action.click(delegateDropdownImage).build().perform();
		action.moveToElement(mollyManagerUser).build().perform();
		action.click(mollyManagerUser).build().perform();
	}
	
	public void selectDelegateApproverFromAction() {
		action.moveToElement(actionMenuOnRightClick).build().perform();
		action.click(delegateApproverOption).build().perform();
		wait.until(ExpectedConditions.visibilityOf(delegateApproverDialog));
	}
	
	
	public void rightClickOnApprovalReq() {
		action.moveToElement(firstEle).build().perform();
		action.contextClick(firstEle).build().perform();

	}
	
	public ManageProcessPage clickOnManageProcessFromMOD (){
		action.moveToElement(manageProcessFromEditMenu).build().perform();
		action.click(manageProcessFromEditMenu).build().perform();
		return new ManageProcessPage();
		
	}
	
	public ManageProcessPage clickOnManageLayupFromMOD (){
		action.moveToElement(manageLayupFromEditMenu).build().perform();
		action.click(manageLayupFromEditMenu).build().perform();
		return new ManageProcessPage();
		
	}
	
	public boolean verifyManageProcessOptionFromEditMenuDisplayed(){
		return manageProcessFromEditMenu.isDisplayed();
	}
	public boolean verifyEditMatAtRL0OptionFromEditMenuDisplayed(){
		return editMatAtRL0FromEditMenu.isDisplayed();
	}
	
	
	public boolean verifyManageLayupOptionFromEditMenuDisplayed(){
		return manageLayupFromEditMenu.isDisplayed();
	}
	
	public boolean verifyCurvePropertySearchDisplayed(){
		return txtCurveProperty.isDisplayed();
	}
	
	public void clickEdit() {
		action.moveToElement(editMenu).build().perform();
		action.click(editMenu).build().perform();
		//wait.until(ExpectedConditions.visibilityOf(manageProcessFromEditMenu));
	}
public void clickApplyChangesForCurves() {
		
	js.executeScript("arguments[0].click();", curveApplyChanges);
}
	
public void selectCurveAttributeFromDropdown() {
		
		Select select = new Select(curveAttributesDropdown);
		select.selectByValue("%RT Bearing Yield Strength vs Temperature");
}
	public void expandCurveAttribute(){
		//action.moveToElement(expandCurveAttr).build().perform();
		//action.contextClick(firstEle).build().perform();
		//wait.until(ExpectedConditions.visibilityOf(openLinkOnRightClick));
		//js.executeScript("arguments[0].click();", expandCurveAttr);
		action.moveToElement(expandCurveAttr).build().perform();
		action.click(expandCurveAttr).build().perform();
		wait.until(ExpectedConditions.visibilityOf(curvesAttrSelectOptions));
	}
	
	public boolean verifyTestSearchDisplayed(){
		return textTest.isDisplayed();
	}

	public MaterialSOD doubleClickOnFirstMat() {
		// action.moveToElement(secondEle).build().perform();
		action.moveToElement(firstEle).build().perform();
		action.doubleClick(firstEle).build().perform();
		return new MaterialSOD();
	}
	public CurvePropertySOD doubleClickOnFirstCurve() {
		// action.moveToElement(secondEle).build().perform();
		action.moveToElement(firstMat).build().perform();
		action.doubleClick(firstMat).build().perform();
		return new CurvePropertySOD();
	}
	public MaterialSOD doubleClickOnFirstMaterial() {
		// action.moveToElement(secondEle).build().perform();
		action.moveToElement(firstMat).build().perform();
		action.doubleClick(firstMat).build().perform();
		//js.executeScript("arguments[0].click();", firstMat);
		return new MaterialSOD();
	}
	
	public void clickOnMats() {
		//action.moveToElement(firstEle).build().perform();
		//action.click(firstEle).build().perform();
		action.click();
		js.executeScript("arguments[0].click();", firstEle);
		System.out.println("click action performed");
	}
	public boolean verifyCAESearchDisplayed(){
		return textCAE.isDisplayed();
	}
	public boolean verifyMaterialsSearchDisplayed(){
		return textMaterial.isDisplayed();
			}
	
	public void rightClickOnElement(){
		//action.moveToElement(firstEle).build().perform();
		action.contextClick(firstEle).build().perform();
		//wait.until(ExpectedConditions.visibilityOf(openLinkOnRightClick));
		System.out.println("Right click action performed");
	}
	
	public MaterialSOD clickOnFirstLinkFromSearchResults(){
		//action.moveToElement(firstlinkFromSearchResult).build().perform();
		//action.click(firstlinkFromSearchResult).build().perform();
		js.executeScript("arguments[0].click();", firstlinkFromSearchResult);
		
		return new MaterialSOD();
	}
	
	public SearchPage textSearch(String text) {
		easySearch.click();
		easySearch.clear();
		easySearch.sendKeys(text);
		action.click(searchButton).build().perform();
		return new SearchPage();
	}
	
	public void enterTextSearch() {
		textSearch(prop.getProperty("textsearch"));
	}
	
	public void enterTextSearchForPlot() {
		textSearch(prop.getProperty("textsearchplot"));
	}
	
	public void enterTextSearch1() {
		textSearch(prop.getProperty("textsearch1"));
	}
	
	public void enterTestDataMat() {
		textSearch(prop.getProperty("testDataMaterial"));
	}
	
	public void enterTestDataSearch() {
		textSearch(prop.getProperty("testdataSearch"));
	}
	
	public void enterCAEModelSearch() {
		textSearch(prop.getProperty("CAEModelSearch"));
	}
	public void searchResult() {
		if(searchResult.isDisplayed()) {
			System.out.println("Search result is displayed");
		} else {
			System.out.println("Search result didn't display");
		}
	}
	
	public SearchPage numericalSearch(String text) {
		action.moveToElement(easySearch).build().perform();
		easySearch.click();
		easySearch.clear();
		easySearch.sendKeys(text);
		action.click(searchButton).build().perform();
		return new SearchPage();
	}
	
	public void enterNumericalSearch() {
		numericalSearch(prop.getProperty("numericalsearch"));
	}
	
	public void clickOnSearchButton() {
		action.moveToElement(searchButton).build().perform();
		action.click(searchButton).build().perform();
		wait.until(ExpectedConditions.visibilityOf(searchHome));
		
	}
	
	public void clickOnTestOpt() {
		action.click(testSearch).build().perform();
		wait.until(ExpectedConditions.visibilityOf(testText));
	}
	
	public void clickOnApprovalReqOpt() {
		action.click(approvalReqSearch).build().perform();
		wait.until(ExpectedConditions.visibilityOf(testText));
	}
	
	public void clickOnMeasurePropOpt() {
		action.click(measurePropSearch).build().perform();
	}
	
	public void clickOnTemplateLinkFromHomePage() {
		
		action.moveToElement(HomeSearchTemplatelink).build().perform();
		action.click(HomeSearchTemplatelink).build().perform();
		
	}
	
	public void clickOnSaveButton() {
		//js.executeScript("arguments[0].scrollIntoView(true);", saveSearch);
		
		js.executeScript("arguments[0].click();", saveSearch);
		//action.moveToElement(saveSearch).build().perform();
		//action.click(saveSearch).build().perform();
		//wait.until(ExpectedConditions.visibilityOf(saveByName));
		/*driver.switchTo().activeElement();
		saveByName.click();
		saveByName.clear();
		storeName = RandomStringUtils.randomAlphabetic(10);
		saveByName.sendKeys(storeName);
		System.out.println("Search result saved by name : " + storeName);
		//action.click(okButton).build().perform();
		//wait.until(ExpectedConditions.elementToBeClickable(okButton));
		js.executeScript("arguments[0].click();", okButton);*/
	}
	
	public void clickOnSaveSearch() {
		//js.executeScript("arguments[0].scrollIntoView(true);", saveSearch);
		//action.moveToElement(saveSearch).build().perform();
		//action.click(saveSearch).build().perform();
		//driver.switchTo().activeElement();
		saveByName.click();
		saveByName.clear();
		storeName = RandomStringUtils.randomAlphabetic(10);
		saveByName.sendKeys(storeName);
		System.out.println("Search result saved by name : " + storeName);
		//action.click(okButton).build().perform();
		//wait.until(ExpectedConditions.elementToBeClickable(okButton));
		js.executeScript("arguments[0].click();", okButton);
	}
	
	public void clickOnSaveSearch1() {
		action.click(saveSearch).build().perform();
		saveByName.click();
		saveByName.clear();
		saveByName.sendKeys("Search for Steels by Density");
		//action.click(okButton).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(okButton1));
		js.executeScript("arguments[0].click();", okButton1);
	}
	
	public void relaunchSearch() {
		action.moveToElement(mySearches).build().perform();
		action.click(mySearches).build().perform();
		wait.until(ExpectedConditions.visibilityOf(textMySearches));
		action.moveToElement(latestSearch).build().perform();
		action.doubleClick(latestSearch).build().perform();
		if(searchResult.isDisplayed()) {
			System.out.println("Relaunch of saved search is done successfully");
		} else {
			System.out.println("Relaunch of saved search is not done successfully");
		}
	}
	
	public void relaunchLatestSearch() {
		js.executeScript("arguments[0].click();", mySearches);
		for(WebElement li : savedSearchList) {
			System.out.println(li.getText());
			System.out.println();
			for (int i=0; i<storeName.length(); i++)
		     {
		        if(li.getText().equalsIgnoreCase(storeName))
		        {
		            action.doubleClick(li).build().perform();
		        }
		      }
		}
	}
	
	public void sortAscendingReleaseLevel() {
		action.click(releaseLevel).build().perform();
		action.click(sortAscending).build().perform();
	}
	
	public void relaunchLatestSearch1() {
		
		action.moveToElement(latestSearch).build().perform();
		action.doubleClick(latestSearch).build().perform();
	}
	
	public void clickonMySearches() {
		action.moveToElement(mySearches).build().perform();
		action.click(mySearches).build().perform();
		wait.until(ExpectedConditions.visibilityOf(textMySearches));
	}
	
	public void verifysavedSearch() {
	//	String text = matCount.getText();
		//System.out.println("Materials displayed after applying filter : " + text);
	//	Assert.assertEquals(text, "Displayed Rows: 1 - 25 of 1628");
		System.out.println("Saved search launched successfully");
	}
	
	public void clickOnMaterial() throws InterruptedException {
		//action.moveToElement(materialSearch).build().perform();
		//action.click(materialSearch).build().perform();
		js.executeScript("arguments[0].click();", materialSearch);
		//wait.until(ExpectedConditions.visibilityOf(textMaterial));
		Thread.sleep(2000);
		
	}
	
	public void clickOnCurveProperty() throws InterruptedException {
		//action.moveToElement(materialSearch).build().perform();
		//action.click(materialSearch).build().perform();
		js.executeScript("arguments[0].click();", curvePropertySearch);
		//wait.until(ExpectedConditions.visibilityOf(textMaterial));
		Thread.sleep(2000);
		
	}
	
	public void selectAddCondition() {
		action.moveToElement(addCondition).build().perform();
		action.click(addCondition).build().perform();
	}
	
	public void addDensityAttr() {
		//action.click(addCondition).build().perform();
		filterText.clear();
		filterText.click();
		filterText.sendKeys("Density");
		//js.executeScript("arguments[0].scrollIntoView(true);", densityCheckbox);
		js.executeScript("arguments[0].click();", densityCheckbox);
		//action.click(densityCheckbox).build().perform();
		action.moveToElement(okButton).build().perform();
		action.click(okButton).build().perform();
		if(densityAttrAdded.isDisplayed()) {
			System.out.println("Density attribute condition added successfully");
		} else {
			System.out.println("Density attribute addition failed");
		}
	}
	
	public void expandDensityAttr() {
		//js.executeScript("arguments[0].scrollIntoView(true);", expandDensityAttr);
		action.moveToElement(expandDensityAttr).build().perform();
		action.click(expandDensityAttr).build().perform();
 	}
	
	public void applyDensitySlider() {
		//action.dragAndDropBy(densitySlider, 30, 0).build().perform();
		js.executeScript("arguments[0].setAttribute('style', 'right: 40%');", densitySlider);
		action.moveToElement(histoApplyChanges).build().perform();
		action.click(histoApplyChanges).build().perform();
	}
	
	public void provideDensityRange() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(densityTextbox));
		densityTextbox.click();
		densityTextbox.clear();
		densityTextbox.sendKeys("0.00472788..0.0179388");
		js.executeScript("arguments[0].click();", histoApplyChanges);
		Thread.sleep(2000);
	}
	
	public void applyHistrogramRange() {
		wait.until(ExpectedConditions.elementToBeClickable(unitsDropDown));
		//js.executeScript("arguments[0].scrollIntoView(true);", unitsDropDown);
		js.executeScript("arguments[0].click();", unitsDropDown);
		js.executeScript("arguments[0].scrollIntoView(true);", lbinchesUnit);
		action.click(lbinchesUnit).build().perform();
		action.moveToElement(historgram).build().perform();
		js.executeScript("arguments[0].click();", historgram);
		//action.sendKeys(historgram, Keys.ENTER).build().perform();
		//action.click(histrogramGraph).build().perform();
		js.executeScript("arguments[0].click();", histrogramGraph);
		
	}
	
	public void applyDensityChange() {
		//js.executeScript("arguments[0].click();", histoApplyChanges);
		//action.click(histoApplyChanges).build().perform();
		if(densityConditionRemoveButton.isEnabled()) {
			System.out.println("Historgram range of density applied successfully");
		} else {
			System.out.println("Historgram range is not applied successfully");
		}
		action.moveToElement(collapseDensityAttr).build().perform();
		action.click(collapseDensityAttr).build().perform();
	}
	
	public void addYieldStrength() {
		//action.click(addCondition).build().perform();
		//filterText.clear();
		filterText.click();
		filterText.sendKeys("Yield Strength");
		action.moveToElement(yieldStrengthCheckbox).build().perform();
		action.click(yieldStrengthCheckbox).build().perform();
		js.executeScript("arguments[0].click();", okButton);
		if(yieldStrengthAdded.isDisplayed()) {
			System.out.println("Yield strength attribute condition added successfully");
		} else {
			System.out.println("Yield strength attribute condition adition failed");
		}
	}
	
	public void clickOnSearchDropDown() {
		action.moveToElement(searchDropDown).build().perform();
		action.click(searchDropDown).build().perform();
	}
	
	public void selectTestDataSearch() {
		action.moveToElement(testDataSearch).build().perform();
		action.click(testDataSearch).build().perform();
	}
	

	public void expandMatType() {
		action.moveToElement(expandMatType).build().perform();
		action.click(expandMatType).build().perform();
		int count = matTypeOptions.size();
		System.out.println("Material type filter options are : " + count);
		//action.moveToElement(metalsMatTypeOption).build().perform();
		//js.executeScript("arguments[0].scrollIntoView(true);", metalsMatTypeOption);
		/*action.click(metalsMatTypeOption).build().perform();
		js.executeScript("arguments[0].click();", applyMatTypeChanges);
		//action.click(applyMatTypeChanges).build().perform();
		String text = matCount.getText();
		System.out.println("Materials displayed after applying filter : " + text);
		Assert.assertEquals(text, "Displayed Rows: 1 - 25 of 1628");
		System.out.println("Material type filter is applied successfully");
		if(text.contains("Displayed Rows: 1 - 25 of 506")) {
			System.out.println("Material type filter is applied successfully");
		} else {
			System.out.println("Material type filter didn't apply successfully");
		}*/
			
	}
	
	public void applyMatTypeFilter() {
		Select select = new Select(selectMaterialType);
		select.selectByIndex(2);
		//action.click(metalsMatTypeOption).build().perform();
	//	js.executeScript("arguments[0].click();", applyMatTypeChanges);
		action.moveToElement(applyMatTypeChanges).build().perform();
		action.click(applyMatTypeChanges).build().perform();
		//String text = matCount.getText();
	//	System.out.println("Materials displayed after applying filter : " + text);
		//Assert.assertEquals(text, "Displayed Rows: 1 - 25 of 1628");
		System.out.println("Material type filter is applied successfully");
		/*if(text.contains("Displayed Rows: 1 - 25 of 506")) {
			System.out.println("Material type filter is applied successfully");
		} else {
			System.out.println("Material type filter didn't apply successfully");
		}*/
			
	}
	public void openCurveProp() {
		action.moveToElement(curvePropSearch).build().perform();
		action.click(curvePropSearch).build().perform();
		//wait.until(ExpectedConditions.visibilityOf(txtCurveBaseProperty));
		wait.until(ExpectedConditions.elementToBeClickable(expandPropDef));
		
	}
	
	public void applyPropDef() {
		//action.moveToElement(expandPropDef).build().perform();
		//action.click(expandPropDef).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", propDefOption);
		action.moveToElement(propDefOption).build().perform();
		action.click(propDefOption).build().perform();
		action.moveToElement(applyMatTypeChanges).build().perform();
		action.click(applyMatTypeChanges).build().perform();
	}
	
	public void expandPropDef() {
		action.moveToElement(expandPropDef).build().perform();
		action.click(expandPropDef).build().perform();
		/*js.executeScript("arguments[0].scrollIntoView(true);", propDefOption);
		action.moveToElement(propDefOption).build().perform();
		action.click(propDefOption).build().perform();
		action.moveToElement(applyMatTypeChanges).build().perform();
		action.click(applyMatTypeChanges).build().perform();*/
	}
	
	public void checkTextResultDisplayCount() {
		Assert.assertEquals(resultDisplayCount.getText(), "Displayed Rows: 1 - 25 of 566");
		System.out.println("Text search result display count is correct as : " + resultDisplayCount.getText());
	}
	
	public void checkNumericalResultDisplayCount() {
		Assert.assertEquals(resultDisplayCount.getText(), "Displayed Rows: 1 - 25 of 84");
		System.out.println("Numerical search result display count is correct as : " + resultDisplayCount.getText());
	}
	
	public void checkCorrectTextDisplayed() {
		int count =  countEle.size();
		System.out.println("Number of materials:" + count);
		for(int i=0; i<5; i++) {
			WebElement clickonEle = countEle.get(i);
			action.moveToElement(clickonEle).build().perform();
			action.doubleClick(clickonEle).build().perform();
			if(driver.getPageSource().contains("Steel")) {
				System.out.println("Searched value is present");
			}
			else {
				System.out.println("Searched value is not present");
			}
			action.moveToElement(backButton).build().perform();
			action.click(backButton).build().perform();
		}
		/*int count = familyColCount.size();
		System.out.println("Family column count displayed as : " + count);
			for(WebElement family : familyColCount) {
					System.out.println(family.getText());
				}*/
	}
	
	public void checkCorrectNumericalDisplayed() {
		int count =  countEle.size();
		System.out.println("Number of materials:" + count);
		for(int i=0; i<5; i++) {
			WebElement clickonEle = countEle.get(i);
			action.moveToElement(clickonEle).build().perform();
			action.doubleClick(clickonEle).build().perform();
			if(driver.getPageSource().contains("7075")) {
				System.out.println("Searched value is present");
			}
			else {
				System.out.println("Searched value is not present");
			}
			action.click(backButton).build().perform();
		}
	}
	
	public void verifySimilarSearchResult() {
		
		Assert.assertEquals(commonNameValueMOD.getText(), "D-6A Alloy Steel");
		System.out.println("Similar search result is displayed correctly as Common name displayed is : " + commonNameValueMOD.getText());
	}
	
	public void verifyTextSearchResult() {
		checkTextResultDisplayCount();
		//checkCorrectTextDisplayed();
	}
	
	public void verifyNumericalSearchResult() {
		checkNumericalResultDisplayCount();
		//checkCorrectNumericalDisplayed();
	}

}
