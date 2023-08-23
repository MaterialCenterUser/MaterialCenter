package com.wiz.materialCenter.stepDefinition;

import org.junit.Assert;

import com.wiz.materialCenter.pages.CAEProcessInput;
import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.EditMatProcess;
import com.wiz.materialCenter.pages.EditTestDataPage;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.pages.SecurityProcess;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class DelegateApproversStepDef extends TestBase {

	HomePage homePage = new HomePage();
	NavigateWS navigate = new NavigateWS();
	MaterialSOD matSod = new MaterialSOD();
	MaterialMOD matMod = new MaterialMOD();
	CAEProcessInput caeProccessInput = new CAEProcessInput();
	ProcessesPage processessPage = new ProcessesPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	ConfigurationWS configPage = new ConfigurationWS();
	SearchPage searchPage = new SearchPage();
	EditMatProcess editMat = new EditMatProcess();
	EditTestDataPage editTestData = new EditTestDataPage();
	SecurityProcess secPrcoess = new SecurityProcess();
	CAEProcessInput caeProcess = new CAEProcessInput();
	
	
	
	@Then("error message displayed for click add delegate as {string}")
	public void error_message_displayed_for_click_add_delegate_as (String expErrorMessage) {
		String actualErrorMessage = searchPage.errToaddDelegateAlreadyFilled();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select delegate approver process")
	public void select_delegate_approver_process() {
		homePage.clickOnDelegateApproverProcessHome();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("navigate to homepage")
	public void navigate_to_homepage() throws InterruptedException {
		//homePage = new HomePage();
		searchPage.clickOnDashboard();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on submit button to delegate the user")
	public void click_on_submit_button_to_delegate_the_user() {
		searchPage.clickDelegateApproverSubmitButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	@And("click on add delegate button")
	public void click_on_add_delegate_button() {
		searchPage.clickAddDelegateButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on revoke button")
	public void click_on_revoke_button() {
		searchPage.clickRevokeButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on revoke delegate button")
	public void click_on_revoke_delegate_button() {
		searchPage.clickrevokeDelegateButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("enter the change reason")
	public void enter_the_change_reason() {
		searchPage.enterChangeReson();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on delegate end date and select thirty date from datepicker")
	public void click_on_delegate_end_date_and_select_thirty_date_from_datepicker() {
		searchPage.selectEndDateFromDatePicker();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on delegate dropdown and select adrian admin user")
	public void click_on_delegate_dropdown_and_select_adrian_admin_user() {
		searchPage.clickDelegateDropdownSelectApprover();
	    screenshot(driver, System.currentTimeMillis());
	}
	@And("click on delegate dropdown and select molly manager user")
	public void click_on_delegate_dropdown_and_select_molly_manager_user() {
		searchPage.clickDelegateDropdownSelectApproverMollyManager();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("select delegate approvar from action menu")
	public void select_delegate_approvar_from_action_menu() {
		searchPage.selectDelegateApproverFromAction();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("right click on first approval request")
	public void right_click_on_first_approval_request() {
		searchPage.rightClickOnApprovalReq();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("user clicks on Approval Request option")
	public void user_clicks_on_ApprovalRequest_option() {
		searchPage.clickOnApprovalReqOpt();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("enter urgency threshold days")
	public void enter_urgency_threshold_days() {
		configPage.enterUrgencyThresholdDays();
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("right click on approver request from approver requests section")
	public void right_click_on_approver_request_from_approver_requests_section() {
		homePage.rightClickOnApprovalRequestsFromApprovalReSection();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("delegate approver option is displayed")
	public void delegate_approver_option_is_displayed() {
		Assert.assertTrue(homePage.verifyDelegateApproverOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("revoke button is displayed on delegate approver")
	public void revoke_button_is_displayed() {
		Assert.assertTrue(searchPage.verifyRevokeButtonIsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("scratch line is displayed on added delegate")
	public void scratch_line_is_displayed_on_added_delegate() {
		Assert.assertTrue(searchPage.verifyScratchRevokeButtonIsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("delegate approver process is done successfully")
	public void delegate_aaprover_process_is_done_successfully() {
		processessPage.verifyDoneStatus();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("select button is disabled against appover select drodown")
	public void select_button_is_disabled_against_appover_select_drodown() {
		searchPage.selectButtonAgainstApproverIsDisabled();
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("clear button is disabled against appover select drodown")
	public void clear_button_is_disabled_against_appover_select_drodown() {
		searchPage.clearButtonAgainstApproverIsDisabled();
		screenshot(driver, System.currentTimeMillis());
	}

}
