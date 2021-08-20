Feature: Enahacements in MaterialCenter MOD and SOD

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@MAT-21702 @Regression
Scenario: Removing the check boxes from material SOD properties
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
Then the properties text is displayed for classfication and checkbox is not present for properties "Classification"
And the properties text is displayed for Assembly and checkbox is not present for properties "Assembly"
And the properties text is displayed for Composition and checkbox is not present for properties "Composition"

@MAT-21703 @Regression
Scenario: Verify add to compare option is available in Action menu for MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on Actions
Then user gets add to compare action

@MAT-21704 @Regression
Scenario: Verify add to compare option is available by right click on MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And right click on material
And move to actions
Then user gets add to compare option


@MAT-21703 @Regression
Scenario: Verify compareresults page is displayed when user selects add to compare action for MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on Actions
And click on Add to Compare action
Then User gets compareresults page with property set displayed

@MAT-21704 @Regression
Scenario: Verify compareresults page is displayed when user right clicks and select add to compare on MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And right click on material
And move to actions and select add to compare option
Then User gets compareresults page with property set displayed

@MAT-21705 @Regression
Scenario: Verify compareresults page is displayed when user selects add to compare action for Test Data
When user selects Test from dropdown
And click on search button from homepage
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And click on Actions
And click on Add to Compare action
Then User gets compareresults page with property set displayed

@MAT-21705 @Regression
Scenario: Verify compareresults page is displayed when user selects add to compare action for CAE Model
When user selects CAE Model from dropdown
And click on search button from homepage
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And click on Actions
And click on Add to Compare action
Then User gets compareresults page with property set displayed

@MAT-21705 @Regression
Scenario: Verify compareresults page is displayed when user right clicks and select add to compare action for Test Data
When user selects Test from dropdown
And click on search button from homepage
And test search results displayed
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And right click on first element
And move to actions and select add to compare option
Then User gets compareresults page with property set displayed

@MAT-21705 @Regression
Scenario: Verify compareresults page is displayed when user right clicks and select add to compare action for CAE Model
When user selects CAE Model from dropdown
And click on search button from homepage
And CAE search results displayed
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And right click on first element
And move to actions and select add to compare option
Then User gets compareresults page with property set displayed

@MAT-21707 @Regression
Scenario: Verify add to compare option is available on SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on actions from SOD page
And select add to compare action
Then User gets compareresults page with property set displayed

@MAT-21706 @Regression
Scenario: Verify add to compare option is available for test data on SOD
When user selects Test from dropdown
And click on search button from homepage
And test search results displayed
And double click on first result
And click on actions from SOD page
And select add to compare action
Then User gets compareresults page with property set displayed

@MAT-21706 @Regression
Scenario: Verify add to compare option is available for CAE Model on SOD
When user selects CAE Model from dropdown
And click on search button from homepage
And CAE search results displayed
And double click on first result
And click on actions from SOD page
And select add to compare action
Then User gets compareresults page with property set displayed

