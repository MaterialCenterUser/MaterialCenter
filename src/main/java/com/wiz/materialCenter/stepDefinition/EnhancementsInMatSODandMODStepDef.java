package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.AdministrationPage;
import com.wiz.materialCenter.pages.CompareProcessPage;
import com.wiz.materialCenter.pages.CurvePropertySOD;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;
import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EnhancementsInMatSODandMODStepDef extends TestBase {
	MaterialMOD matMod = new MaterialMOD();
	MaterialSOD matSod = new MaterialSOD();
	HomePage homepage = new HomePage();
	ProcessesPage processesPage = new ProcessesPage();
	AdministrationPage adminPage = new AdministrationPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	SearchPage searchPage = new SearchPage();
	CompareProcessPage compare = new CompareProcessPage();
	
	CurvePropertySOD curveProp = new CurvePropertySOD();

	@Then("the properties text is displayed for classfication and checkbox is not present for properties {string}")
	public void the_properties_text_is_displayed_and_checkbox_is_not_present_for_properties(
			String expClassificationTag) {
		String actualClassificationTag = matSod.getTextClassificationTag();
		Assert.assertEquals(actualClassificationTag, expClassificationTag);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the properties text is displayed for Assembly and checkbox is not present for properties {string}")
	public void the_properties_text_is_displayed_for_Assembly_and_checkbox_is_not_present_for_properties(
			String expAssemblyTag) {
		String actualAssemblyTag = matSod.getTextAssemblyTag();
		Assert.assertEquals(actualAssemblyTag, expAssemblyTag);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("the properties text is displayed for Composition and checkbox is not present for properties {string}")
	public void the_properties_text_is_displayed_for_Composition_and_checkbox_is_not_present_for_properties(
			String expCompositionTag) {
		String actualCompositionTag = matSod.getTextCompositionTag();
		Assert.assertEquals(actualCompositionTag, expCompositionTag);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("user gets add to compare action")
	public void user_gets_add_to_compare_action() {
		Assert.assertTrue(matMod.verifyAddToCompareAction());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on Add to Compare action")
	public void click_on_Add_to_Compare_action() {
		matMod.clickAddToCompareAction();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("User gets compareresults page with property set displayed")
	public void User_gets_compareresults_page_with_property_set_displayed() {
		Assert.assertTrue(compare.verifyCompareResultsPageDisplayed());
		Assert.assertTrue(compare.verifyPropertySetDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("right click on material")
	public void right_click_on_material() {
		matMod.rightClickOnMats();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("homepage is displayed")
	public void homepage_is_displayed() {
		Assert.assertTrue(homepage.verifyHomePageDisplayed());
		
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("right click on first element")
	public void right_click_on_first_element() {
		searchPage.rightClickOnElement();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select first material")
	public void click_on_material() {
		searchPage.clickOnMats();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("move to actions and select add to compare option")
	public void move_to_actions_and_select_add_to_compare_option() {
		matMod.moveToActionClickAddToCompare();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("user click on curve property from search page")
	public void user_click_on_curveproperty_from_search_page() throws InterruptedException {
	    //homePage.clickOnSearch();
		searchPage.clickOnCurveProperty();
	    screenshot(driver, System.currentTimeMillis());
	}


	@And("move to actions")
	public void move_to_actions() {
		matMod.moveToActions();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("test search results displayed")
	public void test_search_results_displayed() {
		Assert.assertTrue(searchPage.verifyTestSearchDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("CAE search results displayed")
	public void CAE_search_results_displayed() {
		Assert.assertTrue(searchPage.verifyCAESearchDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@And("materials search results displayed")
	public void materials_search_results_displayed() {
		Assert.assertTrue(searchPage.verifyMaterialsSearchDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("select add to compare action")
	public void select_add_to_compare_action() {
		matSod.selectAddToCompareAction();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("double click on first result")
	public void double_click_on_first_result() {
		searchPage.doubleClickOnFirstMat();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("double click on first curve property result")
	public void double_click_on_curve_result() {
		searchPage.doubleClickOnFirstCurve();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on the curve file link from curve SOD page")
	public void click_on_the_curve_file_link() {
		curveProp.clickOnCurveFileDownloadLink();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("double click on first material from search")
	public void double_click_on_first_material_from_search() {
		searchPage.doubleClickOnFirstMaterial();
		screenshot(driver, System.currentTimeMillis());
	}
	
	

	@And("user expands curves attribute")
	public void user_expands_curves_attribute() {
		searchPage.expandCurveAttribute();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select the curve atribute from drodown")
	public void select_the_curve_atribute_from_drodown() {
		searchPage.selectCurveAttributeFromDropdown();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on apply the changes for curve attribute")
	public void click_on_apply_the_changes_for_curve_attribute() throws InterruptedException {
		searchPage.clickApplyChangesForCurves();
		Thread.sleep(1000);
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select checkboxes for properties")
	public void select_checkboxes_for_properties() {
		matSod.selectCheckBoxesForProperties();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select compare from actions dropdown")
	public void select_compare_from_actions_dropdown() {
		matSod.selectCompareOptionFromActionDropdown();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select add to compare from actions dropdown")
	public void select_add_to_compare_from_actions_dropdown() {
		matSod.selectAddToCompareOptionFromActionDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select add property to clipboard from actions dropdown")
	public void select_add_property_to_clipboard_from_actions_dropdown() throws InterruptedException {
		matSod.selectAddPropToClipOptionFromActionDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on view all under clipboard")
	public void click_on_view_all_under_clipboard() {
		homepage.clickOnViewAllUnderClipBoard();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("user enters searchtext for materials search {string}")
	public void user_enters_searchtext_for_materials_search(String textToSearch) {
		homepage.enterTextForSearch(textToSearch);
	}
	@And("click on any value from manyref object material")
	public void click_on_any_value_from_manyref_object_material() {
		matSod.clickOnAnyMatRefObject();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("compare curve property results page is displayed with available comparators")
	public void compare_curve_property_results_page_is_displayed() {
		Assert.assertTrue(compare.verifyCompareCurvePropResultsPageDisplayed());
		Assert.assertTrue(compare.verifyComparatorsDropdownDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("the curve properties display on my workspace page")
	public void the_curve_properties_display_on_my_workspace_page() {
		Assert.assertTrue(workSpacePage.verifyCurvePropertiesDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("user gets add to compare option")
	public void user_gets_add_to_compare_option() {
		Assert.assertTrue(matMod.verifyAddToCompareOption());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("curve file is downloaded")
	public void curve_file_is_downloaded() {
		String curveFileName = "Curve0";
		Assert.assertTrue(CurvePropertySOD.isFileDownloaded(curveFileName));
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("add property to clipboard action is displayed in actions dropdown")
	public void add_property_to_clipboard_action_is_displayed_in_actions_dropdown() {
		Assert.assertTrue(matSod.verifyAddPropertiesToClipboardAction());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("verify the curve property search is displayed")
	public void verify_the_curve_property_search_is_displayed() {
		Assert.assertTrue(searchPage.verifyCurvePropertySearchDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("material SOD page is displayed")
	public void material_SOD_page_is_displayed() {
		Assert.assertTrue(matSod.verifyMatSODPageDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("curve property SOD page is displayed")
	public void curve_property_page_is_displayed() {
		Assert.assertTrue(matSod.verifyCurvePropSODPageDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("the curve file download link is available on SOD page")
	public void curve_file_download_link_is_displayed() {
		Assert.assertTrue(curveProp.verifyCurveFileDownloadLinkDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("Manyref objects are displayed on material SOD page")
	public void Manyref_objects_are_displayed_on_material_SOD_page() {
		Assert.assertTrue(matSod.verifyManyRefObjectsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
}
