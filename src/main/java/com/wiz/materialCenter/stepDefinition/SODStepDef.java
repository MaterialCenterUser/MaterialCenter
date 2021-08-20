package com.wiz.materialCenter.stepDefinition;

import org.junit.Assert;

import com.wiz.materialCenter.pages.AdministrationPage;
import com.wiz.materialCenter.pages.CompareProcessPage;
import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.CurvePropertySOD;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SODStepDef extends TestBase {
	MaterialMOD matMod = new MaterialMOD();
	MaterialSOD matSod = new MaterialSOD();
	HomePage homepage = new HomePage();
	ProcessesPage processesPage = new ProcessesPage();
	AdministrationPage adminPage = new AdministrationPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	SearchPage searchPage = new SearchPage();
	CompareProcessPage compare = new CompareProcessPage();
	ConfigurationWS config = new ConfigurationWS();
	NavigateWS navigate = new NavigateWS();
	CurvePropertySOD curveProp = new CurvePropertySOD();

	@And("click on property set")
	public void click_on_property_set() {
		matSod.clickOnPropertySet();
	}

	@And("uncheck electrical, mechanical and physical properties from filter")
	public void uncheck_electrical_mechanical_and_physical_properties_from_filter() throws InterruptedException {
		matSod.uncheckPropertiesFromFilter();
	}

	@And("click ok button on property set filter")
	public void click_ok_button_on_property_set_filter() throws InterruptedException {
		matSod.clickPropertySetOK();
	}

	@Then("property set filter image is displayed")
	public void property_set_filter_image_is_displayed() {
		Assert.assertTrue(matSod.propertySetImageDisplayed());
		
		//matSod.displayDropdownParameters();

	}
	@And("uncheck assembly property from filter")
	public void uncheck_assembly_property_from_filter() throws InterruptedException {
		matSod.uncheckAssemblyFromFilter();
	}
	
	@Then("eletrical properties are not displayed")
	public void eletrical_properties_are_not_displayed() {
		Assert.assertFalse(matSod.elementNotOnPage());
		//matSod.electricalTagDisplayed();
		//Assert.assertFalse(MaterialSOD.findYourElement() != null);
		//Assert.assertTrue(MaterialSOD.findYourElement() == null);
	}
	@Then("all the three options are displayed in display dropdown")
	public void all_the_three_options_are_displayed_in_display_dropdown() {
		Assert.assertTrue(matSod.verifyOpDisplaySourceDisplayDropdown());
		Assert.assertTrue(matSod.verifyOpClearSourceDisplayDropdown());
		Assert.assertTrue(matSod.verifyOpExpandParamaetersDisplayDropdown());
	}
	@Then("assembly properties are not displayed on material SOD page")
	public void assembly_properties_are_not_displayed() {
		//Assert.assertFalse("Bug!! The element is there!", MaterialSOD.findYourElement() != null);	
		//Assert.assertTrue(MaterialSOD.findYourElement() == null);
		Assert.assertFalse(matSod.assemblyTagDisplayed());
	}

	@And("click on data sources")
	public void click_on_data_sources() {
		config.clickOnDataSources();
	}
	@And("double click on materials selector link")
	public void double_click_on_materials_selector_link() {
		config.doubleClickOnMaterialsSelector();
	}
	@And("click on add to clipboard")
	public void click_on_add_to_clipboard() {
		matSod.clickOnAddToClipboard();
	}
	
	@And("click on cancel on property set filter")
	public void click_on_cancel_on_property_set_filter() {
		matSod.clickPropertySetCancel();
	}
	@Then("all properties are displayed on SOD page")
	public void all_properties_are_displayed_on_SOD_page() {
		//Assert.assertTrue(matSod.electricalPropertiesDisplayed());
		Assert.assertTrue(matSod.classificationPropertiesDisplayed());
	}
	@And("click on select all on property filter")
	public void click_on_select_all_on_property_filter() throws InterruptedException {
		matSod.clickShowAllOnPropFilter();
	}
	@And("select finishes")
	public void select_finishes() {
		matMod.selectFinishesEle();
	}
	
	@And("click on parameters")
	public void click_on_parameters() {
		matSod.clickParameters();
	}
	@Then("all the three buttons ok, cancel and reset are displayed")
	public void all_the_three_buttons_ok_cancel_and_reset_are_displayed() {
		//Assert.assertTrue(matSod.electricalPropertiesDisplayed());
		Assert.assertTrue(matSod.verifyOkButtonFilterParDisplayed());
		Assert.assertTrue(matSod.verifyCancelButtonFilterParDisplayed());
		Assert.assertTrue(matSod.verifyResetButtonFilterParDisplayed());
	}
	
	
	@And("unselect all properties on property filter")
	public void unselect_all_properties_on_property_filter() throws InterruptedException{
		matSod.unselectAllOnPropFilter();
	}
	
	@Then("the no property selected message displayed {string}")
	public void material_does_not_contain_any_selected_property_sets_message_displayed(String expErrorMessage) {
		String actualErrorMessage = matSod.msgPropSetsNotAvailableDisplayed();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
		
	
	@And("user expands polymers")
	public void user_expands_polymers() {
	    navigate.clickOnPolymersExpand();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("user expands plastics,thermoplastic")
	public void user_expands_thermoplastic() {
	    navigate.clickOnThermoplasticExpand();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select ionomer")
	public void select_ionomer() {
		matMod.selectIonomer();
	    screenshot(driver, System.currentTimeMillis());
	}
	@And("user expands ceramics and glasses")
	public void user_expands_ceramics_and_glasses() {
	    navigate.clickOnCeramicsExpand();
	    screenshot(driver, System.currentTimeMillis());
	}
	@And("select industrial glass")
	public void select_industrial_glass() {
		matMod.selectIndustrialGlass();
	    screenshot(driver, System.currentTimeMillis());
	}

	@And("unselect hardness property")
	public void unselect_hardness() throws InterruptedException {
		matSod.unselectHardness();
			screenshot(driver, System.currentTimeMillis());
	}
	@And("unselect processing property")
	public void unselect_processing_property() throws InterruptedException {
		matSod.unselectProcessing();
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("message is displayed which does not property set {string}")
	public void message_is_displayed_which_does_not_property_set(String expErrorMessage) {
		String actualErrorMessage = matSod.verifyMessageNotHavingPropSet();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("hardness property is not displayed")
	public void hardness_property_is_not_displayed() {
		//Assert.assertTrue(matSod.electricalPropertiesDisplayed());
		Assert.assertFalse(matSod.hardnessPropNoDisplayed());
	}
	
	@Then("the material contains single parameters message displayed {string}")
	public void the_material_contains_single_parameters_message_displayed(String expErrorMessage) {
		String actualErrorMessage = matSod.verifySingleParamMessage();
		//String[] test = expErrorMessage.split("\n");
		String zero="The Material Display contains a single parameter and cannot be filtered";
		String one="further";
		String result = zero + "\n" + one;
		Assert.assertEquals(result, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	@And("move test temprature option from selected parameters to available parameters")
	public void move_test_temprature_option(){
		matSod.movetestTempOptionToAvailable();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("move test type option from selected parameters to available parameters")
	public void move_test_type_option() {
		matSod.movetestTypeOptionToAvailable();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("move time option from selected parameters to available parameters")
	public void move_time_option() {
		matSod.movetimeOptionToAvailable();
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("the available parameter is displayed in test temprature dropdown")
	public void the_available_parameter_is_displayed_in_test_temprature() {
		Assert.assertTrue(matSod.testTempAvailableDisplayed());
		
	}
	
	@Then("the available parameter is displayed in test type dropdown")
	public void the_available_parameter_is_displayed_in_test_type() {
		Assert.assertTrue(matSod.testTypeAvailableDisplayed());
		
	}
	
	@Then("the available parameter is displayed in time dropdown")
	public void the_available_parameter_is_displayed_in_time() {
		Assert.assertTrue(matSod.timeAvailableDisplayed());
		
	}
	@And("click ok on filter parameter")
	public void click_ok_on_filter_parameter() {
		matSod.clickOkOnFilterParameter();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify filter applied to parameters is displayed on material SOD")
	public void verify_filter_applied_to_parameters_displayed_on_material_SOD() {
		Assert.assertTrue(matSod.filterParamImageDisplayed());
		
	}
	
}
