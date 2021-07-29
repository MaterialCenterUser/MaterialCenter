package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.CompareProcessPage;
import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UIWorkshopStepDef extends TestBase {
	
	HomePage homepage = new HomePage();
	NavigateWS navigateWS = new NavigateWS();
	MaterialMOD matMod = new MaterialMOD();
	MaterialSOD matSod = new MaterialSOD();
	SearchPage search = new SearchPage();
	ConfigurationWS config = new ConfigurationWS();
	CompareProcessPage compare = new CompareProcessPage();
	MaterialMOD materialMod = new MaterialMOD();
	
	@When("user verfies the homepage gadgets")
	public void user_verfies_the_homepage_gadgets() {
	    homepage.verifyLibraries();
	    screenshot(driver, System.currentTimeMillis());
	    homepage.verifySearchTemplates();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("create new dashboard using add new dashboard action")
	public void create_new_dashboard_using_add_new_dashboard_action() {
	    homepage.addNewDashboard();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("configure the newly added dashboard")
	public void configure_the_newly_added_dashboard() {
	    homepage.configDashboard();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on edit dashboard")
	public void click_on_edit_dashboard() {
	    homepage.editDashboard();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("navigate back to home page")
	public void navigate_back_to_home_page() {
	    homepage.navigateBacktoHome();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	

	@When("verify that configuration of new dashboard is done successfully")
	public void verify_that_configuration_of_new_dashboard_is_done_successfully() {
	    homepage.verifyFolders();
	    screenshot(driver, System.currentTimeMillis());
	//    homepage.verifyMyInfo();
	  //  screenshot(driver, System.currentTimeMillis());
	}

	@Then("change the current units system to US-customary")
	public void change_the_current_units_system_to_US_customary() {
	    homepage.changeUnitSystem();
	    screenshot(driver, System.currentTimeMillis());
	    homepage.verifyFolders();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("open the wrought metals list under non ferrous aluminum section")
	public void open_the_wrought_metals_list_under_non_ferrous_aluminum_section() {
	    navigateWS.clickOnNonFerrousExpand();
	    navigateWS.clickOnAluminumExpand();
	    navigateWS.clickOnWroughtMetals();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("verify the count of the materials in this list is correct")
	public void verify_the_count_of_the_materials_in_this_list_is_correct() {
	    matMod.verifyWroughtCount();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on heat treatment tab on MOD and select sort ascending")
	public void click_on_heat_treatment_tab_on_MOD_and_select_sort_ascending() {
	    matMod.sortHeatTreatment();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("open configure columns to select Create At and Created By into visible columns")
	public void open_configure_columns_to_select_Create_At_and_Created_By_into_visible_columns() {
	    matMod.configColumns();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("save the private view under arrow button and check show as default view")
	public void save_the_private_view_under_arrow_button_and_check_show_as_default_view() {
	    matMod.savePrivateView();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on configure column option")
	public void click_on_configure_column_option() {
	    materialMod.clickOnConfigureColumn();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select the export option and click on selected rows radio button")
	public void select_the_export_option_and_click_on_selected_rows_radio_button() {
	    matMod.exportMat();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("click on ok button to export the materials into excel")
	public void click_on_ok_button_to_export_the_materials_into_excel() {
	    matMod.okButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user expands alloy steels under ferrous metals")
	public void user_expands_alloy_steels_under_ferrous_metals() {
	  //  navigateWS.clickOnFerrousExpand();
	    navigateWS.clickOnAlloySteelsExpand();
	    //navigateWS.clickOnUltraHighStrength();
	    screenshot(driver, System.currentTimeMillis());
	}
	@And("user expands ferrous metals")
	public void user_expands_ferrous_metals() {
	  navigateWS.clickOnFerrousExpand();
	    //navigateWS.clickOnAlloySteelsExpand();
	    //navigateWS.clickOnUltraHighStrength();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("user expands stainless steel")
	public void user_expands_stainless_steel() {
	  //  navigateWS.clickOnFerrousExpand();
	    navigateWS.clickOnStainlessSteelsExpand();
	    //navigateWS.clickOnUltraHighStrength();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user expands age hardenable")
	public void user_expands_age_hardenble() {
	  //  navigateWS.clickOnFerrousExpand();
	    navigateWS.clickOnAgeHardExpand();
	    //navigateWS.clickOnUltraHighStrength();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user expands speciality")
	public void user_expands_speciality() {
	  //  navigateWS.clickOnFerrousExpand();
	    navigateWS.clickOnSpecialityExpand();
	    //navigateWS.clickOnUltraHighStrength();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user expands ultra high strength")
	public void user_expands_ultra_high_strength() {
	  //  navigateWS.clickOnFerrousExpand();
	   // navigateWS.clickOnAlloySteelsExpand();
	    navigateWS.clickOnUltraHighStrength();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select D-sixA Alloy Steel metal under ultra high strength")
	public void select_D_sixA_Alloy_Steel_metal_under_ultra_high_strength() {
	    matMod.selectAlloySteelEle();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select Stainless Steel PH14-8 Mo")
	public void select_Stainless_Steel_Mo() {
	    matMod.selectStainlessSteelPH14Ele();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select nitronic32")
	public void select_Nitronic32() {
	    matMod.selectnitronic32Ele();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("verify that all classification and property sets are listed on SOD under details tab")
	public void verify_that_all_classification_and_property_sets_are_listed_on_SOD_under_details_tab() {
	    matSod.verifyPropSets();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("mouse over on tensile ultimate strength value to check the property value and source attributes")
	public void mouse_over_on_tensile_ultimate_strength_value_to_check_the_property_value_and_source_attributes() {
	    matSod.verifytooltipContent();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on magnifying glass icon to open the all details in seperate window popup")
	public void click_on_magnifying_glass_icon_to_open_the_all_details_in_seperate_window_popup() {
	    matSod.clickOnMagnifyingGlass();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("verify that in prpoerty details window popup classification are on top followed by other properties and close it")
	public void verify_that_in_prpoerty_details_window_popup_classification_are_on_top_followed_by_other_properties_and_close_it() {
		matSod = new MaterialSOD();
	    matSod.verifyPopupContent();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on plus symbol next to test temp under mechanical prop to check parameter ranges and corresponding values")
	public void click_on_plus_symbol_next_to_test_temp_under_mechanical_prop_to_check_parameter_ranges_and_corresponding_values() {
	    matSod.verifyRangeValues();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select expand parameters from Display dropdown on top of SOD")
	public void select_expand_parameters_from_Display_dropdown_on_top_of_SOD() {
	    matSod.displayDropdownParameters();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on parameters filter on top and select test temp to apply filter")
	public void click_on_parameters_filter_on_top_and_select_test_temp_to_apply_filter() {
	    matSod.filterTestTempParameter();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("check that only single test temp displayed in mechanical property and add this material to clipboard")
	public void check_that_only_single_test_temp_displayed_in_mechanical_property_and_add_this_material_to_clipboard() {
	    matSod.verifySingleTestTemp();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select Display source from Display dropdown on top of SOD")
	public void select_Display_source_from_Display_dropdown_on_top_of_SOD() {
	    matSod.displayDropdownSources();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("add source databank and source document publisher in display source col")
	public void add_source_databank_and_source_document_publisher_in_display_source_col() {
	    matSod.addDisplaySource();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("verify that source databank and source document publisher is displayed on SOD for respective properties")
	public void verify_that_source_databank_and_source_document_publisher_is_displayed_on_SOD_for_respective_properties() {
	    matSod.verifyDatabankValues();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("clear source and parameter filter from Display dropdown")
	public void clear_source_and_parameter_filter_from_Display_dropdown() {
	    matSod.clearSourceParameters();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("mouse over footnote value against poisson ratio and check the footnote")
	public void mouse_over_footnote_value_against_poisson_ratio_and_check_the_footnote() {
	    matSod.mouseOverFootnote();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("scroll down till mechanical tag is displayed")
	public void scroll_down_till_mechanical_tag_is_displayed() {
	    matSod.scrollToMechanicalTag();
	    screenshot(driver, System.currentTimeMillis());
	}

	
	@When("in main menu select Options to check the footnotes inline checkbox")
	public void in_main_menu_select_Options_to_check_the_footnotes_inline_checkbox() {
	    matSod.footnoteInlineOptions();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("open the same material")
	public void open_the_same_material() {
	    homepage.clickOnNavigate();
	    navigateWS.clickOnFerrousExpand();
	    navigateWS.clickOnAlloySteelsExpand();
	    navigateWS.clickOnUltraHighStrength();
	    matMod.selectAlloySteelEle();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("verify that footnotes are now displayed inline next to property values")
	public void verify_that_footnotes_are_now_displayed_inline_next_to_property_values() {
	    matSod.verifyFootnoteInline();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select the Revisions tab to check the useful info regarding revisions of material")
	public void select_the_Revisions_tab_to_check_the_useful_info_regarding_revisions_of_material() {
	    matSod.verifyRevisionsTab();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("go to comments tab and add new comment using add button")
	public void go_to_comments_tab_and_add_new_comment_using_add_button() {
	    matSod.addNewComment();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("go to process viewer tab to open the interactive diagram of object and processes")
	public void go_to_process_viewer_tab_to_open_the_interactive_diagram_of_object_and_processes() {
	    matSod.verifyProcessViewerTab();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("click on pedigree viewer icon on toolbar to open pedigree workspace tab")
	public void click_on_pedigree_viewer_icon_on_toolbar_to_open_pedigree_workspace_tab() {
	    matSod.verifyPedigreeWorkspace();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("expand material type filter")
	public void expand_material_type_filter() {
	    search.expandMatType();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select metals option")
	public void select_metals_option() {
	    search.applyMatTypeFilter();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user saves the filtered search template")
	public void user_saves_the_filtered_search_template() {
		search.clickOnSaveSearch1();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("navigate to homepage and verify that saved search result is displayed under search templates")
	public void navigate_to_homepage_and_verify_that_saved_search_result_is_displayed_under_search_templates() throws InterruptedException {
	    homepage.clickOnDashboard();
	    homepage.verifySavedSearchTemplate();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on configure find similar link")
	public void click_on_configure_find_similar_link() {
	    config.clickOnFindSimilar();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("add class family form subclass under classification tab")
	public void add_class_family_form_subclass_under_classification_tab() {
	    config.modifyFindSimilar();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on Ok button on information popup")
	public void click_on_Ok_button_on_information_popup() {
		config.clickOkInfoDialog();
	}
	
	@When("click on find similar icon on toolbar")
	public void click_on_find_similar_icon_on_toolbar() {
	    matSod.clickOnFindSimilar();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("find similar search result is displayed")
	public void find_similar_search_result_is_displayed() {
		 search = new SearchPage();
	    search.verifySimilarSearchResult();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select two materials")
	public void select_two_materials() {
	    matMod.selectTwoMat();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select compare option from Actions menu")
	public void select_compare_option_from_Actions_menu() {
		matMod.performCompare();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Given("user comes on search homepage")
	public void user_comes_on_search_homepage() {
		 homepage = new HomePage();
	    homepage.clickOnSearch();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select the curve property option")
	public void select_the_curve_property_option() {
	    search.openCurveProp();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("expand property def filter")
	public void expand_property_def_filter() {
	    search.expandPropDef();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select Compressive Stress in L-dir Vs Strain and click the check symbol to apply")
	public void select_Compressive_Stress_in_L_dir_Vs_Strain_then_click_the_check_symbol_to_apply() {
	    search.applyPropDef();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	

	@When("select first and third curve property result to compare")
	public void select_first_and_third_curve_property_result_to_compare() {
	    matMod.selectMatForCurveCompare();
	   // matMod.performCompare();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	/*@When("click on compare from actions")
	public void click_on_compare_from_actions() {
	  //  matMod.selectMatForCurveCompare();
	    matMod.performCompare();
	    screenshot(driver, System.currentTimeMillis());
	}*/

	@When("select Property option from Available Comparators dropdown")
	public void select_Property_option_from_Available_Comparators_dropdown() {
	    compare.selectPropOption();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("click on select page option from curve property")
	public void click_on_select_page_option() {
	    materialMod.clickOnSelectPageFromCurveProperty();
	    screenshot(driver, System.currentTimeMillis());
	}
	

	@When("click on property curve to open in large viewer window")
	public void click_on_property_curve_to_open_in_large_viewer_window() {
	    compare.openPropCurve();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on calculator to select Interpolate option")
	public void click_on_calculator_to_select_Interpolate_option() {
	    compare.openCalculator();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("provide the value of X and select the compute Y button")
	public void provide_the_value_of_X_and_select_the_compute_Y_button() {
	    compare.computeYvalue();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("apply it by clicking on ok button and close the curve viewer")
	public void apply_it_by_clicking_on_ok_button_and_close_the_curve_viewer() {
	    compare.closeCurveDialog();
	    compare.compareResult();
	    screenshot(driver, System.currentTimeMillis());
	}

}
