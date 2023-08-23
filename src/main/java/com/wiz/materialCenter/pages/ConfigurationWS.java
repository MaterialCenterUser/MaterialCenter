package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class ConfigurationWS extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, (30));
	EditMatProcess editMat = new EditMatProcess();

	public ConfigurationWS() {
		PageFactory.initElements(driver, this);
	}

	public String storeName;
	/* Xpaths under Materials Configuration tab */

	@FindBy(xpath = "//input[contains(@name,'expandcollapseAdminButton')]")
	WebElement toggleMatAdmin;

	@FindBy(xpath = "//a[text()='Property Categories']")
	WebElement propertyCategories;

	@FindBy(xpath = "//a[text()='Material Property Definitions']")
	WebElement matPropDef;

	@FindBy(xpath = "//a[text()='Material Schemas']")
	WebElement matSchemas;

	@FindBy(xpath = "//a[text()='Databank Mappings']")
	WebElement databankMappings;

	@FindBy(xpath = "//a[text()='Excel Mappings']")
	WebElement excelMappings;

	@FindBy(xpath = "//a[text()='Xml Mappings']")
	WebElement xmlMappings;

	@FindBy(xpath = "//a[text()='CAE Mappings']")
	WebElement caeMappings;

	@FindBy(xpath = "//a[text()='Curve Equations']")
	WebElement curveEqu;

	@FindBy(xpath = "//a[text()='Curve Equation Mappings']")
	WebElement curveEquMappings;

	@FindBy(xpath = "//a[text()='Specimen Definitions']")
	WebElement speciDef;

	@FindBy(xpath = "//a[text()='Test Definitions']")
	WebElement testDef;

	@FindBy(xpath = "//a[text()='Test Templates']")
	WebElement testTemplates;

	@FindBy(xpath = "//td[contains(text(),'Test Templates')]")
	WebElement textTestTemplates;

	@FindBy(xpath = "//a[text()='Approver Lists']")
	WebElement approverLists;

	@FindBy(xpath = "//a[text()='EMV Connections']")
	WebElement emvConnections;

	@FindBy(xpath = "//a[text()='Compliance Connector']")
	WebElement complianceConnector;

	@FindBy(xpath = "//a[text()='Create Compliance Connection']")
	WebElement createComplianceConnection;

	@FindBy(xpath = "//a[text()='Update Base Mapping']")
	WebElement updateBaseMapping;

	@FindBy(xpath = "//a[text()='Configure Material Attributes']")
	WebElement configMatAttributes;

	@FindBy(xpath = "//a[text()='Work Request Templates']")
	WebElement workReqTemp;

	@FindBy(xpath = "//a[text()='Material Displays']")
	WebElement matDisplays;

	@FindBy(xpath = "//option[text()='Class']")
	WebElement classificationClass;

	@FindBy(xpath = "//option[text()='Family']")
	WebElement classificationFamily;

	@FindBy(xpath = "//option[text()='Form']")
	WebElement classificationForm;

	@FindBy(xpath = "//option[text()='Sub Class']")
	WebElement classificationSubClass;

	@FindBy(xpath = "(//img[@class='right'])[1]")
	WebElement moveRight;

	@FindBy(xpath = "//input[@value='Submit' and contains(@id,'Materials')]")
	WebElement findSimilarSubmitButton;

	@FindBy(xpath = "//input[@id='cfsmsgDialogLoggOffInfo-f:msgDlgOkBtn']")
	WebElement okButtonAlert;

	/* Xpaths under Materials Data Owner tab */

	@FindBy(xpath = "//input[contains(@name,'expandcollapseDataOwnerButton')]")
	WebElement toggleMatDataOwner;

	@FindBy(xpath = "//span[text()='Materials Data Owner']/following::div/table/tbody/tr/td/a[text()='Create Material']")
	WebElement createMat;
	@FindBy(xpath = "//h2[text()='Create/Edit Material Data   ']")
	WebElement textCreateMat;

	@FindBy(xpath = "//span[text()='Test Details']")
	WebElement testDetailsTab;

	@FindBy(xpath = "//a[text()='Import Excel File']")
	WebElement importExcel;

	@FindBy(xpath = "//a[text()='Import Text File']")
	WebElement importText;

	@FindBy(xpath = "//a[text()='Import Xml File']")
	WebElement importXml;

	@FindBy(xpath = "//a[text()='Data Sources']")
	WebElement dataSources;

	@FindBy(xpath = "//a[text()='Export Processes']")
	WebElement exportProcesses;

	@FindBy(xpath = "//a[text()='Submitted Approval Requests']")
	WebElement approvalRequest;

	@FindBy(xpath = "//a[text()='Disclaimers']")
	WebElement disclaimers;

	@FindBy(xpath = "//a[text()='Security Labels']")
	WebElement securityLabels;

	@FindBy(xpath = "//a[text()='Compliance Status Plot']")
	WebElement compliancePlot;

	/* Xpaths under All Materials Users tab */

	@FindBy(xpath = "//input[contains(@name,'expandcollapseAllUsersButton')]")
	WebElement toggleMatUsers;

	@FindBy(xpath = "//a[text()='Libraries']")
	WebElement libraries;

	@FindBy(xpath = "//a[text()='Pending Approval Requests']")
	WebElement pendingApprovalReq;

	// @FindBy(xpath = "//a[text()='Configure Find Similar']")
	@FindBy(xpath = "//a[@id='f:w:wm:MaterialsWorkspace:widgetlink_findSimilarLink']")

	WebElement configFindSimilar;

	@FindBy(xpath = "//span[text()='All Materials Users']")
	WebElement textAllMatUsers;

	/* Xpaths under Specimen & Test Definitions */

	@FindBy(xpath = "//a[text()='Pedigree Viewer']")
	WebElement pedigreeViewer;

	@FindBy(xpath = "//a[text()='Create Specimen Definition']")
	WebElement createSpecDef;

	@FindBy(xpath = "//a[text()='Create Test Definition']")
	WebElement createTestDef;

	@FindBy(xpath = "//a[text()='Create Test Template']")
	WebElement createTestTemplate;

	@FindBy(xpath = "//a[text()='Edit Test Definition']")
	WebElement editTestDef;

	@FindBy(xpath = "//a[text()='Edit Specimen Definition']")
	WebElement editSpecDef;

	@FindBy(xpath = "//a[text()='Edit Test Template']")
	WebElement editTestTemplate;

	@FindBy(xpath = "//a[text()='Edit Imported Mapping']")
	WebElement editImportMapping;

	@FindBy(xpath = "//a[text()='Assign Security Labels']")
	WebElement assignSecurityLabels;

	@FindBy(xpath = "//a[text()='Example Test Data Mapping']//parent::td")
	WebElement exTestDataMapping;

	@FindBy(xpath = "//td[contains(text(),'Excel Mappings')]")
	WebElement textExcelMappings;

	@FindBy(xpath = "//a[text()='Generic Materials Selector']//parent::td")
	WebElement excelMappingGenMatSelector;

	@FindBy(xpath = "//input[contains(@id,'TestTemplate:name')]")
	WebElement testTemplateName;

	@FindBy(xpath = "//input[contains(@id,'btnImportDesignMapping')]")
	WebElement importDesignDataMapping;

	@FindBy(xpath = "//div[contains(@id,'ImportExcelMapping:project')]")
	WebElement designDataProjectDropdown;

	@FindBy(xpath = "//span[text()='/Data']")
	WebElement designDataProjectData;

	@FindBy(xpath = "//input[contains(@id,'ImportExcelMapping:name')]")
	WebElement designDataMappingName;

	@FindBy(xpath = "//img[contains(@id,'materialsSchema')]")
	WebElement designDataSchemaDropdown;

	@FindBy(xpath = "//span[text()='Master']")
	WebElement schemaMaster;

	@FindBy(xpath = "//img[contains(@id,'testDataMapping')]")
	WebElement testDataMappingDropdown;

	@FindBy(xpath = "(//span[text()='Import Digimat-VA CompositeTests'])[2]")
	WebElement exampleTestDataMapping;

	@FindBy(xpath = "//img[contains(@id,'dynamicOneRefWidget')]")
	WebElement tensileRefDropdown;

	@FindBy(xpath = "//span[contains(text(),'ASTM')]")
	WebElement tensileRef;

	@FindBy(xpath = "//select[contains(@id,'designAllowableDropdown')]")
	WebElement designAllowableDropdown;

	@FindBy(xpath = "//select[contains(@id,'designAllowableDropdown')]/option[text()='Tensile Ultimate Strength']")
	WebElement tensileUltStrgth;

	@FindBy(xpath = "//select[contains(@id,'designAllowableDropdown')]/option[text()='Tensile Yield Strength']")
	WebElement tensileYieldStrgth;

	@FindBy(xpath = "//input[@value='Add']")
	WebElement addDesignAllowable;

	@FindBy(xpath = "//input[contains(@id,'url')]")
	WebElement serverUrl;

	@FindBy(xpath = "//input[contains(@id,'materialUser')]")
	WebElement matUser;

	@FindBy(xpath = "//input[contains(@id,'materialPassword')]")
	WebElement matPassword;

	@FindBy(xpath = "//input[contains(@id,'complianceUser')]")
	WebElement complianceUser;

	@FindBy(xpath = "//input[contains(@id,'compliancePassword')]")
	WebElement compliancePassword;

	@FindBy(xpath = "//input[contains(@id,'singleMatComplianceApi')]")
	WebElement singleMatApi;

	@FindBy(xpath = "//input[contains(@id,'multipleMatComplianceApi')]")
	WebElement multiMatApi;

	@FindBy(xpath = "//input[contains(@id,'ComplianceConnection:submitButton')]")
	WebElement complianceConnectionSubmit;

	@FindBy(xpath = "//td[@smcol='2']")
	WebElement matUserValue;

	@FindBy(xpath = "//td[@smcol='3']")
	WebElement complianceUserValue;

	/* Xpaths for import excel file */

	@FindBy(xpath = "//label[text()=' Fixed'] | //input[@value='excelFixed']")
	WebElement fixedFormat;

	@FindBy(xpath = "(//img[contains(@id,'ImportFromExcel')])[1]")
	WebElement projectDropDown;

	@FindBy(xpath = "//img[@id='materialsActionDialog-f:CreateApproverListSimActivity:SMRecentObjectsSelection_approverListProject_recentObjectListDropDownArrowImage']")
	WebElement projectDropDownApprovalList;

	@FindBy(xpath = "//img[contains(@id,'CreateEditMaterial:SMRecentObjectsSelection_project_recentObjectListDropDownArrowImage')]")
	WebElement projectDropDownCreateMat;

	@FindBy(xpath = "(//img[contains(@id,'ImportFromExcel')])[2]")
	WebElement schemaDropDown;

	@FindBy(xpath = "//select[contains(@id,'CreateEditMaterial:schemaObject_orDd')]")
	WebElement schemaDropDownCreatMat;

	@FindBy(xpath = "(//img[contains(@id,'ImportFromExcel')])[3]")
	WebElement schemaMappingDropDown;

	@FindBy(xpath = "//div[@id='RecentObjSel']/table/tbody/tr/td/span[text()='/Data'] | //div[@id='RecentObjSel']/table/tbody/tr/td/span[text()='/Data/Active/TASE']")
	WebElement dataProject;

	@FindBy(xpath = "//div[@id='RecentObjSel']/table/tbody/tr/td/span[text()='/System'] | //div[@id='RecentObjSel']/table/tbody/tr/td/span[text()='/Data/Active/TASE']")
	WebElement systemProject;

	@FindBy(xpath = "//table[@class='RecentObjSelTbl']/tbody/tr/td/span[text()='MasterMetals']")
	WebElement masterMetalsSchema;

	@FindBy(xpath = "//table[@class='RecentObjSelTbl']/tbody/tr/td/span[text()='Generic Materials Selector']")
	WebElement genericMatSelector;

	@FindBy(xpath = "//input[@id='httpFile']")
	WebElement uploadExcel;

	@FindBy(xpath = "(//input[@id='httpFile'])[2]")
	WebElement uploadExcelOnExcelMapping;

	@FindBy(xpath = "(//input[@id='httpFile'])[1]")
	WebElement uploadExcel1;

	@FindBy(xpath = "//img[@class='BfsButton']")
	WebElement removeExcelButton;

	@FindBy(xpath = "//img[@class='BfsButton']")
	WebElement removeXmlButton;

	@FindBy(xpath = "//input[@value='Submit' and @title='Submit']")
	WebElement submitExcelButton;

	@FindBy(xpath = "//input[contains(@id,'ExcelMapping:submitButton')]")
	WebElement submitDesignDataButton;

	@FindBy(xpath = "//div[contains(@id,'objLabelDecPanel')]")
	WebElement verifyHeading;

	@FindBy(xpath = "//a[contains(text(),'TestDataReductionTemplate.xlsx')]")
	WebElement templateLink;

	@FindBy(xpath = "//input[@value='Ok']")
	WebElement infoDialogOkButton;

	@FindBy(xpath = "(//input[@value='Clear'])[2]")
	WebElement matToReviseClear;

	@FindBy(xpath = "//h2[contains(text(),'Material (Excel)   ')]")
	WebElement textMaterialtoImportExcel;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:CreateEditTestTemplate:generatedFromDropdown']")
	WebElement selectTestDataDropdown;

	@FindBy(xpath = "//td[text()='Data Sources']")
	WebElement txtDataSources;

	@FindBy(xpath = "//a[text()='Materials Selector']")
	WebElement materialsSelectorLink;
	@FindBy(xpath = "//span[text()='materials_selector [ Mvision Data Source ]']")
	WebElement txtMatDataSources;

	@FindBy(xpath = "//span[text()='Classification']")
	WebElement classificationTab;

	@FindBy(xpath = "(//td[@class='MatEditorTableEvenRow']/span[text()='Class']/following::td/input)[1]")
	WebElement classTextBox;

	@FindBy(xpath = "(//td[@class='MatEditorTableOddRow']/span[text()='Sub Class']/following::td/input)[1]")
	WebElement subClassTextBox;

	@FindBy(xpath = "(//td[@class='MatEditorTableOddRow']/span[text()='Common Name']/following::td/input)[1]")
	WebElement commonNameTextBox;

	@FindBy(xpath = "//span[text()='MaterialCenter Attribute']")
	WebElement MatAttributes;

	@FindBy(xpath = "//input[contains(@id, 'CreateEditMaterial:submitBtn')]")
	WebElement submitOnCreateMat;

	@FindBy(xpath = "//a[@name='f:w:wm:MaterialsWorkspace:widgetlink_measureEquationLink']")
	WebElement measureEquationsLink;

	@FindBy(xpath = "//a[@title='Work Request Templates']")
	WebElement workRequestTemplatesLink;

	@FindBy(xpath = "//a[@name='f:w:wm:MaterialsWorkspace:widgetlink_measureEquationMappingLink']")
	WebElement measureEquationMappingsLink;

	@FindBy(xpath = "//a[text()='Import Measure Equation']")
	WebElement importMeasureEquationsLink;

	@FindBy(xpath = "//img[@title='New Work Request Template']")
	WebElement createTemplateImage;

	@FindBy(xpath = "//a[text()='Edit Imported Measure Equation']")
	WebElement editImportMeasureEquationsLink;

	@FindBy(xpath = "//a[text()='Import Mapping']")
	WebElement importMappingsLink;

	@FindBy(xpath = "//a[text()='Edit Imported Mapping']")
	WebElement editImportMappingsLink;

	@FindBy(xpath = "(//td[text()='Mat Measure Equation'])[1]")
	WebElement createdMeasureEquation;

	@FindBy(xpath = "(//td[text()='Mat Measure Equation Mapping'])[1]")
	WebElement createdMeasureEquationMappings;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement firstEle;

	@FindBy(xpath = "//input[@name='materialsActionDialog-f:CreateApproverListSimActivity:name']")
	WebElement approverListNameTextBox;

	@FindBy(xpath = "//input[@value='Users..']")
	WebElement selectApproversUsersbutton;

	@FindBy(xpath = "//table[@id='selectReviewersDialog_pnl']/tbody//tr/td/span[text()='Select Approvers']")
	WebElement selectApproverDialog;

	@FindBy(xpath = "//table[@id='selectUsersDialog_pnl']/tbody//tr/td/span[text()='Select Mandatory Approvers']")
	WebElement selectMandApprDialog;

	@FindBy(xpath = "(//input[@value='Users..'])[2]")
	WebElement selectApproversUsersbuttonSte2;

	@FindBy(xpath = "(//input[@value='Users..'])[3]")
	WebElement selectApproversUsersbuttonSte3;

	@FindBy(xpath = "(//input[@value='Users..'])[4]")
	WebElement selectApproversUsersbuttonSte4;

	@FindBy(xpath = "//input[@id='selectReviewersDialog-f:btnMandatory']")
	WebElement mandatoryApproverSelectbutton;

	@FindBy(xpath = "//input[@id='selectReviewersDialog-f:btnOptional']")
	WebElement optionalApproverSelectbutton;

	@FindBy(xpath = "//select/option[@value='matAdmin']")
	WebElement matAdminApprover;

	@FindBy(xpath = "//select/option[@value='SimMan']")
	WebElement simManApprover;

	@FindBy(xpath = "//select/option[@value='manager']")
	WebElement managerApprover;

	@FindBy(xpath = "//select/option[@value='dataOwner']")
	WebElement dataOwnerApprover;

	@FindBy(xpath = "//select/option[@value='smroot']")
	WebElement smrootApprover;

	@FindBy(xpath = "//select/option[@value='user1']")
	WebElement user1Approver;

	@FindBy(xpath = "//select/option[@value='user3']")
	WebElement user3Approver;

	@FindBy(xpath = "//select/option[@value='user2']")
	WebElement user2Approver;

	@FindBy(xpath = "//input[@id='selectUsersDialog-f:okBtn3']")
	WebElement chooseApproverSelectOKButton;

	@FindBy(xpath = "//input[@id='selectReviewersDialog-f:okBtn2']")
	WebElement approverSelectOKButton;

	@FindBy(xpath = "//a[text()='Create Approver List']")
	WebElement createApproverListLink;
	@FindBy(xpath = "//span[text()='Approver List']")
	WebElement approvalRequestWindowText;

	@FindBy(xpath = "//span[@id='selectReviewersDialog_ttl']")
	WebElement titleSelectApproversDialogBox;

	@FindBy(xpath = "//span[@id='materialsActionDialog_ttl']")
	WebElement titleApproverListsDialogBox;

	@FindBy(xpath = "//span[@id='selectReviewersDialog-f:lbDlg4']")
	WebElement mandatorySection;

	@FindBy(xpath = "//span[@id='selectReviewersDialog-f:lbDlg1']")
	WebElement optionalSection;

	@FindBy(xpath = "//input[@id='selectReviewersDialog-f:btnMandatory']")
	WebElement selectButtonMandatoryUsers;

	@FindBy(xpath = "//input[@id='selectReviewersDialog-f:btnOptional']")
	WebElement selectButtonOptionalUsers;

	@FindBy(xpath = "//input[@id='selectUsersDialog-f:okBtn3']")
	WebElement okButtonOnChooseApprovers;

	@FindBy(xpath = "//input[@id='selectReviewersDialog-f:okBtn2']")
	WebElement okButtonOnSelectApproversDialogBox;

	@FindBy(xpath = "(//td/input[@value='Step 1']/following::td/span[text()='matAdmin (Matthew Admin)'])[1]")
	WebElement matAdminmanApprAddedTextStep1;

	@FindBy(xpath = "(//td/input[@value='Step 2']/following::td/span[text()='matAdmin (Matthew Admin)'])[1]")
	WebElement matAdminmanApprAddedTextStep2;

	@FindBy(xpath = "(//td/input[@value='Step 3']/following::td/span[text()='matAdmin (Matthew Admin)'])[1]")
	WebElement matAdminmanApprAddedTextStep3;

	@FindBy(xpath = "(//td/input[@value='Step 4']/following::td/span[text()='matAdmin (Matthew Admin)'])[1]")
	WebElement matAdminmanApprAddedTextStep4;

	@FindBy(xpath = "(//select[contains(@id,\"materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\")]/option[@value='0'])[1]")
	WebElement minOptionalApprDropValue0Step1;

	@FindBy(xpath = "(//select[contains(@id,\"materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\")]/option[@value='0'])[2]")
	WebElement minOptionalApprDropValue0Step2;

	@FindBy(xpath = "(//select[contains(@id,\"materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\")]/option[@value='0'])[3]")
	WebElement minOptionalApprDropValue0Step3;

	@FindBy(xpath = "(//select[contains(@id,\"materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\")]/option[@value='0'])[4]")
	WebElement minOptionalApprDropValue0Step4;

	@FindBy(xpath = "//input[@id='materialsActionDialog-f:CreateApproverListSimActivity:okBtn']")
	WebElement submitButtonApproverList;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='1']")
	WebElement promoteApproveDemoteMatsOption;

	@FindBy(xpath = "//input[@id='materialsActionDialog-f:CreateApproverListSimActivity:orderingList']")
	WebElement reorderStepsButton;

	@FindBy(xpath = "//span[@id='materialsActionDialog-f:CreateApproverListSimActivity:grouWithPrevious_']")
	WebElement grpWithPrevColumn;

	@FindBy(xpath = "//span[@id='stepTaskOrderingDlg_ttl']")
	WebElement reorderStepsDialog;

	@FindBy(xpath = "//span[@id='materialsActionDialog-f:CreateApproverListSimActivity:stepDescription_']")
	WebElement stepDescColumn;

	@FindBy(xpath = "//span[@id='materialsActionDialog-f:CreateApproverListSimActivity:urgencyThresholdLabel']")
	WebElement urgeThresholdDaysOption;

	@FindBy(xpath = "(//textarea[contains(@id, 'materialsActionDialog-f:CreateApproverListSimActivity:stepDescription')])[1]")
	WebElement stepDescTextBoxStep1;

	@FindBy(xpath = "//input[@id='materialsActionDialog-f:CreateApproverListSimActivity:urgencyThresholdInfo']")
	WebElement urgeThresholdQuestionMarkIcon;
	@FindBy(xpath = "//b[text()=' Urgency Threshold ']")
	WebElement urgeThresholdTooltip;

	@FindBy(xpath = "//a[text()='Test Templates']")
	WebElement testTemplatesLink;

	@FindBy(xpath = "(//td/input[@value='Step 1']/following::td/table/tbody/tr/td/img[@title='add a new approval step'])[1]")
	WebElement plusButtonAddStep1;

	@FindBy(xpath = "(//td/input[@value='Step 2']/following::td/table/tbody/tr/td/img[@title='add a new approval step'])[1]")
	WebElement plusButtonAddStep2;

	@FindBy(xpath = "(//td/input[@value='Step 3']/following::td/table/tbody/tr/td/img[@title='add a new approval step'])[1]")
	WebElement plusButtonAddStep3;

	@FindBy(xpath = "(//td/input[@value='Step 4']/following::td/table/tbody/tr/td/img[@title='add a new approval step'])[1]")
	WebElement plusButtonAddStep4;

	@FindBy(xpath = "//input[@value='Step 2']")
	WebElement step2Label;

	@FindBy(xpath = "//input[@value='Step 3']")
	WebElement step3Label;

	@FindBy(xpath = "//input[@value='Step 4']")
	WebElement step4Label;

	@FindBy(xpath = "//span[@id='messageDialog-f:messageDialog-msg']")
	WebElement incorrentStepMsg;

	@FindBy(xpath = "(//span[@id='materialsActionDialog-f:CreateApproverListSimActivity:j_id3']/following::input[@name='selectCB'])[1]")
	WebElement grpWithPrevStp3CheckBox;

	@FindBy(xpath = "(//span[@id='materialsActionDialog-f:CreateApproverListSimActivity:j_id1']/following::input[@name='selectCB'])[1]")
	WebElement grpWithPrevStp1CheckBox;

	@FindBy(xpath = "(//span[@id='materialsActionDialog-f:CreateApproverListSimActivity:j_id2']/following::input[@name='selectCB'])[1]")
	WebElement grpWithPrevStp2CheckBox;

	@FindBy(xpath = "//div[@id='Step1']")
	WebElement parallelStep1;

	@FindBy(xpath = "//div[@id='Step1']")
	WebElement newStep1Created;

	@FindBy(xpath = "//div[@id='Step1']/child::div/span[text()='Step 3']")
	WebElement step3OrderChangesAsPrevStep2;

	@FindBy(xpath = "//table[contains(@id,'materialsActionDialog-f:CreateApproverListSimActivity:pnl')]//td//input[@value='Step 2']//following::img[@title='remove current approval step'][1]")
	WebElement delButtonStep2;

	@FindBy(xpath = "//table[contains(@id,'materialsActionDialog-f:CreateApproverListSimActivity:pnl')]//td//input[@value='Step 3']//following::img[@title='remove current approval step'][1]")
	WebElement delButtonStep3;

	@FindBy(xpath = "//table[contains(@id,'materialsActionDialog-f:CreateApproverListSimActivity:pnl')]//td//input[@value='Step 4']//following::img[@title='remove current approval step'][1]")
	WebElement delButtonStep4;

	@FindBy(xpath = "//span[@id='warningDlg_ttl']")
	WebElement warningConfirmDialogDelStep;

	@FindBy(xpath = "//input[@id='warningDlg-f:warningDlg_yes']")
	WebElement warningConfirmDialogOkButton;

	@FindBy(xpath = "//table[contains(@id,'materialsActionDialog-f:CreateApproverListSimActivity:pnl')]//td//input[@value='Step 2']")
	WebElement step2TextLabelBox;

	@FindBy(xpath = "//input[@id='materialsActionDialog-f:CreateApproverListSimActivity:urgencyThreshold']")
	WebElement urgencyThresholdTextBox;

	@FindBy(xpath = "(//select[contains(@id,\"myWorkspaceActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\")])[1]")
	WebElement minOptionalApproverDropdownStep1;

	@FindBy(xpath = "//a[text()='Pending Approval Requests']")
	WebElement pendingApprovalRequestsLink;

	@FindBy(xpath = "//td[text()='Pending Approval Requests']")
	WebElement pendingApprovalRequestsText;

	@FindBy(xpath = "(//select[contains(@id,'materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown')])[1]")
	WebElement minOptApproverDropDownStep1;

	@FindBy(xpath = "(//select[contains(@id,'materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown')])[2]")
	WebElement minOptApproverDropDownStep2;

	@FindBy(xpath = "(//select[contains(@id,'materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown')])[3]")
	WebElement minOptApproverDropDownStep3;

	public void selectMinOptApproverValue2Step1() {

		Select selectMinOptApproverValue2 = new Select(minOptApproverDropDownStep1);

		selectMinOptApproverValue2.selectByVisibleText("2");
	}

	public void selectMinOptApproverValue1Step2() {

		Select selectMinOptApproverValue1 = new Select(minOptApproverDropDownStep2);

		selectMinOptApproverValue1.selectByVisibleText("1");
	}

	public void selectMinOptApproverValue1Step3() {

		Select selectMinOptApproverValue1 = new Select(minOptApproverDropDownStep3);

		selectMinOptApproverValue1.selectByVisibleText("1");
	}

	public boolean pendingAppRequestIsDisplayed() {

		return (firstEle.isDisplayed());

	}

	public void clickOnPendingApprovalRequestsLink() {

		action.moveToElement(pendingApprovalRequestsLink).build().perform();
		action.click(pendingApprovalRequestsLink).build().perform();

		wait.until(ExpectedConditions.visibilityOf(pendingApprovalRequestsText));
	}

	public void selectValue2FromMinOptionalApproverDropdown() {

		Select selectMinOptionalDropdownStep1 = new Select(minOptionalApproverDropdownStep1);

		selectMinOptionalDropdownStep1.selectByValue("2");

	}

	public void enterUrgencyThresholdDays() {

		action.moveToElement(urgencyThresholdTextBox).build().perform();
		action.click(urgencyThresholdTextBox).build().perform();
		// urgencyThresholdTextBox.click();
		storeName = RandomStringUtils.randomNumeric(2);
		urgencyThresholdTextBox.sendKeys(storeName);

	}

	public boolean step2IsNotDisplayed() {
		try {
			if (step2TextLabelBox.isDisplayed())
				;

		} catch (Throwable e) {
			return false;
		}
		return false;

	}

	public void clickOnOkDelConfirmDialog() {
		action.moveToElement(warningConfirmDialogOkButton).build().perform();
		action.click(warningConfirmDialogOkButton).build().perform();
		// wait.until(ExpectedConditions.visibilityOf(warningConfirmDialogDelStep));
	}

	public void clickOnDelButtonStep2() {
		action.moveToElement(delButtonStep2).build().perform();
		action.click(delButtonStep2).build().perform();
		wait.until(ExpectedConditions.visibilityOf(warningConfirmDialogDelStep));
	}

	public boolean currentStep3OrderChangesAsPrevStep2() {

		return (step3OrderChangesAsPrevStep2.isDisplayed());
	}

	public void clickOnGrpWithPrevAgainstStep3() {
		action.moveToElement(grpWithPrevStp3CheckBox).build().perform();
		action.click(grpWithPrevStp3CheckBox).build().perform();
		wait.until(ExpectedConditions.visibilityOf(newStep1Created));
	}

	public String incorrectStepMsgDisplayed() {

		return (incorrentStepMsg.getText());
	}

	public boolean addedStep2IsDisplayed() {

		return (step2Label.isDisplayed());
	}

	public boolean addedStep3IsDisplayed() {

		return (step3Label.isDisplayed());
	}

	public boolean addedStep4IsDisplayed() {

		return (step4Label.isDisplayed());
	}

	public void clickOnPlusButtonStep1() {

		action.moveToElement(plusButtonAddStep1).build().perform();
		action.click(plusButtonAddStep1).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Users..'])[2]")));

	}

	public void clickOnPlusButtonStep2() {

		action.moveToElement(plusButtonAddStep2).build().perform();
		action.click(plusButtonAddStep2).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Users..'])[3]")));
	}

	public void clickOnPlusButtonStep3() {

		action.moveToElement(plusButtonAddStep3).build().perform();
		action.click(plusButtonAddStep3).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Users..'])[4]")));
		// js.executeScript("arguments[0].click();", plusButtonAddStep3);
	}

	public void clickOnPlusButtonStep4() {

		action.moveToElement(plusButtonAddStep4).build().perform();
		action.click(plusButtonAddStep4).build().perform();
	}

	public void clickOnTestTemplatesLink() {

		action.moveToElement(testTemplatesLink).build().perform();
		action.click(testTemplatesLink).build().perform();
	}

	public boolean testTemplateOptionIsDisplayed() {

		return (testTemplatesLink.isDisplayed());
	}

	public boolean urgeThresholdDaysTooltipDisplayed() {

		return (urgeThresholdTooltip.isDisplayed());
	}

	public void howerOnQuestionMarkUrgeThreshold() {

		action.moveToElement(urgeThresholdQuestionMarkIcon).build().perform();
		// wait.until(ExpectedConditions.visibilityOf(importMeasureEquationsLink));
	}

	public void enterStepDescForStep1() {
		stepDescTextBoxStep1.click();
		storeName = RandomStringUtils.randomAlphanumeric(10);
		stepDescTextBoxStep1.sendKeys(storeName);

	}

	public boolean urgeThresholdDaysOptionDisplayed() {

		return (urgeThresholdDaysOption.isDisplayed());
	}

	public boolean stepDescColumnDisplayed() {

		return (stepDescColumn.isDisplayed());
	}

	public boolean reorderStepsUIOpened() {

		return (reorderStepsDialog.isDisplayed());
	}

	public boolean grpWithPrevColumnDisplayed() {

		return (grpWithPrevColumn.isDisplayed());
	}

	public boolean reorderStepsButtonDisplayed() {

		return (reorderStepsButton.isDisplayed());
	}

	public MyWorkspacePage clickSubmitToCreteApproverList() {

		action.moveToElement(submitButtonApproverList).build().perform();
		action.click(submitButtonApproverList).build().perform();
		return new MyWorkspacePage();
	}

	public void clickOkOnSelectApproversDialog() {

		action.moveToElement(okButtonOnSelectApproversDialogBox).build().perform();
		action.click(okButtonOnSelectApproversDialogBox).build().perform();
		wait.until(ExpectedConditions.visibilityOf(minOptionalApprDropValue0Step1));

	}

	public void clickOkOnSelectApproversDialogStep2() {

		action.moveToElement(okButtonOnSelectApproversDialogBox).build().perform();
		action.click(okButtonOnSelectApproversDialogBox).build().perform();
		wait.until(ExpectedConditions.visibilityOf(minOptionalApprDropValue0Step2));

	}

	public void clickOkOnSelectApproversDialogStep3() {

		action.moveToElement(okButtonOnSelectApproversDialogBox).build().perform();
		action.click(okButtonOnSelectApproversDialogBox).build().perform();
		//wait.until(ExpectedConditions.visibilityOf(minOptionalApprDropValue0Step3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[contains(@id,\\\"materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\\\")]/option[@value='0'])[3]")));
	}

	public void clickOkOnSelectApproversDialogStep4() {

		action.moveToElement(okButtonOnSelectApproversDialogBox).build().perform();
		action.click(okButtonOnSelectApproversDialogBox).build().perform();
		wait.until(ExpectedConditions.visibilityOf(minOptionalApprDropValue0Step4));

	}

	public void selectDataOwnerUser() {

		action.moveToElement(dataOwnerApprover).build().perform();
		action.doubleClick(dataOwnerApprover).build().perform();
	}

	public void clickOkOnChooseApproversSection() {

		action.moveToElement(okButtonOnChooseApprovers).build().perform();
		action.click(okButtonOnChooseApprovers).build().perform();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='selectReviewersDialog-f:okBtn2']")));
		// wait.until(ExpectedConditions.elementToBeClickable(okButtonOnSelectApproversDialogBox));
	}

	public void selectMatAdminUser() throws InterruptedException {

		action.moveToElement(matAdminApprover).build().perform();
		action.doubleClick(matAdminApprover).build().perform();
		// Thread.sleep(2000);
	}

	public void selectUser1User() throws InterruptedException {

		action.moveToElement(user1Approver).build().perform();
		action.doubleClick(user1Approver).build().perform();
		// Thread.sleep(2000);
	}

	public void selectUser2User() throws InterruptedException {

		action.moveToElement(user2Approver).build().perform();
		action.doubleClick(user2Approver).build().perform();
		// Thread.sleep(2000);
	}

	public void selectUser3User() throws InterruptedException {

		action.moveToElement(user3Approver).build().perform();
		action.doubleClick(user3Approver).build().perform();
		// Thread.sleep(2000);
	}

	public void selectSimManUser() {

		action.moveToElement(simManApprover).build().perform();
		action.doubleClick(simManApprover).build().perform();
		// Thread.sleep(2000);
	}

	public void selectsmrootUser() {

		action.moveToElement(smrootApprover).build().perform();
		action.doubleClick(smrootApprover).build().perform();
		// Thread.sleep(2000);
	}

	public void selectManagerUser() {

		action.moveToElement(managerApprover).build().perform();
		action.doubleClick(managerApprover).build().perform();
		// Thread.sleep(2000);
	}

	public void clickSelectMandatoryUsers() {

		action.moveToElement(selectButtonMandatoryUsers).build().perform();
		action.click(selectButtonMandatoryUsers).build().perform();
		// wait.until(ExpectedConditions.visibilityOf(selectMandApprDialog));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='selectUsersDialog_pnl']/tbody//tr/td/span[text()='Select
		// Mandatory Approvers']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//table[@id='selectUsersDialog_pnl']/tbody//tr/td/span[text()='Select Mandatory Approvers']")));
	}

	public void clickSelectOptinalUsers() {

		action.moveToElement(selectButtonOptionalUsers).build().perform();
		action.click(selectButtonOptionalUsers).build().perform();
	}

	public boolean verifyMandatorySectionDisplayed() {

		return (mandatorySection.isDisplayed());
	}

	public boolean verifyOptionalSectionDisplayed() {

		return (optionalSection.isDisplayed());
	}

	public boolean selectApproverDialogBoxDisplayed() {

		return (titleSelectApproversDialogBox.isDisplayed());
	}

	public boolean verifyApproverListsDialogDisplayed() {

		return (titleApproverListsDialogBox.isDisplayed());
	}

	public void clickOnCreateApproverListLink() {

		action.moveToElement(createApproverListLink).build().perform();
		action.click(createApproverListLink).build().perform();
		wait.until(ExpectedConditions.visibilityOf(approvalRequestWindowText));

	}

	public void clickOnApproverListsLink() {

		action.moveToElement(approverLists).build().perform();
		action.click(approverLists).build().perform();
	}

	public void clickOkButtonToSelectApprover() {

		action.moveToElement(approverSelectOKButton).build().perform();
		action.click(approverSelectOKButton).build().perform();
	}

	public void selectmatAdminUser() {

		action.moveToElement(matAdminApprover).build().perform();
		action.doubleClick(matAdminApprover).build().perform();
	}

	public void clickSelectApproversUsersBUtton() {
		// action.moveToElement(selectApproversUsersbutton).build().perform();
		// action.click(selectApproversUsersbutton).build().perform();
		js.executeScript("arguments[0].click();", selectApproversUsersbutton);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//table[@id='selectReviewersDialog_pnl']/tbody//tr/td/span[text()='Select Approvers']")));

	}

	public void clickSelectApproversUsersBUttonStep2() {
		// action.moveToElement(selectApproversUsersbuttonSte2).build().perform();
		// action.click(selectApproversUsersbuttonSte2).build().perform();
		js.executeScript("arguments[0].click();", selectApproversUsersbuttonSte2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//table[@id='selectReviewersDialog_pnl']/tbody//tr/td/span[text()='Select Approvers']")));
	}

	public void clickSelectApproversUsersBUttonStep3() {
		// action.moveToElement(selectApproversUsersbuttonSte3).build().perform();
		// action.click(selectApproversUsersbuttonSte3).build().perform();
		js.executeScript("arguments[0].click();", selectApproversUsersbuttonSte3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//table[@id='selectReviewersDialog_pnl']/tbody//tr/td/span[text()='Select Approvers']")));
	}

	public void clickSelectApproversUsersBUttonStep4() {
		// action.moveToElement(selectApproversUsersbuttonSte4).build().perform();
		// action.click(selectApproversUsersbuttonSte4).build().perform();
		js.executeScript("arguments[0].click();", selectApproversUsersbuttonSte4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//table[@id='selectReviewersDialog_pnl']/tbody//tr/td/span[text()='Select Approvers']")));
	}

	public void clickOnReorderStepsBUtton() {
		action.moveToElement(reorderStepsButton).build().perform();
		action.click(reorderStepsButton).build().perform();

	}

	public void enterApproverListName() {
		action.moveToElement(approverListNameTextBox).build().perform();
		action.click(approverListNameTextBox).build().perform();
		// approverListNameTextBox.click();
		storeName = RandomStringUtils.randomAlphabetic(10);
		approverListNameTextBox.sendKeys(storeName);

	}

	public boolean verifyApproverListsDisplayed() {

		return (approverLists.isDisplayed());
	}

	public MyWorkspacePage doubleClickOnFirstMat() {
		// action.moveToElement(secondEle).build().perform();
		action.moveToElement(firstEle).build().perform();
		action.click(firstEle).build().perform();

		return new MyWorkspacePage();

	}

	/*
	 * public ConfigurationWS uploadMeasureEquation(String xml) {
	 * //action.click(uploadExcel).build().perform(); uploadExcel.sendKeys(xml);
	 * return new ConfigurationWS(); }
	 * 
	 * public void selectMeasureEquationFileToUplaod() {
	 * uploadMeasureEquation(prop.getProperty("measureEquationPath"));
	 * wait.until(ExpectedConditions.visibilityOf(removeXmlButton)); }
	 */
	public void clickOnMeasureEquationsLInk() {
		action.moveToElement(measureEquationsLink).build().perform();
		action.click(measureEquationsLink).build().perform();
		wait.until(ExpectedConditions.visibilityOf(importMeasureEquationsLink));
	}

	public void clickOnWorkRequestTemplatesLInk() {
		action.moveToElement(workRequestTemplatesLink).build().perform();
		action.click(workRequestTemplatesLink).build().perform();
		wait.until(ExpectedConditions.visibilityOf(createTemplateImage));
	}

	public ProcessesPage clickCreatetTemplateLInk() throws InterruptedException {
		action.moveToElement(createTemplateImage).build().perform();
		action.click(createTemplateImage).build().perform();
		Thread.sleep(3000);
		// wait.until(ExpectedConditions.visibilityOf(workRequestTemplatesText));
		return new ProcessesPage();
	}

	public void selectPromoteApproveDemoteMaterialsOption() {
		action.moveToElement(promoteApproveDemoteMatsOption).build().perform();
		action.click(promoteApproveDemoteMatsOption).build().perform();

	}

	public void clickOnMeasureEquationMappingsLink() {
		action.moveToElement(measureEquationMappingsLink).build().perform();
		action.click(measureEquationMappingsLink).build().perform();
	}

	public boolean verifyImportedMeasureEquationDisplayed() {

		return (createdMeasureEquation.isDisplayed());
	}

	public boolean verifyImportedMeasureMappingsDisplayed() {

		return (createdMeasureEquationMappings.isDisplayed());
	}

	public ProcessesPage clickOnEditImportedMeasureEquationsLink() throws InterruptedException {
		action.moveToElement(editImportMeasureEquationsLink).build().perform();
		action.click(editImportMeasureEquationsLink).build().perform();
		Thread.sleep(3000);
		// js.executeScript("arguments[0].click();", importMeasureEquationsLink);
		// wait.until(ExpectedConditions.visibilityOf(textImportMeasureEquation));
		return new ProcessesPage();
	}

	public ProcessesPage clickOnimportMeasureEquationsLink() throws InterruptedException {
		action.moveToElement(importMeasureEquationsLink).build().perform();
		action.click(importMeasureEquationsLink).build().perform();
		Thread.sleep(3000);
		// js.executeScript("arguments[0].click();", importMeasureEquationsLink);
		// wait.until(ExpectedConditions.visibilityOf(textImportMeasureEquation));
		return new ProcessesPage();
	}

	public ProcessesPage clickOnimportMappingsLink() throws InterruptedException {
		action.moveToElement(importMappingsLink).build().perform();
		action.click(importMappingsLink).build().perform();
		Thread.sleep(3000);
		// js.executeScript("arguments[0].click();", importMeasureEquationsLink);
		// wait.until(ExpectedConditions.visibilityOf(textImportMeasureEquation));
		return new ProcessesPage();
	}

	public ProcessesPage clickOnEditimportMappingsLink() throws InterruptedException {
		action.moveToElement(editImportMappingsLink).build().perform();
		action.click(editImportMappingsLink).build().perform();
		Thread.sleep(3000);
		// js.executeScript("arguments[0].click();", importMeasureEquationsLink);
		// wait.until(ExpectedConditions.visibilityOf(textImportMeasureEquation));
		return new ProcessesPage();
	}

	public boolean measureEquationsLinkDisplayed() {

		return (measureEquationsLink.isDisplayed());
	}

	public boolean measureEquationMappingsLinkDisplayed() {

		return (measureEquationMappingsLink.isDisplayed());
	}

	public MaterialSOD clickOnSubmitToCreateMat() throws InterruptedException {

		js.executeScript("arguments[0].click();", submitOnCreateMat);
		Thread.sleep(3000);
		return new MaterialSOD();
	}

	public void clickOnClassificationTab() {
		action.moveToElement(classificationTab).build().perform();
		action.click(classificationTab).build().perform();
		// js.executeScript("arguments[0].click();", classificationTab);
		wait.until(ExpectedConditions.visibilityOf(MatAttributes));
	}

	public void enterValueForCommonNameOnClassificationTab(String commonNameToEnter) {
		action.moveToElement(commonNameTextBox).build().perform();
		action.click(commonNameTextBox).build().perform();
		commonNameTextBox.sendKeys(commonNameToEnter);
	}

	public void provideRandomNameToMat() {
		// js.executeScript("arguments[0].scrollIntoView(true);", saveSearch);
		// action.moveToElement(saveSearch).build().perform();
		// action.click(saveSearch).build().perform();
		// driver.switchTo().activeElement();
		storeName = RandomStringUtils.randomNumeric(6);
		commonNameTextBox.sendKeys(storeName);
		// js.executeScript("arguments[0].click();", submitOnCreateMat);
		// return new MaterialSOD();
	}

	public void clickOnCreateMaterial() {
		js.executeScript("arguments[0].scrollIntoView(true);", createMat);
		js.executeScript("arguments[0].click();", createMat);
		wait.until(ExpectedConditions.visibilityOf(textCreateMat));
	}

	public void doubleClickOnMaterialsSelector() {
		js.executeScript("arguments[0].scrollIntoView(true);", materialsSelectorLink);
		action.moveToElement(materialsSelectorLink).build().perform();
		action.click(materialsSelectorLink).build().perform();
		wait.until(ExpectedConditions.visibilityOf(txtMatDataSources));
	}

	public void clickOnImportExcel() {
		// action.moveToElement(importExcel).build().perform();
		// action.click(importExcel).build().perform();
		js.executeScript("arguments[0].click();", importExcel);
		wait.until(ExpectedConditions.visibilityOf(textMaterialtoImportExcel));
	}

	public void clickOnDataSources() {
		js.executeScript("arguments[0].click();", dataSources);
		wait.until(ExpectedConditions.visibilityOf(txtDataSources));
	}

	public void clickOnFixedFormat() {
		action.moveToElement(fixedFormat).build().perform();
		action.click(fixedFormat).build().perform();
		// wait.until(ExpectedConditions.elementToBeSelected(fixedFormat));
	}

	public void selectDataProject() {
		action.moveToElement(projectDropDown).build().perform();
		action.click(projectDropDown).build().perform();
		js.executeScript("arguments[0].click();", dataProject);
	}

	public void selectSystemProject() {
		action.moveToElement(projectDropDown).build().perform();
		action.click(projectDropDown).build().perform();
		js.executeScript("arguments[0].click();", systemProject);
	}

	public void selectSystemProjectFromApprovalListPage() {
		action.moveToElement(projectDropDownApprovalList).build().perform();
		action.click(projectDropDownApprovalList).build().perform();
		js.executeScript("arguments[0].click();", systemProject);
	}

	public void selectDataProjectToCreatMat() {
		action.moveToElement(projectDropDownCreateMat).build().perform();
		action.click(projectDropDownCreateMat).build().perform();
		action.moveToElement(dataProject).build().perform();
		action.click(dataProject).build().perform();
		// js.executeScript("arguments[0].click();", dataProject);
	}

	public void selectMasterMetalSchema() {
		action.moveToElement(schemaDropDown).build().perform();
		action.click(schemaDropDown).build().perform();
		js.executeScript("arguments[0].click();", masterMetalsSchema);
	}

	public void selectMasterMetalSchemaToCreateMat() throws InterruptedException {
		// action.moveToElement(schemaDropDownCreatMat).build().perform();
		// action.click(schemaDropDownCreatMat).build().perform();
		// js.executeScript("arguments[0].click();", masterMetalsSchema);

		Select select = new Select(schemaDropDownCreatMat);
		select.selectByValue("MasterMetals");
		Thread.sleep(2000);
	}

	public void selectGenericMatSchema() {
		action.moveToElement(schemaMappingDropDown).build().perform();
		action.click(schemaMappingDropDown).build().perform();
		js.executeScript("arguments[0].click();", genericMatSelector);
		// wait.until(ExpectedConditions.elementToBeSelected(genericMatSelector));
	}

	public void clearMatToRevise() {
		action.moveToElement(matToReviseClear).build().perform();
		action.click(matToReviseClear).build().perform();
	}

	public ConfigurationWS uploadExcel(String excelSheet) {
		// action.click(uploadExcel).build().perform();
		uploadExcel.sendKeys(excelSheet);
		return new ConfigurationWS();
	}

	public ConfigurationWS uploadExcelOnExcelMapping(String excelSheet) {
		// action.click(uploadExcel).build().perform();
		uploadExcelOnExcelMapping.sendKeys(excelSheet);
		return new ConfigurationWS();
	}

	public ConfigurationWS uploadExcel1(String excelSheet) {
		// action.click(uploadExcel).build().perform();
		uploadExcel1.sendKeys(excelSheet);
		return new ConfigurationWS();
	}

	public void selectExcelToUplaod() {
		uploadExcel(prop.getProperty("excelPath"));
		if (removeExcelButton.isDisplayed()) {
			System.out.println("Excel file to upload is selected");
		} else {
			System.out.println("Excel file to upload is not yet selected");
		}
	}

	public void selectExcelToUplaodMapped() {
		uploadExcel(prop.getProperty("excelPathMapped"));
		if (removeExcelButton.isDisplayed()) {
			System.out.println("Excel file to upload is selected");
		} else {
			System.out.println("Excel file to upload is not yet selected");
		}
	}

	public void selectAlphaNumericCASExcelToUplaod() {
		uploadExcel(prop.getProperty("excelPathAlphaNumericCAS"));
		if (removeExcelButton.isDisplayed()) {
			System.out.println("Excel file to upload is selected");
		} else {
			System.out.println("Excel file to upload is not yet selected");
		}
	}

	public void selectTestDataToUplaod() {
		uploadExcel(prop.getProperty("testDataPath"));
		if (removeExcelButton.isDisplayed()) {
			System.out.println("File to upload is selected");
		} else {
			System.out.println("File to upload is not yet selected");
		}
	}

	public void clickOnSubmitExcel() {
		js.executeScript("arguments[0].click();", submitExcelButton);
		// action.moveToElement(submitExcelButton).build().perform();
		// action.click(submitExcelButton).build().perform();
	}

	public void selectTestDataToGenerateFromDropdown() {
		Select select = new Select(selectTestDataDropdown);

		select.selectByValue("compressiveModulusLdir_pctRTVsTemp");
	}

	public void clickOnFindSimilar() {
		js.executeScript("arguments[0].scrollIntoView(true);", configFindSimilar);
		// js.executeScript("arguments[0].scrollIntoView(true);", textAllMatUsers);
		action.moveToElement(configFindSimilar).build().perform();
		action.click(configFindSimilar).build().perform();
	}

	public void modifyFindSimilar() {
		action.keyDown(Keys.CONTROL).click(classificationClass).click(classificationFamily).click(classificationForm)
				.click(classificationSubClass).keyUp(Keys.CONTROL).build().perform();
		action.moveToElement(moveRight).build().perform();
		action.click(moveRight).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", findSimilarSubmitButton);
		action.moveToElement(findSimilarSubmitButton).build().perform();
		action.click(findSimilarSubmitButton).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonAlert));
		action.moveToElement(okButtonAlert).build().perform();
		action.click(okButtonAlert).build().perform();

		// driver.switchTo().alert().accept();
	}

	public void selectSpecDef() {
		// action.moveToElement(speciDef).build().perform();
		// action.click(speciDef).build().perform();
		js.executeScript("arguments[0].click();", speciDef);
		wait.until(ExpectedConditions.elementToBeClickable(createSpecDef));
	}

	public void clickOnCreateSpecDef() {
		action.moveToElement(createSpecDef).build().perform();
		action.click(createSpecDef).build().perform();
	}

	public void selectTestDef() {
		action.click(testDef).build().perform();
	}

	public void clickOnCreateTestDef() {
		action.click(createTestDef).build().perform();
	}

	public void selectExcelMappings() {
		// action.moveToElement(excelMappings).build().perform();
		// action.click(excelMappings).build().perform();
		js.executeScript("arguments[0].click();", excelMappings);
		wait.until(ExpectedConditions.visibilityOf(textExcelMappings));
	}

	public void selectExTestDataMapping() {
		js.executeScript("arguments[0].click();", exTestDataMapping);
	}

	public void selectGenericMatSelector() {
		js.executeScript("arguments[0].click();", excelMappingGenMatSelector);
	}

	public void clickOnEditImportedMapping() {
		action.moveToElement(editImportMapping).build().perform();
		action.click(editImportMapping).build().perform();
	}

	public void selectExcelTemplate() {
		uploadExcelOnExcelMapping(prop.getProperty("testDataReductionTemplate"));
	}

	public void submitExcelTemplate() {
		action.moveToElement(submitExcelButton).build().perform();
		action.click(submitExcelButton).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(verifyHeading));
		String text = verifyHeading.getText();
		if (text.contains("Example Test Data Mapping [ Excel Schema Mapping ]")) {
			System.out.println("Test Definition is created successfully");
		} else {
			System.out.println("Test Deifinition is not created successfully");
		}
	}

	public void verifyTheTemplate() {

		// String tempLink = templateLink.getText();
		if (templateLink.isDisplayed()) {
			System.out.println("Test Template is uploaded successfully");
		} else {
			System.out.println("Test Template is  not uploaded successfully");
		}
	}

	public void selectTestTemplates() {
		// action.click(testTemplates).build().perform();
		js.executeScript("arguments[0].click();", testTemplates);
		wait.until(ExpectedConditions.visibilityOf(textTestTemplates));

	}

	public void clickOncreateTestTemplate() {
		action.moveToElement(createTestTemplate).build().perform();
		action.click(createTestTemplate).build().perform();
	}

	public void provideTestTemplateName() {
		testTemplateName.click();
		testTemplateName.clear();
		testTemplateName.sendKeys(RandomStringUtils.randomAlphabetic(13));

	}

	public void selectDesignDataMapping() {
		action.moveToElement(importDesignDataMapping).build().perform();
		action.click(importDesignDataMapping).build().perform();
	}

	public void provideImportDesignDataDetails() {
		action.moveToElement(designDataProjectDropdown).build().perform();
		action.click(designDataProjectDropdown).build().perform();
		js.executeScript("arguments[0].click();", designDataProjectData);
		designDataMappingName.click();
		designDataMappingName.clear();
		designDataMappingName.sendKeys("Example Design Data Mapping");
		action.moveToElement(designDataSchemaDropdown).build().perform();
		action.click(designDataSchemaDropdown).build().perform();
		js.executeScript("arguments[0].click();", schemaMaster);
		uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		action.moveToElement(submitDesignDataButton).build().perform();
		action.click(submitDesignDataButton).build().perform();
	}

	public void selectDesignDataProject() {
		action.moveToElement(designDataProjectDropdown).build().perform();
		action.click(designDataProjectDropdown).build().perform();
		js.executeScript("arguments[0].click();", designDataProjectData);
		/*
		 * designDataMappingName.click(); designDataMappingName.clear();
		 * designDataMappingName.sendKeys("Example Design Data Mapping");
		 * action.moveToElement(designDataSchemaDropdown).build().perform();
		 * action.click(designDataSchemaDropdown).build().perform();
		 * js.executeScript("arguments[0].click();", schemaMaster);
		 * uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		 * action.moveToElement(submitDesignDataButton).build().perform();
		 * action.click(submitDesignDataButton).build().perform();
		 */
	}

	public void enterMappingNameSelectSchema() {
		// action.moveToElement(designDataProjectDropdown).build().perform();
		// action.click(designDataProjectDropdown).build().perform();
		// js.executeScript("arguments[0].click();", designDataProjectData);
		designDataMappingName.click();
		designDataMappingName.clear();
		designDataMappingName.sendKeys(RandomStringUtils.randomAlphabetic(16));
		action.moveToElement(designDataSchemaDropdown).build().perform();
		action.click(designDataSchemaDropdown).build().perform();
		js.executeScript("arguments[0].click();", schemaMaster);
		// uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		// action.moveToElement(submitDesignDataButton).build().perform();
		// action.click(submitDesignDataButton).build().perform();
	}

	public void uploadMappingFileAndSubmit() {

		uploadExcel1(prop.getProperty("exampleDesignDataMapping"));

	}

	public void designDataMappingSubmit() {

		// uploadExcel1(prop.getProperty("exampleDesignDataMapping"));
		action.moveToElement(submitDesignDataButton).build().perform();
		action.click(submitDesignDataButton).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(submitExcelButton));
	}

	public void selectTestDataMapping() {
		action.moveToElement(testDataMappingDropdown).build().perform();
		action.click(testDataMappingDropdown).build().perform();
		js.executeScript("arguments[0].click();", exampleTestDataMapping);
	}

	public void selectTensileRef() {
		action.click(tensileRefDropdown).build().perform();
		action.click(tensileRef).build().perform();
		// js.executeScript("arguments[0].click();", tensileRef);
	}

	public void addTensileUltStrgth() {
		action.moveToElement(designAllowableDropdown).build().perform();
		action.click(designAllowableDropdown).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", tensileUltStrgth);
		js.executeScript("arguments[0].click();", tensileUltStrgth);
		action.moveToElement(addDesignAllowable).build().perform();
		action.click(addDesignAllowable).build().perform();
	}

	public void addTensileYieldStrgth() {
		action.click(designAllowableDropdown).build().perform();
		js.executeScript("arguments[0].scrollIntoView(true);", tensileYieldStrgth);
		js.executeScript("arguments[0].click();", tensileYieldStrgth);
		action.click(addDesignAllowable).build().perform();
	}

	public void selectComplianceConnector() {
		action.click(complianceConnector).build().perform();
	}

	public void clickOnCreateComplianceConnection() {
		action.click(createComplianceConnection).build().perform();
	}

	public void complianceMatDetails() {
		serverUrl.click();
		serverUrl.clear();
		serverUrl.sendKeys("https://msc-dv.ipoint-systems.com/materialcenter-connector-service");
		matUser.click();
		matUser.clear();
		matUser.sendKeys("mcc-backend-demo");
		matPassword.click();
		matPassword.clear();
		matPassword.sendKeys("secret-demo");
	}

	public void complianceDetails() {
		complianceUser.click();
		complianceUser.clear();
		complianceUser.sendKeys("ipoint-backend-user");
		compliancePassword.click();
		compliancePassword.clear();
		compliancePassword.sendKeys("secret-pwd");
	}

	public void complianceApiDetails() {
		singleMatApi.click();
		singleMatApi.clear();
		singleMatApi.sendKeys("api/model/complianceInfo");
		multiMatApi.click();
		multiMatApi.clear();
		multiMatApi.sendKeys("api/model/complianceInfos");
	}

	public void provideComplianceConnection() {
		complianceMatDetails();
		complianceDetails();
		complianceApiDetails();
	}

	public void submitComplianceConnection() {
		action.click(complianceConnectionSubmit).build().perform();
		String text = matUserValue.getText();
		System.out.println("Material User used while creating the Compliance connection is : " + text);
		String text1 = complianceUserValue.getText();
		System.out.println("Compliance User used while creating the Compliance connection is : " + text1);
	}

	public void uploadAlphaNumericCASExcel() {
		selectDataProject();
		selectAlphaNumericCASExcelToUplaod();
		selectMasterMetalSchema();
	}

	public void clickOkInfoDialog() {
		action.click(infoDialogOkButton).build().perform();
	}
}
