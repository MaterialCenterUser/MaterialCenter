Feature: Add CopyAnalysisResultPropertiesToMaterial

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|

#PreCondition: Import/Create Analysis Result with Properties to copy to Material
# Import the xml file shared by Shashikant
                     

                     
@Regression
Scenario: Copy Analysis Result Property to Material as New Property value
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click ok button on property set filter
Then property set filter image is displayed

@Regression
Scenario: Copied Analysis Result Property when Edited should available for copy to Material
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click ok button on property set filter
Then property set filter image is displayed


@Regression
Scenario: Material Property values which are copied from ananlysis result, when revised, A
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click ok button on property set filter
Then property set filter image is displayed

