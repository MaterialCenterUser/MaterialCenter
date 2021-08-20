$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/ProcessManagement/MAT-13044_ProcessManagement.feature");
formatter.feature({
  "name": "Process Management",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has already logged in to Material Center application",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "smroot",
        "sdm"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDef.user_has_already_logged_in_to_Material_Center_application(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify component dropdown when process type is selected as composites",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MAT-21747"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.step({
  "name": "user selects Materials from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "ProcessManagementStepDef.user_selects_Materials_from_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters searchtext for test data search \"ceramics\"",
  "keyword": "And "
});
formatter.match({
  "location": "WatchFeatureStepDef.user_enters_searchtext_for_test_data_search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button from homepage",
  "keyword": "And "
});
formatter.match({
  "location": "WatchFeatureStepDef.click_on_search_button_from_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "materials search results displayed",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.materials_search_results_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on rows per page",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_rows_per_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on three",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "double click on first result",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.double_click_on_first_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on edit on MatSOD",
  "keyword": "And "
});
formatter.match({
  "location": "EditDeleteStepDef.click_on_edit_on_MatSOD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on manage process from edit menu on SOD",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_manage_process_from_edit_menu_on_SOD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select composites from process type dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.select_composites_from_process_type_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on process dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_process_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all the components listed are displayed as of selected process type composites",
  "keyword": "Then "
});
formatter.match({
  "location": "ProcessManagementStepDef.all_the_components_listed_are_displayed_as_of_selected_process_type_composites()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has already logged in to Material Center application",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "smroot",
        "sdm"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDef.user_has_already_logged_in_to_Material_Center_application(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check if Process tab is displayed on Material SOD if Material has Process Assembly",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MAT-21770"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.step({
  "name": "user selects Materials from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "ProcessManagementStepDef.user_selects_Materials_from_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters searchtext for test data search \"metals\"",
  "keyword": "And "
});
formatter.match({
  "location": "WatchFeatureStepDef.user_enters_searchtext_for_test_data_search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button from homepage",
  "keyword": "And "
});
formatter.match({
  "location": "WatchFeatureStepDef.click_on_search_button_from_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "materials search results displayed",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.materials_search_results_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on rows per page",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_rows_per_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on three",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "double click on first result",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.double_click_on_first_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on edit on MatSOD",
  "keyword": "And "
});
formatter.match({
  "location": "EditDeleteStepDef.click_on_edit_on_MatSOD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on manage process from edit menu on SOD",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_manage_process_from_edit_menu_on_SOD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select composites from process type dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.select_composites_from_process_type_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on select button displayed against process dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_select_button_displayed_against_process_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on rows per page",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_rows_per_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on three",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "double click on first result",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.double_click_on_first_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter some value in time textbox",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.enter_some_value_in_time_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add button on process page",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_Add_button_on_process_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button on process page",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_Submit_button_on_process_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "process tab is displayed on material SOD page",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.process_tab_is_displayed_on_material_SOD_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has already logged in to Material Center application",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "smroot",
        "sdm"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDef.user_has_already_logged_in_to_Material_Center_application(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check if Discard Manager Process action deletes the created object",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MAT-21755"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.step({
  "name": "user selects Materials from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "ProcessManagementStepDef.user_selects_Materials_from_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters searchtext for test data search \"coatings\"",
  "keyword": "And "
});
formatter.match({
  "location": "WatchFeatureStepDef.user_enters_searchtext_for_test_data_search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button from homepage",
  "keyword": "And "
});
formatter.match({
  "location": "WatchFeatureStepDef.click_on_search_button_from_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "materials search results displayed",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.materials_search_results_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on rows per page",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_rows_per_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on three",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "double click on first result",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.double_click_on_first_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on edit on MatSOD",
  "keyword": "And "
});
formatter.match({
  "location": "EditDeleteStepDef.click_on_edit_on_MatSOD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on manage process from edit menu on SOD",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_manage_process_from_edit_menu_on_SOD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select composites from process type dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.select_composites_from_process_type_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on process dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_process_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select first row from process dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.select_first_row_from_process_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter some value in time textbox",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.enter_some_value_in_time_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add button on process page",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_Add_button_on_process_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button on process page",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_Submit_button_on_process_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to homepage from material SOD page",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.navigate_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on view all processes",
  "keyword": "And "
});
formatter.match({
  "location": "CAEModelStepDef.user_clicks_on_view_all_processes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on rows per page",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_rows_per_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on three",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on manage process link",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_manage_process_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on discard option",
  "keyword": "And "
});
formatter.match({
  "location": "CAEModelStepDef.user_clicks_on_discard_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit button on manage process",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.user_clicks_on_submit_button_on_CAE_model_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on view all processes",
  "keyword": "And "
});
formatter.match({
  "location": "CAEModelStepDef.user_clicks_on_view_all_processes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "discard of manage process is done successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ProcessManagementStepDef.discard_of_manage_process_is_done_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});