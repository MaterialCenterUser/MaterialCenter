package com.wiz.materialCenter.testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*@ExtendedCucumberOptions(
		jsonReport = "target/cucumber.json",
        detailedReport = true,
        detailedAggregatedReport = true,
        toPDF = true,
        outputFolder = "target/LoginReport/ExtendedReport")*/

@CucumberOptions(
		features = "Features/MC2021_2GeneralImrovements/MAT-14161_Not_Able_To_Save Enterprise_View_as_Default_View.feature",
		tags={"@Regression"},
		glue= {"com/wiz/materialCenter/stepDefinition"},
		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json", 
				"html:target/cucumber-reports/feature-overview",
				"junit:target/cucumber-reports/cucumber.xml",
				"usage:target/cucumber-reports/view.json"},
		monochrome = true
		)

public class EnterPriseandDefaultView {

}
