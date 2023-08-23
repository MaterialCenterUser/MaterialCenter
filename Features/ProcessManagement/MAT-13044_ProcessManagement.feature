Feature: Process Management

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@MAT-21743 @Regression
Scenario: Verify that manage process option is available on MOD Edit menu
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And select first material
And click on edit
Then manage process option is displayed from edit menu on search results MOD
Then the first process is removed from process component table


@MAT-21743 @Regression
Scenario: Verify that manage process option is available on SOD Edit menu
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
Then manage process option is displayed on SOD

@MAT-21744 @Regression
Scenario: Check if Manage Process UI can be launched on Material MOD
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And select first material
And click on edit
And click on manage process from edit menu on search results MOD
Then manage process page is displayed

@MAT-21744 @Regression
Scenario: Check if Manage Process UI can be launched from Material SOD
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
Then manage process page is displayed

@MAT-21745 @Regression
Scenario: Check if Project, Name & Type are pre-populated and disabled on Manage process UI
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
Then project is pre-populated and displayed as "/Data"
And name is pre-populated and displayed on manage process UI
And type is pre-populated and displayed as "Material"

@MAT-21746 @Regression
Scenario: Verify Process Type drop down Values
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And click on process type dropdown
Then first option in process type dropdown is displayed as "Composites"
And second option in process type dropdown is displayed as "Metals"

@MAT-21747 @Regression
Scenario: Verify component dropdown when process type is selected as composites
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
Then all the components listed are displayed as of selected process type composites


@MAT-21747 @Regression
Scenario: Verify component dropdown when process type is selected as metals
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select metals from process type dropdown
And click on process dropdown
Then all the components listed are displayed as of selected process type metals

@Regression
Scenario: Verify material selection window is displayed after clicking on the select button displayed against process dropdown
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on select button displayed against process dropdown
Then verify material selection window is displayed


@Regression
Scenario: Verify the select button functionality for composites process type
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
Then class is populated with the value
And common name is poulated with value
And composites component is populated in process dropdown

@Regression
Scenario: Verify the select button functionality for metals process type
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select metals from process type dropdown
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
Then class is populated with the value
And common name is poulated with value
And metals component is populated in process dropdown


@Regression
Scenario: Verify copy material window is displayed after clicking on the copy button displayed against process dropdown
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And click on copy button displayed against process dropdown
Then copy material window is displayed


@Regression
Scenario: Verify error message for copy material when not material is selected in process
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
And click on clear button displayed against process dropdown
And click on copy button displayed against process dropdown
Then copy material error message is displayed as "lable.ManageProcess.Copy.No.MaterialSelectedForCopy"

@MAT-21749 @Regression
Scenario: check the add button functionality
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
Then the process is added with material data and properties


@MAT-21748 @Regression
Scenario: check on Dynamic Link properties functionality
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
Then the link properties are displayed in added process order


@MAT-21751 @Regression
Scenario: check the process component table and verify the process type for composites
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
Then the composites process type displayed in process component table

@MAT-21751 @Regression
Scenario: check the process component table and verify the process type for metals
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
Then the metals process type displayed in process component table

@MAT-21751 @Regression
Scenario: check the process component table and verify the process properties
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
Then process properties are displayed in process component table


@MAT-21751 @Regression
Scenario: check the process component table and verify the order number
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
Then order number is displayed in process component table

@MAT-21751 @Regression
Scenario: check the process component table and verify the order number as per the order added
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
And enter some value in time textbox
And click on Add button on process page
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
Then order number is displayed in process component table
And second order is displayed in process component table

@MAT-21752 @Regression
Scenario: Verify submit button is displayed on process page
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
Then submit button is displayed on process page

@MAT-21753 @Regression
Scenario: Verify cancel button is displayed on process page
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
Then cancel button is displayed on process page


@MAT-21753 @Regression
Scenario: Verify cancel button functionality
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
And enter some value in time textbox
And click on Add button on process page
And click on cancel button on process page
Then the process is cancelled and material SOD page is displayed


@MAT-21754 @Regression
Scenario: Check if User is able to pass negative Time Value
#Automation is pending for this test case, defect raised MAT-14288
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
And enter negative value in time textbox
And click on Add button on process page
Then negative value is not added and giving error message ""

@MAT-21755 @Regression
Scenario: Verify unrealistic time value is not accepting while entering Dynamic Link Properties input
When user selects Materials from dropdown
And user enters searchtext for test data search "coatings"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
And enter some unrelalistic value in time textbox
And click on Add button on process page
Then link property value is not added and giving error message "The given value (100C) is not valid."


@MAT-21770 @Regression
Scenario: Check if Process tab is displayed on Material SOD if Material has Process Assembly
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
And enter some value in time textbox
And click on Add button on process page
And click on submit button on process page
And process tab is displayed on material SOD page

@MAT-21755 @Regression
Scenario: Check if Discard Manager Process action deletes the created object
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And click on submit button on process page
And navigate to homepage from material SOD page
#And user clicks on view all processes
#And click on rows per page
#And click on three
And click on manage process link
And user clicks on discard option
And user clicks on submit button on manage process
#And user clicks on view all processes
Then discard of manage process is done successfully


@MAT-21772 @Regression
Scenario: Check the update button is displayed if user selects edit option on process page
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select the process from process component table
And click on edit button on process page
Then update button is displayed on process page to update the process

@MAT-21772 @Regression
Scenario: Check the edit functionality on process page
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select the process from process component table
And click on edit button on process page
And select metals from process type dropdown
And click on select button displayed against process dropdown
And click on rows per page
And click on three
And double click on first result
And enter some value in time textbox
And click on update button on process page
Then process is updated and update button is changed to add button

@MAT-21773 @Regression
Scenario: verify if the process component has been moved to first position
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select the last process from process component table
And click on first button on process page
Then the process is moved to first position in process component table

@MAT-21776 @Regression
Scenario: verify if the process component has been moved to last position
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select the first process from process component table
And click on last button on process page
Then the process is moved to last position in process component table

@MAT-21774 @Regression
Scenario: verify if the process component has been moved to up
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select the second process from process component table
And click on up button on process page
Then the process is moved to first position in process component table

@MAT-21775 @Regression
Scenario: verify if the process component has been moved to down
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select the first process from process component table
And click on down button on process page
Then the process is moved to last position in process component table


@MAT-21775 @Regression
Scenario: verify if the process component has been removed from process component table
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage process from edit menu on SOD
And select composites from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select metals from process type dropdown
And click on process dropdown
And select first row from process dropdown
And enter some value in time textbox
And click on Add button on process page
And select the first process from process component table
And click on remove button on process page
