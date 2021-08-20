Feature: To plot the bar chart graph of multiple materials
Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@All
Scenario: Plot the bar chart graph of selected material with multiple Y values
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And Click on fifty
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Bar chart
And select multiple Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the bar chart graph of selected material with two Y values
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And Click on fifty
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Bar chart
And select two Y values
And click on plot button
Then verify the plotted bar chart values by navigating to material SOD from plot

@All
Scenario: Plot the scatter graph of density vs ultimate strength
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And Click on fifty
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the scatter graph of density vs ultimate strength and verify plotted scatter plot
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And Click on fifty
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then verify the plotted scatter plot values by navigating to material SOD from plot

@All
Scenario: Plot the pie chart graph of Ultimate strength
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And Click on fifty
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the pie chart graph of density
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And Click on fifty
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Density as Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the pie chart graph of density with selecting rows as fifty
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And click on rows per page
And Click on fifty
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Density as Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the pie chart graph of density with selecting rows as hundred
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Density as Y values
And click on plot button
Then plot should be done successfully


@All
Scenario: Plot the pie chart graph of density verifying the chart values from plot
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Density as Y values
And click on plot button
Then verify the plotted pie chart values by navigating to material SOD from plot

@All
Scenario: Plot the pie chart graph of ultimate strength verifying the chart values from plot
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Ultimate Strength as Y values
And click on plot button
Then verify the plotted pie chart values by navigating to material SOD from plot


@All
Scenario: Plot the spider graph with four params selected
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the spider graph with four params selected and verify the chart values from plot
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then verify the plotted spider plot values by navigating to material SOD from plot

@All
Scenario: Plot the bar chart by searching the material
Given user gives text to search in materials for plot
And click on plot action
And select plot type as Bar chart
And select multiple Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the scatter chart by searching the material
Given user gives text to search in materials for plot
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the pie chart by searching the material
Given user gives text to search in materials for plot
And click on plot action
And select plot type as Pie chart
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the spider graph with four params selected
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then plot should be done successfully

@All
Scenario: Plot the pie chart by searching the material
Given user gives text to search in materials for plot
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then plot should be done successfully


@AllFixLater
Scenario: Plot the bar chart graph of test data
Given user selects test data type from search dropdown
When user gives search input in search field
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Bar chart
And select multiple Y values
And click on plot button
Then plot should be done successfully

@AllFixLater
Scenario: Plot the pie chart graph of test data
Given user selects test data type from search dropdown
When user gives search input in search field
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Density as Y values
And click on plot button
Then plot should be done successfully

@AllFixLater
Scenario: Plot the scatter graph of density vs ultimate strength of test data
Given user selects test data type from search dropdown
When user gives search input in search field
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@AllFixLater
Scenario: Plot the spider graph with four params selected of test data
Given user selects test data type from search dropdown
When user gives search input in search field
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then plot should be done successfully



@AllFordSpecific
Scenario: Plot the spider graph with four params selected
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And click on plot button
Then plot should be done successfully

@AllFordSpecific
Scenario: Plot the spider graph with four params selected
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Spider plot
And select four params as Y values
And select test temperature from filters
And click on plot button
Then plot should be done successfully

@AllFordSpecific
Scenario: Plot the bar chart graph of selected material
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Bar chart
And select multiple Y values
And select test temperature from filters
And click on plot button
Then plot should be done successfully


@AllFordSpecific
Scenario: Plot the bar chart graph of selected material
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Bar chart
And select multiple Y values
And click on plot button
Then plot should be done successfully





@AllFordSpecific
Scenario: Plot the scatter graph of density vs ultimate strength
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And click on plot button
Then plot should be done successfully

@AllFordSpecific
Scenario: Plot the scatter graph of density vs ultimate strength
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Scatter plot
And select Density as X values
And select Ultimate Strength as Y values
And select test temperature from filters
And click on plot button
Then plot should be done successfully


@AllFordSpecific
Scenario: Plot the pie chart graph of density
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And click on arrow button
And click on select page option
And click on plot action
And select plot type as Pie chart
And select Ultimate Strength as Y values
And select test temperature from filters
And click on plot button
Then plot should be done successfully




