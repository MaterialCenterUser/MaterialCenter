Feature: Create&Edit Approver List improvements - group and reorder steps

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@All
  Scenario: verify reorder steps button is displayed for approver list
  When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    Then reorder steps button is displayed
    
    
		@All
  Scenario: verify group with previous option is displayed for approver list
  When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    Then group with previous column is displayed
    
  @All
  Scenario: verify reorder steps UI is opened on clicking reorder steps button
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    And click on reorder steps button
    Then reorder steps UI is opened
  
    @All
  Scenario: verify the order column on clicking group with previous checkbox
  
  
   
   @All
  Scenario: verify group with previous option is displayed for approver list
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