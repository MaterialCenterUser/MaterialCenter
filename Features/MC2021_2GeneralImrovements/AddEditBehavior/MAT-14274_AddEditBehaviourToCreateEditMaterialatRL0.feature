Feature: Add Edit Behavior to create edit material 

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed
#pre -requisites - To execute below test, the user should activate the configurations'
# steps -
#Go to Material center installation directory amd Enable the "EditMaterialData_Material" in SMP_MenuConfig.XMl file".
#Go to Administration Workspace -> Configuration-> Publish the SMP_MenuConfig.XMl file and Activate the Configuration.

@Regression
Scenario: Create new material
And user clicks on Config WS
And click on create material link
And select data project to create material
And select master metal schema to create material
And click on classification tab
And enter value for common name on classification tab "TestAutomationMat2"
And click on submit button to create material
Then created material is displayed

@Regression
Scenario: Verify edit material at RL0 is displayed for in work level material on MOD
When user enters searchtext for materials search "TestAutomationMat2"
And click on search button from homepage
And materials search results displayed
And select first material
And click on edit
Then edit material at RL0 option is displayed from edit menu on search results MOD

@Regression
Scenario: Verify edit material at RL0 is displayed for in work level material on SOD
When user enters searchtext for materials search "TestAutomationMat2"
And click on search button from homepage
And materials search results displayed
And double click on first result
And click on edit on MatSOD
Then edit material at RL0 option is displayed on SOD

@Regression
Scenario: Verify edit material at RL0 is not displayed for review RL1 level material on MOD
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-review checkbox and click on ok button
And select first material
And click on edit on MOD
Then edit material at RL0 option is not displayed from edit menu on MOD

@Regression
Scenario: Verify edit material at RL0 is not displayed for review RL1 level material on SOD
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-review checkbox and click on ok button
And double click on first material
And click on edit on MatSOD
Then edit material at RL0 option is not displayed from edit menu on SOD

@Regression
Scenario: Verify edit material at RL0 is not displayed for production RL2 level material on MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select first material
And click on edit on MOD
Then edit material at RL0 option is not displayed from edit menu on MOD

@Regression
Scenario: Verify edit material at RL0 is not displayed for production RL2 level material on SOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And double click on first material
And click on edit on MatSOD
Then edit material at RL0 option is not displayed from edit menu on SOD

@Regression
Scenario: Promote the material from RL0 to RL1 and verify edit material at RL0 is not displayed for review RL1 level material on SOD
And user clicks on Config WS
And click on create material link
And select data project to create material
And select master metal schema to create material
And click on classification tab
And enter material name and click on submit button to create material
#And enter value for common name on classification tab "TestAutomationMat233"
And click on submit button to create material
And click on security action menu
And select promote action
#And click on promote action under security tab
And select target level as in review
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
And click on edit on MatSOD
Then edit material at RL0 option is not displayed from edit menu on SOD

@Regression
Scenario: Promote the material from RL1 to RL2 and verify edit material at RL0 is not displayed for review RL2 level material on SOD
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-review checkbox and click on ok button
And double click on first material
And click on promote action under security tab
And select target level as production
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
And click on edit on MatSOD
Then edit material at RL0 option is not displayed from edit menu on SOD


@Regression
Scenario: Demote the material from RL2 to RL0 and verify edit material at RL0 is displayed for review RL0 level material on SOD
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select production checkbox and click on ok button
And double click on first material
And click on demote action under security tab
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
And click on edit on MatSOD
Then edit material at RL0 option is displayed on SOD

@Regression
Scenario: Demote the material from RL1 to RL0 and verify edit material at RL0 is displayed for review RL0 level material on SOD
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-review checkbox and click on ok button
And double click on first material
And click on demote action under security tab
And click on next button
And click on rows per page
And click on three
And click on submit button on dependent objects list
And click on edit on MatSOD
Then edit material at RL0 option is displayed on SOD

@Regression
Scenario: Create Material and verify release level is not changed or updated when editing the material with no change from SOD page
When user clicks on Config WS
And click on create material link
And select data project
And select master metal schema
And click on classification tab
And enter material name and click on submit button to create material
And click on edit on MatSOD
And click on edit material at RL0 option on SOD
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"


@Regression
Scenario: Search the material and verify release level is not changed or updated when editing the material with no change from MOD page
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-work checkbox and click on ok button
And select first material
And click on edit on MOD
And click on edit material at RL0 option on MOD
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"

