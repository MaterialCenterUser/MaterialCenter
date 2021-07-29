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
  "name": "Check if Manage Process UI can be launched on Material MOD",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MAT-21744"
    },
    {
      "name": "@Regression1"
    }
  ]
});
formatter.step({
  "name": "user comes on search WS",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDef.user_is_on_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on material from search page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDef.user_click_on_material_from_search_page()"
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
  "name": "Click on rows per page",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.Click_on_rows_per_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on three",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.click_on_three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select first material",
  "keyword": "And "
});
formatter.match({
  "location": "EnhancementsInMatSODandMODStepDef.click_on_material()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on edit",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_Edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on manage process from edit menu on search results MOD",
  "keyword": "And "
});
formatter.match({
  "location": "ProcessManagementStepDef.click_on_manage_process_from_edit_menu_on_search_results_MOD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "manage process page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ProcessManagementStepDef.manage_process_page_is_displayed()"
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
  "name": "Check if Manage Process UI can be launched from Material SOD",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MAT-21744"
    },
    {
      "name": "@Regression1"
    }
  ]
});
formatter.step({
  "name": "user comes on search WS",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDef.user_is_on_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on material from search page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDef.user_click_on_material_from_search_page()"
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
  "name": "Click on rows per page",
  "keyword": "And "
});
formatter.match({
  "location": "UIPerformanceStepDef.Click_on_rows_per_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on three",
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
  "name": "manage process page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ProcessManagementStepDef.manage_process_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});