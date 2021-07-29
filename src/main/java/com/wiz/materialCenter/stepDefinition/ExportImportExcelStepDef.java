package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExportImportExcelStepDef extends TestBase {
	
	MaterialSOD matSod = new MaterialSOD();
	ProcessesPage process = new ProcessesPage();
	ConfigurationWS config = new ConfigurationWS();
	SearchPage search = new SearchPage();
	HomePage homePage = new HomePage();
	MaterialMOD matMod = new MaterialMOD();
	NavigateWS navgWS = new NavigateWS();
	
	@When("click on export to excel")
	public void click_on_export_to_excel() {
		 matSod = new MaterialSOD();
	    matSod.clickOnExportExcel();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on export to excel from action menu")
	public void click_on_export_to_excel_from_action_menu() {
		 matSod = new MaterialSOD();
	    matSod.performExportExcel();
	    screenshot(driver, System.currentTimeMillis());
	}

	
	@When("click on submit button on export to excel popup")
	public void click_on_submit_button_on_export_to_excel_popup() {
	    matSod.exportExcelSubmit();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("export to excel is done successfully")
	public void export_to_excel_is_done_successfully() {
	    process.exportExcelSuccess();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("user clicks on Import excel file link")
	public void user_clicks_on_Import_excel_file_link() {
	    config.clickOnImportExcel();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@When("select fixed excel format")
	public void select_fixed_excel_format() {
	    config.clickOnFixedFormat();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("enter all details and select excel file from system")
	public void enter_all_details_and_select_excel_file_from_system() {
		 config.selectDataProject();
		    config.selectExcelToUplaod();
		    config.selectMasterMetalSchema();
		    screenshot(driver, System.currentTimeMillis());
		}
	@When("select data project")
	public void select_data_project() {
		ConfigurationWS config = new ConfigurationWS();
	    config.selectDataProject();
	   // config.selectExcelToUplaod();
	   // config.selectMasterMetalSchema();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("select excel file to upload")
	public void select_excel_file_to_upload() {
	    //config.selectDataProject();
	    config.selectExcelToUplaod();
	   // config.selectMasterMetalSchema();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("select master metal schema")
	public void select_master_metal_schema() {
	    //config.selectDataProject();
	   // config.selectExcelToUplaod();
	    config.selectMasterMetalSchema();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("enter all details and select excel file from system for mapped")
	public void enter_all_details_and_select_excel_file_from_system_for_mapped() {
	    config.selectDataProject();
	    config.selectExcelToUplaodMapped();
	    config.clearMatToRevise();
	    config.selectGenericMatSchema();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select excel file from system for mapped")
	public void select_excel_file_from_system_for_mapped() {
	    //config.selectDataProject();
	    config.selectExcelToUplaodMapped();
	   // config.clearMatToRevise();
	   // config.selectGenericMatSchema();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select generic mat schema")
	public void select_generic_mat_schema() {
	    //config.selectDataProject();
	   // config.selectExcelToUplaodMapped();
	   // config.clearMatToRevise();
	    config.selectGenericMatSchema();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("click on submit button to upload the excel")
	public void click_on_submit_button_to_upload_the_excel() {
	    config.clickOnSubmitExcel();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("material through excel file should be uploaded successfully")
	public void material_through_excel_file_should_be_uploaded_successfully() {
	    matSod.verifyPropSetDisplay();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Given("user gives test data material to search")
	public void user_gives_test_data_material_to_search() {
	    search.enterTestDataMat();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on mapping tab")
	public void click_on_mapping_tab() {
		matSod.clickOnMappingTab();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("select schema mapping from dropdown")
	public void select_schema_mapping_from_dropdown() {
	    matSod.selectSchemaMapping();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on test data tab and select all test data")
	public void click_on_test_data_tab_and_select_all_test_data() {
		matSod.selectTestData();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on export to excel test data")
	public void click_on_export_to_excel_test_data() {
	    matSod.selectExportTestDataExcel();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("navigate to homepage and select first process")
	public void navigate_to_homepage_and_select_first_process() throws InterruptedException {
		homePage.clickOnDashboard();
		homePage.clickOnProcessViewAll();
		homePage.clickOnDemoteProcess();	// selecting first process 
		screenshot(driver, System.currentTimeMillis());
	}
	
	@When("check that process status is completed")
	public void check_that_process_status_is_completed() {
	    process.verifyProcessStatus();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on tools tab and import test data")
	public void click_on_tools_tab_and_import_test_data() {
	    matSod.selectImportTestData();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("choose the file from system to import")
	public void choose_the_file_from_system_to_import() {
	    config.selectTestDataToUplaod();
	    matSod.selectTestTemplate();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on submit button of import test data popup")
	public void click_on_submit_button_of_import_test_data_popup() {
	    matSod.importTestDataSubmit();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("check that process status is completed with download excel link")
	public void check_that_process_status_is_completed_with_download_excel_link() {
		process.verifyProcessStatus();
		process.exportExcelSuccess();
	}
	
	@When("click on export menu and select XML option")
	public void click_on_export_menu_and_select_XML_option() {
	    matMod.selectExportToXML();
	}

	@When("select include project and all mat datas checkbox")
	public void select_include_project_and_all_mat_datas_checkbox() {
	    matMod.selectCheckbox();
	}

	@When("click on submit button on export to XML popup")
	public void click_on_submit_button_on_export_to_XML_popup() {
	  //  matMod.deleteSubmit();
	    matSod.exportXmlSubmit();
	}
	
	@When("verify the details of material on SOD")
	public void verify_the_details_of_material_on_SOD() {
	    matSod.verifyFixedImportMatValuesOnSOD();
	}
	
	@When("verify the details of material on SOD for mapped excel")
	public void verify_the_details_of_material_on_SOD_for_mapped_excel() {
	    matSod.verifyMappedImportMatValuesOnSOD();
	}
	
	@When("user clicks on required mapped material tree to open MOD")
	public void user_clicks_on_required_mapped_material_tree_to_open_MOD() {
	    navgWS.mappedMatTree();
	}
}
