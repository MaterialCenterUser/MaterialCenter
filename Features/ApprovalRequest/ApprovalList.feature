Feature: Approval list

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


  @All
  Scenario: Verify approver lists on configuration page
    When user clicks on Config WS
    Then verify approver lists link is displayed


 @All
  Scenario: Verify approver list dialog is displayed from create approver list
    When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		Then verify approver list dialog is displayed to create approver list
		
		@All
  Scenario: Verify select approvers dialog box is displayed with mandatory and optional section
    When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    And click on users button to select approver list
    Then select approvers dialog box is displayed
    Then mandatory section is displayed
    Then optional section is displayed

  @All
  Scenario: Verify user is able to create approver list 
    When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project
    And enter name for new approver list
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver 
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on submit button to create approver list
    Then approver list is created successfully

  