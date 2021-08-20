Feature: Watch Feature Enhancements

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
When user comes on Navigate WS
And user clicks on Metals to open MOD

@MAT-21877 @Regression
Scenario: Subscribe/Unsubscribe actions are available in Action menu 
And click on arrow button
And click on select page option
And click on Actions
Then user gets Subscribe action
And user gets Unsubscribe action

@MAT-21877 @Regression
Scenario: Verify subscribe button is available on Material SOD
And double click on material
Then subscribe button is available on material details page

@MAT-21880 @Regression
Scenario: Verify user able to Subscribe multiple MatData and check if the subscription process is done
And click on arrow button
And click on select page option
And click on Actions
And click on subscribe action
And navigate to homepage from material SOD page
And click on subscribe for revision change notification link under processes
Then user gets subscribe for revision change notification process status as done

@MAT-21880 @Regression
Scenario: Verify user able to Unsubscribe multiple MatData and check if the unsubscription process is done
And click on arrow button
And click on select page option
And click on Actions
And click on unsubscribe action
And navigate to homepage from material SOD page
And click on unsubscribe for revision change notification link under processes
Then user gets unsubscribe for revision change notification process status as done

@MAT-21880 @Regression
Scenario: Verify user able to Subscribe multiple MatData and displays it under subscribed materials
And click on arrow button
And click on select page option
And click on Actions
And click on subscribe action
And navigate to homepage from material SOD page
And click on view all under subscribed materials
Then the materials display on my workspace page

@MAT-21880 @Regression
Scenario: Verify user able to unubscribe multiple MatData and no results found displays under subscribed materials
And click on arrow button
And click on select page option
And click on Actions
And click on unsubscribe action
And navigate to homepage from material SOD page
Then no results found shows under subscribed materials