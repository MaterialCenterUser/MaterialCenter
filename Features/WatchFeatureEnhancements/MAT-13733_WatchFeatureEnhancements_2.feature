Feature: Watch Feature Enhancements

Background:
Given user has already logged in to Material Center application
|username|password|
|Tester1|sdm|

#PreCondition: 1. New/Existing user should have valid Email address 2. Settings should be configured in portal.propeties,pulish and activate it
                     
@MAT-21878 @Regression
Scenario: Verify if user is able to Subscribe MatData
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on subscribe button
Then the button label changes to unsubscribe

@MAT-21878 @Regression
Scenario: Verify if user is able to Unsubscribe MatData
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on unsubscribe button
Then the button label changes to subscribe


@MAT-21878 @Regression
Scenario: Navigate to MatSOD and verify user is able to subscribe MatData from action menu
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on actions from SOD page
And select subscribe action
And click on refresh button
Then the button label changes to unsubscribe

@MAT-21878 @Regression
Scenario: Navigate to MatSOD and verify user is able to unsubscribe MatData from action menu
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on actions from SOD page
And select unsubscribe action
And click on refresh button
Then the button label changes to subscribe

@MAT-21878 @Regression
Scenario: Verify that subscribed materials displays under subscribed materials on home page
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on subscribe button
And navigate to homepage
And click on view all under subscribed materials
Then the materials display on my workspace page
And double click on material link
Then the button label changes to unsubscribe

@MAT-21878 @Regression
Scenario: Verify that unsubscribed materials removes under subscribed materials from home page
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on unsubscribe button
And navigate to homepage
Then no results found shows under subscribed materials

@MAT-21879 @Regression
Scenario: Verify user receives MatData Revision Notification
#Email is receiving or not that we could not check with selenium. Hence the verification steps verifies that revision is done or not.
# User need to check the mail manually in inbox
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on subscribe button
And click on Edit material option
And navigate to Classification tab
And edit few values
And click on submit button on edit materials page
And click on revisions tab
Then verify revision is created

@MAT-21881 @Regression
Scenario: Verify that subscribed materials by the same user only able to see all the subscribed MatData
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
|Tester2|sdm|
Then no results found shows under subscribed materials
