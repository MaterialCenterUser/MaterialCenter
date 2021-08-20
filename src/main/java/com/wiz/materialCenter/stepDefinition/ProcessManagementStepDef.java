package com.wiz.materialCenter.stepDefinition;

import org.junit.Assert;

import com.wiz.materialCenter.pages.AdministrationPage;
import com.wiz.materialCenter.pages.CompareProcessPage;
import com.wiz.materialCenter.pages.CurvePropertySOD;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.ManageProcessPage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProcessManagementStepDef extends TestBase {
	MaterialMOD matMod = new MaterialMOD();
	MaterialSOD matSod = new MaterialSOD();
	HomePage homepage = new HomePage();
	ProcessesPage processesPage = new ProcessesPage();
	AdministrationPage adminPage = new AdministrationPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	SearchPage searchPage = new SearchPage();
	CompareProcessPage compare = new CompareProcessPage();
	CurvePropertySOD curveProp = new CurvePropertySOD();
	ManageProcessPage manageProcess = new ManageProcessPage();

	@And("click on edit")
	public void click_on_Edit() {
		searchPage.clickEdit();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on manage process from edit menu on search results MOD")
	public void click_on_manage_process_from_edit_menu_on_search_results_MOD() {
		searchPage.clickOnManageProcessFromMOD();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on manage process from edit menu on SOD")
	public void click_on_manage_process_from_edit_menu_on_SOD() {
		matSod.clickOnManageProcessFromSOD();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on process type dropdown")
	public void click_on_process_type_dropdown() {
		manageProcess.clickOnProcessTypeDropdown();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on process dropdown")
	public void click_on_process_dropdown() {
		manageProcess.clickProcessDropdownImage();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("user selects Materials from dropdown")
	public void user_selects_Materials_from_dropdown() {
		homepage.selectMaterialsFromSearchMenu();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select composites from process type dropdown")
	public void select_composites_from_process_type_dropdown() {
		manageProcess.selectCompositesFromProcessTypeDropdown();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select metals from process type dropdown")
	public void select_metals_from_process_type_dropdown() {
		manageProcess.selectMetalsFromProcessTypeDropdown();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on clear button displayed against process dropdown")
	public void click_on_clear_button_displayed_against_process_dropdown() {
		manageProcess.clickClearButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("enter some value in time textbox")
	public void enter_some_value_in_time_textbox() {
		manageProcess.enterValueinTimeTextBox();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("enter negative value in time textbox")
	public void enter_negative_value_in_time_textbox() {
		manageProcess.enterNergativeValueinTimeTextBox();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("enter some unrelalistic value in time textbox")
	public void enter_some_unrealistic_value_in_time_textbox() {
		manageProcess.enterUnrealisticValueinTimeTextBox();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on Add button on process page")
	public void click_on_Add_button_on_process_page() throws InterruptedException {
		manageProcess.clickAddButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on submit button on process page")
	public void click_on_Submit_button_on_process_page() {
		manageProcess.clickOnSubmitButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("navigate to homepage from material SOD page")
	public void navigate_to_homepage() throws InterruptedException {
		// homePage = new HomePage();
		matSod.clickOnDashboard();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select first row from process dropdown")
	public void select_first_row_from_process_dropdown() {

		manageProcess.selectFirstRowFromProcessDropdown();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on manage process link")
	public void click_on_manage_process_link() {
		workSpacePage.clickOnManageProcess();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("user clicks on submit button on manage process")
	public void user_clicks_on_submit_button_on_CAE_model_page() {
		// processessPage.clickOnDiscard();
		processesPage.clickOnDiscardSubmit();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on edit button on process page")
	public void click_on_edit_button_on_process_page() {
		// processessPage.clickOnDiscard();
		manageProcess.clickOnEditButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select the process from process component table")
	public void select_the_process_from_process_component_table() {
		manageProcess.selectFirstProcess();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select the last process from process component table")
	public void select_the_last_process_from_process_component_table() {
		manageProcess.selectLastProcess();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select the second process from process component table")
	public void select_the_second_process_from_process_component_table() {
		manageProcess.selectSecondProcess();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on first button on process page")
	public void click_on_first_button_on_process_page() {
		manageProcess.clickOnFirstButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on last button on process page")
	public void click_on_last_button_on_process_page() {
		manageProcess.clickOnLastButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on up button on process page")
	public void click_on_up_button_on_process_page() {
		manageProcess.clickOnUpButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on down button on process page")
	public void click_on_down_button_on_process_page() {
		manageProcess.clickOnDownButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on remove button on process page")
	public void click_on_remove_button_on_process_page() {
		manageProcess.clickOnRemoveButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the first process is removed from process component table")
	public void the_process_is_removed_from_process_component_table() {
		Assert.assertFalse(manageProcess.removeProcessDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on update button on process page")
	public void click_on_update_button_on_process_page() {
		manageProcess.clickOnUpdateButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select the first process from process component table")
	public void select_the_first_process_from_process_component_table() {
		manageProcess.selectFirstAddedProcess();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the process is moved to last position in process component table")
	public void the_process_is_moved_to_last_position_in_process_component_table() {
		Assert.assertTrue(manageProcess.LastEntryDisplayedClickingOnFirstButton());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the process is moved to first position in process component table")
	public void the_process_is_moved_to_first_position_in_process_component_table() {
		Assert.assertTrue(manageProcess.FirstEntryDisplayedClickingOnFirstButton());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("process is updated and update button is changed to add button")
	public void process_is_updated_and_update_button_is_changes_to_add_button() {
		Assert.assertTrue(manageProcess.processUpdated());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("process tab is displayed on material SOD page")
	public void process_tab_is_displayed_on_material_SOD_page() {
		Assert.assertTrue(matSod.processTabDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("update button is displayed on process page to update the process")
	public void update_button_is_displayed_on_process_page_to_update_the_process() {
		Assert.assertTrue(manageProcess.updateProcessButtonDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("discard of manage process is done successfully")
	public void discard_of_manage_process_is_done_successfully() {
		Assert.assertTrue(workSpacePage.discardStatusDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the process is added with material data and properties")
	public void the_process_is_added_with_material_data_and_properties() {
		Assert.assertTrue(manageProcess.processEntryDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("project is pre-populated and displayed as {string}")
	public void project_is_prepopulated_and_displayed(String expProjectName) {
		String actualProjectName = manageProcess.getProjectText();
		Assert.assertEquals(expProjectName, actualProjectName);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("copy material error message is displayed as {string}")
	public void copy_material_error_message_is_displayed(String expErrorMessage) {
		String actualErrorMessage = manageProcess.errorMessageCopyMatGetText();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("link property value is not added and giving error message {string}")
	public void link_property_value_is_not_added_and_giving_error_message(String expErrorMessage) {
		String actualErrorMessage = manageProcess.wrongValueTimeMessageText();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("type is pre-populated and displayed as {string}")
	public void type_is_prepopulated_and_displayed(String expType) {
		String actualType = manageProcess.getTextType();
		Assert.assertEquals(expType, actualType);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("all the components listed are displayed as of selected process type composites")
	public void all_the_components_listed_are_displayed_as_of_selected_process_type_composites() {
		Assert.assertTrue(manageProcess.verifyCompositesComponentsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("all the components listed are displayed as of selected process type metals")
	public void all_the_components_listed_are_displayed_as_of_selected_process_type_metals() {
		Assert.assertTrue(manageProcess.verifyMetalsComponentsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on select button displayed against process dropdown")
	public void click_on_select_button_displayed_against_process_dropdown() {
		manageProcess.clickOnSelectButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on copy button displayed against process dropdown")
	public void click_on_copy_button_displayed_against_process_dropdown() {
		manageProcess.clickOnCopyButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("verify material selection window is displayed")
	public void verify_material_selection_window_is_displayed() {
		Assert.assertTrue(manageProcess.materialsSelectionWindowDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the link properties are displayed in added process order")
	public void the_link_properties_are_displayed_in_added_process_order() {
		Assert.assertTrue(manageProcess.linkPropertiesDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the composites process type displayed in process component table")
	public void the_composites_process_type_displayed() {
		Assert.assertTrue(manageProcess.compositesProcessTypeInEntryDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the metals process type displayed in process component table")
	public void the_metals_process_type_displayed() {
		Assert.assertTrue(manageProcess.metalsProcessTypeInEntryDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("copy material window is displayed")
	public void copy_material_window_is_displayed() {
		Assert.assertTrue(manageProcess.copyMatWindowDsipalyed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("class is populated with the value")
	public void class_is_populated_with_the_value() {
		Assert.assertTrue(manageProcess.classTextBoxDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("common name is poulated with value")
	public void common_name_is_poulated_with_value() {
		Assert.assertTrue(manageProcess.commonNameTextBoxDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("process properties are displayed in process component table")
	public void process_properties_are_displayed_in_process_component_table() {
		Assert.assertTrue(manageProcess.processPropetiesDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("order number is displayed in process component table")
	public void order_number_is_displayed_in_process_component_table() {
		Assert.assertTrue(manageProcess.orderNUmberEntryDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("second order is displayed in process component table")
	public void second_number_is_displayed_in_process_component_table() {
		Assert.assertTrue(manageProcess.secondOrderNUmberEntryDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("submit button is displayed on process page")
	public void submit_button_is_displayed_on_process_page() {
		Assert.assertTrue(manageProcess.submitButtonDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("cancel button is displayed on process page")
	public void cancel_button_is_displayed_on_process_page() {
		Assert.assertTrue(manageProcess.cancelButtonDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on cancel button on process page")
	public void click_on_cancel_button_on_process_page() {
		manageProcess.clickOnCancelButton();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("composites component is populated in process dropdown")
	public void composites_component_is_populated_in_process_dropdown() {
		Assert.assertTrue(manageProcess.processCompoPrepopulatedInDropdown());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("metals component is populated in process dropdown")
	public void metals_component_is_populated_in_process_dropdown() {
		Assert.assertTrue(manageProcess.processMetalsPrepopulatedInDropdown());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the process is cancelled and material SOD page is displayed")
	public void the_process_is_cancelled_and_material_SOD_page_is_displayed() {
		Assert.assertTrue(matSod.verifyDetailsTab());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("first option in process type dropdown is displayed as {string}")
	public void first_option_in_process_type_dropdown_is_displayed(String expFirstOption) {
		String actualFirstOption = manageProcess.processTypeGetFirstOption();
		Assert.assertEquals(expFirstOption, actualFirstOption);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("second option in process type dropdown is displayed as {string}")
	public void second_option_in_process_type_dropdown_is_displayed(String expSecondOption) {
		String actualSecondOption = manageProcess.processTypeGetSecondOption();
		Assert.assertEquals(expSecondOption, actualSecondOption);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("name is pre-populated and displayed on manage process UI")
	public void name_is_prepopulated_and_displayed_on_manage_process_UI() {
		Assert.assertTrue(manageProcess.verifyNamePopulatedDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("manage process option is displayed from edit menu on search results MOD")
	public void manage_process_option_is_displayed_on_search_results_MOD() {
		Assert.assertTrue(searchPage.verifyManageProcessOptionFromEditMenuDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("manage process option is displayed on SOD")
	public void manage_process_option_is_displayed_on_SOD() {
		Assert.assertTrue(matSod.verifyManageProcessOptionFromSODDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("manage process page is displayed")
	public void manage_process_page_is_displayed() {
		Assert.assertTrue(manageProcess.manageProcessPageDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

}
