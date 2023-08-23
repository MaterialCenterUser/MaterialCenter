Feature: Performance test

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

  @CAEModel @All1
  Scenario: Generate CAE model of material
    When user comes on Navigate WS
    And user expands ceramics and glasses
		And select industrial glass
		And double click on first material
    And click on create SA
    And click on CAE model AUTO action
    And click on Submit button
    And navigate to homepage
    And select CAE model process
    Then CAE model should generate successfully

  @CAEModel @All
  Scenario: User discards the CAE model process
    #When user clicks on view all processes
   # And click on rows per page
		#And click on three
    When user select CAE model process
    And user clicks on discard option
    And user clicks on submit button on CAE model page
    Then discard of CAE model should be completed successfully

 @plot @All
Scenario: Plot the bar chart graph of selected material with multiple Y values
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And select rows per page as five hundred
And click on arrow button
And click on select page option
And click on bar chart
#And click on plot action
#And select plot type as Bar chart
#And select multiple Y values
#And click on plot button
#Then plot should be done successfully
Then bar chart page is displayed


@plot @All
Scenario: Plot the scatter graph of density vs ultimate strength
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And select rows per page as five hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@plot @All
Scenario: Plot the pie chart graph of Ultimate strength
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And select rows per page as five hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully


@plot @All
Scenario: Plot the spider graph with four params selected
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as five hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then plot should be done successfully

@Promote @All
Scenario: User is able to promote the material to production level
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select material with In work release level
And click on promote action under security tab
And select target level as production
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
Then check that process status is completed

@Demote @All
Scenario: User is able to demote the material to In-Review or In Work level
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select material with In work release level
And click on demote action under security tab
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
Then check that process status is completed

@All1
Scenario: Switching from one MOD to another MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And switch to Polymers MOD
And user expands metals
Then select nonferrous metals

@All @run
Scenario: Changing the rows per page displayed
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And Click on fifty
And select rows per page as hundred
And select rows per page as two fifty
Then select rows per page as five hundred


@DensityColFilter @All
Scenario: Navigate to metals and user adds density column in MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as five hundred
And click on arrow button
And open configure columns and click on more button
And select density filter and click on ok button
And click on density column and select filter
And move density slider for particular limit and click ok button
Then density filter is applied successfully

@EasySearch @All
Scenario: Easy search action templates
When user enters searchtext for materials search "polymer"
And click on search button from homepage
And materials search results displayed
And user gives some numerical values to search in materials
Then materials search results displayed

@SaveEasySearch @All
Scenario: Save the search templates
When user enters searchtext for materials search "polymer"
And click on search button from homepage
And materials search results displayed
And user click on save button
And user saves the search template by entering the name
Then relaunch the saved search template


@All
Scenario: Navigate to all test using search WS
Given user is on search workspace
When user clicks on Test option
And Click on fifty
And select rows per page as hundred
And select rows per page as two fifty
Then select rows per page as five hundred

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

@MultipleMatCompare @All
Scenario: User selects 15 materials and compare them
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select fifteen materials
And right click to select compare option
Then compare results displayed

@ApplyFilter @All
Scenario: Apply property set filter on material SOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And double click on material
And click on property set and uncheck select all checkbox
And no property set selected msg is displayed
And click on property set and check select all checkbox
Then all property set of material is displayed


@ConfigNav @All
Scenario: After login user navigates to config tab
Given user is on dashboard page
Then user clicks on configuration tab

@EditMat @All
Scenario: User edit the footnotes add it to tensile modulus and update the material
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And double click on material
And click on Edit material option
And navigate to footnotes tab and add footnotes
And go to properties tab
And select mechanical property set
And click on select button against tensile elastic modulus
And add newly added footnotes to eleastic modulus property
And click on ok button to submit footnotes
And click on submit button on edit materials page
Then verify that newly added footnotes is updated with property successfully

@ImportExcel @All
Scenario: User uploads material using import excel file link
When user clicks on Config WS
And user clicks on Import excel file link
And select fixed excel format
And select data project
And select excel file to upload
And select master metal schema
And click on submit button to upload the excel
Then check that process status is completed

@ExportMatIntoXML @All1
Scenario: User export the material into XML
When user comes on Navigate WS
And user clicks on Metals to open MOD
And select rows per page as five hundred
And click on arrow button
And click on select page option for rows100 or more
And click on export menu and select XML option
And select include project and all mat datas checkbox
And click on submit button on export to XML popup
Then check that process status is completed for xml

@Airbus  @norun
Scenario: Navigate to all test using search WS
When user is on search workspace
And user clicks on Test option
And click on first row from search results
And click on the related material link from SOD page to view test data tab
And click on test data tab from SOD page
And select rows per page as hundred
And select rows per page as two fifty
Then select rows per page as five hundred

@Airbus @All
Scenario: Navigate to SOD page and click on tests data tab
Given user is on search workspace
When user click on material from search page
And click on arrow button
And open configure columns and click on more button
And select created at filter and click on ok button
And click on created at column and select sort descending
And double click on first material
And click on test data tab from SOD page
And select rows per page as hundred
And select rows per page as two fifty
Then select rows per page as five hundred

@Airbus @All
Scenario: Configure 3 columns and change the rows per page
Given user is on search workspace
When user click on material from search page
And click on arrow button
And open configure columns and click on more button
And select created at filter and click on ok button
And click on created at column and select sort descending
And double click on first material
And click on test data tab from SOD page
And select rows per page as hundred
And select rows per page as two fifty
Then select rows per page as five hundred

  