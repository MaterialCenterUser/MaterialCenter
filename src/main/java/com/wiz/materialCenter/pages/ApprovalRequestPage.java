package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class ApprovalRequestPage extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));

	public ApprovalRequestPage() {
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
}
