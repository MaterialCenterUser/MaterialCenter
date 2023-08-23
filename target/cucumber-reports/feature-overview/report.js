$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/MC2022_3_MAT-15457ApprovalRequestImprovements/MAT-15664_Approval_Request_Delegate_Approver_Logic.feature");
formatter.feature({
  "name": "MAT-15664 - Delegate Approver Logic",
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
  "name": "Create approval list1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression1"
    }
  ]
});
formatter.step({
  "name": "user clicks on Config WS",
  "keyword": "When "
});
formatter.match({
  "location": "CAEModelStepDef.user_clicks_on_Config_WS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on approver lists link",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_approver_lists_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on create approver list link",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_create_approver_list_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select system project from approval list project dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.select_system_project_approvalList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter name for new approver list",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.enter_name_for_new_approver_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on users button to select approver list",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_users_button_to_select_approvar_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on select button to select mandatory approvers",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_select_button_to_select_mandatory_approvers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select smroot user as approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.select_smroot_user_as_approver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok button for mandatory approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_for_mandatory_approver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok button to select approvers",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_to_select_approvers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on plus button against step1",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalReqExecuteStepsParallelStepDef.click_on_plus_button_against_step1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on users button to select approver list against step2",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_users_button_to_select_approvar_list_step2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on select button to select mandatory approvers",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_select_button_to_select_mandatory_approvers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select manager user as approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.select_manager_user_as_approver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok button for mandatory approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_for_mandatory_approver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok button to select approvers Step2",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_to_select_approvers_Step2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on plus button against step2",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalReqExecuteStepsParallelStepDef.click_on_plus_button_against_step2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on users button to select approver list against step3",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_users_button_to_select_approvar_list_step3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on select button to select mandatory approvers",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_select_button_to_select_mandatory_approvers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select SimMan user as approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.select_SimMan_user_as_approver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok button for mandatory approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_for_mandatory_approver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on ok button to select approvers Step3",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_to_select_approvers_Step3()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: (//select[contains(@id,\\\"materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\\\")]/option[@value\u003d\u00270\u0027])[3] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.wiz.materialCenter.pages.ConfigurationWS.clickOkOnSelectApproversDialogStep3(ConfigurationWS.java:867)\r\n\tat com.wiz.materialCenter.stepDefinition.ApprovalListRequestStepDef.click_on_ok_button_to_select_approvers_Step3(ApprovalListRequestStepDef.java:835)\r\n\tat ✽.click on ok button to select approvers Step3(file:Features/MC2022_3_MAT-15457ApprovalRequestImprovements/MAT-15664_Approval_Request_Delegate_Approver_Logic.feature:34)\r\nCaused by: org.openqa.selenium.InvalidSelectorException: Given xpath expression \"(//select[contains(@id,\\\"materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\\\")]/option[@value\u003d\u00270\u0027])[3]\" is invalid: SyntaxError: Document.evaluate: The expression is not a legal expression\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027IND-MTWIN01\u0027, ip: \u0027169.254.235.129\u0027, os.name: \u0027Windows Server 2016\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_242\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 116.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20230805021307, moz:geckodriverVersion: 0.33.0, moz:headless: false, moz:platformVersion: 10.0, moz:processID: 3808, moz:profile: C:\\Users\\VIBHAV~1.PAT\\AppDa..., moz:shutdownTimeout: 60000, moz:webdriverClick: true, moz:windowless: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 38d1cfb2-32ee-4a5f-8a4f-cfd2b83c5fe1\n*** Element info: {Using\u003dxpath, value\u003d(//select[contains(@id,\\\"materialsActionDialog-f:CreateApproverListSimActivity:OptionalUserDropdown\\\")]/option[@value\u003d\u00270\u0027])[3]}\r\n\tat sun.reflect.GeneratedConstructorAccessor20.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat com.wiz.materialCenter.pages.ConfigurationWS.clickOkOnSelectApproversDialogStep3(ConfigurationWS.java:867)\r\n\tat com.wiz.materialCenter.stepDefinition.ApprovalListRequestStepDef.click_on_ok_button_to_select_approvers_Step3(ApprovalListRequestStepDef.java:835)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.junit.vintage.engine.execution.RunnerExecutor.execute(RunnerExecutor.java:39)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Iterator.forEachRemaining(Iterator.java:116)\r\n\tat java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)\r\n\tat org.junit.vintage.engine.VintageTestEngine.executeAllChildren(VintageTestEngine.java:79)\r\n\tat org.junit.vintage.engine.VintageTestEngine.execute(VintageTestEngine.java:70)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)\r\n\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)\r\n\tat org.eclipse.jdt.internal.junit5.runner.JUnit5TestReference.run(JUnit5TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on plus button against step3",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalReqExecuteStepsParallelStepDef.click_on_plus_button_against_step3()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on users button to select approver list against step4",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_users_button_to_select_approvar_list_step4()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on select button to select mandatory approvers",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_select_button_to_select_mandatory_approvers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select matadmin user as approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.select_matadmin_user_as_approver()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ok button for mandatory approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_for_mandatory_approver()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on select button to select optional approvers",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_select_button_to_select_optional_approvers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select dataowner user as approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.select_dataowner_user_as_approver()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ok button for optional approver",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_for_optional_approver()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ok button to select approvers Step4",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_ok_button_to_select_approvers_Step4()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter urgency threshold days",
  "keyword": "And "
});
formatter.match({
  "location": "DelegateApproversStepDef.enter_urgency_threshold_days()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on submit button to create approver list",
  "keyword": "And "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.click_on_submit_button_to_create_approver_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "approver list is created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ApprovalListRequestStepDef.approver_list_is_created_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Please look below for failed step screenshot:");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});