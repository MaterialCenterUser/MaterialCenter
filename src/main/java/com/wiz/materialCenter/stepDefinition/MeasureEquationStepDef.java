package com.wiz.materialCenter.stepDefinition;

import org.junit.Assert;

import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.EditMatProcess;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class MeasureEquationStepDef extends TestBase {
	
	NavigateWS navigate = new NavigateWS();
	MaterialMOD matMod = new MaterialMOD();
	EditMatProcess edit = new EditMatProcess();
	MaterialSOD matSod = new MaterialSOD();
	SearchPage search = new SearchPage();
	ConfigurationWS configPage = new ConfigurationWS();
	
	ProcessesPage processesPage = new ProcessesPage();
	MyWorkspacePage workspacePage = new MyWorkspacePage();
	@Then("verify measure equations link is displayed")
	public void verify_measure_equations_link_is_displayed() {
		Assert.assertTrue(configPage.measureEquationsLinkDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify measure equations mappings link is displayed")
	public void verify_measure_equations_mappings_link_is_displayed() {
		Assert.assertTrue(configPage.measureEquationMappingsLinkDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on measure equations link")
	public void click_on_measure_equations_link()  {
		configPage.clickOnMeasureEquationsLInk();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on measure equation mappings link")
	public void click_on_measure_equation_mappings_link()  {
		configPage.clickOnMeasureEquationMappingsLink();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on import measure equation option")
	public void click_on_import_measure_equation_option() throws InterruptedException {
		configPage.clickOnimportMeasureEquationsLink();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on edit imported measure equation option")
	public void click_on_edit_imported_measure_equation_option() throws InterruptedException {
		configPage.clickOnEditImportedMeasureEquationsLink();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on import mappings option")
	public void click_on_import_measure_equation_mappings_option() throws InterruptedException {
		configPage.clickOnimportMappingsLink();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on edit imported mapping option")
	public void click_on_edit_import_measure_equation_mappings_option() throws InterruptedException {
		configPage.clickOnEditimportMappingsLink();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("verify import measure equation page is displayed")
	public void verify_import_equations_page_link_is_displayed() {
		Assert.assertTrue(processesPage.importMeasureEquationDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify import mappings page is displayed")
	public void verify_import_mappings_page_link_is_displayed() {
		Assert.assertTrue(processesPage.importMappingsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select measure equation file to upload")
	public void select_measure_equation_file_to_upload() {
		processesPage.selectMeasureEquationFileToUpload();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select mapping file to upload")
	public void select_mapping_file_to_upload() {
		processesPage.selectMappingFileToUpload();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select wrong measure equation file to upload")
	public void select_wrong_measure_equation_file_to_upload() {
		processesPage.selectWrongMeasureEquationFileToUpload();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select wrong measure equation mapping file to upload")
	public void select_wrong_measure_equation_mapping_file_to_upload() {
		processesPage.selectWrongMeasureEquationMappingsFileToUpload();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on remove button")
	public void click_on_remove_button() {
		processesPage.clickRemoveButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on submit button to import measure equation")
	public void click_on_submit_button_to_import_measure_equation() throws InterruptedException {
		processesPage.clickOnSubmitMeasureEquation();
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("click on submit button to import measure equation mappings")
	public void click_on_submit_button_to_import_measure_equation_mappings() throws InterruptedException {
		processesPage.clickOnSubmitMeasureEquationMappings();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify the import measure equation is completed successfully")
	public void verify_the_import_measure_equation_is_completed_successfully() {
		Assert.assertTrue(workspacePage.verifyDoneStatus());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on autorefresh checkbox")
	public void click_on_autorefresh_checkbox()  {
		workspacePage.clickOnAutomRefresh();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("create measure equation error message displayed {string}")
	public void create_measure_equation_error_message_displayed(String expErrorMessage) {
		String actualErrorMessage = processesPage.msgCreateMeasureEquationError();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("measure equation name invalid error message displayed {string}")
	public void measure_equation_name_invalid_message_displayed(String expErrorMessage) {
		String actualErrorMessage = processesPage.msgInvalidMeasureEquationName();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("enter invalid measure eqaution name in name textbox {string}")
	public void enter_invalid_measure_eqaution_name_in_name_textbox(String measureEquationName)  {
		processesPage.enterInvalidMeasureEquationName(measureEquationName);
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on home icon to navigate to homepage")
	public void click_on_home_icon_to_navigate_to_homepage() throws InterruptedException  {
		workspacePage.clickOnDashboard();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on configuration tab to navigate to configuration")
	public void click_on_configuration_tab_to_navigate_to_configuration() throws InterruptedException  {
		workspacePage.clickOnConfiguration();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify the imported measure eqaution is displayed in measure equations")
	public void verify_the_imported_measure_eqaution_is_displayed_in_measure_equations() {
		Assert.assertTrue(configPage.verifyImportedMeasureEquationDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("verify the imported measure eqaution mappings is displayed in measure equation mappings")
	public void verify_the_imported_measure_eqaution_mappings_is_displayed_in_measure_mappings() {
		Assert.assertTrue(configPage.verifyImportedMeasureMappingsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select measure equation from dropdown")
	public void select_measure_equation_from_dropdown() throws InterruptedException   {
		processesPage.selectMeaureEquationFromDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select master metals schema from dropdown")
	public void select_master_metals_schema_from_dropdown() throws InterruptedException   {
		processesPage.selectMasterMetalsSchemaFromDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select measure property from dropdown")
	public void select_measure_property_from_dropdown() throws InterruptedException   {
		processesPage.selectMeasurePRopertyFromDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on create from matMOD")
	public void click_on_create_from_matMOD() {
		matMod.clickOnCreate();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify measure from equations options is displayed on MOD")
	public void verify_measure_from_equations_options_is_displayed_on_MOD() {
		Assert.assertTrue(matMod.measureFromEquationsOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("verify measure from equations options is displayed on SOD")
	public void verify_measure_from_equations_options_is_displayed_on_SOD() {
		Assert.assertTrue(matSod.measureFromEquationsOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on measure from equations from MOD page")
	public void click_on_measure_from_equations_from_MOD_page() {
		matMod.clickOnMeasureFromEquations();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on measure from equations from SOD page")
	public void click_on_measure_from_equations_from_SOD_page() {
		matSod.clickOnMeasureFromEquations();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify measure from equations window is displayed on MOD")
	public void verify_measure_from_equations_window_is_displayed_on_MOD() {
		Assert.assertTrue(matMod.measureFromEquationsWindowDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify measure from equations window is displayed on SOD")
	public void verify_measure_from_equations_window_is_displayed_on_SOD() {
		Assert.assertTrue(matSod.measureFromEquationsWindowDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on select button displayed against measure eqaution mappings")
	public void click_on_select_button_displayed_against_measure_eqaution_mappings() {
		matSod.clickOnSelectButtonAgainstMeasureMappings();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on submit button to create measure equations")
	public void click_on_submit_button_to_create_measure_equations() {
		matSod.clickOnSelectButtonAgainstMeasureMappings();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify measure from equations are created")
	public void verify_measure_from_equations_created() {
		Assert.assertTrue(workspacePage.measureFromEquationsCreated());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify output measure property is displayed on SOD page")
	public void verify_output_measure_property_is_displayed_on_SOD_page() {
		Assert.assertTrue(matSod.verifyOutputMeasurePropertyDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("verify output measure property correct values is displayed on SOD page")
	public void verify_output_measure_property_correct_values_is_displayed_on_SOD_page() {
		Assert.assertTrue(matSod.verifyOutputMeasurePropertyValueDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on metals")
	public void click_on_metals() {
	
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on latest revision")
	public void click_on_latest_revision() {
	
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select imported measure equation")
	public void select_imported_measure_equation() {
		configPage.doubleClickOnFirstMat();
	   // matSod.storeClassificationValuesBeforeEdit();
	    screenshot(driver, System.currentTimeMillis());
	}
	
}
