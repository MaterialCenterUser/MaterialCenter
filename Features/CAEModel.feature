Feature: Create CAE model Auto of selected material

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed




  @CAEModel @All
  Scenario: Generate CAE model of material
    When user comes on Navigate WS
    And user expands ceramics and glasses
		And select industrial glass
		And double click on first material
    And click on create SA
    And click on CAE model AUTO action
    And click on Submit button
    And navigate to homepage
    And select CAE model process
    Then CAE model should generate successfully

  @CAEModel @All
  Scenario: User discards the CAE model process
    When user clicks on view all processes
    And click on rows per page
		And click on three
    And user select CAE model process
    And user clicks on discard option
    And user clicks on submit button on CAE model page
    Then discard of CAE model should be completed successfully

  @CAEModel @All
  Scenario: Generate CAE model of material
    When user comes on Navigate WS
    And user clicks on Metals to open MOD
    And double click on material
    And check the mechanical property values and store them
    And click on create SA
    And click on CAE model AUTO action
    And click on Submit button
    Then verify that CAE model is successfully created with correct values

  @FordSpecific
  Scenario: Generate CAE model of material
    Given user clicks on Config WS
    When user comes on Navigate WS
    And user expands material design data
    And select metal option
    And double click on material from MOD of ford data
    And click on create SA
    And click on CAE model AUTO action
    And click on Submit button
    And navigate to homepage
    And select CAE model process
    Then CAE model should generate successfully
