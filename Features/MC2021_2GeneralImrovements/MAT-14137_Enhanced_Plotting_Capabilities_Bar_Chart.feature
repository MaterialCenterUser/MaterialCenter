Feature: Enhanced Plotting Capabilities Bar Chart

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@Regression
Scenario: Verify bar chart option is disabled until selection
Given user comes on Navigate WS
When user clicks on Metals to open MOD
Then bar chart option is disabled


@Regression
Scenario: Verify bar chart option is displayed for materials
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on arrow button
And click on select page option
Then bar chart option is enabled 

@Regression
Scenario: Verify bar chart page is launched
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And click on bar chart
Then bar chart page is displayed

@Regression
Scenario: Verify bar chart page is loaded
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And click on bar chart
Then bar chart page with plot button is displayed


@Regression
Scenario: Verify bar chart is plotted and displayed
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And click on bar chart
Then bar chart page with plot button is displayed


