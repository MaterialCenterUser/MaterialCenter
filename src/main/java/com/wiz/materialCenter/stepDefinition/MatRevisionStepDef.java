package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.EditMatProcess;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MatRevisionStepDef extends TestBase {
	
	NavigateWS navigate = new NavigateWS();
	MaterialMOD matMod = new MaterialMOD();
	EditMatProcess edit = new EditMatProcess();
	MaterialSOD matSod = new MaterialSOD();
	SearchPage search = new SearchPage();
	
	@When("click on material design data")
	public void click_on_material_design_data() {
	    navigate.clickOnMatDesignData();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("sort the material in descending order of revisions")
	public void sort_the_material_in_descending_order_of_revisions() {
	    matMod.clickOnRevisionTab();
	    matMod.clickOnSorting();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select the material with max revisions")
	public void select_the_material_with_max_revisions() {
	    matMod.doubleClickMat_Ford();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("navigate to properties tab and edit properties")
	public void navigate_to_properties_tab_and_edit_properties() {
	    edit.editPropDetails();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("material revisions should be done successfully")
	public void material_revisions_should_be_done_successfully() {
	    matSod.verifyPropSetDisplay();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Given("user gives material to search")
	public void user_gives_material_to_search() {
	    search.enterTextSearch1();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("doubleclick on material from search results")
	public void material_is_displayed_and_open_the_material() {
	    matMod.doubleClickMat_Ford();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("edit mechanical and curves properties")
	public void navigate_to_properties_tab_and_edit_mechanical_and_curves_properties() {
	    edit.editMultiplePropDetails();
	    screenshot(driver, System.currentTimeMillis());
	}

}
