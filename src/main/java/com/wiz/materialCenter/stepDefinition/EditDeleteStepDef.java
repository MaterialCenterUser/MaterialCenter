package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.EditMatProcess;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditDeleteStepDef extends TestBase {

	MaterialSOD matSod = new MaterialSOD();
	EditMatProcess editMat = new EditMatProcess();
	MaterialMOD matMod = new MaterialMOD();
	HomePage homePage = new HomePage();
	ProcessesPage process = new ProcessesPage();

	@When("click on Edit material option")
	public void click_on_Edit_material_option() {
		matSod.clickOnEditMat();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("navigate to footnotes tab and add footnotes")
	public void navigate_to_footnotes_tab_and_add_footnotes() {
		editMat.clickOnFootnotesTab();
		screenshot(driver, System.currentTimeMillis());
		editMat.addFootnote();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("go to properties tab")
	public void go_to_properties_tab() {
		editMat.clickOnPropertiesTab();
		screenshot(driver, System.currentTimeMillis());
		// editMat.selectMechProp();
		// screenshot(driver, System.currentTimeMillis());
	}

	@When("select different parameter set and click on submit")
	public void select_different_parameter_set_and_click_on_submit() {
		editMat.selectDiffrentparameterSet();
		screenshot(driver, System.currentTimeMillis());
		// editMat.selectMechProp();
		// screenshot(driver, System.currentTimeMillis());
	}

	@When("click on add properties")
	public void click_on_add_properties() {
		editMat.clickOnAddProperties();
		screenshot(driver, System.currentTimeMillis());
		// editMat.selectMechProp();
		// screenshot(driver, System.currentTimeMillis());
	}

	@When("select the Solderability property")
	public void select_the_Solderability_property() {
		editMat.selectPropertyToAdd();
		screenshot(driver, System.currentTimeMillis());
		// editMat.selectMechProp();
		// screenshot(driver, System.currentTimeMillis());
	}

	@When("select mechanical property set")
	public void select_mechanical_property_set() {
		editMat.selectMechProp();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("click on select button against solderability")
	public void click_on_select_button_against_solderability() {
		editMat.selectFootnotesUnderSolderability();
		screenshot(driver, System.currentTimeMillis());
		// editMat.linkFootnote();
		// screenshot(driver, System.currentTimeMillis());
	}

	@When("click on select button against tensile elastic modulus")
	public void click_on_select_button_against_tensile_elastic_modulus() {
		editMat.clickOnFootnotes();
		screenshot(driver, System.currentTimeMillis());
		// editMat.linkFootnote();
		// screenshot(driver, System.currentTimeMillis());
	}

	@When("add newly added footnotes to eleastic modulus property and submit")
	public void add_newly_added_footnotes_to_property_and_submit() {
		// editMat.clickOnFootnotes();
		// screenshot(driver, System.currentTimeMillis());
		editMat.linkFootnote();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("verify that newly added footnotes is updated with property successfully")
	public void verify_that_newly_added_footnotes_is_updated_with_property_successfully() {
		matSod.verifyPropSetDisplay();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("select four materials to delete")
	public void select_four_materials_to_delete() {
		matMod.selectLastEles();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("right click to select edit and then delete option")
	public void right_click_to_select_edit_and_then_delete_option() {
		matMod.selectDelete();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("click on submit button to delete materials successfully")
	public void click_on_submit_button_to_delete_materials_successfully() {
		matMod.deleteSubmit();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("navigate to homepage and select Delete process")
	public void navigate_to_homepage_and_select_Delete_process() throws InterruptedException {
		homePage.clickOnDashboard();
		homePage.clickOnProcessViewAll();
		homePage.clickOnDemoteProcess(); // this method is selecting the first
											// process in list always
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("check that process is completed")
	public void check_that_process_is_completed() {
		process.verifyDoneStatus();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("navigate to Classification tab")
	public void navigate_to_Classification_tab() {
		editMat.clickOnClassificationTab();
	}

	@When("edit few values")
	public void edit_few_values_and_save_it() {
		editMat.editClassificationValue();
	}

	@And("edit subclass value")
	public void edit_subclass_value() {
		editMat.editSubClassValue();
	}

	@And("click on submit button on edit materials page")
	public void click_on_submit_button_on_edit_materials_page() {
		editMat.clickSubmitButton();
	}

	@And("click on edit on MatSOD")
	public void click_on_edit_on_MatSOD() {
		matSod.clickEditMenu();

	}

	@And("select delete action")
	public void select_delete_action() {
		matSod.selectDeleteAction();
	}

	@Then("verify that edited values are updated successfully")
	public void verify_that_edited_values_are_updated_successfully() {
		matSod.verifyEditValuesOnSOD();
	}

}
