package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.CompareProcessPage;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompareUIStepDef extends TestBase {
	MaterialMOD matMod = new MaterialMOD();
	CompareProcessPage compare = new CompareProcessPage();
	MaterialSOD matSod = new MaterialSOD();
	HomePage homePage = new HomePage();
	
	@When("select fifteen materials")
	public void select_fifteen_materials() {
	    matMod.selectMultiMat();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("right click to select compare option")
	public void right_click_to_select_compare_option() {
		matMod.rightClickOnMats();
		screenshot(driver, System.currentTimeMillis());
		matMod.clickOnCompare();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("compare results displayed")
	public void compare_results_displayed() {
	    compare.compareResult();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("double click on material")
	public void double_click_on_material() {
	    matMod.doubleClickOnSecondMat();
	    matSod.storeClassificationValuesBeforeEdit();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("double click on first material")
	public void double_click_on_materialEdit() {
	    matMod.doubleClickOnFirstMat();
	   // matSod.storeClassificationValuesBeforeEdit();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on property set and uncheck select all checkbox")
	public void click_on_property_set_and_uncheck_select_all_checkbox() {
	    matSod.propSetSelect();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("no property set selected msg is displayed")
	public void no_property_set_selected_msg_is_displayed() {
	    matSod.verifyNoPropMsg();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on property set and check select all checkbox")
	public void click_on_property_set_and_check_select_all_checkbox() {
		matSod.propSetSelect();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("all property set of material is displayed")
	public void all_property_set_of_material_is_displayed() {
		matSod.verifyPropSetDisplay();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Given("user is on dashboard page")
	public void user_is_on_dashboard_page() {
	    homePage.verifyClipboard();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("user clicks on configuration tab")
	public void user_clicks_on_configuration_tab() {
	    homePage.clickOnConfiguration();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("verify that material SOD is open")
	public void verify_that_material_SOD_is_open() {
		matSod.verifyPropSetDisplay();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on collapse thumbnail of curve")
	public void click_on_collapse_thumbnail_of_curve() {
	    matSod.selectCollapseCurve();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on expand thumbnail of curve")
	public void click_on_expand_thumbnail_of_curve() {
	    matSod.selectExpandCurve();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("click on curve to open curve applet")
	public void click_on_curve_to_open_curve_applet() {
	    matSod.openCurveApplet();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("go to revisions tab of material")
	public void go_to_revisions_tab_of_material() {
	    matSod.clickOnRevisionsTab();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select fifty materials")
	public void select_fifty_materials() {
	    matSod.selectMatRevisions();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("right click on revisions to select compare option")
	public void right_click_on_revisions_to_select_compare_option() {
	    matSod.performComapreAction();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select show differences only from Display dropdown")
	public void select_show_differences_only_from_Display_dropdown() {
	    compare.displaydiffOnly();
	}

	@Then("verify that all differences are displayed in highlighted color")
	public void verify_that_all_differences_are_displayed_in_highlighted_color() {
	    compare.printAllDiffValues();
	}

}
