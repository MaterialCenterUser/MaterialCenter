Feature: MAT-15664 - Delegate Approver Logic


Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@Regression1
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
    And click on ok button to select approvers
    And click on plus button against step1
    And click on users button to select approver list against step2
    And click on select button to select mandatory approvers
    And select manager user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers Step2
    And click on plus button against step2
    And click on users button to select approver list against step3
    And click on select button to select mandatory approvers
    And select SimMan user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers Step3
    And click on plus button against step3
    And click on users button to select approver list against step4
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers Step4
    And enter urgency threshold days
  	And click on submit button to create approver list
  	Then approver list is created successfully
		
		@Regression
Scenario: Create approval list2
		When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select manager user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers
    And click on plus button against step1
    And click on users button to select approver list against step2
    And click on select button to select mandatory approvers
    And select dataowner user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers Step2
    And click on plus button against step2
    And click on users button to select approver list against step3
    And click on select button to select mandatory approvers
    And select SimMan user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers Step3
    And click on plus button against step3
    And click on users button to select approver list against step4
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers Step4
    And enter urgency threshold days
  	And click on submit button to create approver list
  	Then approver list is created successfully
		
		@Regression
Scenario: Create approval list3
		When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select manager user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers
    And click on plus button against step1
    And click on users button to select approver list against step2
    And click on select button to select mandatory approvers
    And select dataowner user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers Step2
    And click on plus button against step2
    And click on users button to select approver list against step3
    And click on select button to select mandatory approvers
    And select SimMan user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers Step3
    And enter urgency threshold days
  	And click on submit button to create approver list
  	Then approver list is created successfully
  	
  	@Regression
Scenario: Create approval request1
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
  	And enter approval request name
		And click on submit button on approval request page
		Then approval request is created successfully
		
	@Regression
Scenario: Create approval request2
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
		And click on submit button on approval request page
		Then approval request is created successfully
		
		@Regression
Scenario: Create approval request3
		When user comes on Navigate WS
		And user expands metals
		And user expands ferrous metals
		And user expands alloy steels under ferrous metals
		And user expands ultra high strength
		And select D-sixA Alloy Steel metal under ultra high strength
		And double click on first result
		And click on create SA
		And click on approval request option from create menu on SOD
  	And select third approval list from approval list dropdown
  	And enter approval request name
		And click on submit button on approval request page
		Then approval request is created successfully	
		
		
  	
@Regression
Scenario: verify delegate approvar option is displayed on right click of approval list
		When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers
    And click on plus button against step1
    And click on users button to select approver list against step2
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers
    And click on plus button against step2
    And click on users button to select approver list against step3
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers
    And click on plus button against step3
    And click on users button to select approver list against step4
    And click on select button to select mandatory approvers
    And select matadmin user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And enter urgency threshold days
  	And click on submit button to create approver list
  	And click on logff link
		And click ok button from logoff dialog
		And log in to Material Center application
				|username|password|
				|matAdmin|sdm|
		And right click on approver request from approver requests section
		Then delegate approver option is displayed
 