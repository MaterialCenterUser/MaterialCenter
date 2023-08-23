Feature:  MAT-15478 - Preferred approvers logic


Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed    
  	
  @Regression1
  Scenario: Verify  legend for 1-in review material approval request
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on create material option from create menu on SOD
And click on submit button to create material on SOD page
And click on security action from workspace page
And select promote option from security menu on SOD
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
And click on create SA
And click on approval request option from create menu on SOD
And select first approval list from approval list dropdown
And enter approval request name
And click on preferred approvers editor button
And click on all right button on preferred approvers page
And click on apply button on preferred approver page
And click on ok button on preferred approver page
And click on submit button on approval request page
Then p legend is displayed on step1 on approver request details page

@Regression
  Scenario: Verify  legend for 2-production material approval request
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on create material option from create menu on SOD
And click on submit button to create material on SOD page
And click on security action menu
And select promote action
And select target level as production
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
And click on create SA
And click on approval request option from create menu on SOD
And select first approval list from approval list dropdown
And enter approval request name
And click on preferred approvers editor button
And click on all right button on preferred approvers page
And click on apply button on preferred approver page
And click on ok button on preferred approver page
And click on submit button on approval request page
Then p legend is displayed on step1 on approver request details page

  	@Regression
Scenario: Verify error message on submission in case of min optional approvals required 
		When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select smroot user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And select manager user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And select value2 from min optional approvers dropdown step1
    And click on plus button against step1
    And click on users button to select approver list against step2
    And click on select button to select mandatory approvers
    And select manager user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers
    And enter urgency threshold days
  	And click on submit button to create approver list
  	And approver list is created successfully
  	And navigate to homepage
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
		And click on preferred approvers editor button
		And double click on first optional approver for step1
		And click on apply button on preferred approver page
		Then error message displayed for min opt app as "Number of minimum optional approvers required for 'Step 1' is 2. Number of preferred approvers should be equal to or more than minimum required optional approvers."

		
		  	@Regression
		Scenario: Verify  pending request in MOD of approvers
		When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select smroot user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And select manager user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And select value2 from min optional approvers dropdown step1
    And click on plus button against step1
    And click on users button to select approver list against step2
    And click on select button to select mandatory approvers
    And select manager user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers
    And enter urgency threshold days
  	And click on submit button to create approver list
  	And approver list is created successfully
  	And navigate to homepage
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
		And click on preferred approvers editor button
		And click on all right button on preferred approvers page
		And click on apply button on preferred approver page
		And click on ok button on preferred approver page
		And click on submit button on approval request page
		And click on logff link
		And click ok button from logoff dialog
		And log in to Material Center application
				|username|password|
				|dataOwner|sdm|
		And user clicks on Config WS
    And click on pending approval requests link
    Then pending approval request is displayed on MOD
    
    
    @Regression
		Scenario: Verify  pending request in SOD of approvers
		When user clicks on Config WS
    And click on approver lists link
    And click on create approver list link
		And select system project from approval list project dropdown
		And enter name for new approver list
		And click on users button to select approver list
    And click on select button to select mandatory approvers
    And select smroot user as approver
    And click on ok button for mandatory approver
    And click on select button to select optional approvers
    And select dataowner user as approver
    And select manager user as approver
    And click on ok button for optional approver
    And click on ok button to select approvers
    And select value2 from min optional approvers dropdown step1
    And click on plus button against step1
    And click on users button to select approver list against step2
    And click on select button to select mandatory approvers
    And select manager user as approver
    And click on ok button for mandatory approver
    And click on ok button to select approvers
    And enter urgency threshold days
  	And click on submit button to create approver list
  	And approver list is created successfully
  	And navigate to homepage
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
		And click on preferred approvers editor button
		And click on all right button on preferred approvers page
		And click on apply button on preferred approver page
		And click on ok button on preferred approver page
		And click on submit button on approval request page
		And click on logff link
		And click ok button from logoff dialog
		And log in to Material Center application
				|username|password|
				|dataOwner|sdm|
		And user clicks on Config WS
    And click on pending approval requests link
    And double click on first approval request
    Then 