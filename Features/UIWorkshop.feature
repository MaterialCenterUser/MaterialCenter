Feature: This feature file consist of all UI Workshop flows
Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@Step1 @All
Scenario: Log in and Personalize your homepage
When user is on dashboard page
And user verfies the homepage gadgets
And create new dashboard using add new dashboard action
And click on edit dashboard
And configure the newly added dashboard
And verify that configuration of new dashboard is done successfully
Then change the current units system to US-customary

@Step2 @All
Scenario: Use of Navigate workspace
When user comes on Navigate WS
And user expands metals
And open the wrought metals list under non ferrous aluminum section
And verify the count of the materials in this list is correct
And click on heat treatment tab on MOD and select sort ascending
And click on arrow button
And click on configure column option
And open configure columns to select Create At and Created By into visible columns
Then save the private view under arrow button and check show as default view

@Step3 @All
Scenario: Select materials from MOD and export
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on select page option
And click on arrow button
And select the export option and click on selected rows radio button
Then click on ok button to export the materials into excel

@Step4 @All
Scenario: Open a material detailed view
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And verify that all classification and property sets are listed on SOD under details tab
And mouse over on tensile ultimate strength value to check the property value and source attributes
And click on magnifying glass icon to open the all details in seperate window popup
Then verify that in prpoerty details window popup classification are on top followed by other properties and close it

@Step5 @All
Scenario: Collapse parameters and filter parameters
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on plus symbol next to test temp under mechanical prop to check parameter ranges and corresponding values
And select expand parameters from Display dropdown on top of SOD
And click on parameters filter on top and select test temp to apply filter
Then check that only single test temp displayed in mechanical property and add this material to clipboard

@Step6 @All
Scenario: Add source attributes
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And select Display source from Display dropdown on top of SOD
And add source databank and source document publisher in display source col
And verify that source databank and source document publisher is displayed on SOD for respective properties
Then clear source and parameter filter from Display dropdown

@Step7 @All
Scenario: Change the footnote display in options panel
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And scroll down till mechanical tag is displayed
And mouse over footnote value against poisson ratio and check the footnote
And navigate back to home page
And in main menu select Options to check the footnotes inline checkbox
And user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
Then verify that footnotes are now displayed inline next to property values

@Step8 @All
Scenario: Explore the datasheet tabs and pedigree viewer
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And select the Revisions tab to check the useful info regarding revisions of material
And go to process viewer tab to open the interactive diagram of object and processes
And go to comments tab and add new comment using add button
Then click on pedigree viewer icon on toolbar to open pedigree workspace tab

@Step9 @All
Scenario: Use easy search and then filter the results
Scenario: Easy search action validation templates
And user enters searchtext for materials search "steel"
And click on search button from homepage
And materials search results displayed
Then verify that correct text search result is displayed

@Step10 @All
Scenario: Configure the Find Similar search
When user clicks on Config WS
And click on configure find similar link
And add class family form subclass under classification tab
#Then user is on dashboard page
Then check that process status is completed

@Step11 @All
Scenario: Perform a Find Similar search
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on find similar icon on toolbar
Then find similar search result is displayed

@Step12 @All
Scenario: Compare two material
When user comes on Navigate WS
And user clicks on Metals to open MOD
#And select two materials
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And select compare option from Actions menu
Then compare results displayed

@Step13 @All
Scenario: Search for curve properties in search workspace
When user comes on search homepage
And select the curve property option
And expand property def filter
And select Compressive Stress in L-dir Vs Strain and click the check symbol to apply
#And select first and third curve property result to compare
And click on rows per page
And click on three
And click on arrow button
And click on select page option from curve property
And select compare option from Actions menu
#And click on compare from actions
And select Property option from Available Comparators dropdown
And click on property curve to open in large viewer window
And click on calculator to select Interpolate option
And provide the value of X and select the compute Y button
Then apply it by clicking on ok button and close the curve viewer

@Step14 @All
Scenario: Bar chart plotting
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on plot action
And select plot type as Bar chart
And select two Y values
And click on plot button
Then verify the plotted bar chart values by navigating to material SOD from plot

@Step15 @All
Scenario: Scatter plotting
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then verify the plotted scatter plot values by navigating to material SOD from plot

@Step16 @All
Scenario: Pie chart plotting
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on plot action
And select plot type as Pie chart
And select Density as Y values
And click on plot button
Then verify the plotted pie chart values by navigating to material SOD from plot

@Step17 @All
Scenario: Spider plotting
When user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then verify the plotted spider plot values by navigating to material SOD from plot