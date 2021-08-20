Feature: This feature file consist of all Test data management flows
Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@Step1 @All
Scenario: Create a Specimen Definition using material center administrator
Given user clicks on Config WS
When select the Specimen Definitions option under Materials Administration
And click on Create Specimen Definition
And enter the name on init tab
And select the project on init tab
And select Specimen Definition tab to provide all required details
And click on validate button to ensure that there are no errors
And click on Submit button from specimen definition tab
Then Verify the created Specimen Definition record

@Step2 @All
Scenario: Create a Test Definition and promote to Production level
Given user clicks on Config WS
When select the Specimen Definitions option under Materials Administration
And click on Create Specimen Definition
And enter the name on init tab
And select the project on init tab
And select Specimen Definition tab to provide all required details
And click on validate button to ensure that there are no errors
And click on Submit button from specimen definition tab
And click on promote action under security tab
And select target level as production
And click on next button
And click on submit button on dependent objects list
Then check that process status is completed

@Step3 @All
Scenario: Add a Reduction Template to the Mapping
Given user clicks on Config WS
When select the Excel Mappings option under Materials Administration
And select Generic Material Selector from the list
And click on Edit Imported Mapping
And attach TestDataReductionTemplate in excel file template
Then click on Submit button to import supporting template
Then Verify the uploaded template is displayed on details page

@Step4 @All
Scenario: Create a Test Template
Given user clicks on Config WS
When select the Test Template option under Materials Administration
And click on Create Test Template
And provide the name of the Test Template
And select Import Mapping button next to Design Data Mapping
And select design data project from dropdown
And enter mapping name and select schema from dropdown
And upload mapping file
And click on submit button
And click on submit button to create the Test Template
Then Verify the created test template