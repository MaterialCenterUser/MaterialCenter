package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.AdministrationPage;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import org.junit.Assert;

public class WatchFeatureStepDef extends TestBase {

	MaterialMOD matMod = new MaterialMOD();
	MaterialSOD matSod = new MaterialSOD();
	HomePage homepage = new HomePage();
	ProcessesPage processesPage = new ProcessesPage();
	AdministrationPage adminPage = new AdministrationPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	SearchPage searchPage = new SearchPage();

	@And("click on Actions")
	public void click_on_Actions() {
		matMod.clickActions();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("user gets Subscribe action")
	public void user_gets_Subscribe_action() {
		Assert.assertTrue(matMod.verifySubscribeAction());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("user gets Unsubscribe action")
	public void user_gets_Unsubscribe_action() {
		Assert.assertTrue(matMod.verifyUnsubscribeAction());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("subscribe button is available on material details page")
	public void subscribe_button_is_available_on_material_details_page() {
		Assert.assertTrue(matSod.verifySubscribeButton());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on subscribe action")
	public void click_on_subscribe_action() throws InterruptedException {
		matMod.clickSubscribeAction();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on unsubscribe action")
	public void click_on_unsubscribe_action() throws InterruptedException {
		matMod.clickUnsubscribeAction();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on subscribe for revision change notification link under processes")
	public void click_on_subscribe_for_revision_change_notification_link_under_processes() {
		homepage.clickOnSubscribeForRevisionProcess();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on unsubscribe for revision change notification link under processes")
	public void click_on_unsubscribe_for_revision_change_notification_link_under_processes() {
		homepage.clickOnUnsubscribeForRevisionProcess();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("user gets subscribe for revision change notification process status as done")
	public void user_gets_subscribe_for_revision_change_notification_process_status_as_done() {
		Assert.assertTrue(processesPage.verifyTextSubscribeForRevisionProcess());
		Assert.assertTrue(processesPage.verifyDoneStatusOnProcess());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("user gets unsubscribe for revision change notification process status as done")
	public void user_gets_unsubscribe_for_revision_change_notification_process_status_as_done() {
		Assert.assertTrue(processesPage.verifyTextUnsubscribeForRevisionProcess());
		Assert.assertTrue(processesPage.verifyDoneStatusOnProcess());
		screenshot(driver, System.currentTimeMillis());
	}

	@When("user clicks on administration link")
	public void user_clicks_on_administration_link() {
		homepage.clickOnAdministration();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on Users link")
	public void click_on_Users_link() {
		adminPage.clickOnUsersLink();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on Create User")
	public void click_on_Create_User() {
		adminPage.clickOnCreateUserLink();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("^enter username as ([^\"]*)$")
	public void enter_username(String username) {
		/*
		 * List<Map<String, String>> userNameList = userNameTable.asMaps();
		 * String UserName = userNameList.get(0).get("UserName");
		 */
		adminPage.enterUserName(username);
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select rootuserprofile")
	public void select_rootuserprofile() {
		adminPage.selectRootProfile();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select licensetype")
	public void select_licensetype() {
		adminPage.selectLicenseType();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("^enter firstname ([^\"]*)$")
	public void enter_firstname(String FirstName) {
		/*
		 * List<Map<String, String>> firstNameList = firstNameTable.asMaps();
		 * String FirstName = firstNameList.get(0).get("FirstName");
		 */
		adminPage.enterFirstName(FirstName);
		screenshot(driver, System.currentTimeMillis());
	}

	@And("^enter lastname ([^\"]*)$")
	public void enter_lastname(String LastName) {
		/*
		 * List<Map<String, String>> LastNameList = LastNameTable.asMaps();
		 * String LastName = LastNameList.get(0).get("LastName");
		 */
		adminPage.enterLastName(LastName);
		screenshot(driver, System.currentTimeMillis());
	}

	@And("^enter email ([^\"]*)$")
	public void enter_email(String Email) {
		/*
		 * List<Map<String, String>> emailList = emailTable.asMaps(); String
		 * Email = emailList.get(0).get("Email");
		 */
		adminPage.enterEmail(Email);
		screenshot(driver, System.currentTimeMillis());
	}

	@And("^enter department ([^\"]*)$")
	public void enter_department(String Department) {
		/*
		 * List<Map<String, String>> deptList = deptTable.asMaps(); String
		 * Department = deptList.get(0).get("Department");
		 */
		adminPage.enterDept(Department);
		screenshot(driver, System.currentTimeMillis());
	}

	@And("^enter designation ([^\"]*)$")
	public void enter_designation(String Designation) {
		/*
		 * List<Map<String, String>> desgnList = desgnTable.asMaps(); String
		 * Designation = desgnList.get(0).get("Designation");
		 */
		adminPage.enterDesgn(Designation);
		screenshot(driver, System.currentTimeMillis());
	}

	/*
	 * @And("enter all the user details to create new user") public void
	 * enter_all_the_user_details_to_create_new_user(DataTable userTable) {
	 * List<Map<String, String>> userList = userTable.asMaps(); //String
	 * UserName = userList.get(0).get("UserName"); //String UserProfile =
	 * userList.get(0).get("UserProfile"); //String LicenseType =
	 * userList.get(0).get("LicenseType"); //String Description =
	 * userList.get(0).get("Description"); String FirstName =
	 * userList.get(0).get("FirstName"); String LastName =
	 * userList.get(0).get("LastName"); String Email =
	 * userList.get(0).get("Email"); String Department =
	 * userList.get(0).get("Department"); String Designation =
	 * userList.get(0).get("Designation"); //adminPage.createUser(Description,
	 * FirstName, LastName, Email, Department, Designation);
	 * adminPage.createUser(FirstName, LastName, Email, Department,
	 * Designation); screenshot(driver, System.currentTimeMillis()); }
	 */

	@And("click on submit button to create new user")
	public void click_on_submit_button_to_create_new_user() {
		adminPage.clickSubmitToCreateNewUser();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("^new user is created with valid email address ([^\"]*)$")
	public void new_user_is_created_with_valid_email_address(String expEmailID) {
		String actualEmailID = workSpacePage.verifyEmailID();
		// Assert.assertEquals(message, expecteds, actuals);
		Assert.assertEquals(expEmailID, actualEmailID);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("username displays on myworkspacepage")
	public void username_displays_on_myworkspacepage() {
		Assert.assertTrue(workSpacePage.verifyUserCreated());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("Error message is displayed for existing user {string}")
	public void Error_message_is_displayed_for_existing_user(String expErrorMessage) {
		String actualErrorMessage = adminPage.verifyErrorMessageToCreateNewUser();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on subscribe button")
	public void click_on_subscribe_button() throws InterruptedException {
		matSod.clickOnSubscribeButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on unsubscribe button")
	public void click_on_unsubscribe_button() {
		matSod.clickOnUnsubscribeButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the button label changes to unsubscribe")
	public void the_button_label_changes_to_unsubscribe() {
		Assert.assertTrue(matSod.verifyLableUnSubscribe());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the button label changes to subscribe")
	public void the_button_label_changes_to_subscribe() {
		Assert.assertTrue(matSod.verifyLableSubscribe());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on actions from SOD page")
	public void click_on_actions_from_SOD_page() {
		matSod.clickOnActions();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select subscribe action")
	public void select_subscribe_action() {
		matSod.selectSubscribeAction();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select unsubscribe action")
	public void select_unsubscribe_action() {
		matSod.selectUnSubscribeAction();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on refresh button")
	public void click_on_refresh_button() {
		matSod.clickRefreshButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on view all under subscribed materials")
	public void click_on_view_all_under_subscribed_materials() {
		homepage.clickOnViewAllUnderSubscribedMaterials();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the materials display on my workspace page")
	public void the_materials_display_on_my_workspace_page() {
		Assert.assertTrue(workSpacePage.verifyMaterialsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("double click on material link")
	public void double_click_on_material_link() {
		workSpacePage.clickFirstMaterialLink();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("no results found shows under subscribed materials")
	public void no_results_found_shows_under_subscribed_materials() {
		Assert.assertTrue(homepage.verifyEmptySubscribedMaterials());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on revisions tab")
	public void click_on_revisions_tab() {
		matSod.clickOnRevisionsTab();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on first revision")
	public void click_on_first_revision() {
		matSod.clickFirstRevision();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on second revision")
	public void click_on_second_revision() {
		matSod.clickSecondRevision();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("verify revision is created")
	public void verify_revision_is_created() {
		Assert.assertTrue(matSod.verifyRevisionsCreated());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on logff link")
	public void click_on_logff_link() {
		homepage.logOffOption();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click ok button from logoff dialog")
	public void click_ok_button_from_logoff_dialog() {
		homepage.logOffOkButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("verify the process is completed with done status")
	public void verify_the_process_is_completed_with_done_status() {
		Assert.assertTrue(workSpacePage.verifyDoneStatus());
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on auto refresh checkbox")
	public void click_on_auto_refresh_checkbox() {
		workSpacePage.clickOnAutomRefresh();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("user selects Test from dropdown")
	public void user_selects_Test_from_dropdown() {
		homepage.selectTestFromSearchMenu();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("user enters searchtext for test data search {string}")
	public void user_enters_searchtext_for_test_data_search(String textToSearch) {
		homepage.enterTextForSearch(textToSearch);
	}

	@And("click on first row from search results")
	public void click_on_first_row_from_search_results() {
		searchPage.clickOnFirstLinkFromSearchResults();
	}

	@And("click on search button from homepage")
	public void click_on_search_button_from_homepage() throws InterruptedException {
		homepage.clickOnSearchButton();
	}

}
