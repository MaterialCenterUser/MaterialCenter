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

public class FilterMODColumnStepDef extends TestBase {
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
	
	@And("click on release level column")
	public void click_on_release_level_column() {
		matMod.clickOnRLColumn();
	}
	
	@Then("search textbox is displayed")
	public void verify_search_textbox_is_displayed() {
		Assert.assertTrue(matMod.verifyFilterSearchBox());
}
	
	@Then("select all checkbox is displayed")
	public void verify_select_all_checkbox_is_displayed() {
		Assert.assertTrue(matMod.verifyFilterSelectAllCheckBox());
	
	}
	@Then("blank checkbox is displayed")
	public void verify_blank_checkbox_is_displayed() {
		Assert.assertTrue(matMod.verifyFilterBlankCheckBox());
	
	}
	
	@Then("cancel button is displayed")
	public void verify_cancel_button_is_displayed() {
		Assert.assertTrue(matMod.verifyFilterCancelButton());
	
	}
	
	@Then("ok button is displayed")
	public void verify_ok_button_is_displayed() {
		Assert.assertTrue(matMod.verifyFilterOkButton());
	
	}
	@Then("close button is displayed")
	public void verify_close_button_is_displayed() {
		Assert.assertTrue(matMod.verifyFilterCloseButton());
	
	}
	@Then("filter UI is closed")
	public void verify_filter_UI_is_closed() {
		Assert.assertFalse(matMod.verifyFilterUIDisplayed());
	}
	
	@Then("clear column filter option is displayed")
	public void verify_clear_column_filter_option_is_displayed() {
		Assert.assertTrue(matMod.verifyFilterClearColumnFilterOption());
	}
	@Then("filter is removed from column")
	public void filter_is_removed_from_column() {
		Assert.assertFalse(matMod.verifyFilterIsRemoved());
	}

	@Then("clear filter option is displayed")
	public void clear_filter_option_is_displayed() {
		Assert.assertTrue(matMod.clearFilterOptionDisplayed());
	}
	
	@And("click on clear filter option")
	public void click_on_clear_filter_option() {
		matMod.clickClearFilter();
			
	}
	@And("click on user name column and select filter")
	public void click_on_user_name_column_and_select_filter() {
		adminPage.selectUserNameFilter();		  
		}
	
	
	@Then("one row is displayed in filter results")
	public void one_row_is_displayed_in_filter_results() {
		Assert.assertTrue(adminPage.verifyFilterResultsDisplayedOneRow());
		
	}
	@Then("filter image is displayed with column name")
	public void verify_filter_image_is_displayed_with_column_name() {
		Assert.assertTrue(matMod.verifyFilterImageDisplayed());
		
	}
		
	@Then("blank filter is applied and results are correct")
	public void verify_blank_filter_is_applied_and_results_are_correct() {
		Assert.assertTrue(matMod.verifyBlankFilterApplied());
	}
	@Then("newly created user is displayed in the filter list")
	public void newly_created_user_is_displayed_in_the_filter_list() {
		Assert.assertTrue(adminPage.verifyNewUserDisplayedInList());
	}
	
	@Then("new user is displayed in filter results")
	public void new_user_is_displayed_in_filter_results() {
		Assert.assertTrue(adminPage.verifyNewUserFilterResult());
	}
	
	
	@And("check the new user checkbox and click on ok button")
	public void select_new_user_checkbox_and_click_on_ok_button() throws InterruptedException {
		adminPage.clickNewUserFilterCheckbox();
			
	}
	
	@And("select blank checkbox filter and click on ok button")
	public void select_blank_checkbox_filter_and_click_on_ok_button() throws InterruptedException {
		matMod.clickBlankCheckboxFilter();
			
	}
	@And("select select all checkbox filter and click on ok button")
	public void select_select_all_checkbox_filter_and_click_on_ok_button() {
		matMod.clickSelectAllCheckboxFilter();
			
	}
	
	@And("select select all checkbox filter")
	public void select_select_all_checkbox_filter() {
		matMod.clickSelectAllCheckbox();
			
	}

	@Then("all the checkboxes are selected")
	public void verify_all_the_checkboxes_are_selected() {
		Assert.assertTrue(matMod.verifyAllCheckBoxesSelected());
	}
	@And("click on clear column filter option")
	public void click_on_clear_column_filter_option() {
		matMod.clickClearColumnFilterOption();
			
	}
	
}
