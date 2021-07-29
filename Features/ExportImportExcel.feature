Feature: User does export and import to excel action for selected material

@ExportMat @All
Scenario: User export the material into excel
Given user comes on Navigate WS
When user clicks on Metals to open MOD
#And select rows per page as five hundred
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on export to excel
And click on submit button on export to excel popup
Then check that process status is completed

@ExportMatIntoXML @All
Scenario: User export the material into XML
Given user comes on Navigate WS
When user clicks on Metals to open MOD
#And select rows per page as five hundred
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on export menu and select XML option
And select include project and all mat datas checkbox
And click on submit button on export to XML popup
Then check that process status is completed

@ExportMatValidation @All1
Scenario: User export the material into excel
Given user comes on Navigate WS
When user clicks on Metals to open MOD
And select rows per page as hundred
And click on arrow button
And click on select page option
And click on export to excel
And click on submit button on export to excel popup
Then check that process status is completed with download excel link

@ImportExcel @All
Scenario: User uploads material using import excel file link
Given user clicks on Config WS
When user clicks on Import excel file link
And select fixed excel format
#And enter all details and select excel file from system
And select data project
And select excel file to upload
And select master metal schema
And click on submit button to upload the excel
Then check that process status is completed
#Then material through excel file should be uploaded successfully

@ImportExcelValidationFixed @All
Scenario: User uploads material using import excel file link
Given user clicks on Config WS
When user clicks on Import excel file link
And select fixed excel format
#And enter all details and select excel file from system
And select data project
And select excel file to upload
And select master metal schema
And click on submit button to upload the excel
And check that process status is completed
And user comes on Navigate WS
And user clicks on required compliant mat tree to open MOD
And open the material to open SOD
Then verify the details of material on SOD

@ImportExcelValidationMapped @All
Scenario: User uploads material using import excel file link
Given user clicks on Config WS
When user clicks on Import excel file link
#And enter all details and select excel file from system for mapped
And select data project
And select excel file from system for mapped
And select generic mat schema
And click on submit button to upload the excel
And check that process status is completed
And user comes on Navigate WS
And user clicks on required mapped material tree to open MOD
And open the required material to open SOD
Then verify the details of material on SOD for mapped excel

@ExportMatFord @AllFordSpecific
Scenario: User export the material into excel
Given user comes on Navigate WS
And user expands material design data
And select metal option
And double click on material from MOD of ford data
And click on export to excel
And click on submit button on export to excel popup
Then export to excel is done successfully

@ExportTestDataMatFord @AllFordSpecific
Scenario: User export the material test data into excel
Given user gives test data material to search
When sort the material in descending order of revisions
And select the material with max revisions
And click on test data tab and select all test data
And click on export to excel test data
And click on mapping tab
And select schema mapping from dropdown
And click on submit button on export to excel popup
Then check that process status is completed

@ImportTestDataMatFord @AllFordSpecific
Scenario: User import the material test data
Given user gives test data material to search
When sort the material in descending order of revisions
And select the material with max revisions
And click on tools tab and import test data
And choose the file from system to import
And click on submit button of import test data popup
Then check that process status is completed

@ImportExcelFord @All
Scenario: User uploads material using import excel file link
Given user clicks on Config WS
When user clicks on Import excel file link
And select fixed excel format
#And enter all details and select excel file from system
And select data project
And select excel file to upload
And select master metal schema
And click on submit button to upload the excel
And check that process status is completed
And user comes on Navigate WS
And user clicks on required compliant mat tree to open MOD
And open the material to open SOD
Then material through excel file should be uploaded successfully