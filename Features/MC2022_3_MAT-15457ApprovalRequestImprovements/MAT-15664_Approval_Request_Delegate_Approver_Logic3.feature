Feature: MAT-15664 - Delegate Approver Logic


Background:
Given user has already logged in to Material Center application
|username|password|
|user1|sdm|
And homepage is displayed    
  	
  @Regression1
  Scenario: Logged In user not part of Approval process- Verify select button against approver is disabled
When user is on search workspace
And user clicks on Approval Request option
And right click on first approval request
And select delegate approvar from action menu
Then select button is disabled against appover select drodown

  @Regression1
  Scenario: Logged In user not part of Approval process - Verify clear button against approver is disabled
When user is on search workspace
And user clicks on Approval Request option
And right click on first approval request
And select delegate approvar from action menu
Then clear button is disabled against appover select drodown


 