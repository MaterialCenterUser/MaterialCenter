Feature: MAT-15664 - Delegate Approver Logic


Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed    
  	
  	@Regression1
  Scenario: Check for Delegate behaviour - Revoke Approver option is displayed on delegate approver
When user is on search workspace
And user clicks on Approval Request option
And right click on first approval request
And select delegate approvar from action menu
And click on delegate dropdown and select adrian admin user
And enter the change reason
And click on delegate end date and select thirty date from datepicker
And click on add delegate button
Then revoke button is displayed on delegate approver


  @Regression1
  Scenario: Check for Delegate behaviour - Verify revoke approver should revoke the approver
When user is on search workspace
And user clicks on Approval Request option
And right click on first approval request
And select delegate approvar from action menu
And click on delegate dropdown and select adrian admin user
And enter the change reason
And click on delegate end date and select thirty date from datepicker
And click on add delegate button
And click on revoke button
Then scratch line is displayed on added delegate

