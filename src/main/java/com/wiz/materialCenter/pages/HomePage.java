package com.wiz.materialCenter.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.wiz.materialCenter.util.TestBase;

public class HomePage extends TestBase {

	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Ok']")
	// @FindBy(xpath =
	// "//input[@id='materialsDisclaimerDlgOnLogin-f:MaterialsDisclaimerWidgeta:okBtn']")

	// @FindBy(xpath =
	// "//input[@id='materialsDisclaimerDlgOnLogin-f:MaterialsDisclaimerWidgeta:okBtn']")
	WebElement okButtonDisclaimer;

	@FindBy(xpath = "//img[@src='/MaterialCenter/themes/Default/images/close.gif']")
	WebElement closeButtonDisclaimer;

	@FindBy(xpath = "//img[@title='Home Workspace']")
	WebElement dashboardPage;

	@FindBy(xpath = "//img[@class='GlobalBCEnable']")
	WebElement backButton;

	@FindBy(xpath = "(//img[@class='GlobalBCEnable'])[2]")
	WebElement forwardButton;

	/* Workspace tabs */

	@FindBy(xpath = "//table[@title='My Workspace']")
	WebElement myWorkspace;

	@FindBy(xpath = "//table[@title='Navigate']")
	WebElement navigate;

	@FindBy(xpath = "//table[@title='Configuration']")
	WebElement config;

	@FindBy(xpath = "//table[@title='Administration']")
	WebElement administration;

	@FindBy(xpath = "//table[@title='Search']")
	WebElement search;

	@FindBy(xpath = "//span[text()='Clipboard' and contains(@id,'HomeWorkspace')]")
	WebElement clipboardText;

	@FindBy(xpath = "//span[text()='Libraries' and contains(@id,'HomeWorkspace')]")
	WebElement librariesText;

	@FindBy(xpath = "//span[text()='Search Templates' and contains(@id,'HomeWorkspace')]")
	WebElement searchTempText;

	@FindBy(xpath = "//span[text()='Materials Data Owner']")
	WebElement configConfirm;

	@FindBy(xpath = "//span[text()='+']")
	WebElement addNewDashboard;

	@FindBy(xpath = "//button[text()='New Dashboard']")
	WebElement newDashboardButton;

	@FindBy(xpath = "//input[@type='text' and @id='label']")
	WebElement labelText;

	@FindBy(xpath = "//span[text()='Ok']")
	WebElement okButton;

	@FindBy(xpath = "(//td[@cmenu='tmenu'])[2]")
	WebElement newAddedDashboard;

	@FindBy(xpath = "(//a[text()=' Edit'])[1]")
	WebElement editDashboard;

	@FindBy(xpath = "//input[@value='Add']")
	WebElement addCol;

	@FindBy(xpath = "//select[contains(@id,'GadgetInput')]")
	WebElement gadgetDropdown;

	@FindBy(xpath = "//select[contains(@id,'GadgetInput')]/option[text()='My Info']")
	WebElement myInfoGadget;

	@FindBy(xpath = "(//input[@value='Submit'])[2]")
	WebElement configSubmitButton;

	@FindBy(xpath = "//span[text()='Folders']")
	WebElement folders;

	@FindBy(xpath = "//span[text()='My Info']")
	WebElement myInfo;

	@FindBy(xpath = "//span[@id='smfooter']")
	WebElement unitSystemFooter;

	@FindBy(xpath = "(//a[text()='US-CUSTOMARY'])[1]")
	WebElement usCustomary;

	@FindBy(xpath = "//tr[@smrow='0']/td/a[text()='Search for Steels by Density']")
	WebElement savedSearchTemplate;

	/* Processes tabs */

	@FindBy(xpath = "(//div[@class='SMObjectsLink']/a[text()='View All'])[5]")
	WebElement processViewAll;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement setReleaseProcess;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement demoteProcess;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement caeProcess;
	@FindBy(xpath = "(//a[text()='Subscribe for Revision Change Notification'])[1]")
	WebElement SubscribeForRevisionProcess;

	@FindBy(xpath = "(//a[text()='Unsubscribe for Revision Change Notification'])[1]")
	WebElement UnsubscribeForRevisionProcess;

	// @FindBy(xpath = "//img[@id='f:w:wm:wm_db']")
	// WebElement caeProcess;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']/td/a[text()='CAE Model (Auto)']")
	WebElement caeProcessHome;

