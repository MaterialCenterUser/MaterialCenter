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
/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/

public class AddEditBehaviourMatStepDef extends TestBase {
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
	
	@And("click on create material link")
	public void click_on_create_material_link() {
		configPage.clickOnCreateMaterial();
	}
	@And("enter value for shear modulus {string}")
	public void enter_value_for_shear_modulus(String shearValue) {
		caeProcess.enterValueForShear(shearValue);
	}
	@And("enter value for clamped lenghth {string}")
	public void enter_value_for_clamped_length(String clampLength) {
		editTestData.enterValueForClampLength(clampLength);
	}
	
	@And("click on test details tab")
	public void click_on_test_details_tab() {
		editTestData.clickOnTestDetailsTab();
	}
	
	//span[text()='Test Details']
	@And("click on Submit button on edit test data page")
	public void click_on_Submit_button_on_edit_test_data_page() {
		editTestData.clickSubmitButton();
	}
	

	@And("enter value for poisson ratio {string}")
	public void enter_value_for_poisson_ratio(String ratioValue) {
		caeProcess.enterValueForPoissonRatio(ratioValue);
	}
	@And("click on the related material link from SOD page to view CAE model tab")
	public void click_on_the_related_material_link_from_SOD_page_to_view_CAE_model_tab() {
		matSod.clickOnRelatedMatLinkToGetCAEModel();
	}
	
	@And("click on classification tab")
	public void click_on_classification_tab() {
		configPage.clickOnClassificationTab();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on test data action")
	public void click_on_test_data_action() {
		matSod.clickOnTestDataAction();
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("enter value for common name on classification tab {string}")
	public void enter_value_for_commom_name_on_classification_tab(String commonNameToEnter) {
		configPage.enterValueForCommonNameOnClassificationTab(commonNameToEnter);
		screenshot(driver, System.currentTimeMillis());
	}
	@And("edit common name attribute value")
	public void enter_commom_name_attribute_vaue() {
		editMat.editValueForCommonNameOnClassificationTab();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@When("navigate to sources tab")
	public void navigate_to_Sources_tab() {
		editMat.clickOnSourcesTab();
	}
	
	
	@And("remove class attribute value")
	public void remove_class_attribute_vaue() {
		editMat.removeClassAttributeValueFromClassficationTab();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("enter material name and click on submit button to create material")
	public void enter_material_name_and_click_on_submit_button_to_create_material() {
		configPage.provideRandomNameToMat();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on submit button to create material")
	public void click_on_submit_button_to_create_material() throws InterruptedException {
		configPage.clickOnSubmitToCreateMat();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("created material is displayed")
	public void created_material_is_displayed() {
		Assert.assertTrue(matSod.createdMatDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select target level as in review")
	public void select_target_level_as_review() {
	  // promote = new SecurityProcess();
		//promote = new SecurityProcess();
		secPrcoess.clickOnTargetLevel();
		secPrcoess.selectReviewLevel();
	  // promote.clickOnNext();
	   screenshot(driver, System.currentTimeMillis());
	}
	@And("click on release level column and select filter")
	public void click_on_release_level_column_and_select_filter() {
		  matMod.selectReleaseLevelFilter();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select In-review checkbox and click on ok button")
	public void select_Inreview_checkbox_and_click_on_ok_button() {
	    matMod.clickInReviewCheckbox();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select In-work checkbox and click on ok button")
	public void select_Inwork_checkbox_and_click_on_ok_button() {
	    matMod.clickInWorkCheckbox();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select production checkbox and click on ok button")
	public void select_production_checkbox_and_click_on_ok_button() {
	    matMod.clickProdCheckbox();
	    screenshot(driver, System.currentTimeMillis());
	}	
	@And("click on edit material at RL0 option on SOD")
	public void click_on_edit_material_at_RL0_option_on_SOD() {
		matSod.clickOnEditMatAtRL0Option();
	    screenshot(driver, System.currentTimeMillis());
	}	
	@And("click on edit material at RL0 option on MOD")
	public void click_on_edit_material_at_RL0_option_on_MOD() {
		matMod.clickOnEditMatAtRL0OptionFromMOD();
	    screenshot(driver, System.currentTimeMillis());
	}	

	@And("click on edit on MOD")
	public void click_on_Edit_on_MOD() {
		matMod.clickEditOnMOD();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on add attributes button")
	public void click_on_add_attributes_button() {
		editMat.clickOnAddAttributesButton();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on select button displayed against select existing source")
	public void click_on_select_button_displayed_against_select_existing_source() {
		editMat.clickOnSelectButtonToSelectExistingSource();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("double click on first source from result")
	public void double_click_on_first_result() {
		editMat.doubleClickOnFirstSource();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("double click on class attribute")
	public void double_click_on_class_attribute() {
		editMat.addClassAttributes();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("double click on cas number attribute")
	public void double_click_on_cas_number_attribute() {
		editMat.addCASNumberAttribute();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on ok button to add attribute")
	public void click_on_ok_button_to_add_attribute() {
		editMat.clickOkButtonAddAttributes();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("enter class attribute value")
	public void enter_class_attribute_value() {
		editMat.enterClassAttrValue();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("enter cas Number attribute value")
	public void enter_cas_number_attribute_value() {
		editMat.enterCASNumberAttrValue();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("enter source name on sources tab")
	public void enter_source_name_on_source_tab() {
		editMat.enterSourceNameOnSourcesTab();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on ok button to add source")
	public void click_on_ok_button_to_add_source() {
		editMat.clickOkButtonAddSource();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on edit button to edit source on source tab")
	public void click_on_edit_button_to_edit_source() {
		editMat.clickEditToButtonEditSource();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on remove button to remove source on source tab")
	public void click_on_remove_button_to_remove_source() {
		editMat.clickRemoveButtonToRemoveSource();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select source on source tab")
	public void click_on_source() {
		editMat.clickAddedSource();
		screenshot(driver, System.currentTimeMillis());
	}
	

	@Then("edit material at RL0 option is displayed on SOD")
	public void edit_material_at_RL0_option_is_displayed_on_SOD() {
		Assert.assertTrue(matSod.verifyeditMatAtRL0OptionFromSODDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify release level is displayed as {string}")
	public void verify_release_level_is_displayed_as(String expReleaseLevel) {
		String actualReleaseLevel = matSod.releaseLevelDisplayed();
		Assert.assertEquals(expReleaseLevel, actualReleaseLevel);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("edit material at RL0 option is displayed from edit menu on search results MOD")
	public void edit_material_at_RL0_option_is_displayed_on_search_results_MOD() {
		Assert.assertTrue(searchPage.verifyEditMatAtRL0OptionFromEditMenuDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("edit material at RL0 option is not displayed from edit menu on MOD")
	public void edit_material_at_RL0_option_is_not_displayed_on_MOD() {
		Assert.assertFalse(matMod.verifyEditMatAtRL0OptionFromEditMenuNotDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("edit material at RL0 option is not displayed from edit menu on SOD")
	public void edit_material_at_RL0_option_is_not_displayed_on_SOD() {
		Assert.assertFalse(matSod.verifyEditMatAtRL0OptionFromEditMenuNotDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
}
