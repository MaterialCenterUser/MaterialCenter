Feature: Approval Request behaviour - Execute steps in parallel


Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

 @All1 @regression
  Scenario: Verify user is able to create approver list
    When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
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
    
    

@All
  Scenario: Verify user is able to add multiple steps
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step1
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step4
		Then step2 is added and displayed
		Then step3 is added and displayed
		Then step4 is added and displayed
    
    
    @All
  Scenario: Verify the message for incomplete step
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    And click on plus button against step1
    Then msg is displayed as "Can't add new row when there is incomplete step, select atleast one  approver"
    
    
@All
  Scenario: Check for change the order of the current step as the previous one when “group with previous” is selected for adding steps
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step1
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And check the checkbox group with previous against step3
    Then current step order is changed and same as order of previous step2
  
  @All
  Scenario: Verify user is able to delete the step
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step1
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on delete button against step2
    And click on ok button on delete confirm dialog box
    Then deleted step is removed
    
    
  @All
  Scenario: Check for change the order of the current step when Deleting step.
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
  	And click on ok button to select approvers
    And click on plus button against step1
    
    
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step4
		Then step2 is added and displayed
		Then step3 is added and displayed
		Then step4 is added and displayed


    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And check the checkbox group with previous against step3
    Then current step order is changed and same as order of previous step2
  
  
  @All
  Scenario: verify charge number input field is empty on launching create approval request
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then charge number input field is displayed empty

  @All
  Scenario: verify that charge number input is accepting alphanumeric and special characters
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
And enter combination of alphanumeric and special characters in charge number input field
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
  @All
  Scenario: validate the charge number input string length limit
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
And enter the string length limit value in charge number textbox
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
 
  
  @All
Scenario: validate the charge number input is not accepting string length larger than limit
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select second approval list from approval list dropdown
And enter the string length larger than limit value in charge number textbox
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on refresh icon on workspace page
Then create approval request is failed with error message for charge number

  @All
  Scenario: Verify the charge number is displayed on status page on creating approval request
  When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select second approval list from approval list dropdown
And enter any string in charge number input field
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
  @All
  Scenario: verify charge number is not mandatory
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
And click on submit button on approval request page
Then approval request is created successfully
  
  @All
  Scenario: verify charge number is displayed blank on status page if approval request submitted without charnge number
  When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select second approval list from approval list dropdown
And click on submit button on approval request page
Then charge number is displayed as ""



@All
  Scenario: Check for change the order of the current step as the previous one when “group with previous” is selected for adding steps
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
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
    And click on plus button against step1
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And check the checkbox group with previous against step3
    Then current step order is changed and same as order of previous step2
  
  @All
  Scenario: Verify user is able to delete the step
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
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
    And click on plus button against step1
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on delete button against step2
    And click on ok button on delete confirm dialog box
    Then deleted step is removed
    
    
  @All
  Scenario: Check for change the order of the current step when Deleting step.
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
  	And click on ok button to select approvers
    And click on plus button against step1
    
    
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step4
		Then step2 is added and displayed
		Then step3 is added and displayed
		Then step4 is added and displayed


    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And check the checkbox group with previous against step3
    Then current step order is changed and same as order of previous step2
  
  
  @All
  Scenario: verify charge number input field is empty on launching create approval request
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then charge number input field is displayed empty

  @All
  Scenario: verify that charge number input is accepting alphanumeric and special characters
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
And enter combination of alphanumeric and special characters in charge number input field
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
  @All
  Scenario: validate the charge number input string length limit
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select second approval list from approval list dropdown
And enter the string length limit value in charge number textbox
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
 
  
  @All
Scenario: validate the charge number input is not accepting string length larger than limit
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And enter the string length larger than limit value in charge number textbox
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on refresh icon on workspace page
Then create approval request is failed with error message for charge number

  @All
  Scenario: Verify the charge number is displayed on status page on creating approval request
  When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And enter any string in charge number input field
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
  @All
  Scenario: verify charge number is not mandatory
 When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And click on submit button on approval request page
Then approval request is created
  
  @All
  Scenario: verify charge number is displayed blank on status page if approval request submitted without charnge number
  When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And click on submit button on approval request page
Then charge number is displayed as ""


@All
  Scenario: Check for change the order of the current step as the previous one when “group with previous” is selected for adding steps
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
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
    And click on plus button against step1
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And check the checkbox group with previous against step3
    Then current step order is changed and same as order of previous step2
  
  @All
  Scenario: Verify user is able to delete the step
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
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
    And click on plus button against step1
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on delete button against step2
    And click on ok button on delete confirm dialog box
    Then deleted step is removed
    
    
  @All
  Scenario: Check for change the order of the current step when Deleting step.
   When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
  	And click on ok button to select approvers
    And click on plus button against step1
    
    
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step4
		Then step2 is added and displayed
		Then step3 is added and displayed
		Then step4 is added and displayed


    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And check the checkbox group with previous against step3
    Then current step order is changed and same as order of previous step2
  
  
  @All
  Scenario: verify charge number input field is empty on launching create approval request
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
Then charge number input field is displayed empty

  @All
  Scenario: verify that charge number input is accepting alphanumeric and special characters
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And enter combination of alphanumeric and special characters in charge number input field
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
  @All
  Scenario: validate the charge number input string length limit
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And enter the string length limit value in charge number textbox
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
 
  
  @All
Scenario: validate the charge number input is not accepting string length larger than limit
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And enter the string length larger than limit value in charge number textbox
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
And click on refresh icon on workspace page
Then create approval request is failed with error message for charge number

  @All
  Scenario: Verify the charge number is displayed on status page on creating approval request
  When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And enter any string in charge number input field
And click on completion date textbox
And click on any date from datepicker
And click on submit button on approval request page
Then charge Number is displayed on create approval request details page
  
  @All
  Scenario: verify charge number is not mandatory
 When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And click on submit button on approval request page
Then approval request is created
  
  @All
  Scenario: verify charge number is displayed blank on status page if approval request submitted without charnge number
  When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on create SA
And click on approval request option from create menu on SOD
And enter approval request name
And select approval list from approval list dropdown
And click on submit button on approval request page
Then charge number is displayed as ""