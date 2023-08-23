package com.wiz.materialCenter.stepDefinition;

import org.junit.Assert;

import com.wiz.materialCenter.pages.CAEProcessInput;
import com.wiz.materialCenter.pages.ConfigurationWS;
import com.wiz.materialCenter.pages.EditMatProcess;
import com.wiz.materialCenter.pages.EditTestDataPage;
import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.MyWorkspacePage;
import com.wiz.materialCenter.pages.NavigateWS;
import com.wiz.materialCenter.pages.ProcessesPage;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.pages.SecurityProcess;
import com.wiz.materialCenter.util.TestBase;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
public class ApprovalListRequestStepDef extends TestBase {

	HomePage homePage = new HomePage();
	NavigateWS navigate = new NavigateWS();
	MaterialSOD matSod = new MaterialSOD();
	MaterialMOD matMod = new MaterialMOD();
	CAEProcessInput caeProccessInput = new CAEProcessInput();
	ProcessesPage processessPage = new ProcessesPage();
	MyWorkspacePage workSpacePage = new MyWorkspacePage();
	ConfigurationWS configPage = new ConfigurationWS();
	SearchPage searchPage = new SearchPage();
	EditMatProcess editMat = new EditMatProcess();
	EditTestDataPage editTestData = new EditTestDataPage();
	SecurityProcess secPrcoess = new SecurityProcess();
	CAEProcessInput caeProcess = new CAEProcessInput();

