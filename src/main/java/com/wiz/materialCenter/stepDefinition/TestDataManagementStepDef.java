package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.EditMatProcess;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestDataManagementStepDef extends TestBase {
	
	ConfigurationWS configWS = new ConfigurationWS();
	EditMatProcess matProcess = new EditMatProcess();
	
	@When("select the Specimen Definitions option under Materials Administration")
	public void select_the_Specimen_Definitions_option_under_Materials_Administration() {
	    configWS.selectSpecDef();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on Create Specimen Definition")
	public void click_on_Create_Specimen_Definition() {
	    configWS.clickOnCreateSpecDef();
	    screenshot(driver, System.currentTimeMillis());
	}

	/*@When("provide required specimen def details under init tab")
	public void provide_required_specimen_def_details_under_init_tab() {
		//matProcess = new EditMatProcess();
	    matProcess.provideInitSpecDefDetails();
	    screenshot(driver, System.currentTimeMillis());
	}*/
	
	@When("select the project on init tab")
	public void select_the_project_on_init_tab() {
		//matProcess = new EditMatProcess();
	    matProcess.provideInitSpecDefDetails();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@When("enter the name on init tab")
	public void enter_the_name_on_init_tab() {
		//matProcess = new EditMatProcess();
	    matProcess.enterNameOnInitTab();
	    screenshot(driver, System.currentTimeMillis());
	}

	
	@When("select Specimen Definition tab to provide all required details")
	public void select_Specimen_Definition_tab_to_provide_all_required_details() {
	    matProcess.provideSpecDeftabDetails();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on validate button to ensure that there are no errors")
	public void click_on_validate_button_to_ensure_that_there_are_no_errors() {
	    matProcess.validateInfo();
	    screenshot(driver, System.currentTimeMillis());
	}

	/*@Then("click on Submit button to create the Specimen Definition record")
	public void click_on_Submit_button_to_create_the_Specimen_Definition_record() {
	    matProcess.clickOnSpecDefSubmitButton();
	    screenshot(driver, System.currentTimeMillis());
	}*/
	
	@When("click on Submit button from specimen definition tab")
	public void click_on_Submit_button_from_specimen_definition_tab() {
	    matProcess.clickOnSpecDefSubmitButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("Verify the created Specimen Definition record")
	public void Verify_the_created_Specimen_Definition_record() {
	    matProcess.verifyCreatedSpecimenDefRecord();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("Verify the created test template")
	public void Verify_the_created_test_template() {
	    matProcess.verifyCreatedTestTemplate();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	
	
	@When("select the Test Definitions option under Materials Administration")
	public void select_the_Test_Definitions_option_under_Materials_Administration() {
	    configWS.selectTestDef();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on Create Test Definition")
	public void click_on_Create_Test_Definition() {
	    configWS.clickOnCreateTestDef();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("provide required test def details under init tab")
	public void provide_required_test_def_details_under_init_tab() {
	    matProcess.provideInitTestDefDetails();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select Test Definition tab to provide all required details")
	public void select_Test_Definition_tab_to_provide_all_required_details() {
	    matProcess.provideTestDeftabDetails();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("click on Submit button to create the Test Definition record")
	public void click_on_Submit_button_to_create_the_Test_Definition_record() {
	    matProcess.clickOnTestDefSubmitButton();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select the Excel Mappings option under Materials Administration")
	public void select_the_Excel_Mappings_option_under_Materials_Administration() {
	    configWS.selectExcelMappings();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select Example Test Data Mapping from the list")
	public void select_Example_Test_Data_Mapping_from_the_list() {
	    configWS.selectExTestDataMapping();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select Generic Material Selector from the list")
	public void select_Generic_Material_Selector_from_the_list() {
	    configWS.selectGenericMatSelector();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on Edit Imported Mapping")
	public void click_on_Edit_Imported_Mapping() {
	    configWS.clickOnEditImportedMapping();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("attach TestDataReductionTemplate in excel file template")
	public void attach_TestDataReductionTemplate_in_excel_file_template() {
	    configWS.selectExcelTemplate();
	    screenshot(driver, System.currentTimeMillis());
	}

	@And("click on Submit button to import supporting template")
	public void click_on_Submit_button_to_import_supporting_template() {
		// configWS = new ConfigurationWS();
	    configWS.submitExcelTemplate();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("Verify the uploaded template is displayed on details page")
	public void Verify_the_uploaded_template_is_displayed_on_details_page() {
	    configWS.verifyTheTemplate();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@When("select the Test Template option under Materials Administration")
	public void select_the_Test_Template_option_under_Materials_Administration() {
	    configWS.selectTestTemplates();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on Create Test Template")
	public void click_on_Create_Test_Template() {
	    configWS.clickOncreateTestTemplate();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("provide the name of the Test Template")
	public void provide_the_name_of_the_Test_Template() {
	    configWS.provideTestTemplateName();
	}

	@When("select Import Mapping button next to Design Data Mapping")
	public void select_Import_Mapping_button_next_to_Design_Data_Mapping() {
	    configWS.selectDesignDataMapping();
	}

/*	@When("provide all required details of Design Data Mapping and attach ExampleDesignDataMapping file to submit")
	public void provide_all_required_details_of_Design_Data_Mapping_and_attach_ExampleDesignDataMapping_file_to_submit() {
	    configWS.provideImportDesignDataDetails();
	    screenshot(driver, System.currentTimeMillis());
	}*/
	
	@When("select design data project from dropdown")
	public void select_design_data_project_from_dropdown() {
	    configWS.selectDesignDataProject();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("enter mapping name and select schema from dropdown")
	public void enter_mapping_name_and_select_schema_from_dropdown() {
	    configWS.enterMappingNameSelectSchema();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("upload mapping file")
	public void upload_mapping_file() {
	    configWS.uploadMappingFileAndSubmit();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on submit button")
	public void click_on_submit_button() {
		configWS = new ConfigurationWS();
	    configWS.designDataMappingSubmit();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select the Example Test Data Mapping from dropdown of Test Data Mapping")
	public void select_the_Example_Test_Data_Mapping_from_dropdown_of_Test_Data_Mapping() {
	    configWS.selectTestDataMapping();
	}

	@When("select ASTM Eeight from tensile drop down for Reference Data")
	public void select_ASTM_Eeight_from_tensile_drop_down_for_Reference_Data(Integer int1) {
	    configWS.selectTensileRef();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select Tensile Ultimate Strength from Design Allowable dropdown and click on Add button")
	public void select_Tensile_Ultimate_Strength_from_Design_Allowable_dropdown_and_click_on_Add_button() {
	    configWS.addTensileUltStrgth();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("now select Tensile Yield Strength from Design Allowable dropdown and click on Add button")
	public void now_select_Tensile_Yield_Strength_from_Design_Allowable_dropdown_and_click_on_Add_button() {
	    configWS.addTensileYieldStrgth();
	    screenshot(driver, System.currentTimeMillis());
	}

	@And("click on submit button to create the Test Template")
	public void click_on_submit_button_to_create_the_Test_Template() {
	    configWS.clickOnSubmitExcel();
	}
	@And("select test data to generate from dropdown")
	public void select_test_data_to_generate_from_dropdown() {
	    configWS.selectTestDataToGenerateFromDropdown();
	}
	
}
