Feature: SOD unit tests

Background:
Given user has already logged in to Material Center application
|username|password|
|matAdmin|sdm|
And homepage is displayed

@MAT-19344 @Regression
Scenario: Navigate to material using search and verify properties are unchecked from filter and not displayed on SOD page
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

@MAT-19344 @Regression
Scenario: Navigate to material and verify properties are unchecked from filter and not displayed on SOD page
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click ok button on property set filter
Then property set filter image is displayed

@MAT-19344 @Regression
Scenario: Navigate to material from configurations and verify properties are unchecked from filter and not displayed on SOD page
Given user clicks on Config WS
And click on data sources
And double click on materials selector link
And double click on first material
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click ok button on property set filter
Then property set filter image is displayed

@MAT-19344 @Regression
Scenario: Navigate to material from clipboard and verify properties are unchecked from filter and not displayed on SOD page
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on add to clipboard
And navigate to homepage
And click on view all under clipboard
And double click on first material
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click ok button on property set filter
Then property set filter image is displayed

@MAT-19360 @Regression
Scenario: Navigate to material using search and verify all properties are displayed on SOD page using select all
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And click on select all on property filter
Then all properties are displayed on SOD page

@MAT-19360 @Regression
Scenario: Navigate to material and verify all properties are displayed on SOD page using select all
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on property set
And click on select all on property filter
Then all properties are displayed on SOD page

@MAT-19360 @Regression
Scenario: Navigate to material from configurations and verify all properties are displayed on SOD page using select all
Given user clicks on Config WS
And click on data sources
And double click on materials selector link
And double click on first material
And click on property set
And click on select all on property filter
Then all properties are displayed on SOD page

@MAT-19360 @Regression
Scenario: Navigate to material from clipboard and verify all properties are displayed on SOD page using select all
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on add to clipboard
And navigate to homepage
And click on view all under clipboard
And double click on first material
And click on property set
And click on select all on property filter
Then all properties are displayed on SOD page

@MAT-19345 @Regression
Scenario: Navigate to material using search and verify checked properties are displayed on SOD page
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click on cancel on property set filter
Then all properties are displayed on SOD page

@MAT-19345 @Regression
Scenario: Navigate to material and verify checked properties are displayed on SOD page
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click on cancel on property set filter
Then all properties are displayed on SOD page

@MAT-19345 @Regression
Scenario: Navigate to material from configurations and verify checked properties are displayed on SOD page
Given user clicks on Config WS
And click on data sources
And double click on materials selector link
And double click on first material
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click on cancel on property set filter
Then all properties are displayed on SOD page

@MAT-19345 @Regression
Scenario: Navigate to material from clipboard and verify checked properties are displayed on SOD page
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on add to clipboard
And navigate to homepage
And click on view all under clipboard
And double click on first material
And click on property set
And uncheck electrical, mechanical and physical properties from filter
And click on cancel on property set filter
Then all properties are displayed on SOD page

@MAT-19362 @Regression
Scenario: Navigate to material using search and verify unselecting all properties are not displayed on SOD page
When user comes on search WS
And user click on material from search page
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"


@MAT-19362 @Regression
Scenario: Navigate to material and verify unselecting all properties are not displayed on SOD page
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"

@MAT-19362 @Regression
Scenario: Navigate to material from configurations and verify unselecting all properties are not displayed on SOD page
Given user clicks on Config WS
And click on data sources
And double click on materials selector link
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"


@MAT-19362 @Regression
Scenario: Navigate to material from clipboard and verify unselecting all properties are not displayed on SOD page
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on add to clipboard
And navigate to homepage
And click on view all under clipboard
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"



@MAT-19346 @Regression
Scenario: Navigate to polymer material from clipboard and verify the Property Set filter and Material SOD behaviour between sessions
When user comes on Navigate WS
And user expands polymers
And user expands plastics,thermoplastic
And select ionomer
And double click on first material
And click on add to clipboard
And navigate to homepage
And click on view all under clipboard
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"


@MAT-19346 @Regression
Scenario: Navigate to polymer material using search and verify the Property Set filter and Material SOD behaviour between sessions
When user enters searchtext for materials search "polymer"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"


