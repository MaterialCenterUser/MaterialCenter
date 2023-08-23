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

public class ApprovalReqExecuteStepsParallelStepDef extends TestBase {

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
	
	
	@Then("msg is displayed as {string}")
	public void msg_is_displayed_as(String expErrorMessage) {
		String actualErrorMessage = configPage.incorrectStepMsgDisplayed();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
		

	@And("click on plus button against step1")
	public void click_on_plus_button_against_step1() {
		//configPage = new ConfigurationWS();
		configPage.clickOnPlusButtonStep1();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on plus button against step2")
	public void click_on_plus_button_against_step2() {
		//configPage = new ConfigurationWS();
		configPage.clickOnPlusButtonStep2();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on plus button against step3")
	public void click_on_plus_button_against_step3() {
		configPage = new ConfigurationWS();
		configPage.clickOnPlusButtonStep3();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on plus button against step4")
	public void click_on_plus_button_against_step4() {
		configPage = new ConfigurationWS();
		configPage.clickOnPlusButtonStep4();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("check the checkbox group with previous against step3")
	public void check_the_checkbox_group_with_previous_against_step3() {
		configPage.clickOnGrpWithPrevAgainstStep3();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	
	@Then("current step order is changed and same as order of previous step2")
	public void current_step_order_is_changed_and_same_as_order_of_previous_step2() {
		Assert.assertTrue(configPage.currentStep3OrderChangesAsPrevStep2());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("step2 is added and displayed")
	public void step2_is_added_and_displayed() {
		Assert.assertTrue(configPage.addedStep2IsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("step3 is added and displayed")
	public void step3_is_added_and_displayed() {
		Assert.assertTrue(configPage.addedStep3IsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("step4 is added and displayed")
	public void step4_is_added_and_displayed() {
		Assert.assertTrue(configPage.addedStep4IsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
}
