Feature: Measure From Equation

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@Regression
Scenario: Verify create measure equations link displayed
And user clicks on Config WS
Then verify measure equations link is displayed

@Regression
Scenario: Verify create measure equations mappings link is displayed
And user clicks on Config WS
Then verify measure equations mappings link is displayed

@Regression
Scenario: Verify import measure equation page is displayed after clicking on Import measure equations
And user clicks on Config WS
And click on measure equations link
And click on import measure equation option
Then verify import measure equation page is displayed

@Regression
Scenario: Verify import measure equation mappings page is displayed after clicking on Import measure equations
And user clicks on Config WS
And click on measure equation mappings link
And click on import mappings option
Then verify import mappings page is displayed

@Regression
Scenario: Import measure equations
And user clicks on Config WS
And click on measure equations link
And click on import measure equation option
And select measure equation file to upload
And click on submit button to import measure equation
And click on autorefresh checkbox
Then verify the import measure equation is completed successfully

@Regression
Scenario: Verify the measure equations is showing error on uploading wrong syntax and semantics file
And user clicks on Config WS
And click on measure equations link
And click on import measure equation option
And select wrong measure equation file to upload
And click on submit button to import measure equation
Then create measure equation error message displayed "error.createEditMeasureEquationMappingSeeErrorsTab"


@Regression
Scenario: Verify the measure equations is showing error message on entering invalid name
And user clicks on Config WS
And click on measure equations link
And click on import measure equation option
And select measure equation file to upload
And enter invalid measure eqaution name in name textbox "CalculateShearModulus 1"
And click on submit button to import measure equation
Then measure equation name invalid error message displayed "The given value (CalculateShearModulus 1) is not valid."

@Regression
Scenario: Verify measure equations is imported and displayed under measure equations
And user clicks on Config WS
And click on measure equations link
And click on import measure equation option
And select measure equation file to upload
And click on submit button to import measure equation
And click on autorefresh checkbox
And verify the import measure equation is completed successfully
And click on configuration tab to navigate to configuration
Then verify the imported measure eqaution is displayed in measure equations


@Regression
Scenario: Import measure equations mappings
And user clicks on Config WS
And click on measure equation mappings link
And click on import mappings option
And select mapping file to upload
And select measure equation from dropdown
And select master metals schema from dropdown
And select measure property from dropdown
And click on submit button to import measure equation mappings
And click on autorefresh checkbox
Then verify the import measure equation is completed successfully

@Regression
Scenario: Verify the measure equation mappings is showing error for wrong sysntax and semantics
And user clicks on Config WS
And click on measure equation mappings link
And click on import mappings option
And select wrong measure equation mapping file to upload
And select measure equation from dropdown
And select master metals schema from dropdown
And select measure property from dropdown
And click on submit button to import measure equation mappings
Then create measure equation error message displayed "error.createEditMeasureEquationMappingSeeErrorsTab"

@Regression
Scenario: Verify the measure equation mappings is showing error message on entering invalid name
And user clicks on Config WS
And click on measure equations link
And click on import measure equation option
And select mapping file to upload
And enter invalid measure eqaution name in name textbox "CalculateShearModulus 1"
And select measure equation from dropdown
And select master metals schema from dropdown
And select measure property from dropdown
And click on submit button to import measure equation mappings
Then measure equation name invalid error message displayed "The given value (CalculateShearModulus 1) is not valid."


@Regression
Scenario: Verify measure equations mappings is imported and displayed under measure equation mappings 
And user clicks on Config WS
And click on measure equation mappings link
And click on import mappings option
And select mapping file to upload
And select measure equation from dropdown
And select master metals schema from dropdown
And select measure property from dropdown
And click on submit button to import measure equation mappings
And click on autorefresh checkbox
Then verify the import measure equation is completed successfully
And click on configuration tab to navigate to configuration
Then verify the imported measure eqaution mappings is displayed in measure equation mappings


