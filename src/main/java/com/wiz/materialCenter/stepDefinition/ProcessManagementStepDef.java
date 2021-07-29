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