	@FindBy(xpath = "//tr[@smrow='0']/td/a[text()='Discard']")
	WebElement discardProcess;

	@FindBy(xpath = "//img[@src='/MaterialCenter/themes/Default/images/close.gif']")
	WebElement closeButton;
	@FindBy(xpath = "//select[@id='HomeWorkspace__HP_undefined_HomepageEditDialog-f:HomeWorkspace__HP_undefined_ConfigEditor_GadgetInput']")
	WebElement cofigDashboardGadgetselect;

	@FindBy(xpath = "//img[@title='Home Workspace']")
	WebElement backToHome;

	@FindBy(xpath = "//a[text()='Administration']")
	WebElement AdministrationLinkFromHomePage;

	@FindBy(xpath = "//span[text()='Subscribed Materials']/following::td[contains(text(),'No records found')]")
	WebElement SubscribedMaterialsEmpty;

	@FindBy(xpath = "//span[text()='Subscribed Materials']/following::a[text()='View All']")
	WebElement SubscribedMaterialsViewAll;
	
	@FindBy(xpath = "(//span[text()='Clipboard']/following::a[text()='View All'])[4]")
	WebElement ClipBoardViewAll;

	// @FindBy(xpath = "//span[text()='Log Off']")
	@FindBy(xpath = "//a[@id='j_id_24']")
	WebElement logoffLink;

	@FindBy(xpath = "//span[text()='OK']")
	WebElement logoffOkButton;

	@FindBy(xpath = "//span[@class='ui-dialog-title']")
	WebElement logOffDialog;

	@FindBy(xpath = "//table[@id='searchMenuDiv']")
	WebElement searchMenu;

	@FindBy(xpath = "//a[text()='Test']")
	WebElement testOptionsearchMenu;

	@FindBy(xpath = "(//a[text()='Materials' and @img='MatMaterial' ])[1]")
	WebElement materialsOptionsearchMenu;
	
	@FindBy(xpath = "//a[text()='CAE Model']")
	WebElement caeModelSearch;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement easySearch;

	@FindBy(xpath = "//td/img[@id='search']")
	WebElement searchButton;
	
	@FindBy(xpath = "//a[text()='My Workspace']")
	WebElement linkMyWorkSpace;
	
	
	public boolean verifyHomePageDisplayed(){
		return (linkMyWorkSpace.isDisplayed());
	}

	public void selectTestFromSearchMenu() {

		action.moveToElement(searchMenu).build().perform();
		action.click(searchMenu).build().perform();
		// js.executeScript("arguments[0].click();", testOptionsearchMenu);
		action.moveToElement(testOptionsearchMenu).build().perform();
		action.click(testOptionsearchMenu).build().perform();
	}
	
	public void selectMaterialsFromSearchMenu() {

		action.moveToElement(searchMenu).build().perform();
		action.click(searchMenu).build().perform();
		// js.executeScript("arguments[0].click();", testOptionsearchMenu);
		action.moveToElement(materialsOptionsearchMenu).build().perform();
		action.click(materialsOptionsearchMenu).build().perform();
	}


	public void selectCAEModelSearch() {

		action.moveToElement(searchMenu).build().perform();
		action.click(searchMenu).build().perform();
		// js.executeScript("arguments[0].click();", testOptionsearchMenu);
		action.moveToElement(caeModelSearch).build().perform();
		action.click(caeModelSearch).build().perform();
	}

	public SearchPage clickOnSearchButton() {
		// js.executeScript("arguments[0].click();", searchButton);
		action.moveToElement(searchButton).build().perform();
		action.click(searchButton).build().perform();
		return new SearchPage();
	}

	public void enterTextForSearch(String textToSearch) {
		easySearch.sendKeys(textToSearch);
		// wait.until(ExpectedConditions.textToBePresentInElement(easySearch,
		// textToSearch));
	}

	public void logOffOption() {

		// action.moveToElement(logoffLink).build().perform();
		// action.click(logoffLink).build().perform();
		js.executeScript("arguments[0].click();", logoffLink);
		wait.until(ExpectedConditions.visibilityOf(logOffDialog));
		// js.executeScript("arguments[0].click();", logoffOkButton);
		// action.moveToElement(logoffOkButton).build().perform();
		// action.click(logoffOkButton).build().perform();
		// driver.switchTo().alert().accept();
	}

