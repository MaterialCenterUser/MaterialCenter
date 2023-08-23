package com.wiz.materialCenter.testRunner;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
/*@ExtendedCucumberOptions(
		jsonReport = "target/cucumber.json",
        detailedReport = true,
        detailedAggregatedReport = true,
        toPDF = true,
        outputFolder = "target/LoginReport/ExtendedReport")*/

@CucumberOptions(
		features = "Features/CopyAnalysisResults/MAT-13801_AddCopyAnalysisResultPropertiesToMaterial.feature",
		tags="@Regression",
		glue= {"com/wiz/materialCenter/stepDefinition"},
		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json", 
				"html:target/cucumber-reports/feature-overview",
				"junit:target/cucumber-reports/cucumber.xml",
				"usage:target/cucumber-reports/addCopyAnResults.json"},
		monochrome = true
		)
public class AddCopyAnalysisResults {

}
