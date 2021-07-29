Feature: Add CopyAnalysisResultPropertiesToMaterial

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|

#PreCondition: Import/Create Analysis Result with Properties to copy to Material
                     
@MAT-21887 @Regression
Scenario: Copy Analysis Result Property to Material as New Property value to the Material
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
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
And click on select page option
And click on Actions
And click on subscribe action
And navigate to homepage
And click on view all under subscribed materials
Then the materials display on my workspace page

@MAT-21888 @Regression
Scenario: Copied Analysis Result Property when Edited should available for copy to Materi
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
And navigate to homepage
And click on view all under subscribed materials
Then the materials display on my workspace page

@MAT-21889 @Regression
Scenario:Material Property values which are copied from ananlysis result, when revised, A
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

@MAT-21890 @Regression
Scenario: User should not be able to copy property if Material Schema does not have required properties/Parameters
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

