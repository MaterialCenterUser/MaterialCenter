Feature: Last promoted date

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@Regression
Scenario: Create new material for RL0 level
And user clicks on Config WS
And click on create material link
And select data project to create material
And select master metal schema to create material
And click on classification tab
And enter value for common name on classification tab "TestAutomationforEditMatRL"
And click on submit button to create material
Then created material is displayed

@Regression
Scenario: Materials are promoted then SOD should display the Promoted time
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-review checkbox and click on ok button
And double click on first material
And click on promote action under security tab
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list