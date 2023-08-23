Feature: Layup Management

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed


@MAT-21758 @Regression
Scenario: Verify that manage Layup option is available on MOD Edit menu
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And select first material
And click on edit
Then manage layup option is displayed from edit menu on search results MOD

@MAT-21759 @Regression
Scenario: Verify that manage Layup option is available on SOD Edit menu
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
Then manage layup option is displayed on SOD

@MAT-21758 @Regression
Scenario: Check if Manage Layup UI can be launched on Material MOD
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And select first material
And click on edit
And click on manage layup from edit menu on search results MOD
Then manage Layup page is displayed

@MAT-21759 @Regression
Scenario: Check if Manage Layup UI can be launched from Material SOD
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
Then manage Layup page is displayed

@Regression
Scenario: Check if Project, Name & Type are pre-populated and disabled on Manage layup UI
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
Then project is pre-populated and displayed as "/Data"
And name is pre-populated and displayed on manage layup UI
And type is pre-populated and displayed as "Material"

@Regression
Scenario: Verify Material Data Type drop down Values
When user selects Materials from dropdown
And user enters searchtext for test data search "ceramics"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And click on material data type dropdown
Then second option in mat data type dropdown is displayed as "Composites"
And seventh option in mat data type dropdown is displayed as "Material"
And ninth option in mat data type dropdown is displayed as "Metals"

@Regression
Scenario: Verify Material Data is not selected initially and empty
When user selects Materials from dropdown
And user enters searchtext for test data search "ceramics"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
Then the material data is not selected initially and displayed empty


@Regression
Scenario: Verify material data dropdown when process type is selected as composites
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
And click on material data dropdown
Then all the components listed are displayed as of selected mat data type composites


@Regression
Scenario: Verify component dropdown when process type is selected as metals
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
Then all the components listed are displayed as of selected mat data type metals


@Regression
Scenario: Verify material selection window is displayed after clicking on the select button displayed against process dropdown
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
And click on select button displayed against material data dropdown
Then verify material data selection window is displayed


@Regression
Scenario: Verify the clear button is disabled before selecting material data
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
Then clear button is disabled before material data selection

@Regression
Scenario: Verify the clear button is enabled after selecting material data
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
And click on select button displayed against material data dropdown
And click on rows per page
And click on three
And double click on first result
Then clear button is enabled after material data selection

@Regression
Scenario: Verify the clear button functionality
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
And click on select button displayed against material data dropdown
And click on rows per page
And click on three
And double click on first result
And click on clear button next to material data
Then the material data selection is removed
#And clear button is disabled

@Regression
Scenario: Verify the add material data functionality
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for composites
And click on add material data button
Then material data is added to the materials table

@Regression
Scenario: Verify the material data type of added material when data type selected as composites
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for composites
And click on add material data button
Then material data type is displayed in materials table as "Composites"

@Regression
Scenario: Verify the material data type of added material when data type selected as metals
And user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
Then material data type is displayed in materials table as "Metals"

@Regression
Scenario: Verify the material data type of added material when data type selected as material
#pending -need confirmation
And user comes on Navigate WS
And select joining and sealing
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And click on material data dropdown
And select second row from mat data dropdown for ceramics
And click on add material data button
Then material data type is displayed in materials table as "Material"

@Regression
Scenario: Verify that other character is not allowed in stacking formula
user user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]_2B"
And click on update button to add stacking orientation
Then the error message displayed for invalid stacking as "Stacking formula is invalid"


@Regression
Scenario: Verify that orientation without square bracket is not allowed in stacking formula
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "0/45/90"
And click on update button to add stacking orientation
Then the error message displayed for invalid stacking as "Stacking formula is invalid"


@Regression
Scenario: Verify that single integer without square bracket is not allowed in stacking formula
And user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "4"
And click on update button to add stacking orientation
Then the error message displayed for invalid stacking as "Stacking formula is invalid"

@Regression
Scenario: Verify that negative orienation is allowed in stacking formula
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[-45]"
And click on update button to add stacking orientation
Then one ply is added in ply table

@Regression
Scenario: Verify the orientation is matched for stacking formula and ply table
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[45]"
And click on update button to add stacking orientation
Then the orienation in ply table is displayed as "45"

@Regression
Scenario: Verify remove ply button is displayed after adding the orienation
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[45]"
And click on update button to add stacking orientation
Then remove ply button is displayed


@Regression
Scenario: Verify remove ply button funtionality
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[45]"
And click on update button to add stacking orientation
And click on first remove ply button
Then ply is removed from ply table

@Regression
Scenario: Verify the ply table if _ is added for orientation within sqaure bracket
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45_2/90]"
And click on update button to add stacking orientation
Then the first orientation in ply table is displayed as "0"
And the second orientation in ply table is displayed as "45"
And the third orientation in ply table is displayed as "45"
And the fourth orientation in ply table is displayed as "90"

