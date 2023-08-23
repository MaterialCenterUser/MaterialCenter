Feature: Latest Valid Revision URL of a MaterialRecord

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@Regression
Scenario: Verify copy URL option is displayed on SOD page
When user clicks on Config WS
And click on create material link
And select data project
And select master metal schema
And click on classification tab
And enter value for common name on classification tab "TestMatLatestrecord"
#And enter value for class on classification tab
#And enter value for sub lass on classification tab
And click on submit button to create material
And click on tools from SOD page

@Regression
Scenario: Verify the Correct page shown when navigating to URL copied for current Release level and Revision
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then blank checkbox is displayed

@Regression
Scenario: Copy and Navigate to Latest URL at any release level
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then select all checkbox is displayed

@Regression
Scenario: Generate and Navigate to URL for Latest revision and particular selected Release level
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then cancel button is displayed

@Regression
Scenario: Access the URL using different user
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then ok button is displayed

