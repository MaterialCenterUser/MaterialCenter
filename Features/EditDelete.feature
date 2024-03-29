Feature: To delete and edit the existing material in MaterialCenter
Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@EditMat @All
Scenario: User edit the footnotes add it to tensile modulus and update the material
And user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on first material
And click on Edit material option
And navigate to footnotes tab and add footnotes
And go to properties tab
And select mechanical property set
And click on select button against tensile elastic modulus
And add newly added footnotes to eleastic modulus property
And click on ok button to submit footnotes
Then verify that newly added footnotes is updated with property successfully

@EditMatValidation @All
Scenario: User edit the classification and update the material
And user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on first material
And click on Edit material option
And navigate to Classification tab
And edit few values
And click on submit button on edit materials page
Then verify that edited values are updated successfully


@DeleteMat @All1
Scenario: User delete the selected materials
And user gives some text to search in materials
And search result is displayed
And click on rows per page
And click on three
And click on arrow button
And click on select page option
And right click to select edit and then delete option
And click on next button 
And click on submit button to delete materials successfully
Then check that process status is completed


@new @All
Scenario: User add the new property add the footnote to it and update the material
And user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on Edit material option
And navigate to footnotes tab and add footnotes
And go to properties tab
And click on add properties
And select the Solderability property
And click on select button against solderability
And add newly added footnotes to eleastic modulus property
And click on ok button to submit footnotes
Then verify that newly added footnotes is updated with property successfully


@New @All
Scenario: User add the footnotes and different parameter set to assembly property and update the material
And user comes on Navigate WS
And user expands metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And click on Edit material option
And navigate to footnotes tab and add footnotes
And go to properties tab
And select different parameter set and click on submit
Then verify that newly added footnotes is updated with property successfully

@EditMatFord @AllFordSpecific
Scenario: User edit the footnotes and update the material
Given user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on Edit material option
And navigate to footnotes tab and add footnotes
And go to properties tab
#And go to properties tab and select mechanical property set as eleastic modulus
And add newly added footnotes to eleastic modulus property
And click on ok button to submit footnotes
Then verify that newly added footnotes is updated with property successfully

@DeleteMatFord @AllFordSpecific
Scenario: User delete the selected materials
Given user comes on Navigate WS
When user expands material design data
And select metal option
And select four materials to delete
And right click to select edit and then delete option
And click on next button 
And click on submit button to delete materials successfully
And navigate to homepage and select Delete process
Then check that process is completed