Feature: Create approval request

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@All
  Scenario: Verify approval request option is displayed on MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on create from matMOD
Then approval request option is displayed on MOD

@All
  Scenario: Verify approval request option is displayed on SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
#And double click on material
And double click on first result
And click on create SA
Then approval request option is displayed on SOD

 @All
  Scenario: Verify user can launch the approval request UI from MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on create from matMOD
And click on approval request option from create menu on MOD
Then approval request window is opened on MOD

@All
  Scenario: Verify user can launch the approval request UI from SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then approval request winodw is opened on SOD


@All
  Scenario: Verify the completion date is displayed on approval request page
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then completion date option is displayed on approval request page

@All
  Scenario: Verify the preferred approvers is displayed on approval request page
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then preferred approvers option is displayed on approval request page

@All
  Scenario: Verify the completion date are not pre-polulated and is empty on approval request page
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then completion date textbox is empty on approval request page

@All
  Scenario: Verify preferred approvers editor button is disabled on approval request page
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then preferred approvers editor button is disabled on approval request page

@All
  Scenario: Validate preferred approvers editor button is enabled after selecting approver list
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And select first approval list from approval list dropdown
Then preferred approvers editor button is enabled on approval request page

@All
  Scenario: Validate approval request name is mandatory field
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And select first approval list from approval list dropdown
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then name is showing error message as "Required field."

@All
  Scenario: Validate approval list is mandatory field
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then approval list is showing error message as "Required field."


@All
  Scenario: Validate completion date is mandatory field
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
And click on cross button of completion date
And click on submit button on approval request page
Then completion date is showing error message as "Required field."

@All
  Scenario: Validate the completion date field is restricting to enter the value manually
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And click on completion date textbox
And enter some date value in completion date textbox
Then completion date field is not accepting any date entered manually


 