@MAT-19346 @Regression
Scenario: Navigate to polymer material and verify the Property Set filter and Material SOD behaviour between sessions
When user comes on Navigate WS
And user expands polymers
And user expands plastics,thermoplastic
And select ionomer
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"


@MAT-19346 @Regression
Scenario: Navigate to polymer material from configurations and verify the Property Set filter and Material SOD behaviour between sessions
Given user clicks on Config WS
And click on data sources
And double click on materials selector link
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"

@MAT-19352 @Regression
Scenario: Verify the Property Set filter and material sod behaviour for materials which do not have any property sets configured
When user enters searchtext for materials search "Mat2"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
Then message is displayed which does not property set "The material does not have any property sets"

@MAT-19347 @Regression
Scenario: Verify the Property Set filter and Material SOD behaviour between invocations of different materials
When user comes on Navigate WS
And user expands polymers
And user expands plastics,thermoplastic
And select ionomer
And double click on first material
And click on property set
And unselect hardness property
And click on property set
And unselect processing property
Then property set filter image is displayed

@MAT-19349 @Regression
Scenario: Verify the Property Set filter and Material SOD between invocations
When user comes on Navigate WS
And user expands polymers
And user expands plastics,thermoplastic
And select ionomer
And double click on first material
And click on property set
And unselect hardness property
And click on property set
And unselect processing property
And navigate to homepage
And user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"


@MAT-19349 @Regression
Scenario: Navigate to material from search and verify the Property Set filter and Material SOD between invocations
When user enters searchtext for materials search "Ionomer"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And unselect hardness property
And click on property set
And unselect processing property
And navigate to homepage
And user comes on Navigate WS
And user expands ceramics and glasses
And select industrial glass
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"


@MAT-19369 @Regression
Scenario: Navigate to material from search and verify the Property Set filter and Material SOD behaviour between different invocations of material types
When user enters searchtext for materials search "Ionomer"
And click on search button from homepage
And materials search results displayed
And click on rows per page
And click on three
And double click on first result
And click on property set
And unselect hardness property
And click on property set
And unselect processing property
Then property set filter image is displayed


@MAT-19442 @MAT-19491 @Regression
Scenario: Verify the display dropdown on material SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
Then all the three options are displayed in display dropdown

@MAT-19470 @Regression
Scenario: Verify the message for a single parameter material
When user comes on Navigate WS
And select finishes
And double click on first material
And click on parameters
Then the material contains single parameters message displayed "The Material Display contains a single parameter and cannot be filtered further"

@MAT-19442 @Regression
Scenario: Verify the filter parameters buttons
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on parameters
Then all the three buttons ok, cancel and reset are displayed

@MAT-19442 @Regression
Scenario: Verify user is able to move the selected parameters to available parameters
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on parameters
And move test temprature option from selected parameters to available parameters
And move test type option from selected parameters to available parameters
And move time option from selected parameters to available parameters
Then the available parameter is displayed in test temprature dropdown
And the available parameter is displayed in test type dropdown
And the available parameter is displayed in time dropdown

@MAT-19442 @Regression
Scenario: Verify the changes in parameters are applied to material SOD
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on parameters
And move test temprature option from selected parameters to available parameters
And move test type option from selected parameters to available parameters
And move time option from selected parameters to available parameters
And click ok on filter parameter
And verify filter applied to parameters is displayed on material SOD

@MAT-19351 @Regression
Scenario: verify the Property Set filter and Material SOD when some or no property sets that are specified in the property set filter 
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on property set
And unselect all properties on property filter
Then the no property selected message displayed "The material does not contain any selected property sets.  Select property sets to show from the Property Set filter button"


@MAT-19498 @Regression
Scenario: verify the Property Set filter and Material SOD when some or no property sets that are specified in the property set filter 
When user comes on Navigate WS
And user expands metals
And user expands ferrous metals
And user expands alloy steels under ferrous metals
And user expands ultra high strength
And select D-sixA Alloy Steel metal under ultra high strength
And double click on first material
And click on property set
And uncheck assembly property from filter
Then assembly properties are not displayed on material SOD page