@Regression
Scenario: Add new attribute value on classficarion tab and Verify no new revision is created when updating the values in the classification tab
When user clicks on Config WS
And click on create material link
And select data project
And select master metal schema
And click on classification tab
And enter material name and click on submit button to create material
And click on edit on MatSOD
And click on edit material at RL0 option on SOD
And navigate to Classification tab
And click on add attributes button
And double click on class attribute
And click on ok button to add attribute
And enter class attribute value
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"

@Regression
Scenario: Edit existing attribute value on classficarion tab and Verify no new revision is created when updating the values in the classification tab
When user clicks on Config WS
And click on create material link
And select data project
And select master metal schema
And click on classification tab
And enter material name and click on submit button to create material
And click on edit on MatSOD
And click on edit material at RL0 option on SOD
And navigate to Classification tab
And edit common name attribute value
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"

@Regression
Scenario: Remove existing attribute value on classficarion tab and Verify no new revision is created when removing attribute value from the classification tab
When user clicks on Config WS
And click on create material link
And select data project
And select master metal schema
And click on classification tab
And enter material name and click on submit button to create material
And click on edit on MatSOD
And click on edit material at RL0 option on SOD
And navigate to Classification tab
And click on add attributes button
And double click on class attribute
And click on ok button to add attribute
And enter class attribute value
And click on submit button on edit materials page
And click on edit material at RL0 option on SOD
And navigate to Classification tab
And remove class attribute value
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"


@Regression
Scenario: Add new attribute value on sources tab and Verify no new revision is created when updating the values in the sources tab
When user clicks on Config WS
And click on create material link
And select data project
And select master metal schema
And click on classification tab
And enter material name and click on submit button to create material
And click on edit on MatSOD
And click on edit material at RL0 option on SOD
And navigate to sources tab
And click on add attributes button
And double click on cas number attribute
And click on ok button to add attribute
And enter cas Number attribute value
And enter source name on sources tab
And click on ok button to add source
And navigate to Classification tab
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"


@Regression
Scenario: Add source from selecting existing source on sources tab and Verify no new revision is created when adding existing source on the sources tab
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-review checkbox and click on ok button
And double click on first material
And click on edit material at RL0 option on SOD
And navigate to sources tab
And click on select button displayed against select existing source
And double click on first source from result
And enter source name on sources tab
And click on ok button to add source
And navigate to Classification tab
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"


@Regression
Scenario: Edit existing source on sources tab and Verify no new revision is created when editing existing source on the sources tab
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-review checkbox and click on ok button
And double click on first material
And click on edit material at RL0 option on SOD
And navigate to sources tab
And click on select button displayed against select existing source
And double click on first source from result
And enter source name on sources tab
And click on ok button to add source
And select source on source tab
And click on edit button to edit source on source tab
And enter source name on sources tab
And click on ok button to add source
And navigate to Classification tab
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"


@Regression
Scenario: Remove existing source on sources tab and Verify no new revision is created when removing existing source on the sources tab
Given user comes on Navigate WS
When user clicks on All Materials to open MOD
And click on release level column and select filter
And select In-review checkbox and click on ok button
And double click on first material
And click on edit material at RL0 option on SOD
And navigate to sources tab
And click on select button displayed against select existing source
And double click on first source from result
And enter source name on sources tab
And click on ok button to add source
And select source on source tab
And click on remove button to remove source on source tab
And navigate to Classification tab
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"

@Regression
Scenario: Create the CAE model for material having in work level
When user clicks on Config WS
And click on create material link
And select data project to create material
And select master metal schema to create material
And click on classification tab
And enter value for common name on classification tab "MatForCAE"
And click on submit button to create material
And click on create SA
And click on CAE model AUTO action
And enter value for shear modulus "0.34"
And enter value for poisson ratio "0.2"
And click on Submit button


@Regression
Scenario: Verify no new revision is created when material is having CAE model
When user enters searchtext for materials search "MatForCAE"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on edit material at RL0 option on SOD
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"

@Regression
Scenario: Create the test data for material having in work level
When user clicks on Config WS
And click on create material link
And select data project to create material
And select master metal schema to create material
And click on classification tab
And enter value for common name on classification tab "MatForTestData"
And click on submit button to create material
And click on create SA
And click on test data action
And enter value for clamped lenghth "0.2"
And click on Submit button on edit test data page


@Regression
Scenario: Verify no new revision is created when material is having test data
When user enters searchtext for materials search "MatForTestData"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on edit material at RL0 option on SOD
And click on submit button on edit materials page
And click on revisions tab
Then verify release level is displayed as "0-In-Work"

