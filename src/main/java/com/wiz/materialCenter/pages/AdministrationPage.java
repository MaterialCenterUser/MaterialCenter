package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class AdministrationPage extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));
	EditMatProcess editMat = new EditMatProcess();

	public AdministrationPage() {
		PageFactory.initElements(driver, this);
	}

	/* Xpaths under Materials Administration tab */

	@FindBy(xpath = "//a[text()='Users']")
	WebElement usersLink;

	@FindBy(xpath = "//td[text()='User']")
	WebElement textUser;

	@FindBy(xpath = "//a[text()='Create User']")
	WebElement createUserLink;

	@FindBy(xpath = "//a[text()='Edit User']")
	WebElement editUserLink;

	@FindBy(xpath = "//span[text()='User']")
	WebElement textUserDialog;


	@FindBy(xpath = "//input[@id='actionDialog-f:CreateUserSimActivity:userName']")
	WebElement userNameTextBox;

	@FindBy(xpath = "//input[@id='actionDialog-f:CreateUserSimActivity:FirstNameValue']")
	WebElement firstNameTextBox;

	@FindBy(xpath = "//input[@id='actionDialog-f:CreateUserSimActivity:LastNameValue']")
	WebElement lastNameTextBox;

	@FindBy(xpath = "//input[@id='actionDialog-f:CreateUserSimActivity:EmailValue']")
	WebElement emailTextBox;

	@FindBy(xpath = "//input[@id='actionDialog-f:CreateUserSimActivity:DepartmentValue']")
	WebElement departmentTextBox;

	@FindBy(xpath = "//input[@id='actionDialog-f:CreateUserSimActivity:DesignationValue']")
	WebElement designationTextBox;

	@FindBy(xpath = "//select[@id='actionDialog-f:CreateUserSimActivity:profile']")
	WebElement defaultUserProfileDropdown;

	@FindBy(xpath = "//textarea[@id='actionDialog-f:CreateUserSimActivity:description']")
	WebElement descriptionTextBox;

	@FindBy(xpath = "//select[@id='actionDialog-f:CreateUserSimActivity:rolesWidget']")
	WebElement systemRoleDropdown;

	@FindBy(xpath = "//select[@id='actionDialog-f:CreateUserSimActivity:licenseType']")
	WebElement licenseTypeDropdown;

	@FindBy(xpath = "//input[@id='actionDialog-f:CreateUserSimActivity:okBtn']")
	WebElement createUserSubmitButton;
	
	@FindBy(xpath = "//span[@class='rf-msg-det']")
	WebElement errorMessageToCreateUser;
	
	@FindBy(xpath = "//th[text()='User Name']")
	WebElement userNameCol;
	
	@FindBy(xpath = "//td[@class='voice']/a[text()='Filter']")
	WebElement filterOption;
	
	@FindBy(xpath = "//a[contains(text(),'abcd')]")
	WebElement createdUserInList;
	
	@FindBy(xpath = "//input[@id='abcd patil']")
	WebElement newUserFilterCheckBox;
	
	@FindBy(xpath = "//span[text()='OK']")
	WebElement okButton2;
	
	@FindBy(xpath = "//tr[@class='ModBodyRowEven ModClick']")
	WebElement filterResultsOneRow;
	
	public boolean verifyFilterResultsDisplayedOneRow(){
		return ((filterResultsOneRow).isDisplayed());
	}
	
	
	public boolean verifyNewUserFilterResult(){
		return ((createdUserInList).isDisplayed());
	}
	
	
	public void clickNewUserFilterCheckbox() throws InterruptedException {
		js.executeScript("arguments[0].click();", newUserFilterCheckBox);
		action.moveToElement(okButton2).click(okButton2).build().perform();
		Thread.sleep(2000);
	}

	
	
	public boolean verifyNewUserDisplayedInList(){
		return ((createdUserInList).isDisplayed());
	}
	
	public void selectUserNameFilter() {
		js.executeScript("arguments[0].click();", userNameCol);
		action.click(filterOption).build().perform();
	}


	public void clickOnUsersLink() {
		js.executeScript("arguments[0].click();", usersLink);
		wait.until(ExpectedConditions.visibilityOf(textUser));
	}

	public void clickOnCreateUserLink() {
		js.executeScript("arguments[0].click();", createUserLink);
		wait.until(ExpectedConditions.visibilityOf(textUserDialog));
	}

	public void selectRootProfile() {

		Select select = new Select(defaultUserProfileDropdown);
		select.selectByValue("RootUserProfile");
	}

	public void selectLicenseType() {

		Select select = new Select(licenseTypeDropdown);
		select.selectByValue("Full");
	}
	
	public void enterUserName(String uname){
		action.moveToElement(userNameTextBox).click(userNameTextBox).sendKeys(uname).build().perform();
	}
	
	public void enterFirstName(String fname){
		action.moveToElement(firstNameTextBox).click(firstNameTextBox).sendKeys(fname).build().perform();
	}

	public void enterLastName(String lname){
		action.moveToElement(lastNameTextBox).click(lastNameTextBox).sendKeys(lname).build().perform();
	}
	
	public void enterEmail(String email){
		action.moveToElement(emailTextBox).click(emailTextBox).sendKeys(email).build().perform();
	}
	public void enterDept(String dept){
		action.moveToElement(departmentTextBox).click(departmentTextBox).sendKeys(dept).build().perform();
	}
	public void enterDesgn(String desg){
		action.moveToElement(designationTextBox).click(designationTextBox).sendKeys(desg).build().perform();
	}
	/*public void createUser(String fname, String lname, String email, String dept,
			String desg) {
		//action.moveToElement(userNameTextBox).click(userNameTextBox).sendKeys(uname).build().perform();
		//action.moveToElement(descriptionTextBox).click(descriptionTextBox).sendKeys(desc).build().perform();
		//action.moveToElement(firstNameTextBox).click(firstNameTextBox).sendKeys(fname).build().perform();
		//action.moveToElement(lastNameTextBox).click(lastNameTextBox).sendKeys(lname).build().perform();
		//action.moveToElement(emailTextBox).click(emailTextBox).sendKeys(email).build().perform();
		action.moveToElement(departmentTextBox).click(departmentTextBox).sendKeys(dept).build().perform();
		action.moveToElement(designationTextBox).click(designationTextBox).sendKeys(desg).build().perform();
		//String desc
		//selectRootProfile();
		//selectLicenseType();
		Select s1 = new Select(defaultUserProfileDropdown);
		s1.selectByVisibleText(selectUserProfile);
		Select s2 = new Select(licenseTypeDropdown);
		s2.selectByVisibleText(selectLicenseType);
		userNameTextBox.sendKeys(uname);
		descriptionTextBox.sendKeys(desc);
		firstNameTextBox.sendKeys(fname);
		lastNameTextBox.sendKeys(lname);
		emailTextBox.sendKeys(email);
		departmentTextBox.sendKeys(dept);
		designationTextBox.sendKeys(desg);
		// createUserSubmitButton.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", createUserSubmitButton);
		
	}*/
	
	public MyWorkspacePage clickSubmitToCreateNewUser(){
		action.moveToElement(createUserSubmitButton).build().perform();
		action.click(createUserSubmitButton).build().perform();
		return new MyWorkspacePage();
	}
	public String verifyErrorMessageToCreateNewUser(){
		
		return (errorMessageToCreateUser.getText());
	}
}
