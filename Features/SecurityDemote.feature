Feature: Demoting material from Production level to In-Review or In Work level

@Demote @All
Scenario: User is able to demote the material to In-Review or In Work level
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select material with In work release level
And click on demote action under security tab
And click on next button
And Click on rows per page
And Click on three
And click on submit button on dependent objects list
Then check that process status is completed
#And navigate to homepage and select Demote process
#And open the demoted material under inputs and outputs tab
#Then material should be demoted successfully

@DemoteFord @All1
Scenario: User is able to demote the material to In-Review or In Work level
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on demote action under security tab
And click on next button
And click on the submit button on dependent objects list
And navigate to homepage and select Demote process
And open the demoted material under inputs and outputs tab
Then material should be demoted successfully

