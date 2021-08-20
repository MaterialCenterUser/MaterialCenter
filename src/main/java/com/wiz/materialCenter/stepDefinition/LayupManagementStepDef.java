package com.wiz.materialCenter.stepDefinition;

import org.junit.Assert;

import com.wiz.materialCenter.pages.AdministrationPage;
import com.wiz.materialCenter.pages.CompareProcessPage;
import com.wiz.materialCenter.pages.CurvePropertySOD;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.ManageLayupPage;
import com.wiz.materialCenter.pages.ManageProcessPage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LayupManagementStepDef extends TestBase{
	MaterialMOD matMod = new MaterialMOD();
	MaterialSOD matSod = new MaterialSOD();
	HomePage homepage = new HomePage();
	ProcessesPage processesPage = new ProcessesPage();
	AdministrationPage adminPage = new AdministrationPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	SearchPage searchPage = new SearchPage();
	CompareProcessPage compare = new CompareProcessPage();
	CurvePropertySOD curveProp = new CurvePropertySOD();
	ManageLayupPage manageLayup = new ManageLayupPage();

	
	
	@Then("manage layup option is displayed from edit menu on search results MOD")
	public void manage_layup_option_is_displayed_on_search_results_MOD() {
		Assert.assertTrue(searchPage.verifyManageLayupOptionFromEditMenuDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("manage layup option is displayed on SOD")
	public void manage_layup_option_is_displayed_on_SOD() {
		Assert.assertTrue(matSod.verifyManageLayupOptionFromSODDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("manage Layup page is displayed")
	public void manage_Layup_page_is_displayed() {
		Assert.assertTrue(manageLayup.manageLayupPageDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

}
