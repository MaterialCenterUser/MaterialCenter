package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.CAEProcessInput;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class CAEModelStepDef extends TestBase {
	HomePage homePage = new HomePage();
	NavigateWS navigate = new NavigateWS();
	MaterialSOD matSod = new MaterialSOD();
	MaterialMOD matMod = new MaterialMOD();
	CAEProcessInput caeProccessInput = new CAEProcessInput();
	ProcessesPage processessPage = new ProcessesPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	
	@When("user clicks on Config WS")
	public void user_clicks_on_Config_WS() {
		//HomePage homePage = new HomePage();
		homePage.clickOnConfiguration();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("user comes on Navigate WS")
	public void user_comes_on_Navigate_WS() {
		homePage.clickOnNavigate();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user expands metals")
	public void user_expands_metals() {
	    navigate.clickOnMetalsExpand();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select nonferrous metals")
	public void select_nonferrous_metals() {
	   navigate.clickOnNonFerrousMetals();
	   screenshot(driver, System.currentTimeMillis());
	}

	@When("double click on material from MOD")
	public void double_click_on_material_from_MOD() {
	    matMod.doubleClickOnFirstMat();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("click on create SA")
	public void click_on_create_SA() {
		matSod.clickOnCreate();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("click on CAE model AUTO action")
	public void click_on_CAE_model_AUTO_action() {
	    matSod.clickOnCAEAuto();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on Submit button")
	public void click_on_Submit_button() {
		caeProccessInput.clickOnSubmit();
//		Assert.assertTrue(, "download image is visible");
		
		caeProccessInput.verifyDownloadImage();
		screenshot(driver, System.currentTimeMillis());
	}

	
	/*
	 * @And("navigate to homepage") public void navigate_to_homepage_duplicate()
	 * throws InterruptedException { //homePage = new HomePage();
	 * homePage.clickOnDashboard(); Thread.sleep(3000); screenshot(driver,
	 * System.currentTimeMillis()); }
	 */
	
	@When("select CAE model process")
	public void select_CAE_model_process() {
		homePage.clickOnCaeProcessHome();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("CAE model should generate successfully")
	public void cae_model_should_generate_successfully() {
	    processessPage.verifyDoneStatus();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Given("user clicks on view all processes")
	public void user_clicks_on_view_all_processes() throws InterruptedException {
	    homePage.clickOnProcessViewAll();
	 //   homePage.clickOnCaeProcess();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user select CAE model process")
	public void user_select_CAE_model_process() {
	   	    workSpacePage.clickOnCaeProcess();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("user clicks on discard option")
	public void user_clicks_on_discard_option() {
	    processessPage.clickOnDiscard();
	  //  processessPage.clickOnDiscardSubmit();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@When("user clicks on submit button on CAE model page")
	public void user_clicks_on_submit_button_on_CAE_model_page() {
	   // processessPage.clickOnDiscard();
	    processessPage.clickOnDiscardSubmit();
	    screenshot(driver, System.currentTimeMillis());
	}
	@Then("discard of CAE model should be completed successfully")
	public void discard_of_CAE_model_should_be_completed_successfully() throws InterruptedException {
	    homePage.clickOnProcessViewAll();
	    homePage.clickOnDemoteProcess();
	    processessPage.verifyDoneStatus();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user expands material design data")
	public void user_expands_material_design_data() {
	    navigate.clickOnMatExpand_ford();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select metal option")
	public void select_metal_option() {
	    navigate.clickOnMetals_Ford();
	    matMod.countMat();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("double click on material from MOD of ford data")
	public void double_click_on_material_from_MOD_of_ford_data() {
	    matMod.doubleClickMat_Ford();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("check the mechanical property values and store them")
	public void check_the_mechanical_property_values_and_store_them() {
	    matSod.storeMechPropSOD();
	}

	@Then("verify that CAE model is successfully created with correct values")
	public void verify_that_CAE_model_is_successfully_created_with_correct_values() {
	    matSod.storeMechPropCAEModel();
	    matSod.comparePropValuesCAEModel();
	}

}