	@And("click on create approver list link")
	public void click_on_create_approver_list_link() {
		configPage.clickOnCreateApproverListLink();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on delete button against step2")
	public void click_on_delete_button_against_step2() {
		configPage.clickOnDelButtonStep2();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on ok button on delete confirm dialog box")
	public void click_on_ok_button_on_delete_confirm_dialog_box() {
		configPage.clickOnOkDelConfirmDialog();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("deleted step is removed")
	public void deleted_step_is_removed() {
		configPage.step2IsNotDisplayed();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	
	@And("hower on question mark available against urgency threshold days")
	public void hower_on_question_mark_available_against_urgency_threshold_days() {
		configPage.howerOnQuestionMarkUrgeThreshold();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("enter step description for step1")
	public void enter_step_description_for_step1() {
		configPage.enterStepDescForStep1();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on approver lists link")
	public void click_on_approver_lists_link() {
		configPage.clickOnApproverListsLink();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select system project from approval list project dropdown")
	public void select_system_project_approvalList() {
		configPage.selectSystemProjectFromApprovalListPage();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("enter name for new approver list")
	public void enter_name_for_new_approver_list() {
		configPage.enterApproverListName();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on users button to select approver list")
	public void click_on_users_button_to_select_approvar_list() {
		configPage.clickSelectApproversUsersBUtton();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on users button to select approver list against step2")
	public void click_on_users_button_to_select_approvar_list_step2() {
		configPage.clickSelectApproversUsersBUttonStep2();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on users button to select approver list against step3")
	public void click_on_users_button_to_select_approvar_list_step3() {
		configPage.clickSelectApproversUsersBUttonStep3();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on users button to select approver list against step4")
	public void click_on_users_button_to_select_approvar_list_step4() {
		configPage.clickSelectApproversUsersBUttonStep4();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on reorder steps button")
	public void click_on_reorder_steps_button() {
		configPage.clickOnReorderStepsBUtton();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("reorder steps UI is opened")
	public void reorder_steps_UI_is_opened() {
		Assert.assertTrue(configPage.reorderStepsUIOpened());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("step description column is displayed")
	public void step_description_column_is_displayed() {
		Assert.assertTrue(configPage.stepDescColumnDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("urgency threshold days option is displayed")
	public void urgency_threshold_days_option_is_displayed() {
		Assert.assertTrue(configPage.urgeThresholdDaysOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("urgency threshold tooltip is displayed")
	public void urgency_threshold_tooltip_is_displayed() {
		Assert.assertTrue(configPage.urgeThresholdDaysTooltipDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify approver lists link is displayed")
	public void verify_approver_lists_link_is_displayed() {
		Assert.assertTrue(configPage.verifyApproverListsDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("verify approver list dialog is displayed to create approver list")
	public void verify_approver_list_dialog_is_displayed_to_create_approver_list() {
		Assert.assertTrue(configPage.verifyApproverListsDialogDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("select approvers dialog box is displayed")
	public void select_approvers_dialog_box_is_displayed() {
		Assert.assertTrue(configPage.selectApproverDialogBoxDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("reorder steps button is displayed")
	public void reorder_steps_button_is_displayed() {
		Assert.assertTrue(configPage.reorderStepsButtonDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("group with previous column is displayed")
	public void group_with_previous_column_is_displayed() {
		Assert.assertTrue(configPage.grpWithPrevColumnDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("mandatory section is displayed")
	public void mandatory_section_is_displayed() {
		Assert.assertTrue(configPage.verifyMandatorySectionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("optional section is displayed")
	public void optional_section_is_displayed() {
		Assert.assertTrue(configPage.verifyOptionalSectionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("approval request option is displayed on MOD")
	public void approval_request_option_is_displayed_on_MOD() {
		Assert.assertTrue(matMod.approvalRequestOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("work request option is displayed on MOD")
	public void work_request_option_is_displayed_on_MOD() {
		Assert.assertTrue(matMod.workRequestOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("approval request option is displayed on SOD")
	public void approval_request_option_is_displayed_on_SOD() {
		Assert.assertTrue(matSod.approvalRequestOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("work request option is displayed on SOD")
	public void work_request_option_is_displayed_on_SOD() {
		Assert.assertTrue(matSod.workRequestOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on select button to select mandatory approvers")
	public void click_on_select_button_to_select_mandatory_approvers() {
		configPage.clickSelectMandatoryUsers();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on approval request option from create menu on MOD")
	public void click_on_approval_request_option_from_create_menu_on_MOD() {
		matMod.clickOnApprovalRequestMOD();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("approval request window is opened on MOD")
	public void approval_request_window_is_opened_on_MOD() {
		Assert.assertTrue(matMod.approvalWindowDisplayedMOD());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("work request window is opened on MOD")
	public void work_request_window_is_opened_on_MOD() {
		Assert.assertTrue(matMod.workRequestWindowDisplayedMOD());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("completion date option is displayed on approval request page")
	public void completion_date_is_displayed_on_approval_request_page() {
		Assert.assertTrue(matSod.approvalRequestCompletionDateDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("preferred approvers option is displayed on approval request page")
	public void preferred_approvers_is_displayed_on_approval_request_page() {
		Assert.assertTrue(matSod.approvalRequestPrefferedApproversDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("approval request winodw is opened on SOD")
	public void approval_request_window_is_opened_on_SOD() {
		Assert.assertTrue(matSod.approvalWindowDisplayedSOD());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("work request winodw is opened on SOD")
	public void work_request_window_is_opened_on_SOD() {
		Assert.assertTrue(matSod.workRequestWindowDisplayedSOD());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("preferred approvers UI is displayed")
	public void preferred_approvers_UI_is_displayed() {
		Assert.assertTrue(matSod.preferredApproversUIDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("charge number input field is displayed")
	public void manage_charge_number_input_field_is_displayed() {
		Assert.assertTrue(matSod.manageChargeNumberDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("charge Number is displayed on create approval request details page")
	public void charge_Number_is_displayed_on_create_approval_request_details_page() {
		Assert.assertTrue(workSpacePage.chargeNumberOnCreateAppReqDetailsPageDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("create approval request is failed with error message for charge number")
	public void create_approval_request_is_failed_with_error_message_for_charge_number() {
		Assert.assertTrue(workSpacePage.errMessageForChargeNumberLargerThanLImitDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on approval request option from create menu on SOD")
	public void click_on_approval_request_option_from_create_menu_on_SOD() {
		matSod.clickOnApprovalRequestSOD();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	
	@And("click on preferred approvers editor button")
	public void click_on_preferred_approvers_editor_button() {
		matSod.clickPreferredApproversEditorButton();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("double click on first optional approver for step1")
	public void double_click_on_first_optional_approver_for_step1() {
		matSod.selectFirstOptionalapproverAndMoveTOPreferred();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click submit button on work request page")
	public void click_submit_button_on_work_request_page() {
		matSod.clickSubmitButtonWorkRequestWindow();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on work request templates link")
	public void click_on_work_request_templates_link() {
		configPage.clickOnWorkRequestTemplatesLInk();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on work request option from create menu on SOD")
	public void click_on_work_request_option_from_create_menu_on_SOD() {
		matSod.clickOnWorkRequestSOD();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select promoteApproveDemoteMaterials")
	public void select_promoteApproveDemoteMaterials() {
		configPage.selectPromoteApproveDemoteMaterialsOption();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click create template link")
	public void click_create_template_link() throws InterruptedException {
		configPage.clickCreatetTemplateLInk();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click choose file button to upload custom template")
	public void click_choose_file_button_to_select_custom_template() throws InterruptedException {
		processessPage.selectTemplateFileToUplaod();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click choose file button to upload custom template for one ref attribute")
	public void click_choose_file_button_to_select_custom_template_for_one_ref_attribute() throws InterruptedException {
		processessPage.selectTemplateFileToUplaodForOneRefAttr();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click submit button to create work request template")
	public void click_submit_button_to_create_work_request_template() throws InterruptedException {
		processessPage.clickSubmitButtonToCreateWorkReqTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select CAE model request template from template dropdown")
	public void select_CAE_model_request_template_from_template_dropdown() {
		matSod.selectCAEModelRequestTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select promote demote materials template from template dropdown")
	public void select_promote_demote_materials_template_from_template_dropdown() {
		matSod.selectPromoteDemoteMaterialsTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select test data management template configuration template from template dropdown")
	public void select_test_data_management_template_configuration_template_from_template_dropdown() {
		matSod.selectTestDataManagementTemplateConfigurationTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select test data management generate design data template from template dropdown")
	public void select_test_data_management_generate_design_data_template_from_template_dropdown() {
		matSod.selectTestDataManagementGenerateDesignDataTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select test data management import test data template from template dropdown")
	public void select_test_data_management_import_test_data_template_from_template_dropdown() {
		matSod.selectTestDataManagementImportTestDataTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select submit material revision template from template dropdown")
	public void select_submit_material_revision_template_from_template_dropdown() {
		matSod.selectSubmitMatRevisionTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select custom template from template dropdown")
	public void select_custom_template_from_template_dropdown() throws InterruptedException {
		matSod.selectCustomTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select schema configuration template from template dropdown")
	public void select_schema_configuration_template_from_template_dropdown() {
		matSod.selectSchemaConfigurationTemplate();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("completion date textbox is empty on approval request page")
	public void completion_date_textbox_is_empty_on_approval_request_page() {
		Assert.assertFalse(matSod.completionTextBoxEmpty());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("start date and end date are displayed")
	public void start_date_and_end_date_are_displayed() {
		Assert.assertFalse(matSod.startDateDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("only first field is populated in custom template")
	public void only_first_field_is_populated_in_custom_template() {
		Assert.assertTrue(matSod.seconfFieldNotPopulated());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("material for CAE model is pouplated under input field")
	public void Material_for_CAE_model_is_pouplated_under_input_field() {
		Assert.assertTrue(matSod.materialForCAEModelDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("one ref materials are displayed in dropdown")
	public void One_ref_materials_are_displayed_in_dropdown() {
		Assert.assertTrue(matSod.oneRefMatDropdownDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("materials to set release level is pouplated under input field")
	public void Material_to_set_release_level_is_pouplated_under_input_field() {
		Assert.assertTrue(matSod.materialSetToReleaseLevelDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("reference Material For Test Data is pouplated under input field")
	public void reference_Material_For_Test_Data_is_pouplated_under_input_field() {
		Assert.assertTrue(matSod.refMatForTestDataDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("material For Test Data is pouplated under input field")
	public void material_For_Test_Data_is_pouplated_under_input_field() {
		Assert.assertTrue(matSod.matForTestDataDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("existing material data to edit is pouplated under input field")
	public void existing_material_data_to_edit_is_pouplated_under_input_field() {
		Assert.assertTrue(matSod.existingMatDataToEditDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("many ref materials are displayed in dropdown")
	public void many_ref_materials_are_displayed_in_dropdown() {
		Assert.assertTrue(matSod.manyRefMatDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("preferred approvers editor button is enabled on approval request page")
	public void preferred_approvers_editor_button_is_enabled_on_approval_request_page() {
		Assert.assertTrue(matSod.preferredApproversEditorButtonDisabled());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("preferred approvers editor button is disabled on approval request page")
	public void preferred_approvers_editor_button_is_disabled_on_approval_request_page() {
		Assert.assertFalse(matSod.preferredApproversEditorButtonDisabled());
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on completion date textbox")
	public void click_on_completion_date_textbox() {
		matSod.clickOnCompletionDateTextBox();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("enter combination of alphanumeric and special characters in charge number input field")
	public void enter_combination_of_alphanumeric_and_special_characters_in_charge_number_input_field() {
		matSod.enterAlphaAndSpecialCharChargeNumber();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("enter any string in charge number input field")
	public void enter_any_string_in_charge_number_input_field() {
		matSod.enterAnyChargeNumber();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("enter the string length larger than limit value in charge number textbox")
	public void enter_the_string_larger_than_length_limit_value_in_charge_number_textbox() {
		matSod.enterLengthLargerThanLimitValueInChargeNUmberTxtbox();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("enter the string length limit value in charge number textbox")
	public void enter_the_string_length_limit_value_in_charge_number_textbox() {
		matSod.enterLengthLimitValueInChargeNUmberTxtbox();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("enter some date value in completion date textbox")
	public void enter_some_date_value_in_completion_date_textbox() {
		matSod.enterDateInCompletionDateTextbox();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("charge number input field is displayed empty")
	public void charge_number_input_field_is_displayed_empty() {
		Assert.assertTrue(matSod.chargeNumberInputEmpty());
		screenshot(driver, System.currentTimeMillis());
	}

	
	@Then("completion date field is not accepting any date entered manually")
	public void completion_date_field_is_not_accepting_any_date_entered_manually() {
		Assert.assertTrue(matSod.completionDateNotAcceptingManualEntry());
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("work request template is created")
	public void work_request_template_is_created() {
		Assert.assertTrue(workSpacePage.createTemplateDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on any date from datepicker")
	public void click_on_any_date_from_datepicker() {
		matSod.selectAnyDateFromDatePicker();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on submit button on approval request page")
	public void click_on_submit_button_on_approval_request_page() throws InterruptedException {
		matSod.clickSubmitButtonApprovalRequest();
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("approval request is created successfully")
	public void approval_request_is_created_successfully() {
		Assert.assertTrue(workSpacePage.approvalRequestIsCreated());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	
	@Then("charge number is displayed as {string}")
	public void charge_number_is_displayed_as(String expChargeNumber) {
		String actualChargeNumber = workSpacePage.blankChargeNumberDisplayed();
		Assert.assertEquals(expChargeNumber, actualChargeNumber);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify the count of step dropdown matches the count of preview table steps")
	public void verify_the_count_of_step_dropdown_matches_the_count_of_preview_table_steps() {
		int stepDropdownOption = matSod.verifyCountOfStepsInPrefAppEditor();
		int previewTableSteps = matSod.verifyCountOfPreviewTable();
		Assert.assertEquals(stepDropdownOption, previewTableSteps);
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on refresh icon on workspace page")
	public void click_on_refresh_icon_on_workspace_page() {
		workSpacePage.clickOnRefreshIcon();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on edit on approver list wrokspace")
	public void click_on_edit_on_approver_list_wrokspace() {
		workSpacePage.clickEditMenu();

	}
	
	@And("click on edit watch list from edit menu on workspace")
	public void click_on_edit_watch_list_from_edit_menu_on_workspace() {
		workSpacePage.clickEditWatchListOption();

	}
	@And("select the added user from watch list")
	public void select_the_added_user_from_watch_list() {
		workSpacePage.selectTheFirstAddedUserWatchList();

	}
	
	@And("click on remove button on watch list")
	public void click_on_remove_button_on_watch_list() {
		workSpacePage.clickRemoveButtonOnWatchList();

	}
	
	
	@Then("remove button is disabled on watch list")
	public void remove_button_is_disabled_on_watch_list() {
		Assert.assertTrue(workSpacePage.removeButtonIsDisabledInWatchList());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("new added user is displayed in watch list")
	public void new_added_user_is_displayed_in_watch_list() {
		Assert.assertTrue(workSpacePage.newAddedUserDisplayedInWatchList());
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("name is showing error message as {string}")
	public void name_is_showing_error_message(String expErrMessage) {
		String actualErrMessage = matSod.getNameRequiredFieldErrorMessage();
		Assert.assertEquals(expErrMessage, actualErrMessage);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("project is populated as {string}")
	public void project_is_populated_as(String expProject) {
		String actualProject = matSod.getPojectNamePrePopulated();
		Assert.assertEquals(expProject, actualProject);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("approval list is showing error message as {string}")
	public void approval_list_is_showing_error_message(String expErrMessage) {
		String actualErrMessage = matSod.getApprovalListRequiredFieldErrorMessage();
		Assert.assertEquals(expErrMessage, actualErrMessage);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("completion date is showing error message as {string}")
	public void completion_date_is_showing_error_message(String expErrMessage) {
		String actualErrMessage = matSod.getCompletionDateRequiredFieldErrorMessage();
		Assert.assertEquals(expErrMessage, actualErrMessage);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("template is showing error message as {string}")
	public void template_is_showing_error_message(String expErrMessage) {
		String actualErrMessage = matSod.getTemplateRequiredFieldErrorMessage();
		Assert.assertEquals(expErrMessage, actualErrMessage);
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("work request name is showing error message as {string}")
	public void work_request_name_is_showing_error_message(String expErrMessage) {
		String actualErrMessage = matSod.getWorkRequestNameRequiredFieldErrorMessage();
		Assert.assertEquals(expErrMessage, actualErrMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify users list displayed as {string}")
	public void verify_users_list_displayed_as(String expMessage) {
		String actualMessage = workSpacePage.getUsersList();
		Assert.assertEquals(expMessage, actualMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("enter approval request name")
	public void enter_approval_request_name() {
		matSod.enterApprovalRequestName();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("enter approval request name on work request page")
	public void enter_approval_request_name_on_work_request_page() {
		matSod.enterApprovalRequestNameOnWorkRequest();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("select user1 user as approver")
	public void select_user1_user_as_approver() throws InterruptedException {
		configPage.selectUser1User();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select user2 user as approver")
	public void select_user2_user_as_approver() throws InterruptedException {
		configPage.selectUser2User();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select user3 user as approver")
	public void select_user3_user_as_approver() throws InterruptedException {
		configPage.selectUser3User();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select matadmin user as approver")
	public void select_matadmin_user_as_approver() throws InterruptedException {
		configPage.selectMatAdminUser();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select manager user as approver")
	public void select_manager_user_as_approver() throws InterruptedException {
		configPage.selectManagerUser();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select smroot user as approver")
	public void select_smroot_user_as_approver() throws InterruptedException {
		configPage.selectsmrootUser();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select SimMan user as approver")
	public void select_SimMan_user_as_approver() throws InterruptedException {
		configPage.selectSimManUser();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select dataowner user as approver")
	public void select_dataowner_user_as_approver() {
		configPage.selectDataOwnerUser();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("select first approval list from approval list dropdown")
	public void select_approval_list_from_approval_list_dropdown() {
		matSod.selectFirstApprovalListFromDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("select first approval list from approval list dropdown on work request")
	public void select_approval_list_from_approval_list_dropdown_on_work_request() {
		matSod.selectFirstApprovalListFromDropdownOnWorkRequest();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select second approval list from approval list dropdown")
	public void select_second_approval_list_from_approval_list_dropdown() {
		matSod.selectSecondApprovalListFromDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select third approval list from approval list dropdown")
	public void select_third_approval_list_from_approval_list_dropdown() {
		matSod.selectThirdApprovalListFromDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on select button from edit watch list")
	public void click_on_select_button_from_edit_watch_list() {
		workSpacePage.clickOnSelectButtonEditWatchList();
		screenshot(driver, System.currentTimeMillis());
	}

	
	@And("click on cross button of completion date")
	public void click_on_cross_button_of_completion_date() {
		matSod.clickOnCrossButtonCompetionDate();
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("click on submit button to submit watch list")
	public void click_on_submit_button_to_submit_watch_list() {
		matSod.clickOnSubmitButtonToSubWatchList();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select first user for edit watch list")
	public void select_first_user_for_edit_watch_list() {
		workSpacePage.selectFirstUserObjectSelection();
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("select second user for edit watch list")
	public void select_second_user_for_edit_watch_list() {
		workSpacePage.selectSecondUserObjectSelection();
		screenshot(driver, System.currentTimeMillis());
	}
	

	@And("click on ok button for mandatory approver")
	public void click_on_ok_button_for_mandatory_approver() {
		//configPage = new ConfigurationWS();
		configPage.clickOkOnChooseApproversSection();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on select button to select optional approvers")
	public void click_on_select_button_to_select_optional_approvers() {
		configPage.clickSelectOptinalUsers();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on ok button for optional approver")
	public void click_on_ok_button_for_optional_approver() {
		//configPage = new ConfigurationWS();
		configPage.clickOkOnChooseApproversSection();
		screenshot(driver, System.currentTimeMillis());
	}

	@And("click on ok button to select approvers")
	public void click_on_ok_button_to_select_approvers() {
		//configPage = new ConfigurationWS();
		configPage.clickOkOnSelectApproversDialog();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select min optional approver value as two for step1")
	public void select_min_optional_approver_value_as_two_for_step1() {
		//configPage = new ConfigurationWS();
		configPage.selectMinOptApproverValue2Step1();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select min optional approver value as one for step2")
	public void select_min_optional_approver_value_as_one_for_step2() {
		//configPage = new ConfigurationWS();
		configPage.selectMinOptApproverValue1Step2();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select min optional approver value as one for step3")
	public void select_min_optional_approver_value_as_one_for_step3() {
		//configPage = new ConfigurationWS();
		configPage.selectMinOptApproverValue1Step3();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@And("click on ok button to select approvers Step2")
	public void click_on_ok_button_to_select_approvers_Step2() {
		//configPage = new ConfigurationWS();
		configPage.clickOkOnSelectApproversDialogStep2();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on ok button to select approvers Step3")
	public void click_on_ok_button_to_select_approvers_Step3() {
		//configPage = new ConfigurationWS();
		configPage.clickOkOnSelectApproversDialogStep3();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on ok button to select approvers Step4")
	public void click_on_ok_button_to_select_approvers_Step4() {
		//configPage = new ConfigurationWS();
		configPage.clickOkOnSelectApproversDialogStep4();
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("verify step1 value is empty")
	public void verify_step1_value_is_empty() {
		Assert.assertTrue(matSod.verifyStep1ValueEmpty());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify that optional approvers are displayed for step2")
	public void verify_that_optional_approvers_are_displayed_for_step2() {
		Assert.assertTrue(matSod.verifyOptApprForStep2OnPreApprEditor());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("verify preferred approvers are displayed on preferred approvers editor")
	public void verify_preferred_approvers_are_displayed_on_preferred_approvers_editor() {
		Assert.assertTrue(matSod.verifyPrefApproversTextOnPrefApprEditor());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify optional approvers are displayed on preferred approvers editor")
	public void verify_optional_approvers_are_displayed_on_preferred_approvers_editor() {
		Assert.assertTrue(matSod.verifyOptApproversTextOnPrefApprEditor());
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select step2 from select step dropdown from preferred approver editor window")
	public void select_step2_from_select_step_dropdown_from_preferred_approver_editor_window() {
		matSod.selectStep2FromDropdownPreEditorWindow();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("select the optional approver as preferred approver from step1")
	public void select_the_optional_approver_as_preferred_approver_from_step1() {
		matSod.selectoptApprAsPrefApprStep1();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select the two optional approver as preferred approver from step1")
	public void select_the_two_optional_approver_as_preferred_approver_from_step1() {
		matSod.selectTwooptApprAsPrefApprStep1();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("remove the preferred approver from preferred approver table")
	public void remove_the_preferred_approver_from_preferred_approver_table1() {
		matSod.removePrefApprFromPrefApproverTable();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on apply button on preffered approver editor")
	public void click_on_apply_button_on_preffered_approver_editor() {
		matSod.clickApplyButtonOnPreferredApproverEditor();
		screenshot(driver, System.currentTimeMillis());
	}
	@And("click on ok button on preffered approver editor")
	public void click_on_ok_button_on_preffered_approver_editor() {
		matSod.clickOkButtonOnPreferredApproverEditor();
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("verify message for min approver {string}")
	public void verify_message_for_min_approver(String expErrorMessage) {
		String actualErrorMessage = matSod.verifyErrorMessageForMinPrefferedApprover();
		Assert.assertEquals(expErrorMessage, actualErrorMessage);
		screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("optional approver is displayed as preffered approver")
	public void optional_approver_is_displayed_as_preffered_approver() {
		Assert.assertTrue(matSod.verifyOptApprisDisplayedAsPrefAppr());
		screenshot(driver, System.currentTimeMillis());
	}
	@Then("verify that optional approvers are displayed for step1")
	public void verify_that_optional_approvers_are_displayed_for_step1() {
		Assert.assertTrue(matSod.verifyOptApprForStep1OnPreApprEditor());
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("select value2 from min optional approvers dropdown step1")
	public void select_value2_from_min_optional_approvers_dropdown() {
		configPage.selectValue2FromMinOptionalApproverDropdown();
		screenshot(driver, System.currentTimeMillis());
	}
	
	@And("click on submit button to create approver list")
	public void click_on_submit_button_to_create_approver_list() {
		configPage.clickSubmitToCreteApproverList();
		screenshot(driver, System.currentTimeMillis());
	}

	@Then("approver list is created successfully")
	public void approver_list_is_created_successfully() {
		Assert.assertTrue(workSpacePage.approverListCreated());
		screenshot(driver, System.currentTimeMillis());
	}


	@Then("edit watch list option is displayed")
	public void edit_watch_list_option_is_displayed() {
		Assert.assertTrue(workSpacePage.editWatchListOptionDisplayed());
		screenshot(driver, System.currentTimeMillis());
	}
	
}