	public LoginPage logOffOkButton() {

		js.executeScript("arguments[0].click();", logoffOkButton);
		// action.moveToElement(logoffOkButton).build().perform();
		// action.click(logoffOkButton).build().perform();
		// driver.switchTo().alert().accept();
		return new LoginPage();
	}

	public MyWorkspacePage clickOnViewAllUnderSubscribedMaterials() {

		/*
		 * action.moveToElement(SubscribedMaterialsViewAll).build().perform();
		 * action.click(SubscribedMaterialsViewAll).build().perform();
		 */
		js.executeScript("arguments[0].click();", SubscribedMaterialsViewAll);
		return new MyWorkspacePage();
	}
	
	
	public MyWorkspacePage clickOnViewAllUnderClipBoard() {

		/*
		 * action.moveToElement(SubscribedMaterialsViewAll).build().perform();
		 * action.click(SubscribedMaterialsViewAll).build().perform();
		 */
		js.executeScript("arguments[0].click();", ClipBoardViewAll);
		return new MyWorkspacePage();
	}

	public boolean verifyEmptySubscribedMaterials() {

		return ((SubscribedMaterialsEmpty).isDisplayed());
	}

	public void closeDisclaimer() {

		action.moveToElement(closeButton).build().perform();
		action.click(closeButton).build().perform();
	}

	public void clickOnMyWorkspace() {
		action.moveToElement(myWorkspace).build().perform();
		myWorkspace.click();
	}

	public void clickOnBackButton() {
		js.executeScript("arguments[0].click();", backButton);
		// action.click(backButton).build().perform();
	}

	public NavigateWS clickOnNavigate() {
		action.moveToElement(navigate).build().perform();
		action.click(navigate).build().perform();
		return new NavigateWS();
	}

	public SearchPage clickOnSearch() {
		action.moveToElement(search).build().perform();
		action.click(search).build().perform();
		// search.click();
		return new SearchPage();
	}

	public void clickOnConfiguration() {
		action.moveToElement(config).build().perform();
		action.click(config).build().perform();
		// config.click();
		/*
		 * if(configConfirm.isDisplayed()) {
		 * System.out.println("User is on Configuration page"); } else {
		 * System.out.println("User didn't reach Configuration page"); }
		 */
	}

	public AdministrationPage clickOnAdministration() {
		action.moveToElement(AdministrationLinkFromHomePage).build().perform();
		action.click(AdministrationLinkFromHomePage).build().perform();
		return new AdministrationPage();
	}

	public void clickOnDashboard() throws InterruptedException {
		// Thread.sleep(1000);
		// wait.until(ExpectedConditions.elementToBeClickable(dashboardPage));
		// action.moveToElement(dashboardPage).build().perform();
		// action.click(dashboardPage).build().perform();
		// dashboardPage.click();
		js.executeScript("arguments[0].click();", dashboardPage);
	}

	public void clickOnCaeProcessHome() {
		action.click(caeProcessHome).build().perform();
	}

	public void clickOnSubscribeForRevisionProcess() {

		wait.until(ExpectedConditions.elementToBeClickable(SubscribeForRevisionProcess));
		action.moveToElement(SubscribeForRevisionProcess).build().perform();
		action.click(SubscribeForRevisionProcess).build().perform();

	}

	public void clickOnUnsubscribeForRevisionProcess() {
		wait.until(ExpectedConditions.elementToBeClickable(UnsubscribeForRevisionProcess));
		action.moveToElement(UnsubscribeForRevisionProcess).build().perform();
		action.click(UnsubscribeForRevisionProcess).build().perform();

	}

	public void clickOnCaeProcess() {

		// js.executeScript("arguments[0].click();", caeProcess);
		wait.until(ExpectedConditions.elementToBeClickable(caeProcess));
		action.moveToElement(caeProcess).build().perform();
		action.doubleClick(caeProcess).build().perform();
		// action.moveToElement(caeProcess).build().perform();
		// action.click(caeProcess).build().perform();
		// action.doubleClick(caeProcess).build().perform();
	}

	public MyWorkspacePage clickOnProcessViewAll() throws InterruptedException {
		action.moveToElement(processViewAll).build().perform();
		action.click(processViewAll).build().perform();
		// Thread.sleep(100);
		// wait.until(ExpectedConditions.elementToBeClickable(caeProcess));
		return new MyWorkspacePage();
	}