@Regression
Scenario: Verify the ply table if _ is added for orientation outside of sqaure bracket
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]_2"
And click on update button to add stacking orientation
Then the first orientation in ply table is displayed as "0"
And the fourth orientation in ply table is displayed as "0"
And the second orientation in ply table is displayed as "45"
And the fifth orientation in ply table is displayed as "45"
And the third orientation in ply table is displayed as "90"
And the sixth orientation in ply table is displayed as "90"

@Regression
Scenario: Verify the remove material is removed the added material data from material data table
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And click on remove material button from last column in material data table
Then added material is removed from material data table

@Regression
Scenario: Verify on removing the material, the material data entry is removed from material data selectbox in ply table
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[45]"
And click on update button to add stacking orientation
And click on remove material button from last column in material data table
Then the material data entry is removed from select textbox in ply table


@Regression
Scenario: Verify all the added material data is displayed in ply table material data selectbox
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[45]"
And click on update button to add stacking orientation
And click on select box of first ply material data from ply table
Then all the added material data is displayed in material data selectbox

@Regression
Scenario: Verify the remove ply functionality scenario1
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[45]"
And click on update button to add stacking orientation
And click on first remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as ""

@Regression
Scenario: Verify the remove ply functionality scenario2
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]"
And click on update button to add stacking orientation
And click on first remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[45/90]"


@Regression
Scenario: Verify the remove ply functionality scenario3
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]"
And click on update button to add stacking orientation
And click on second remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/90]"

@Regression
Scenario: Verify the remove ply functionality scenario4
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]"
And click on update button to add stacking orientation
And click on third remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/45]"


@Regression
Scenario: Verify the remove ply functionality scenario5
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45_2/90]"
And click on update button to add stacking orientation
And click on first remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[45_2/90]"


@Regression
Scenario: Verify the remove ply functionality scenario6
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45_2/90]"
And click on update button to add stacking orientation
And click on second remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/45/90]"


@Regression
Scenario: Verify the remove ply functionality scenario7
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45_2/90]"
And click on update button to add stacking orientation
And click on third remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/45/90]"

@Regression
Scenario: Verify the remove ply functionality scenario8
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45_2/90]"
And click on update button to add stacking orientation
And click on fourth remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/45_2]"

@Regression
Scenario: Verify the remove ply functionality scenario9
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]_2"
And click on update button to add stacking orientation
And click on first remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[45/90/0/45/90]"

@Regression
Scenario: Verify the remove ply functionality scenario10
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]_2"
And click on update button to add stacking orientation
And click on second remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/90/0/45/90]"

@Regression
Scenario: Verify the remove ply functionality scenario11
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]_2"
And click on update button to add stacking orientation
And click on third remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/45/0/45/90]"

@Regression
Scenario: Verify the remove ply functionality scenario12
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]_2"
And click on update button to add stacking orientation
And click on fourth remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/45/90/45/90]"

@Regression
Scenario: Verify the remove ply functionality scenario13
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]_2"
And click on update button to add stacking orientation
And click on fifth remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/45/90/0/90]"

@Regression
Scenario: Verify the remove ply functionality scenario14
When user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[0/45/90]_2"
And click on update button to add stacking orientation
And click on sixth remove ply button
Then stacking formula is updated in stacking formula textbox and displayed as "[0/45/90/0/45]"


@Regression
Scenario: Verify the manage layup is submitted and lauyp tab is displayed on material SOD page
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select metals from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for metals
And click on add material data button
And enter the stacking formula "[45]"
And click on update button to add stacking orientation
And click on submit button on layup page
Then layup tab is displayed on material SOD page

@Regression
Scenario: Verify the layup details are populated on manage layup page for submitted layup
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
Then layup details are populated for already submitted layup

@Regression
Scenario: Export Material to XML with Layup Components
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for composites
And click on add material data button
And enter the stacking formula "[90]"
And click on update button to add stacking orientation
And click on submit button on layup page
And click on export to xml option from material SOD page
And click on submit button to export the xml
Then export to xml is completed successfully


@Regression
Scenario: Export multiple materials, including material used as component for other material
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And select ultra high strength
And double click on first material
And click on edit on MatSOD
And click on manage layup from edit menu on SOD
And select composites from material data type dropdown
And click on material data dropdown
And select first row from mat data dropdown for composites
And click on add material data button
And enter the stacking formula "[90]"
And click on update button to add stacking orientation
And click on submit button on layup page
And click on export to xml option from material SOD page
And click on submit button to export the xml
Then export to xml is completed successfully



