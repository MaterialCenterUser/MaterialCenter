Feature: Watch Feature Enhancements

Background:
Given user has already logged in to Material Center application
|username|password|
|Tester5|sdm|

#PreCondition: 1. New/Existing user should have valid Email address 2. Settings should be configured in portal.propeties,pulish and activate it
                     
@MAT-21882 @Regression
Scenario: Verify that Multiple users able to Subscribe same MatData
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on select page option
And click on Actions
And click on subscribe action
And click on logff link
And click ok button from logoff dialog
And log in to Material Center application
|username|password|
|Tester4|sdm|
And user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on select page option
And click on Actions
And click on subscribe action
And navigate to homepage from material SOD page
And click on view all under subscribed materials
Then the materials display on my workspace page

@MAT-21882 @Regression
Scenario: Verify that Multiple users able to unsubscribe same MatData
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on select page option
And click on Actions
And click on unsubscribe action
And click on logff link
And click ok button from logoff dialog
And log in to Material Center application
|username|password|
|Tester4|sdm|
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on select page option
And click on Actions
And click on unsubscribe action
And navigate to homepage from material SOD page
And click on view all under subscribed materials
Then the materials display on my workspace page

@MAT-21883 @Regression
Scenario: Create multiple revisions of material
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on Edit material option
And navigate to Classification tab
And edit few values
And click on submit button on edit materials page
And click on Edit material option
And navigate to Classification tab
And edit subclass value
And click on submit button on edit materials page
And click on revisions tab
Then verify revision is created

@MAT-21883 @Regression
Scenario: Verify User is able to subscribe from any revision of the MatData
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on Edit material option
And navigate to Classification tab
And edit few values
And click on submit button on edit materials page
And click on Edit material option
And navigate to Classification tab
And edit subclass value
And click on submit button on edit materials page
And click on revisions tab
And click on first revision
And click on subscribe button
Then the button label changes to unsubscribe
And click on revisions tab
And click on second revision
Then the button label changes to unsubscribe

@MAT-21883 @Regression
Scenario: Verify User is able to unsubscribe from any revision of the MatData
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on Edit material option
And navigate to Classification tab
And edit few values
And click on submit button on edit materials page
And click on Edit material option
And navigate to Classification tab
And edit subclass value
And click on submit button on edit materials page
And click on revisions tab
And click on second revision
And click on subscribe button
Then the button label changes to unsubscribe
And click on revisions tab
And click on first revision
And click on unsubscribe button
Then the button label changes to subscribe


@MAT-21884 @Regression
Scenario: Verify user is able to delete subscribed MatData
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on subscribe button
And click on Edit material option
And navigate to Classification tab
And edit few values
And click on submit button on edit materials page
And click on Edit material option
And navigate to Classification tab
And edit subclass value
And click on submit button on edit materials page
And click on edit on MatSOD
And select delete action
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
And click on auto refresh checkbox
And verify the process is completed with done status



@Regression
Scenario: Create the test data for material having in work level
When user clicks on Config WS
And click on create material link
And select data project
And select master metal schema
And click on classification tab
And enter value for common name on classification tab "MatForTestDataWatchFeature"
And click on submit button to create material
And click on create SA
And click on test data action
And enter value for clamped lenghth "0.1"
And click on Submit button on edit test data page

@MAT-21885 @Regression
Scenario: Verify user is able to Subscribe TestData
#Pre- requisite - test data should be created
When user selects Test from dropdown
And user enters searchtext for test data search "Nominal : 0.1"
And click on search button from homepage
And click on first row from search results
And click on subscribe button
Then the button label changes to unsubscribe

@MAT-21885 @Regression
Scenario: Verify user is able to unsubscribe TestData
#Pre- requisite - test data should be created
When user selects Test from dropdown
And user enters searchtext for test data search "Nominal : 0.1"
And click on search button from homepage
And click on first row from search results
And click on unsubscribe button
Then the button label changes to subscribe


@MAT-21886 @Regression
Scenario: Create CAE Model and verify user is able to Subscribe or unsubscribe CAE Model
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on create SA
And click on CAE model AUTO action
And click on Submit button
And click on subscribe button
Then the button label changes to unsubscribe
And click on unsubscribe button
Then the button label changes to subscribe