@Regression
Scenario: Verify measure from equations option is displayed on MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on create from matMOD
Then verify measure from equations options is displayed on MOD

@Regression
Scenario: Verify measure from equations option is displayed on SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on create SA
Then verify measure from equations options is displayed on SOD

@Regression
Scenario: Verify user is able to launch measure from equations from MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on create from matMOD
And click on measure from equations from MOD page
Then verify measure from equations window is displayed on MOD


@Regression
Scenario: Verify user is able to launch measure from equations from SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on create SA
And click on measure from equations from SOD page
Then verify measure from equations window is displayed on SOD


@Regression
Scenario: Create measure from equations
# Pre- requisites - create 2 to 3 sample materials for measure from equations
When user enters searchtext for materials search "SampleMaterial"
And click on search button from homepage
And materials search results displayed
And double click on first result
And click on create SA
And click on measure from equations from SOD page
And click on select button displayed against measure eqaution mappings
And double click on first result
And click on submit button to create measure equations
And click on autorefresh checkbox
Then verify measure from equations are created


# verifications

@Regression
Scenario: Verify the output property is displayed on SOD page 
When user enters searchtext for materials search "SampleMaterial"
And click on search button from homepage
And materials search results displayed
And double click on first result
Then verify output measure property is displayed on SOD page


@Regression
Scenario: Verify the output property correct value is displayed on SOD page 
When user enters searchtext for materials search "SampleMaterial"
And click on search button from homepage
And materials search results displayed
And double click on first result
Then verify output measure property correct values is displayed on SOD page

@Regression
Scenario: create measure from eqautions for few materials and verify revisions are created
When user comes on Navigate WS
And user expands metals
And click on three
And click on select page option
And click on create from matMOD
And click on measure from equations from MOD page
And click on select button displayed against measure eqaution mappings
And double click on first result
And click on submit button to create measure equations
And click on autorefresh checkbox
And verify measure from equations are created
And click on home icon to navigate to homepage
And user comes on Navigate WS
And click on metals
And double click on first material
And click on revisions tab
Then verify release level is displayed as "0-In-Work"


@Regression
Scenario: Verify the correct output property and value is displayed on navigating from revisions
When user comes on Navigate WS
And click on metals
And double click on first material
And click on revisions tab
And click on latest revision
Then verify output measure property is displayed on SOD page
Then verify output measure property correct values is displayed on SOD page


@Regression
Scenario: Verify the output property is displayed on comparing  materials where measure mappings created
Given user is on search workspace
When user click on material from search page
And click on arrow button
And open configure columns and click on more button
And select created at filter and click on ok button
And click on created at column and select sort descending
And click on three
And click on select page option
And select compare option from Actions menu
Then verify output measure property is displayed on SOD page
Then verify output measure property correct values is displayed on SOD page



@Regression
Scenario: Verify the option edit imported measure equation 
And user clicks on Config WS
And click on measure equations link
#And select imported measure equation
And click on edit imported measure equation option
And click on remove button
And select measure equation file to upload
And click on submit button to import measure equation
And click on autorefresh checkbox
Then verify the import measure equation is completed successfully


@Regression
Scenario: Verify the option edit imported measure equation mappings 
And user clicks on Config WS
And click on measure equation mappings link
#And select imported mappings
And click on edit imported mapping option
And click on remove button
And select mapping file to upload
And select measure equation from dropdown
And select master metals schema from dropdown
And select measure property from dropdown
And click on submit button to import measure equation mappings
And click on autorefresh checkbox
Then verify the import measure equation is completed successfully

@Regression
Scenario: Verify the option edit imported measure equation mappings 
And user clicks on Config WS
And click on measure equation mappings link
#And select imported mappings
And click on edit imported mapping option
And click on remove button
And select mapping file to upload
And select measure equation from dropdown
And select master metals schema from dropdown
And select measure property from dropdown
And click on submit button to import measure equation mappings
And click on autorefresh checkbox
Then verify the import measure equation is completed successfully



