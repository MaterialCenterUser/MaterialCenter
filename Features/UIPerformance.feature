Feature: UI performance under Navigate WS
Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@MatToLib @All
Scenario: Switching from materials to libraries tree
Given user comes on Navigate WS
When user expands metals
And expands ferrous metals
And switch tree from materials to libraries
Then expands materials selector library

@MODSwitch @All
Scenario: Switching from one MOD to another MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And switch to Polymers MOD
And user expands metals
Then select nonferrous metals

@RowsPerPage @All
Scenario: NAvigate to metals and verify the change in rows per page is displayed
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And Click on fifty
And select rows per page as hundred
And select rows per page as two fifty
Then select rows per page as five hundred

@RowsPerPageFord @All
Scenario: Navigate to material selector library and verify the change in rows per page is displayed
Given user comes on Navigate WS
When switch tree from materials to libraries
And expands materials selector library
And user clicks on Metals from Mat Selector Lib to open MOD
And Click on fifty
And select rows per page as hundred
And select rows per page as two fifty
Then select rows per page as five hundred

@DensityColFilter @All
Scenario: Navigate to metals and user adds density column in MOD
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as five hundred
And click on arrow button
And open configure columns and click on more button
And select density filter and click on ok button
And click on density column and select filter
And move density slider for particular limit and click ok button
Then density filter is applied successfully

@DensityColFilterFord @All
Scenario: Navigate to material selector library and user adds density column in MOD
Given user comes on Navigate WS
When switch tree from materials to libraries
And expands materials selector library
And user clicks on Metals from Mat Selector Lib to open MOD
And click on arrow button
And open configure columns and click on more button
And select density filter and click on ok button
And click on density column and select filter
And move density slider for particular limit and click ok button
Then density filter is applied successfully