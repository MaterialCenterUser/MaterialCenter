Feature: Process Management

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@MAT-21743 @Regression
Scenario: Verify that manage process option is available on MOD Edit menu
When user comes on search WS
And user click on material from search page
And materials search results displayed
And Click on rows per page
And Click on three
And select first material
And click on edit
Then manage process option is displayed from edit menu on search results MOD

@MAT-21743 @Regression
Scenario: Verify that manage process option is available on SOD Edit menu
When user comes on search WS
And user click on material from search page
And materials search results displayed
And Click on rows per page
And Click on three
And double click on first result
And click on edit on MatSOD
Then manage process option is displayed on SOD


@MAT-21744 @Regression
Scenario: Check if Manage Process UI can be launched on Material MOD
When user comes on search WS
And user click on material from search page
And materials search results displayed
And Click on rows per page
And Click on three
And select first material
And click on edit
And click on manage process from edit menu on search results MOD
Then manage process page is displayed

@MAT-21744 @Regression
Scenario: Check if Manage Process UI can be launched from Material SOD
When user comes on search WS
And user click on material from search page
And materials search results displayed
And Click on rows per page
And Click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
Then manage process page is displayed

