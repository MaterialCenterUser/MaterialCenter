Feature: Not able to save Enterprise view as default view

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@Regression
Scenario: Verify if set default view action is available on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
Then set default view option is displayed

@Regression
Scenario: Verify the default view is available in enterprise views on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
Then default view with radio button is displayed

@Regression
Scenario: Verify the detailed view is available in enterprise views on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
Then detailed view with radio button is displayed

@Regression
Scenario: Verify the share view is available in enterprise views on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
Then share view with radio button is displayed

@Regression
Scenario: Verify the default view is getting selected and results are displayed on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
And select default view from available views and click ok button
Then default view results are displayed on MOD page

@Regression
Scenario: Verify the detailed view is getting selected and results displayed on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
And select detailed view from available views and click ok button
Then detailed view results are displayed on MOD page

@Regression
Scenario: Verify the share view is getting selected and results displayed on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
And select share view from available views and click ok button
Then share view results are displayed on MOD page


@Regression
Scenario: Verify save private view option is displayed on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
Then save private view option is displayed

@Regression
Scenario: Verify user is able to save private view
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on save private view option
And enter view name to save private view "TestView1" and click ok button
Then private view results are displayed on MOD page


@Regression
Scenario: Verify the saved private view is available in enterprise views on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
Then saved private view with radio button is displayed

@Regression
Scenario: Verify the saved private view is getting selected and results displayed on MOD
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
And select private view from available views and click ok button
Then private view results are displayed on MOD page

@Regression
Scenario: Verify the default view results are getting displayed after logging back to browser
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
And select default view from available views and click ok button
And click on logff link
And click ok button from logoff dialog
And log in to Material Center application
|username|password|
|smroot|sdm|
And user comes on Navigate WS
And user clicks on Metals to open MOD
Then default view results are displayed on MOD page


@Regression
Scenario: Verify the detailed view results are getting displayed after logging back to browser
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
And select detailed view from available views and click ok button
And click on logff link
And click ok button from logoff dialog
And log in to Material Center application
|username|password|
|smroot|sdm|
And user comes on Navigate WS
And user clicks on Metals to open MOD
Then detailed view results are displayed on MOD page

@Regression
Scenario: Verify the share view results are getting displayed after logging back to browser
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
And select share view from available views and click ok button
And click on logff link
And click ok button from logoff dialog
And log in to Material Center application
|username|password|
|smroot|sdm|
And user comes on Navigate WS
And user clicks on Metals to open MOD
Then share view results are displayed on MOD page


@Regression
Scenario: Verify the saved private view results are getting displayed after logging back to browser
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on set default view option
And select private view from available views and click ok button
And click on logff link
And click ok button from logoff dialog
And log in to Material Center application
|username|password|
|smroot|sdm|
And user comes on Navigate WS
And user clicks on Metals to open MOD
Then private view results are displayed on MOD page