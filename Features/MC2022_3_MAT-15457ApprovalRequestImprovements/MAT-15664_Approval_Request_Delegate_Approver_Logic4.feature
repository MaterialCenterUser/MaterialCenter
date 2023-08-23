Feature: MAT-15664 - Delegate Approver Logic


Background:
Given user has already logged in to Material Center application
|username|password|
|SimMan|sdm|
And homepage is displayed    
  	
  @Regression1
  Scenario: Check for Delegate behaviour for Admin for single Approver Request
When user is on search workspace
And user clicks on Approval Request option
And right click on first approval request
And select delegate approvar from action menu
And click on delegate dropdown and select adrian admin user
And enter the change reason
And click on delegate end date and select thirty date from datepicker
And click on add delegate button
And click on submit button to delegate the user
And navigate to homepage
And select delegate approver process
Then delegate approver process is done successfully

 @Regression1
Scenario: Check for Delegate behaviour for Admin for multiple Approver Requests
When user is on search workspace
And user clicks on Approval Request option
And click on three
And click on arrow button
And click on select page option
And right click on first approval request
And select delegate approvar from action menu
And click on delegate dropdown and select adrian admin user
And enter the change reason
And click on delegate end date and select thirty date from datepicker
And click on add delegate button
And click on submit button to delegate the user
And navigate to homepage
And select delegate approver process
Then delegate approver process is done successfully

 