package com.wiz.materialCenter.stepDefinition;

import org.junit.Assert;

import com.wiz.materialCenter.pages.AdministrationPage;
import com.wiz.materialCenter.pages.CAEProcessInput;
import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.EditMatProcess;
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


public class ViewsStepDef extends TestBase {
	HomePage homePage = new HomePage();
	NavigateWS navigate = new NavigateWS();
	MaterialSOD matSod = new MaterialSOD();
	MaterialMOD matMod = new MaterialMOD();
	CAEProcessInput caeProccessInput = new CAEProcessInput();
	ProcessesPage processessPage = new ProcessesPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	ConfigurationWS configPage = new ConfigurationWS();	
	SearchPage searchPage = new SearchPage();
	
	AdministrationPage adminPage = new AdministrationPage();
	
	EditMatProcess editMat = new EditMatProcess();
	
	SecurityProcess secPrcoess = new SecurityProcess();
	
	@Then("set default view option is displayed")
	public void set_default_view_action__is_displayed() {
		Assert.assertTrue(matMod.verifySetDefaultViewActionDisplayed());
}
	@Then("saved private view with radio button is displayed")
	public void saved_private_view_with_radio_button_is_displayed() {
		Assert.assertTrue(matMod.privateViewRadioButtonDisplayed());
}
	
	@Then("save private view option is displayed")
	public void save_private_view_action__is_displayed() {
		Assert.assertTrue(matMod.verifySavePrivateViewActionDisplayed());
}
	@And("click on save private view option")
	public void click_on_save_private_view_option() {
		matMod.clickSavePrivateViewOption();
	}
	@And("enter view name to save private view {string} and click ok button")
	public void enter_view_name_to_save_private_view(String viewName) {
		matMod.enterViewName(viewName);
	}
		
	@And("click on set default view option")
	public void click_on_release_level_column() {
		matMod.clickSetDefaultViewOption();
	}
	
	@Then("default view with radio button is displayed")
	public void default_view_with_radio_button_is_displayed() {
		matMod.defaultViewRadioButtonDisplayed();
	}
	
	@Then("share view with radio button is displayed")
	public void share_view_with_radio_button_is_displayed() {
		matMod.shareViewRadioButtonDisplayed();
	}
	
	@Then("detailed view with radio button is displayed")
	public void detailed_view_with_radio_button_is_displayed() {
		matMod.detailedViewRadioButtonDisplayed();
	}
	

	@And("select default view from available views and click ok button")
	public void select_default_view_from_available_views() {
		matMod.selectDefaultView();
	}
	
	@And("select private view from available views and click ok button")
	public void select_private_view_from_available_views() {
		matMod.selectPrivateView();
	}

	
	@Then("default view results are displayed on MOD page")
	public void default_view_results_are_displayed_on_MOD_page() {
		matMod.defaultViewResultsDisplayed();
	}

	@And("select detailed view from available views and click ok button")
	public void select_detailed_view_from_available_views() {
		matMod.selectDetailedView();
	}
	
	@And("select share view from available views and click ok button")
	public void select_share_view_from_available_views() {
		matMod.selectShareView();
	}
	@Then("detailed view results are displayed on MOD page")
	public void detailed_view_results_are_displayed_on_MOD_page() {
		matMod.detailedViewResultsDisplayed();
	}

	@Then("share view results are displayed on MOD page")
	public void share_view_results_are_displayed_on_MOD_page() {
		matMod.shareViewResultsDisplayed();
	}
	@Then("private view results are displayed on MOD page")
	public void private_view_results_are_displayed_on_MOD_page() {
		matMod.privateViewResultsDisplayed();
	}

}
