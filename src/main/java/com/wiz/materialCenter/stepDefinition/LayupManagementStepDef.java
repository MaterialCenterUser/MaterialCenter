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
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


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
	@Then("layup details are populated for already submitted layup")
	public void layup_details_is_populated_for_already_submitted_layup() {
		Assert.assertTrue(manageLayup.onePlyisAdded());
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on export to xml option from material SOD page")
	public void click_on_export_to_xml_option_from_material_SOD_page() {
		matSod.clickOnExportToXml();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on manage layup from edit menu on SOD")
	public void click_on_manage_layup_from_edit_menu_on_SOD() {
		matSod.clickOnManageLayupFromSOD();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on submit button to export the xml")
	public void click_on_submit_button_to_export_the_xml() {
		matSod.clickOnExportXMLSubmit();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("export to xml is completed successfully")
	public void export_to_xml_is_completed_successfully() {
		processesPage.verifyProcessStatus();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("name is pre-populated and displayed on manage layup UI")
	public void name_is_prepopulated_and_displayed_on_manage_layup_UI() {
		Assert.assertTrue(manageLayup.verifyNamePopulatedDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("clear button is disabled before material data selection")
	public void clear_button_is_disabled_before_material_data_selection() {
		Assert.assertTrue(manageLayup.clearButtonDisabledInitially());
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("click on manage layup from edit menu on search results MOD")
	public void click_on_manage_layup_from_edit_menu_on_search_results_MOD() {
		searchPage.clickOnManageLayupFromMOD();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on material data type dropdown")
	public void click_on_material_data_type_type_dropdown() {
		manageLayup.clickOnMatDataTypeDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("seventh option in mat data type dropdown is displayed as {string}")
	public void seventh_option_in_process_type_dropdown_is_displayed(String expSeventhOption) {
		String actualSeventhOption = manageLayup.MatDataTypeGetSeventhOption();
		Assert.assertEquals(expSeventhOption, actualSeventhOption);
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("ninth option in mat data type dropdown is displayed as {string}")
	public void ninth_option_in_process_type_dropdown_is_displayed(String expNinthOption) {
		String actualninthOption = manageLayup.matDataTypeGetninthOption();
		Assert.assertEquals(expNinthOption, actualninthOption);
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("second option in mat data type dropdown is displayed as {string}")
	public void second_option_in_process_type_dropdown_is_displayed(String expSecondOption) {
		String actualSecondOption = manageLayup.MatDataTypeGetSecondOption();
		Assert.assertEquals(expSecondOption, actualSecondOption);
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("material data type is displayed in materials table as {string}")
	public void material_data_type_is_displayed_in_materials_table_as(String expMatDataType) {
		String actualMatDataType = manageLayup.getMatDataTypeFromMatTable();
		Assert.assertEquals(expMatDataType, actualMatDataType);
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on material data dropdown")
	public void click_on_mat_data_dropdown() {
		manageLayup.clickMatDataDropdownImage();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select composites from material data type dropdown")
	public void select_composites_from_mat_data_type_dropdown() {
		manageLayup.selectCompositesFromMatDataTypeDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("all the components listed are displayed as of selected mat data type composites")
	public void all_the_components_listed_are_displayed_as_of_selected_mat_data_type_composites() {
		Assert.assertTrue(manageLayup.verifyCompositesComponentsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("all the components listed are displayed as of selected mat data type metals")
	public void all_the_components_listed_are_displayed_as_of_selected_mat_data_type_metals() {
		Assert.assertTrue(manageLayup.verifyMetalsComponentsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on select button displayed against material data dropdown")
	public void click_on_select_button_displayed_mat_data_dropdown() {
		manageLayup.clickOnSelectButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify material data selection window is displayed")
	public void verify_material_data_selection_window_is_displayed() {
		Assert.assertTrue(manageLayup.materialsDataSelectionWindowDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select metals from material data type dropdown")
	public void select_metals_from_mat_data_type_dropdown() {
		manageLayup.selectMetalsFromMatDataTypeDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("clear button is enabled after material data selection")
	public void clear_button_is_enabled_after_material_data_selection() {
		Assert.assertTrue(manageLayup.clearButtonEnabledAfterMatDataSelection());
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on clear button next to material data")
	public void click_on_clear_button_next_to_material_data() {
		manageLayup.clickOnClearButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("the material data selection is removed")
	public void the_material_data_selection_is_removed() {
		Assert.assertTrue(manageLayup.matDataSelectionRemovedAfterClickOnClearButton());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("the material data is not selected initially and displayed empty")
	public void the_material_data_is_not_selected_initially_and_displayed_empty() {
		Assert.assertTrue(manageLayup.matDataSelectionRemovedAfterClickOnClearButton());
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select first row from mat data dropdown for composites")
	public void select_first_row_from_process_dropdown_composites() {

		manageLayup.selectFirstRowFromMatDataDropdownForComp();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select first row from mat data dropdown for metals")
	public void select_first_row_from_process_dropdown_metals() {

		manageLayup.selectFirstRowFromMatDataDropdownforMetals();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select second row from mat data dropdown for ceramics")
	public void select_second_row_from_process_dropdown_metals() {

		manageLayup.selectSecondRowFromMatDataDropdownforCeramics();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on add material data button")
	public void click_on_add_material_data_button() {

		manageLayup.clickOnAddMatDataButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("material data is added to the materials table")
	public void material_data_is_added_to_the_materials_table() {
		Assert.assertTrue(manageLayup.firstRemoveButtonDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on remove material button from last column in material data table")
	public void click_on_remove_material_button_from_last_column_in_material_data_table() {
		manageLayup.clickOnFirstRemoveMatButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("added material is removed from material data table")
	public void added_material_is_removed_from_material_data_table() {
		Assert.assertFalse(manageLayup.matIsRemovedFromMatDataTable());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("the material data entry is removed from select textbox in ply table")
	public void the_material_data_entry_is_removed_from_select_textbox_in_ply_table() {
		Assert.assertFalse(manageLayup.matIsRemovedFromMatDataTable());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("enter the stacking formula {string}")
	public void enter_the_stacking_formula(String stackFormula) {
		manageLayup.enterStackingFormula(stackFormula);
	}
	@And("click on update button to add stacking orientation")
	public void click_on_update_button_to_add_stacking_rientation() {
		manageLayup.clickOnUpdateButton();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on select box of first ply material data from ply table")
	public void click_on_select_box_of_first_ply_material_data_from_ply_table() {
		manageLayup.clickOnFirstMatDataSelectBoxFromPlyTable();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("the error message displayed for invalid stacking as {string}")
	public void the_error_message_displayed_for_invalid_stacking_as(String expErrorMessage) {
		String actualErrorMessage = manageLayup.verifyInvalidStackErrorMessage();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("the orienation in ply table is displayed as {string}")
	public void the_orienation_in_ply_table_is_displayed_as(String expFirstOrientPly) {
		String actualFirstOrientPly = manageLayup.getOrienationForOneply();
		Assert.assertEquals(expFirstOrientPly, actualFirstOrientPly);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("stacking formula is updated in stacking formula textbox and displayed as {string}")
	public void stacking_formula_is_updated_stacking_formula_textbox_and_displayed_as(String expStackFormula) {
		String actualStackFormula = manageLayup.getStackFormula();
		Assert.assertEquals(expStackFormula, actualStackFormula);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("one ply is added in ply table")
	public void one_ply_is_added_in_ply_table() {
		Assert.assertTrue(manageLayup.onePlyisAdded());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("remove ply button is displayed")
	public void remove_ply_button_is_displayed() {
		Assert.assertTrue(manageLayup.onePlyisAdded());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("all the added material data is displayed in material data selectbox")
	public void all_the_added_material_data_is_displayed_in_material_data_selectbox() {
		//Assert.assertTrue(manageLayup.firstMatDataEntrySelectInPlyTableCompositesDisplayed());
		Assert.assertTrue(manageLayup.firstMatDataEntrySelectInPlyTableMetalsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("layup tab is displayed on material SOD page")
	public void layup_tab_is_displayed_on_material_SOD_page() {
		Assert.assertTrue(matSod.layupTabDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on first remove ply button")
	public void click_on_first_remove_ply_button() throws InterruptedException {
		manageLayup.clickOnFirstRemovePlyButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on second remove ply button")
	public void click_on_second_remove_ply_button() {
		manageLayup.clickOnSecondRemovePlyButton();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on submit button on layup page")
	public void click_on_submit_button_on_layup_page() {
		manageLayup.clickOnSubmitLauypButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on third remove ply button")
	public void click_on_third_remove_ply_button() {
		manageLayup.clickOnThirdRemovePlyButton();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on fourth remove ply button")
	public void click_on_fourth_remove_ply_button() {
		manageLayup.clickOnFourthRemovePlyButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on fifth remove ply button")
	public void click_on_fifth_remove_ply_button() {
		manageLayup.clickOnFifthRemovePlyButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on sixth remove ply button")
	public void click_on_sixth_remove_ply_button() {
		manageLayup.clickOnSixthRemovePlyButton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("ply is removed from ply table")
	public void ply_is_removed_from_ply_table() {
		Assert.assertFalse(manageLayup.firstPlyIsRemoved());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("the first orientation in ply table is displayed as {string}")
	public void the_first_orienation_in_ply_table_is_displayed_as(String expFirstOrientPly) {
		String actualFirstOrientPly = manageLayup.getfirstOrienataioninPlyTable();
		Assert.assertEquals(expFirstOrientPly, actualFirstOrientPly);
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("the second orientation in ply table is displayed as {string}")
	public void the_second_orienation_in_ply_table_is_displayed_as(String expSecondOrientPly) {
		String actualSecondOrientPly = manageLayup.getSecondOrienataioninPlyTable();
		Assert.assertEquals(expSecondOrientPly, actualSecondOrientPly);
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("the third orientation in ply table is displayed as {string}")
	public void the_third_orienation_in_ply_table_is_displayed_as(String expThirdOrientPly) {
		String actualThirdOrientPly = manageLayup.getThirdOrienataioninPlyTable();
		Assert.assertEquals(expThirdOrientPly, actualThirdOrientPly);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("the fourth orientation in ply table is displayed as {string}")
	public void the_fourth_orienation_in_ply_table_is_displayed_as(String expFourthOrientPly) {
		String actualFourthOrientPly = manageLayup.getfourthOrienataioninPlyTable();
		Assert.assertEquals(expFourthOrientPly, actualFourthOrientPly);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("the fifth orientation in ply table is displayed as {string}")
	public void the_fifth_orienation_in_ply_table_is_displayed_as(String expFifthOrientPly) {
		String actualFifthOrientPly = manageLayup.getfifthOrienataioninPlyTable();
		Assert.assertEquals(expFifthOrientPly, actualFifthOrientPly);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("the sixth orientation in ply table is displayed as {string}")
	public void the_sixth_orienation_in_ply_table_is_displayed_as(String expSixthOrientPly) {
		String actualSixthOrientPly = manageLayup.getsixthOrienataioninPlyTable();
		Assert.assertEquals(expSixthOrientPly, actualSixthOrientPly);
		screenshot(driver, System.currentTimeMillis());
	}
}
