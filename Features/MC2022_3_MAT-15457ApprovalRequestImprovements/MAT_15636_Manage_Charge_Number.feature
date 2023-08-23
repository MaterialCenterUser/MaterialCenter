Feature: Manage Charge Number

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@All
  Scenario: verify charge number input field displayed on create approval request
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then charge number input field is displayed
  
  @All
  Scenario: verify charge number input field is empty on launching create approval request
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then charge number input field is displayed empty

  @All
  Scenario: verify that charge number input is accepting alphanumeric and special characters
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select first approval list from approval list dropdown
And enter combination of alphanumeric and special characters in charge number input field
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
  @All
  Scenario: validate the charge number input string length limit
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select first approval list from approval list dropdown
And enter the string length limit value in charge number textbox
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
 
  
  @All
Scenario: validate the charge number input is not accepting string length larger than limit
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select first approval list from approval list dropdown
And enter the string length larger than limit value in charge number textbox
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on refresh icon on workspace page
Then create approval request is failed with error message for charge number

  @All
  Scenario: Verify the charge number is displayed on status page on creating approval request
  When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select first approval list from approval list dropdown
And enter any string in charge number input field
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
  @All
  Scenario: verify charge number is not mandatory
 When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select first approval list from approval list dropdown
And click on submit button on approval request page
Then approval request is created successfully
  
  @All
  Scenario: verify charge number is displayed blank on status page if approval request submitted without charnge number
  When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select first approval list from approval list dropdown
And click on submit button on approval request page
Then charge number is displayed as ""