	public void clickOnPromoteProcess() {
		action.doubleClick(setReleaseProcess).build().perform();
	}

	public void clickOnDemoteProcess() {
		action.moveToElement(demoteProcess).doubleClick(demoteProcess).build().perform();
	}

	public void verifyDiscard() {
		if (discardProcess.isDisplayed()) {
			System.out.println("CAE discard process is done successfully");
		} else {
			System.out.println("CAE discard process is not done successfully");
		}
	}

	public void verifyClipboard() {
		if (clipboardText.isDisplayed()) {
			System.out.println("User is on HomePage and clipboard section is present");
		} else {
			System.out.println("User didn't reach HomePage");
		}
	}

	public void verifyLibraries() {
		if (librariesText.isDisplayed()) {
			System.out.println("User is on HomePage and libraries section is present");
		} else {
			System.out.println("User didn't reach HomePage");
		}
	}

	public void verifySearchTemplates() {
		if (searchTempText.isDisplayed()) {
			System.out.println("User is on HomePage and search templates section is present");
		} else {
			System.out.println("User didn't reach HomePage");
		}
	}

	public void addNewDashboard() {
		js.executeScript("arguments[0].click();", addNewDashboard);
		js.executeScript("arguments[0].click();", newDashboardButton);
		labelText.click();
		labelText.clear();
		labelText.sendKeys(RandomStringUtils.randomAlphabetic(10));
		js.executeScript("arguments[0].click();", okButton);
	}

	public void editDashboard() {
		action.moveToElement(newAddedDashboard).build().perform();
		action.contextClick(newAddedDashboard).build().perform();
		action.moveToElement(editDashboard).build().perform();
		action.click(editDashboard).build().perform();
		/*
		 * //js.executeScript("arguments[0].click();", editDashboard);
		 * js.executeScript("arguments[0].click();", addCol);
		 * action.click(gadgetDropdown).build().perform();
		 * action.click(myInfoGadget).build().perform();
		 * js.executeScript("arguments[0].click();", addCol);
		 * action.click(configSubmitButton).build().perform();
		 */
	}

	public void navigateBacktoHome() {
		js.executeScript("arguments[0].scrollIntoView(true);", backToHome);
		action.moveToElement(backToHome).build().perform();
		action.click(backToHome).build().perform();
	}

	public void configDashboard() {
		/*
		 * action.moveToElement(newAddedDashboard).build().perform();
		 * action.contextClick(newAddedDashboard).build().perform();
		 * action.moveToElement(editDashboard).build().perform();
		 * action.click(editDashboard).build().perform();
		 */
		// js.executeScript("arguments[0].click();", editDashboard);
		// js.executeScript("arguments[0].click();", addCol);
		// action.moveToElement(addCol).build().perform();
		// action.click(addCol).build().perform();
		// Select select = new Select(cofigDashboardGadgetselect);
		// select.selectByValue("ObjectList");
		// action.click(gadgetDropdown).build().perform();
		// action.click(myInfoGadget).build().perform();
		// js.executeScript("arguments[0].click();", addCol);
		action.moveToElement(addCol).build().perform();
		action.click(addCol).build().perform();
		action.moveToElement(configSubmitButton).build().perform();
		action.click(configSubmitButton).build().perform();
	}

	public void verifyFolders() {
		if (folders.isDisplayed()) {
			System.out.println("Folders gadget is added successfully");
		} else {
			System.out.println("Folders gadget didn't add successfully");
		}
	}

	public void verifyMyInfo() {
		if (myInfo.isDisplayed()) {
			System.out.println("My Info gadget is added successfully");
		} else {
			System.out.println("My Info gadget didn't add successfully");
		}
	}

	public void changeUnitSystem() {
		js.executeScript("arguments[0].click();", unitSystemFooter);
		action.click(usCustomary).build().perform();
		driver.switchTo().alert().accept();
	}

	public void verifySavedSearchTemplate() {
		wait.until(ExpectedConditions.visibilityOf(savedSearchTemplate));
		String text = savedSearchTemplate.getText();
		if (text.contains("Search for Steels by Density")) {
			System.out.println("Saved search template is displayed under Search templates");
		} else {
			System.out.println("Saved search template is not displayed under Search templates");
		}
	}

}
