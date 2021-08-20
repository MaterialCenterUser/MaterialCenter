package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class ManageLayupPage extends TestBase {


	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);

	public ManageLayupPage() {
		PageFactory.initElements(driver, this);
	}
	
	/* Xpaths manageLayup page */

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
	
	@FindBy(xpath = "//span[text()='Manage Layup']")
	WebElement textManageLayup;
	
	public boolean manageLayupPageDisplayed() {

		return (textManageLayup.isDisplayed());
	}
	
}



