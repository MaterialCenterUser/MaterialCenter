Feature: Test template

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

  @testTemplate @All @regression
  Scenario: Test templates option is displayed in config workspace
    When user clicks on Config WS
    Then test templates option is displayed


		
 @testTemplate @All @regression
  Scenario: Create Test template option is displayed after clicking on test templates
    When user clicks on Config WS
    And user clicks on test templates option