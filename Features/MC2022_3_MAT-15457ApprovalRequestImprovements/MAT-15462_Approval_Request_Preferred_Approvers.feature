Feature: Approval Request/Preferred approvers

  Background: 
    Given user has already logged in to Material Center application
      | username | password |
      | smroot   | sdm      |
    And homepage is displayed

  @Regression
  Scenario: Create approval list1
    When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    And select system project from approval list project dropdown
    And enter name for new approver list
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select smroot user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select SimMan user as approver
    And select user1 user as approver
    And select user3 user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step1
    And click on users button to select approver list against step2
    And click on select button to select mandatory approvers
    And select manager user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select matadmin user as approver
    And select user1 user as approver
    And select user3 user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers Step2
    And click on plus button against step2
    And click on users button to select approver list against step3
    And click on select button to select mandatory approvers
    And select SimMan user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select matadmin user as approver
    And select user1 user as approver
    And select user2 user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers Step3
    And click on plus button against step3
    And click on users button to select approver list against step4
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select user2 user as approver
    And select user3 user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers Step4
    And enter urgency threshold days
    And click on submit button to create approver list
    Then approver list is created successfully
