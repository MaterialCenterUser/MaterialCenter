Feature: Approval Request/Preferred approvers

  Background: 
    Given user has already logged in to Material Center application
      | username | password |
      | smroot   | sdm      |
    And homepage is displayed

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
  Scenario: Validate the preferred approvers is not mandatory and user can submit approval request without it
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
    And click on completion date textbox
    And click on any date from datepicker
    And click on submit button on approval request page
    Then approval request is created successfully

  @All
  Scenario: Verify the preferred approvers UI is opened on clicking preferred approvers editor button
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    Then preferred approvers UI is displayed

  @All
  Scenario: Verify the empty preview table after opening preferred approvers UI first time
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    Then verify step1 value is empty

  @All
  Scenario: Verify the step dropdown matches the steps for selected approver list
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    Then verify the count of step dropdown matches the count of preview table steps

  @All
  Scenario: Verify the swaplist is displayed all the optional approvers for step1
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    Then verify that optional approvers are displayed for step1

  @All
  Scenario: Verify the swaplist is displayed all the optional approvers for step2
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    And select step2 from select step dropdown from preferred approver editor window
    Then verify that optional approvers are displayed for step2

  @All
  Scenario: Verify mandatory approvers are not displayed on preferred approvers UI
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    Then verify preferred approvers are displayed on preferred approvers editor
    Then verify optional approvers are displayed on preferred approvers editor

  @All
  Scenario: Verify user can select any optional approver as preferred approver
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    And select the optional approver as preferred approver from step1
    Then optional approver is displayed as preffered approver

  @All
  Scenario: Validate the error message is displayed for minimum preferred approvers
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    And select the optional approver as preferred approver from step1
    And click on apply button on preffered approver editor
    Then verify message for min approver "Number of minimum optional approvers required for 'Step 1' is 2. Number of preferred approvers should be equal to or more than minimum required optional approvers."

  @All
  Scenario: Verify the preview table for all the selected steps
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    And select the optional approver as preferred approver from step1
    And select step2 from select step dropdown from preferred approver editor window

  @All
  Scenario: Verify that preferred approvers is not mandatory for all the steps
   When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    And select the two optional approver as preferred approver from step1
    And click on apply button on preffered approver editor
    And click on ok button on preffered approver editor
    	And click on submit button on approval request page
		Then approval request is created successfully
    

  @All
  Scenario: Verify the selected preferred approvers are displayed previously selected state
   When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    And select the two optional approver as preferred approver from step1
    And click on apply button on preffered approver editor
    And click on ok button on preffered approver editor
     And click on preferred approvers editor button
     Then optional approver is displayed as preffered approver
    
  @All
  Scenario: Verify user can modify preferred approvers
     When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on approval request option from create menu on SOD
    And select second approval list from approval list dropdown
    And enter approval request name
    And click on preferred approvers editor button
    And select the two optional approver as preferred approver from step1
    And click on apply button on preffered approver editor
    And click on ok button on preffered approver editor
     And click on preferred approvers editor button
     And remove the preferred approver from preferred approver table
     Then 

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
