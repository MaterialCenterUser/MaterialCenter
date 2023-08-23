Feature: Add Description and Urgency Threshold

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@All
  Scenario: verify step description column is available in approval list
When user clicks on Config WS
And click on approver lists link
And click on create approver list link
Then step description column is displayed

@All
  Scenario: verify urgency threshold days option is available in approval list
When user clicks on Config WS
And click on approver lists link
And click on create approver list link
Then urgency threshold days option is displayed

@All
  Scenario: verify urgency threshold tooltip is displayed for urgency threshold days
When user clicks on Config WS
And click on approver lists link
And click on create approver list link
And hower on question mark available against urgency threshold days
Then urgency threshold tooltip is displayed

@All
  Scenario: verify user is able to add step description to each step
When user clicks on Config WS
And click on approver lists link
And click on create approver list link
And enter step description for step1
And click on submit button to create approver list
Then step description column is displayed
