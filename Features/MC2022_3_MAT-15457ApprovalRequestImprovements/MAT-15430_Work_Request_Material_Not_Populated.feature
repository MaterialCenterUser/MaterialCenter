Feature: Work Request Material not populated

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@All1
  Scenario: Create work request template for one ref attribute
When user clicks on Config WS
And click on work request templates link
And select promoteApproveDemoteMaterials
And click create template link
And click choose file button to upload custom template for one ref attribute
And click submit button to create work request template
Then work request template is created


@All1
  Scenario: Create custom work request template for two inputs options
When user clicks on Config WS
And click on work request templates link
And select promoteApproveDemoteMaterials
And click create template link
And click choose file button to upload custom template
And click submit button to create work request template
Then work request template is created

 @All1
  Scenario: Verify work request option is displayed on MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on create from matMOD
Then work request option is displayed on MOD

@All1
  Scenario: Verify work request option is displayed on SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
Then work request option is displayed on SOD

  @All1
  Scenario: Verify user can launch the work request UI from MOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on create from matMOD
And click on work request option from create menu on SOD
Then work request window is opened on MOD

@All1
  Scenario: Verify user can launch the work request UI from SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
Then work request winodw is opened on SOD


@All1
  Scenario: Validate the project field is pre-polulated on work request
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
Then project is populated as "/Data"


@All1
  Scenario: Validate the input fields are pre-polulated with the selected objects for one ref material
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And select CAE model request template from template dropdown
Then material for CAE model is pouplated under input field
Then one ref materials are displayed in dropdown


@All1
  Scenario: Validate the input fields are pre-polulated with the selected objects for many ref material
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
Then materials to set release level is pouplated under input field
Then many ref materials are displayed in dropdown



@All1
  Scenario: verify the input fields for template test data management(template configuration)
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And select test data management template configuration template from template dropdown
Then start date and end date are displayed

@All1
  Scenario: verify the input fields for template test data management(generate design data)
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And select test data management generate design data template from template dropdown
Then reference Material For Test Data is pouplated under input field


@All1
  Scenario: verify the input fields for template test data management(import test data)
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And select test data management import test data template from template dropdown
Then material For Test Data is pouplated under input field

@All1
  Scenario: verify the input fields for template submit mat revision
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And select submit material revision template from template dropdown
Then existing material data to edit is pouplated under input field

@All1
  Scenario: verify the input fields for template schema configuration
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And select schema configuration template from template dropdown
Then start date and end date are displayed

@All1
  Scenario: validate the submit work request without selecting template
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And click submit button on work request page
Then template is showing error message as "Required field."

@All1
  Scenario: validate the submit work request without selecting work request name
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And click submit button on work request page
Then work request name is showing error message as "Required field."

@All1
  Scenario: validate only the first field is populated if several fields defined in the Work Request Template
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first result
And click on create SA
And click on work request option from create menu on SOD
And select custom template from template dropdown
Then only first field is populated in custom template
