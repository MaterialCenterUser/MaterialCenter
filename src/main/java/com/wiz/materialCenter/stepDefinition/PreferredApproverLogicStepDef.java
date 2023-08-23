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

public class PreferredApproverLogicStepDef extends TestBase {

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
	
	@When("click on security action from workspace page")
	public void click_on_security_action() {
	  //  matSod = new MaterialSOD();
		workSpacePage.clickOnSecurity();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("select promote option from security menu on SOD")
	public void select_promote_option_from_security_menu_on_SOD() {
		workSpacePage.clickOnPromoteAction();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on create material option from create menu on SOD")
	public void click_on_create_material_option_from_create_menu_on_SOD() {
		matSod.clickOnCreateMaterialSOD();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on submit button to create material on SOD page")
	public void click_on_submit_button_to_create_material() throws InterruptedException {
		matSod.clickOnSubmitToCreateMat();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on all right button on preferred approvers page")
	public void click_on_all_right_button_on_preferred_approvers_page() {
		matSod.clickOnAllRightButtonOnPreferredApprover();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on apply button on preferred approver page")
	public void click_on_apply_button_on_preferred_approver_page() {
		matSod.clickOnApplyButtonOnPreferredApprover();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on ok button on preferred approver page")
	public void click_on_ok_button_on_preferred_approver_page() {
		matSod.clickOnpreferredApproverOkButton();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on pending approval requests link")
	public void click_on_pending_approval_requests_link() {
		configPage.clickOnPendingApprovalRequestsLink();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("p legend is displayed on step1 on approver request details page")
	public void p_legend_is_displayed_on_step1_on_approver_request_details_page() {
		Assert.assertTrue(workSpacePage.pLegendOnStep1OnApprovalRequestDetailsPage());
		screenshot(driver, System.currentTimeMillis());
	}
	 
	@Then("pending approval request is displayed on MOD")
	public void pending_approval_request_is_displayed_on_MOD() {
		Assert.assertTrue(configPage.pendingAppRequestIsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("error message displayed for min opt app as {string}")
	public void error_message_displayed_for_click_add_delegate_as (String expErrorMessage) {
		String actualErrorMessage = matSod.errForMinOptApprovers();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("double click on first approval request")
	public void double_click_on_first_app_request() {
		configPage.doubleClickOnFirstMat();
		screenshot(driver, System.currentTimeMillis());
	}
}
