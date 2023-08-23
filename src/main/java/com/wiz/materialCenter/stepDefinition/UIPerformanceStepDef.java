package com.wiz.materialCenter.stepDefinition;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class UIPerformanceStepDef extends TestBase {
	NavigateWS navigate = new NavigateWS();
	MaterialMOD matMod = new MaterialMOD();
	MaterialSOD matSod = new MaterialSOD();
	
	@When("expands ferrous metals")
	public void expands_ferrous_metals() {
	    navigate.clickOnFerrousExpand();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("switch tree from materials to libraries")
	public void switch_tree_from_materials_to_libraries() {
	   // navigate.clickOnTreeSelection();
	    navigate.selectLibrariesTree();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("expands materials selector library")
	public void expands_materials_selector_library() {
	    navigate.clickOnMatSelExpand();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user clicks on Metals to open MOD")
	public void user_clicks_on_Metals_to_open_MOD() {
	    navigate.clickOnMetals();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user clicks on All Materials to open MOD")
	public void user_clicks_on_All_Mats_to_open_MOD() {
	    navigate.clickOnAllMats();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	
	@When("user clicks on Metals from Mat Selector Lib to open MOD")
	public void user_clicks_on_Metals_from_Mat_Selector_Lib_to_open_MOD() {
	    navigate.clickOnMetalsFromMatSelectorLib();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on the related material link from SOD page to view test data tab")
	public void click_on_the_related_material_link_from_SOD_page() {
		matSod.clickOnRelatedMatLink();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on test data tab from SOD page")
	public void click_on_test_data_tab_from_SOD_page() {
		matSod.clikOnTestDataTab();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@When("switch to Polymers MOD")
	public void switch_to_Polymers_MOD() {
	    navigate.clickOnPolymers();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select rows per page as fifty")
	public void select_rows_per_page_as_fifty() {
	   matMod.clickOnRowPerPage();
	   matMod.selectRowsPerPage50();
	   screenshot(driver, System.currentTimeMillis());
	}

	@When("now select rows per page as hundred")
	public void now_select_rows_per_page_as_hundred() {
		matMod.clickOnRowPerPage();
		matMod.selectRowsPerPage100();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("now select rows per page as two hundred fifty")
	public void now_select_rows_per_page_as_two_hundred_fifty() {
		matMod.clickOnRowPerPage();
		matMod.selectRowsPerPage250();
		screenshot(driver, System.currentTimeMillis());
	}

	/*@Then("select rows per page as five hundred")
	public void select_rows_per_page_as_five_hundred() {
		matMod.clickOnRowPerPage();
		matMod.selectRowsPerPage500();
		screenshot(driver, System.currentTimeMillis());
	}*/
	
/*	@Then("Click on rows per page")
	public void Click_on_rows_per_page() {
		matMod.clickOnRowPerPage();
		screenshot(driver, System.currentTimeMillis());
	}*/
	
	@And("click on rows per page")
	public void click_on_rows_per_page() {
		 matMod = new MaterialMOD();
		matMod.clickOnRowPerPage();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("Click on fifty")
	public void click_on_fifty() {
		matMod.selectRowsPerPageas50();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on three")
	public void click_on_three() throws InterruptedException {
		matMod.selectRowsPerPageas3();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select rows per page as five hundred")
	public void click_on_five_hundred() throws InterruptedException{
		matMod.selectRowsPerPageas500();
	    screenshot(driver, System.currentTimeMillis());
	}
	
		
	@And("select rows per page as hundred")
	public void click_on_hundred() throws InterruptedException{
		matMod.selectRowsPerPageas100();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	
	@And("select rows per page as two fifty")
	public void click_on_two_fifty(){
		matMod.selectRowsPerPageas250();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("open configure columns and click on more button")
	public void open_configure_columns_and_click_on_more_button() {
	    matMod.selectConfigCol();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select density filter and click on ok button")
	public void select_density_filter_and_click_on_ok_button() {
	    matMod.selectDensityCol();
	    screenshot(driver, System.currentTimeMillis());
	    matMod.clickOnOkButton();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select created at filter and click on ok button")
	public void select_created_at_filter_and_click_on_ok_button() {
	    matMod.selectCreatedAtCol();
	    screenshot(driver, System.currentTimeMillis());
	    matMod.clickOnOkButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on density column and select filter")
	public void click_on_density_column_and_select_filter() {
	    matMod.verifyDensityCol();
	    matMod.selectDensityFilter();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on created at column and select sort descending")
	public void click_on_created_at_column_and_select_sort_descending() throws InterruptedException {
	    matMod.verifyCreatedAtCol();
	    matMod.selectCreatedAtSortDescending();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("move density slider for particular limit and click ok button")
	public void move_density_slider_for_particular_limit_and_click_ok_button() {
	    matMod.setDensityRange();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("density filter is applied successfully")
	public void density_filter_is_applied_successfully() {
	    matMod.verifyDensityCol();
	    screenshot(driver, System.currentTimeMillis());
	}

}
