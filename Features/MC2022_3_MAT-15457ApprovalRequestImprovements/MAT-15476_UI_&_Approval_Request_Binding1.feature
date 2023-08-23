Feature: Approval Request/Preferred approvers

  Background: 
    Given user has already logged in to Material Center application
      | username | password |
      | smroot   | sdm      |
    And homepage is displayed

  @Regression
  Scenario: Verify Preferred user feature in work request SOD
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on work request option from create menu on SOD
    And select promote demote materials template from template dropdown
    And select first approval list from approval list dropdown on work request
    And enter approval request name on work request page
    And click on preferred approvers editor button
    Then preferred approvers UI is displayed

  @Regression
  Scenario: Verify Date handling feature in work request SOD
    When user comes on Navigate WS
    And user expands metals
    And user expands ferrous metals
    And user expands alloy steels under ferrous metals
    And user expands ultra high strength
    And select D-sixA Alloy Steel metal under ultra high strength
    And double click on first result
    And click on create SA
    And click on work request option from create menu on SOD
    And select promote demote materials template from template dropdown
    And select first approval list from approval list dropdown on work request
    And enter approval request name on work request page
    And click on preferred approvers editor button
    Then preferred approvers UI is displayed
