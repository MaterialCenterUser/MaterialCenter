Feature: Create CAE model (Auto) of selected material

@MatRevision @All
Scenario: User verifies the maximum revisions of material
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And Click on rows per page
And Click on three
And click on arrow button
And click on select page option
And select compare option from Actions menu
And select show differences only from Display dropdown
Then verify that all differences are displayed in highlighted color

@MatRevisionCurve @All
Scenario: Creating multiple revisions of material
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And Click on rows per page
And Click on three
And click on arrow button
And click on select page option
And select compare option from Actions menu
And select show differences only from Display dropdown
Then verify that all differences are displayed in highlighted color