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
		features = "Features/SecurityDemote.feature",
		tags={"@Demote"},
		glue= {"com/wiz/materialCenter/stepDefinition"},
		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json", 
				"html:target/cucumber-reports/feature-overview",
				"junit:target/cucumber-reports/cucumber.xml",
				"usage:target/cucumber-reports/demote.json"},
		monochrome = true
		)
public class Test4_Demote { 
	
	/*@BeforeClass
	public static void reportsetup() {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	}*/
	
}