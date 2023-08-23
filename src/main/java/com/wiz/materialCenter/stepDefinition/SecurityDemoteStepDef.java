package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SecurityProcess;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class SecurityDemoteStepDef extends TestBase {
	HomePage homePage;
	MaterialMOD matMod;
	MaterialSOD matSod;
	SecurityProcess demote = new SecurityProcess();
	ProcessesPage process;
	
	@When("select material with production release level")
	public void select_material_with_production_release_level() {
	    matMod = new MaterialMOD();
	    matMod.clickOnMatToDemote();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on demote action under security tab")
	public void click_on_demote_action_under_security_tab() {
	    matSod = new MaterialSOD();
	    matSod.clickOnSecurity();
	    matSod.clickOnDemoteAction();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on next button")
	public void click_on_next_button() {
	    demote.clickOnNext();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on the submit button on dependent objects list")
	public void click_on_the_submit_button_on_dependent_objects_list() {
	    demote.clickOnSubmit();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("navigate to homepage and select Demote process")
	public void navigate_to_homepage_and_select_Demote_process() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickOnDashboard();
		homePage.clickOnProcessViewAll();
		homePage.clickOnDemoteProcess();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@When("open the demoted material under inputs and outputs tab")
	public void open_the_demoted_material_under_inputs_and_outputs_tab() {
		process = new ProcessesPage();
		process.clickOnIOTab();
		process.clickOnDemotedObj();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("material should be demoted successfully")
	public void material_should_be_demoted_successfully() {
	    demote.demoteResult();
	    screenshot(driver, System.currentTimeMillis());
	}

}
