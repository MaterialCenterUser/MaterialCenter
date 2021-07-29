Feature: Comparing multiple materials 

@MultipleMatCompare @All
Scenario: User selects 15 materials and compare them
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select fifteen materials
And right click to select compare option
Then compare results displayed

@MultipleMatCompareValidation @All
Scenario: User selects 2 materials and compare them
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And Click on rows per page
And Click on three
And click on arrow button
And click on select page option
And select compare option from Actions menu
And select show differences only from Display dropdown
Then verify that all differences are displayed in highlighted color

@ApplyFilter @All
Scenario: Apply property set filter on material SOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And double click on material
And click on property set and uncheck select all checkbox
And no property set selected msg is displayed
And click on property set and check select all checkbox
Then all property set of material is displayed


@ConfigNav @All
Scenario: After login user navigates to config tab
Given user is on dashboard page
Then user clicks on configuration tab

@New @All
Scenario: User selects some materials from same material hierarchy and compare them
Given user comes on Navigate WS
When user expands metals
And user expands stainless steel
And user expands age hardenable
And select Stainless Steel PH14-8 Mo
And click on arrow button
And click on select page option
And select compare option from Actions menu
And select show differences only from Display dropdown
Then verify that all differences are displayed in highlighted color

@MultipleMatCompareFord @AllFordSpecific
Scenario: User selects 4 materials and compare them
Given user comes on Navigate WS
And user expands material design data
And select metal option
And select fifteen materials
And right click to select compare option
Then compare results displayed

@ApplyFilterFord @AllFordSpecific
Scenario: Apply property set filter on material SOD
Given user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on property set and uncheck select all checkbox
And no property set selected msg is displayed
And click on property set and check select all checkbox
Then all property set of material is displayed

@ExpandCollapseCurve @AllFordSpecific
Scenario: User expands and collapse the curve thumbnail
Given user clicks on Config WS
When user comes on Navigate WS
And click on material design data
And sort the material in descending order of revisions
And select the material with max revisions
And verify that material SOD is open
And click on collapse thumbnail of curve
And click on expand thumbnail of curve
Then click on curve to open curve applet

@Compare50RevMatFord @AllFordSpecific
Scenario: User compares the fifty revisions of material
Given user clicks on Config WS
When user comes on Navigate WS
And click on material design data
And sort the material in descending order of revisions
And select the material with max revisions
And go to revisions tab of material
And select fifty materials
And right click on revisions to select compare option
Then compare results displayed
