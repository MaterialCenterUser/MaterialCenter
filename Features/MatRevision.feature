Feature: Create Material revisions

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@MatRevision @All
Scenario: User verifies the maximum revisions of material
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on Edit material option
And navigate to Classification tab
And edit few values
And click on submit button on edit materials page
And click on Edit material option
And navigate to Classification tab
And edit subclass value
And click on submit button on edit materials page
And click on revisions tab
Then verify revision is created

@MatRevisionCurve @All
Scenario: Creating multiple revisions of material
When user comes on Navigate WS
And user clicks on Metals to open MOD
And double click on material
And click on Edit material option
And navigate to Classification tab
And edit few values
And click on submit button on edit materials page
And click on Edit material option
And navigate to Classification tab
And edit subclass value
And click on submit button on edit materials page
And click on revisions tab
And click on first revision
Then verify user gets all the revisions