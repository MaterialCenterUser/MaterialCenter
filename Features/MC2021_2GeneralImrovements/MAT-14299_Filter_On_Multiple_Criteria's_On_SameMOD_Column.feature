Feature: Filter on multiple criteria on a same MOD column

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@Regression
Scenario: Check new filer UI search textbox
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then search textbox is displayed

@Regression
Scenario: Check new filer UI blank checkbox
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then blank checkbox is displayed

@Regression
Scenario: Check new filer UI select all checkbox
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then select all checkbox is displayed

@Regression
Scenario: Check new filer UI cancel button
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then cancel button is displayed

@Regression
Scenario: Check new filer UI ok button
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then ok button is displayed

@Regression
Scenario: Check new filer UI close button
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
Then close button is displayed

@Regression
Scenario: Verify filter pop up is closed on selecting any value and clicking ok button
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select production checkbox and click on ok button
Then filter UI is closed


@Regression
Scenario: Verify clear column filter option is displayed if any filter is applied to column
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select production checkbox and click on ok button
And click on release level column
Then clear column filter option is displayed

@Regression
Scenario: Verify filter image is displayed against column name if any filter is applied to column
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select production checkbox and click on ok button
And click on release level column
Then filter image is displayed with column name

@Regression
Scenario: Verify selecting blank filter displays expected results
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select blank checkbox filter and click on ok button
Then blank filter is applied and results are correct

@Regression
Scenario: Verify all the filter gets selected after selecting select all filter
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select select all checkbox filter
Then all the checkboxes are selected

@Regression
Scenario: Verify select all filter is applied and displayed correct results
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select select all checkbox filter and click on ok button
Then filter image is displayed with column name

@Regression
Scenario: Verify clear column filter option is displayed from column
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select blank checkbox filter and click on ok button
And click on release level column
Then clear column filter option is displayed

@Regression
Scenario: Verify clear column filter option is removed the filter
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select blank checkbox filter and click on ok button
And click on release level column
And click on clear column filter option
Then filter is removed from column


@Regression
Scenario: Verify clear filter option is displayed from green arrow
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on arrow button
Then clear filter option is displayed


@Regression
Scenario: Verify clear filter option is displayed from green arrow
When user comes on Navigate WS
And user clicks on Metals to open MOD
And click on release level column and select filter
And select production checkbox and click on ok button
And click on arrow button
And click on clear filter option
Then filter is removed from column

@Regression
Scenario Outline: Create a new user with valid email address
When user clicks on administration link
And click on Users link
And click on Create User
And enter username as <username>
And enter firstname <FirstName>
And enter lastname <LastName>
And enter email <Email>
And enter department <Department>
And enter designation <Designation>
And select rootuserprofile 
And select licensetype
And click on submit button to create new user
Then new user is created with valid email address <expEmailID>
And username displays on myworkspacepage

Examples:
|username|FirstName|LastName|Email|Department|Designation|expEmailID|
|Tester10|abcd|patil|abcd.patil@hexagon.com|MC|Lead Product Engineer|abcd.patil@hexagon.com|

@Regression
Scenario: Verify new user is displayed in user list
When user clicks on administration link
And click on Users link
Then newly created user is displayed in the filter list


@Regression
Scenario: Verify the filter image on column after selecting new user from filter
When user clicks on administration link
And click on Users link
And click on user name column and select filter
And check the new user checkbox and click on ok button
Then filter image is displayed with column name

@Regression
Scenario: Verify the results after selecting new user from filter
When user clicks on administration link
And click on Users link
And click on user name column and select filter
And check the new user checkbox and click on ok button
Then new user is displayed in filter results
And one row is displayed in filter results
