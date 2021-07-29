Feature: This feature file consist of all iPoint related use cases

@ConfigIpointConnector @All
Scenario: To config the Ipoint connector using UI in Configuration WS
Given user clicks on Config WS
When select the Compliance connector option under Materials Administration
And click on Create Compliance Connection
And provide all the required details for compliance connection
Then click on Submit to create it successfully


@ImportCompositionDataUsingExcel @All
Scenario: Import the material having composition data using excel
Given user clicks on Config WS
When user clicks on Import excel file link
And select fixed excel format
And enter all details and select excel file from system
And click on submit button to upload the excel
Then check that process status is completed


@ImportCompositionDataErrorMsg @All
Scenario: Check the all error msgs while importing the excel having invalid CAS number combinations
Given user clicks on Config WS
When user clicks on Import excel file link
And select fixed excel format
And enter the details and select required excel to upload
And click on submit button to upload the excel
And check that process is Failed
Then check the error msg related to CAS number


@SAForCompliance @All
Scenario: Check SA to mat SOD and MOD for compliance check and compliance status
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And click on first mat
And click on Compliance option to verify Check Compliance and Compliance Status actions for MOD
And right click on MOD to verify both actions again
And open the material to open SOD
Then click on Compliance option to verify Check Compliance and Compliance Status actions for SOD


@SingleMatCompliantStatus @All
Scenario: Perform compliance check for compliant status for single mat and verify that mat is updated with compliance result
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And open the material to open SOD
And verify that composition data is present and select Check Compliance under Compliance option
And user comes on Navigate WS
And user clicks on required compliant mat tree to open MOD
Then open the same material and verify that correct Compliance status is updated in mat SOD


@SingleMatNotCompliantStatus @All
Scenario: Perform compliance check for not compliant status for single mat and verify that mat is updated with compliance result
Given user comes on Navigate WS
When user clicks on required not compliant mat tree to open MOD
And open the material to open SOD
And verify that composition data is present and select Check Compliance under Compliance option
And user comes on Navigate WS
And user clicks on required not compliant mat tree to open MOD
Then open the same material and verify that correct Compliance status is updated in mat SOD


@PendingCompliantStatus @All
Scenario: Perform compliance check for pending status and that mat is updated with compliance result
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And select rows per page as fifty
And select required number of mat for compliance check by taking twenty six mats to check the lower boundary condition
And Select Check Compliance under Compliance option
And check that process status is completed
And user comes on Navigate WS
And user clicks on required compliant mat tree to open MOD
Then open the same material and verify that correct Compliance status is updated in mat SOD


@MultipleMatCompliantStatus @All
Scenario: Perform compliance check for compliant status for multiple mat and verify that mat is updated with compliance result
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And click on arrow button
And click on select page option
And Select Check Compliance under Compliance option
And check that process status is completed
And user comes on Navigate WS
And user clicks on required compliant mat tree to open MOD
Then open the same material and verify that correct Compliance status is updated in mat SOD


@PendingCompliantStatus2 @All
Scenario: Perform compliance check for pending status to check the upper boundary condition
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And select rows per page as fifty
And click on arrow button
And click on select page option
And Select Check Compliance under Compliance option
And check that process status is completed
And user comes on Navigate WS
And user clicks on required compliant mat tree to open MOD
Then open the same material and verify that correct Compliance status is updated in mat SOD


@ComplianceStatusPlotting @All
Scenario: User checks the compliance status plotting of compliant results and open the respective mat MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select Compliance status under Compliance option
And check the Compliance status using the pie chart displayed
Then click on pie chart to open the mat MOD accordingly


@BatchSizeError @All
Scenario: To check the error msg when user selects more materials than the batch size limit
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And now select rows per page as hundred
And click on arrow button
And click on select page option
And Select Check Compliance under Compliance option
And check that process status is Failed
Then check the error msg related to batch size exceeded


@EditComplianceStatusValue @All
Scenario: Verify that user should not be able to edit the compliance status value from UI
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And open the material having compliance status value
And click on Edit material option
And go to Properties tab
Then verify that Compliance property set values are not editable


@CASNumberMissingWarning @All
Scenario: Verify the warning msg when CAS number is missing for composition data
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And open the material to open SOD
And click on Edit material option
And go to Properties tab
And select Composition property set and remove Sources value of any composition
And click on Submit
Then verify that warning msg is displayed related to CAS number missing for composition data


@AlreadyCompliantWarningSOD @All
Scenario: Verify warning msg on SOD for single mat when already compliant material is selected for compliance check
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And open the material having compliance status value
And verify that compliance data is present and select Check Compliance under Compliance option
Then verify that warning msg is displayed that compliance result is already present for the selected material


@AlreadyPendingCompliantWarningSOD @All
Scenario: Verify warning msg on SOD for single mat when already pending compliant material is selected for compliance check
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And open the material having compliance status value
And verify that compliance data is present and select Check Compliance under Compliance option
Then verify that warning msg is displayed that compliance result as pending is already present for the selected material


@AlreadyCompliantSingleMatWarningMOD @All
Scenario: Verify warning msg on MOD for single mat when already compliant material is selected for compliance check
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And click on material for compliance check
And Select Check Compliance under Compliance option
Then verify that warning msg is displayed that compliance result is already present for the selected material on MOD


@AlreadyPendingSingleMatWarningMOD @All
Scenario: Verify warning msg on MOD for single mat when already compliant material is selected for compliance check
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And click on material for compliance check
And Select Check Compliance under Compliance option
Then verify that warning msg is displayed that compliance result as pending is already present for the selected material on MOD


@AlreadyCompliantMultiMatWarningMOD @All
Scenario: Verify warning msg for multiple mat when already compliant materials are selected for compliance check
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And select multiple materials for compliance check
And Select Check Compliance under Compliance option
Then verify that warning msg is displayed that compliance result is already present for multiple materials


@EditCompositionDataUI @All
Scenario: Edit the composition data of mat already having compliance result and check the warning msg and perform compliance check again
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And open the material having compliance status value
And click on Edit material option
And go to Properties tab
And select the Composition property set and change the composition data value
And click on Submit
And verify that warning msg is displayed related to composition data changes
Then verify that composition data is present and select Check Compliance under Compliance option


@ApplyComplianceResultColFilter @All
Scenario: Apply the overall compliance result col filter to material MOD
Given user comes on Navigate WS
When user clicks on required compliant mat tree to open MOD
And click on arrow button
And open configure columns and click on more button
And select Overall Compliance Status filter and click on ok button
Then verify that Overall Compliance Status col is added successfully


@ErrorMsgForMatWithoutCompositionDataSOD @All
Scenario: Check the error msg when user tries for compliance check of mat who doesn't have composition data on SOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And double click on material
And Check that composition data is not present for the material
And perform check compliance under Compliance option
Then verify that error msg is displayed related to material composition on SOD


@ErrorMsgForMatWithoutCompositionDataMOD @All
Scenario: Check the error msg when user tries for compliance check of mat who doesn't have composition data on MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on first mat
And Select Check Compliance under Compliance option
Then verify that error msg is displayed related to material composition on MOD