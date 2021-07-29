Feature: Enahacements in MaterialCenter SOD

Background:
Given user has already logged in to Material Center application
|username|password|
|smroot|sdm|
And homepage is displayed

@MAT-21684 @Regression
Scenario: Search the material which is having curves available
When user comes on search WS
And user click on material from search page
And user expands curves attribute
And select the curve atribute from drodown
And click on apply the changes for curve attribute
And double click on first result
Then material SOD page is displayed

@MAT-21684 @Regression
Scenario: Compare material properties by using checkbox on SOD
When user comes on search WS
And user click on material from search page
And user expands curves attribute
And select the curve atribute from drodown
And click on apply the changes for curve attribute
And double click on first result
And select checkboxes for properties
And select compare from actions dropdown
Then compare curve property results page is displayed with available comparators

@MAT-21685 @Regression
Scenario: Compare properties for different materials by using checkbox on SOD
When user comes on search WS
And user click on material from search page
And user expands curves attribute
And select the curve atribute from drodown
And click on apply the changes for curve attribute
And double click on first result
And select checkboxes for properties
And select add to compare from actions dropdown
Then compare curve property results page is displayed with available comparators

@MAT-21686 @Regression
Scenario: Verify add property to clipboard action is available on material SOD
When user comes on search WS
And user click on material from search page
And user expands curves attribute
And select the curve atribute from drodown
And click on apply the changes for curve attribute
And double click on first result
And select checkboxes for properties
Then add property to clipboard action is displayed in actions dropdown

@MAT-21686 @Regression
Scenario: Perform add property to clipboard and verify properties are added to clipboard
When user comes on search WS
And user click on material from search page
And user expands curves attribute
And select the curve atribute from drodown
And click on apply the changes for curve attribute
And double click on first result
And select checkboxes for properties
And select add property to clipboard from actions dropdown
And navigate to homepage
And click on view all under clipboard
Then the curve properties display on my workspace page

@MAT-21687 @Regression
Scenario: Search for manyref object and verify those are displayed on SOD
When user enters searchtext for materials search "TestManyRefMat1"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
Then Manyref objects are displayed on material SOD page

@MAT-21687 @Regression
Scenario: Verify the compare results using compare option for manyref objects materials
When user enters searchtext for materials search "TestManyRefMat1"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And Manyref objects are displayed on material SOD page
And click on any value from manyref object material
And select checkboxes for properties
And select compare from actions dropdown
Then compare curve property results page is displayed with available comparators

@MAT-21687 @Regression
Scenario: Verify the compare results using add to compare option for manyref objects materials
When user enters searchtext for materials search "TestManyRefMat1"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on any value from manyref object material
And select checkboxes for properties
And select add to compare from actions dropdown
Then compare curve property results page is displayed with available comparators


@MAT-21688 @Regression
Scenario: Search the curve property and verify the search results
When user comes on search WS
And user click on curve property from search page
Then verify the curve property search is displayed


@MAT-21688 @Regression
Scenario: Search the curve property and verify the SOD page is displayed for that curve property
When user comes on search WS
And user click on curve property from search page
And verify the curve property search is displayed
And click on rows per page
And click on three
And double click on first curve property result
Then curve property SOD page is displayed

@MAT-21688 @Regression
Scenario: Navigate to curve property and verify the curve file download option is available on SOD page
When user comes on search WS
And user click on curve property from search page
And verify the curve property search is displayed
And click on rows per page
And click on three
And double click on first curve property result
Then the curve file download link is available on SOD page

@MAT-21688 @Regression
Scenario: Verify that the curve file is downloaded from curve SOD page
When user comes on search WS
And user click on curve property from search page
And verify the curve property search is displayed
And click on rows per page
And click on three
And double click on first curve property result
And click on the curve file link from curve SOD page
Then curve file is downloaded