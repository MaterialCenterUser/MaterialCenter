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
		features = "Features/MC2021_2GeneralImrovements/MAT-14299_Filter_On_Multiple_Criteria's_On_SameMOD_Column.feature",
		tags={"@Regression"},
		glue= {"com/wiz/materialCenter/stepDefinition"},
		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json", 
				"html:target/cucumber-reports/feature-overview",
				"junit:target/cucumber-reports/cucumber.xml",
				"usage:target/cucumber-reports/filterOnMODColumn.json"},
		monochrome = true
		)

public class FilterOnMODColumn {

}
