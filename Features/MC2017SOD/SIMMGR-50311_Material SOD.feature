Feature: Process Management

Background:
Given user has already logged in to Material Center application
|username|password|
|matAdmin|sdm|
And homepage is displayed

@MAT-19344 @Regression
Scenario: Property set
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click ok button on property set filter
Then electrical, mechanical and physical properties are not displayed on mat SOD page
And click on property set
And click select all from property set filter
And click ok button on property set filter
Then All properties are displayed on mat SOD page


@MAT-19344 @Regression
Scenario: Property set
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And Uncheck electrical, mechanical and physical properties from filter
And click ok button on property set filter
Then electrical, mechanical and physical properties are not displayed on mat SOD page
And click on property set
And check mechanical property and uncheck optical from filter
And click ok button on property set filter
Then electrical, optical and physical properties are not displayed on mat SOD page
