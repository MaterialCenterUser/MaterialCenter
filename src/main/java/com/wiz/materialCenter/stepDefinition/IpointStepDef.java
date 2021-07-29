package com.wiz.materialCenter.stepDefinition;

import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.EditMatProcess;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.PlotProcessInput;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IpointStepDef extends TestBase	{
	
	MaterialMOD matMod = new MaterialMOD();
	PlotProcessInput plotProcess = new PlotProcessInput();
	ConfigurationWS configWS = new ConfigurationWS();
	NavigateWS navigateWS = new NavigateWS();
	MaterialSOD matSod = new MaterialSOD();
	ProcessesPage process = new ProcessesPage();
	EditMatProcess editMat = new EditMatProcess();
	
	@When("select Compliance status under Compliance option")
	public void select_Compliance_status_under_Compliance_option() {
	    matMod.selectComplianceStatus();
	}

	@When("check the Compliance status using the pie chart displayed")
	public void check_the_Compliance_status_using_the_pie_chart_displayed() {
	    plotProcess.verifyCompliancePlot();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Then("click on pie chart to open the mat MOD accordingly")
	public void click_on_pie_chart_to_open_the_mat_MOD_accordingly() {
	    plotProcess.openComplianceStatusSection();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select the Compliance connector option under Materials Administration")
	public void select_the_Compliance_connector_option_under_Materials_Administration() {
	    configWS.selectComplianceConnector();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("click on Create Compliance Connection")
	public void click_on_Create_Compliance_Connection() {
	    configWS.clickOnCreateComplianceConnection();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("provide all the required details for compliance connection")
	public void provide_all_the_required_details_for_compliance_connection() {
	    configWS.provideComplianceConnection();
	}

	@Then("click on Submit to create it successfully")
	public void click_on_Submit_to_create_it_successfully() {
	    configWS.submitComplianceConnection();
	}
	
	@When("user clicks on required compliant mat tree to open MOD")
	public void user_clicks_on_required_compliant_mat_tree_to_open_MOD() {
	    navigateWS.coompliantMatTree();
	}

	@When("click on first mat")
	public void click_on_first_mat() {
	    matMod.clickOnFirstMat();
	}

	@When("right click on MOD to verify both actions again")
	public void right_click_on_MOD_to_verify_both_actions_again() {
	    matMod.verifyComplianceOptionOnRightClick();
	}

	@When("open the material to open SOD")
	public void open_the_material_to_open_SOD() {
		matMod.doubleClickOnFirstMat();
	}
	
	@When("open the required material to open SOD")
	public void open_the_required_material_to_open_SOD() {
		matMod.doubleClickMat_Ford();
	}

	@Then("click on Compliance option to verify Check Compliance and Compliance Status actions for SOD")
	public void click_on_Compliance_option_to_verify_Check_Compliance_and_Compliance_Status_actions_for_SOD() {
	    matSod.verifyComplianceSAOnSOD();
	}

	@When("verify that composition data is present and select Check Compliance under Compliance option")
	public void verify_that_composition_data_is_present_and_select_Check_Compliance_under_Compliance_option() {
	    matSod.verifyCompositionDataAndPerformCheckCompliance();
	}

	@Then("open the same material and verify that correct Compliance status is updated in mat SOD")
	public void open_the_same_material_and_verify_that_correct_Compliance_status_is_updated_in_mat_SOD() {
	    matMod.doubleClickOnFirstMat();
	    matSod.verifyOverallComplianceStatus();
	}
	
	@When("user clicks on required not compliant mat tree to open MOD")
	public void user_clicks_on_required_not_compliant_mat_tree_to_open_MOD() {
	    navigateWS.notCompliantMatTree();
	}
	
	@When("select required number of mat for compliance check by taking twenty six mats to check the lower boundary condition")
	public void select_required_number_of_mat_for_compliance_check_by_taking_twenty_six_mats_to_check_the_lower_boundary_condition() {
	    matMod.selectMultiMatForCheckCompliance();
	}
	
	@When("click on Compliance option to verify Check Compliance and Compliance Status actions for MOD")
	public void click_on_Compliance_option_to_verify_Check_Compliance_and_Compliance_Status_actions_for_MOD() {
	    matMod.verifyComplianceOptionMOD();
	}

	@When("right click to select Compliance check option under Compliance option")
	public void right_click_to_select_Compliance_check_option_under_Compliance_option() {
	    matMod.selectCheckComplianceOnRightClick();
	}
	
	@When("check that process status is Failed")
	public void check_that_process_status_is_Failed() {
	    process.verifyFailedProcessStatus();
	}
	
	@Then("check the error msg related to batch size exceeded")
	public void check_the_error_msg_related_to_batch_size_exceeded() {
	    process.batchSizeError();
	}
	
	@When("open the material having compliance status value")
	public void open_the_material_having_compliance_status_value() {
	    matMod.doubleClickMat_Ford();
	    matSod.verifyOverallComplianceStatus();
	}

	@When("go to Properties tab")
	public void go_to_Properties_tab() {
	    editMat.clickOnPropertiesTab();
	}

	@Then("verify that Compliance property set values are not editable")
	public void verify_that_Compliance_property_set_values_are_not_editable() {
	    editMat.verifyEditComplianceField();
	}

	@When("select Composition property set and remove Sources value of any composition")
	public void select_Composition_property_set_and_remove_Sources_value_of_any_composition() {
	    editMat.removeCompositionSourceValue();
	}

	@When("click on Submit")
	public void click_on_Submit() {
	    editMat.editSubmitButton();
	}

	@Then("verify that warning msg is displayed related to CAS number missing for composition data")
	public void verify_that_warning_msg_is_displayed_related_to_CAS_number_missing_for_composition_data() {
	    matSod.verifyCASWarningMsg();
	}
	
	@When("verify that compliance data is present and select Check Compliance under Compliance option")
	public void verify_that_compliance_data_is_present_and_select_Check_Compliance_under_Compliance_option() {
	    matSod.verifyOverallComplianceAndPerformCheckCompliance();
	}
	
	@Then("verify that warning msg is displayed that compliance result is already present for the selected material")
	public void verify_that_warning_msg_is_displayed_that_compliance_result_is_already_present_for_the_selected_material() {
	    matSod.verifyCompliantMatCompliancePopupDialogSOD();
	}
	
	@Then("verify that warning msg is displayed that compliance result as pending is already present for the selected material")
	public void verify_that_warning_msg_is_displayed_that_compliance_result_as_pending_is_already_present_for_the_selected_material() {
	    matSod.verifyPendingMatCompliancePopupDialogSOD();
	}
	
	@When("select multiple materials for compliance check")
	public void select_multiple_materials_for_compliance_check() {
	    matMod.selectMultiMat();
	}

	@Then("verify that warning msg is displayed that compliance result is already present for multiple materials")
	public void verify_that_warning_msg_is_displayed_that_compliance_result_is_already_present_for_multiple_materials() {
	    matMod.verifyMultiMatCompliancePopupDialogMOD();
	}
	
	@When("click on material for compliance check")
	public void click_on_material_for_compliance_check() {
	    matMod.clickOnFirstMat();
	}

	@When("Select Check Compliance under Compliance option")
	public void select_Check_Compliance_under_Compliance_option() {
	    matMod.selectCheckCompliance();
	}

	@Then("verify that warning msg is displayed that compliance result is already present for the selected material on MOD")
	public void verify_that_warning_msg_is_displayed_that_compliance_result_is_already_present_for_the_selected_material_on_MOD() {
	    matMod.verifySingleMatCompliancePopupDialogMOD();
	}
	
	@Then("verify that warning msg is displayed that compliance result as pending is already present for the selected material on MOD")
	public void verify_that_warning_msg_is_displayed_that_compliance_result_as_pending_is_already_present_for_the_selected_material_on_MOD() {
	    matMod.verifySingleMatPendingCompliantPopupDialogMOD();
	}

	@When("select the Composition property set and change the composition data value")
	public void select_the_Composition_property_set_and_change_the_composition_data_value() {
		editMat.editCompositionDataValue();
	}

	@When("verify that warning msg is displayed related to composition data changes")
	public void verify_that_warning_msg_is_displayed_related_to_composition_data_changes() {
	    matSod.verifyWarningCompositionDataChanged();
	}
	
	@When("select Overall Compliance Status filter and click on ok button")
	public void select_Overall_Compliance_Status_filter_and_click_on_ok_button() {
	    matMod.selectOverallComplianceStatus();
	}

	@Then("verify that Overall Compliance Status col is added successfully")
	public void verify_that_Overall_Compliance_Status_col_is_added_successfully() {
	    matMod.verifyOverallComplianceStatusCol();
	    matMod.printMODData();
	}
	
	@When("Check that composition data is not present for the material")
	public void Check_that_composition_data_is_not_present_for_the_material() {
	    matSod.verifyCompositionTagNotDisplayed();
	}

	@When("perform check compliance under Compliance option")
	public void perform_check_compliance_under_Compliance_option() {
	    matSod.clickComplianceOnSOD();
	}

	@Then("verify that error msg is displayed related to material composition on SOD")
	public void verify_that_error_msg_is_displayed_related_to_material_composition_on_SOD() {
	    matSod.verifyNoCompositionWarningMsgSOD();
	}
	
	@Then("verify that error msg is displayed related to material composition on MOD")
	public void verify_that_error_msg_is_displayed_related_to_material_composition_on_MOD() {
		matMod.verifyNoCompositionWarningMsgMOD();
	}
	
	@When("enter the details and select required excel to upload")
	public void enter_the_details_and_select_required_excel_to_upload() {
		configWS.uploadAlphaNumericCASExcel();
	}
	
	@When("check that process is Failed")
	public void check_that_process_is_Failed() {
		process.verifyFailedStatus();
	}

	@Then("check the error msg related to CAS number")
	public void check_the_error_msg_related_to_CAS_number() {
	    process.CASNumberError();
	}

}
