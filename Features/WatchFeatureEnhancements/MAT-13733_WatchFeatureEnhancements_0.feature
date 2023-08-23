Feature: Watch Feature Enhancements

  @MAT-21878 @Regression
  Scenario Outline: Create a new user with valid email address
    Given user has already logged in to Material Center application
      | username | password |
      | smroot   | sdm      |
    When user clicks on administration link
    And click on Users link
    And click on Create User
    And enter username as <username>
    And enter firstname <FirstName>
    And enter lastname <LastName>
    And enter email <Email>
    And enter department <Department>
    And enter designation <Designation>
    And select rootuserprofile
    And select licensetype
    And click on submit button to create new user
    Then new user is created with valid email address <expEmailID>
    And username displays on myworkspacepage

    Examples: 
      | username | FirstName  | LastName | Email                         | Department | Designation             | expEmailID                    |
      | Tester1  | vibhavari  | patil    | vibhavari.patil@hexagon.com   | MC         | Lead Product Engineer   | vibhavari.patil@hexagon.com   |
      | Tester2  | shubhangi  | panchal  | shubhangi.panchal@hexagon.com | MC         | Senior Product Engineer | shubhangi.panchal@hexagon.com |
      | Tester5  | amit       | mirkle   | amit.mirkale@hexagon.com      | MC         | Senior Product Engineer | amit.mirkale@hexagon.com      |
      | Tester4  | shashikant | pattar   | shashikant.pattar@hexagon.com | MC         | Senior Product Engineer | shashikant.pattar@hexagon.com |

  @MAT-21878 @Regression
  Scenario Outline: Verify the user cannot create and error message displays for existing user
    Given user has already logged in to Material Center application
      | username | password |
      | smroot   | sdm      |
    When user clicks on administration link
    And click on Users link
    And click on Create User
    And enter username as <username>
    And enter firstname <FirstName>
    And enter lastname <LastName>
    And enter email <Email>
    And enter department <Department>
    And enter designation <Designation>
    And select rootuserprofile
    And select licensetype
    And click on submit button to create new user
    Then Error message is displayed for existing user "Error: Cannot create user. User 'Tester1' already exists."

    Examples: 
      | username | FirstName | LastName | Email                       | Department | Designation           |
      | Tester1  | vibhavari | patil    | vibhavari.patil@hexagon.com | MC         | Lead Product Engineer |
