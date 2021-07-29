Feature: To search different types of templates


@EasySearch @All
Scenario: Easy search action templates
Given user gives some text to search in materials
When search result is displayed
And user gives some numerical values to search in materials
Then search result is displayed


@AddDensityAttribute @All
Scenario: User adds density & yield strength attribute conditions for material navigating from search tab
Given user comes on search WS
When user click on material from search page
And user click on add condition
And user adds density attribute condition
And user provides range using slider
And search result for given condition
And user click on add condition
Then add yield strength attribute condition

@AddDensityAttributeFord @All
Scenario: User adds density & yield strength attribute conditions for material using global search
Given user comes on search WS
When user click on material from search page
And user click on add condition
And user adds density attribute condition
And user provides range using slider
And search result for given condition
And user click on add condition
Then add yield strength attribute condition

@EasyTextSearchValidation @All
Scenario: Easy search action validation templates
Given user gives some text to search in materials
When search result is displayed
Then verify that correct text search result is displayed

@EasyNumericalSearchValidation @All
Scenario: Easy numerical search action templates
Given user gives some numerical values to search in materials
When search result is displayed
Then verify that correct numerical search result is displayed

@SaveEasySearch @All
Scenario: Save the search templates
Given user gives some text to search in materials
When search result is displayed
And user click on save button
And user saves the search template by entering the name
Then relaunch the saved search template

@New @All
Scenario: User launch the recent saved template from home page
Given click on search template link from home page
And Click on rows per page
And Click on fifty
And select rows per page as hundred
Then select rows per page as two fifty

@SaveEasySearchValidation @All
Scenario: Save the search templates using filter type
Given user comes on search WS
When expand material type filter
And select metals option
And user click on save button
And user saves the search template by entering the name
And click on my searches
Then relaunch the recently saved search template

@SearchTestDataFord @All
Scenario: User search for test data
Given user comes on search WS
When user selects test data type from search dropdown
And user gives search input in search field
Then search result is displayed

@OpenTestSearchMOD @All
Scenario: Navigate to all test using search WS
Given user gives some text to search in materials
When search result is displayed
And Click on rows per page
And Click on fifty
And select rows per page as hundred
Then select rows per page as two fifty

@OpenMeasurePropSearchMOD @All
Scenario: Navigate to all test by searching numerical value using search WS and verify results
Given user gives some numerical values to search in materials
When search result is displayed
And Click on rows per page
And Click on three
Then Click on fifty

@New @All
Scenario: User search the material and export to excel
Given user gives text to search in materials for plot
When search result is displayed
#And click on arrow button
#And click on select page option
#Then click on export to excel
Then click on export to excel from action menu

@New @All
Scenario: User launches the saved template from my searches
Given user is on search workspace
When click on my searches
Then relaunch the recently saved search template



@New @All
Scenario: User search for test data and save the searched template
Given user selects test data type from search dropdown
When user gives search input in search field
And click on arrow button
And click on select page option
And user click on save button
And user saves the search template by entering the name
Then relaunch the saved search template


