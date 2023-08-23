Feature: Approval Request/Update Watch List

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@All
  Scenario: verify edit watch list option is displayed for approver request
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on edit on approver list wrokspace
Then edit watch list option is displayed


@All
  Scenario: verify an Approval Request can have empty/null Watch List
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on edit on approver list wrokspace
And click on edit watch list from edit menu on workspace
Then verify users list displayed as "No Records Selected"


@All
  Scenario: verify watch list can have new user
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And enter approval request name
And select approval list from approval list dropdown
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on edit on approver list wrokspace
And click on edit watch list from edit menu on workspace
And click on select button from edit watch list
And select first user for edit watch list
And click on submit button to submit watch list
And click on edit on approver list wrokspace
And click on edit watch list from edit menu on workspace
And click on select button from edit watch list
And select second user for edit watch list
And click on submit button to submit watch list
And click on edit on approver list wrokspace
And click on edit watch list from edit menu on workspace
Then new added user is displayed in watch list




@All
  Scenario: Verify remove button is disabled if no users in watch list
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And enter approval request name
And select approval list from approval list dropdown
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on edit on approver list wrokspace
And click on edit watch list from edit menu on workspace
And click on select button from edit watch list
And select first user for edit watch list
And click on submit button to submit watch list
And click on edit on approver list wrokspace
And click on edit watch list from edit menu on workspace
And select the added user from watch list
And click on remove button on watch list
Then remove button is disabled on watch list


@All
  Scenario: Verify existing users can be removed from watch list
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And enter approval request name
And select approval list from approval list dropdown
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on edit on approver list wrokspace
And click on edit watch list from edit menu on workspace
And click on select button from edit watch list
And select first user for edit watch list
And click on submit button to submit watch list
And click on edit on approver list wrokspace
And click on edit watch list from edit menu on workspace
And select the added user from watch list
And click on remove button on watch list

 @All
  Scenario: Verify the preferred approvers UI is opened on clicking preferred approvers editor button
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And click on preferred approvers editor button
Then preferred approvers UI is displayed

 @All
  Scenario: Verify the empty preview table after opening preferred approvers UI first time
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And click on preferred approvers editor button
And 


 @All
  Scenario: Verify the step dropdown matches the steps for selected approver list


 @All
  Scenario: Verify the swaplist is displayed all the optional approvers for that step
  
 @All
  Scenario: Verify mandatory approvers are not displayed on preferred approvers UI
  
@All
  Scenario: Verify user can select any optional approver as preferred approver
  
@All
  Scenario: Validate the error message is displayed for minimum preferred approvers
  
@All
  Scenario: Verify the preview table for all the selected steps
  
@All
  Scenario: Verify that preferred approvers is not mandatory for all the steps
  
@All
  Scenario: Verify the selected preferred approvers are displayed previously selected state
  
@All
  Scenario: Verify user can modify preferred approvers
  
  
@All
  Scenario: Verify the preferred approvers reset on selecting different approver list

  
@All
  Scenario: Verify the swaplist is displayed empty for no optional approver step
  
@All
  Scenario: Verify the approval request is created with preferred approvers
  
  @All
  Scenario: Verify the completion date is displayed on approval request SOD with tine zone set for user
  
  @All
  Scenario: Verify the completion date and preferred approvers are displayed on approval request process page
  
  
  
  