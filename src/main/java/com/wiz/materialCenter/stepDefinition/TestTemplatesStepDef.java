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


public class TestTemplatesStepDef extends TestBase {

	
	ConfigurationWS configPage = new ConfigurationWS();
	
	
	
	
	@And("user clicks on test templates option")
	public void user_clicks_on_test_templates_option() throws InterruptedException {
		configPage.clickCreatetTemplateLInk();
		screenshot(driver, System.currentTimeMillis());
	}
	
	

	@Then("test templates option is displayed")
	public void test_templates_option_is_displayed() {
		Assert.assertTrue(configPage.testTemplateOptionIsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
}
