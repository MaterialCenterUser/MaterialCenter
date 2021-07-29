Feature: Promoting material from In-work level to Production level

@All
Scenario: User is able to promote the material to production level
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select material with In work release level
And click on promote action under security tab
And select target level as production
And click on next button
And Click on rows per page
And Click on three
And click on submit button on dependent objects list
Then check that process status is completed
#And navigate to homepage and select Set release process
#And open the promoted material under inputs and outputs tab
#Then material should be promoted successfully

@All1
Scenario: User is able to promote the material to production level
Given user clicks on Config WS
When user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on promote action under security tab
And select target level as production
And click on next button
And click on submit button on dependent objects list
And navigate to homepage and select Set release process
And open the promoted material under inputs and outputs tab
Then material should be promoted successfully
And select target level as production

