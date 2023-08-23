package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class SearchStepDef extends TestBase {
	SearchPage search = new SearchPage();
	HomePage homePage = new HomePage();
	MaterialSOD matSod = new MaterialSOD();
	
	@Given("user gives some text to search in materials")
	public void user_gives_some_text_to_search_in_materials() {
		//search = new SearchPage();
	    search.enterTextSearch();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("search result is displayed")
	public void search_result_is_displayed() {
		search.searchResult();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@When("SOD page is displayed")
	public void sod_is_displayed() {
		matSod.verifyDetailsTab();
		screenshot(driver, System.currentTimeMillis());
	}
	
	

	@When("user gives some numerical values to search in materials")
	public void user_gives_some_numerical_values_to_search_in_materials() {
	    search.enterNumericalSearch();
	    screenshot(driver, System.currentTimeMillis());
	}

	/*@Then("numerical search result is displayed")
	public void numerical_search_result_is_displayed() {
	    search.searchResult();
	    screenshot(driver, System.currentTimeMillis());
	}*/
	
	@When("user click on save button")
	public void user_click_on_save_button() {
	    search.clickOnSaveButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("user saves the search template by entering the name")
	public void user_saves_the_searched_template() {
	    search.clickOnSaveSearch();
	    screenshot(driver, System.currentTimeMillis());
	}
	@Then("relaunch the saved search template")
	public void relaunch_the_saved_search_template() {
		search = new SearchPage();
	    search.relaunchSearch();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("relaunch the recently saved search template")
	public void relaunch_the_recently_saved_search_template() {
		//search = new SearchPage();
	    search.relaunchLatestSearch1();
	   // search.verifysavedSearch();
	}
	@And ("click on my searches")
	public void click_on_my_searches() {
		//search = new SearchPage();
	    search.clickonMySearches();
	    
	}
	
	@And ("click on search template link from home page")
	public void click_on_search_template_link_from_home_page() {
	    search.clickOnTemplateLinkFromHomePage();
	}
	@Given("user comes on search WS")
	public void user_is_on_search_page() {
	    homePage.clickOnSearch();
	   // search.clickOnMaterial();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Given("user click on material from search page")
	public void user_click_on_material_from_search_page() throws InterruptedException {
	    //homePage.clickOnSearch();
	    search.clickOnMaterial();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Given("user is on search workspace")
	public void user_is_on_search_workspace() {
		//homePage = new HomePage();
	    homePage.clickOnSearch();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Given("user comes on search page")
	public void user_comes_on_search_page() {
	    search.clickOnSearchButton();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("user click on add condition")
	public void user_click_on_add_condition() {
		search=new SearchPage();
	    search.selectAddCondition();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user adds density attribute condition")
	public void user_adds_density_attribute_condition() {
	    search.addDensityAttr();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("user provides range using slider")
	public void user_provides_range_using_slider() throws InterruptedException {
	    search.expandDensityAttr();
	    search.provideDensityRange();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("search result for given condition")
	public void search_result_for_given_condition() {
	    search.applyDensityChange();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("add yield strength attribute condition")
	public void add_yield_strength_attribute_condition() {
	    search.addYieldStrength();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user selects test data type from search dropdown")
	public void user_selects_test_data_type_from_search_dropdown() {
	    search.clickOnSearchDropDown();
	    search.selectTestDataSearch();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user selects CAE Model type from search dropdown")
	public void user_selects_CAE_Model_type_from_search_dropdown() {
	    search.clickOnSearchDropDown();
	    homePage.selectCAEModelSearch();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Given ("user click on search dropdown")
	public void user_click_on_search_dropdown() {
	    search.clickOnSearchDropDown();
	    //search.selectCAEModelSearch();
	    screenshot(driver, System.currentTimeMillis());
	    
	}
	
	@When("user selects CAE Model from dropdown")
	public void user_selects_CAE_Model_from_dropdown() {
		homePage.selectCAEModelSearch();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("user gives search input in search field")
	public void user_gives_search_input_in_search_field() {
	    search.enterTestDataSearch();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user gives search input for CAE in search field")
	public void user_gives_search_input_for_CAE_in_search_field() {
	    search.enterCAEModelSearch();
	    screenshot(driver, System.currentTimeMillis());
	}

	
	@When("user clicks on Test option")
	public void user_clicks_on_Test_option() {
	    search.clickOnTestOpt();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user clicks on Measure property option")
	public void user_clicks_on_Measure_property_option() {
	    search.clickOnMeasurePropOpt();
	}
	
	@When("verify that correct text search result is displayed")
	public void verify_that_correct_text_search_result_is_displayed() {
		//search = new SearchPage();
	    search.verifyTextSearchResult();
	}
	
	@Then("verify that correct numerical search result is displayed")
	public void verify_that_correct_numerical_search_result_is_displayed() {
	    search.verifyNumericalSearchResult();
	}

}
