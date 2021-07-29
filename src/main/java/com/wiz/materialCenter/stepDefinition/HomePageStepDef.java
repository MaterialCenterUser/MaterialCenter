package com.wiz.materialCenter.stepDefinition;

import java.util.List;
import java.util.Map;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.LoginPage;
import com.wiz.materialCenter.util.TestBase;

import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Given;


public class HomePageStepDef extends TestBase {
	HomePage homePage;
	LoginPage loginPage;

	@Given("user has already logged in to Material Center application")
	public void user_has_already_logged_in_to_Material_Center_application(DataTable credTable) throws InterruptedException {
		TestBase.initialization();
		loginPage = new LoginPage();
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		homePage = loginPage.login(userName, password);
		try {
			homePage.closeDisclaimer();
		} catch (Exception e) {
			System.out.println("Disclaimer popup didn't come");
		}
		Thread.sleep(1000);
		screenshot(driver, System.currentTimeMillis());
	}
	@Given("log in to Material Center application")
	public void log_in_to_Material_Center_application(DataTable credTable) {
		//TestBase.launchUrl();
		loginPage = new LoginPage();
		//HomePage homePage = new HomePage();
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		homePage = loginPage.login(userName, password);
		try {
			homePage.closeDisclaimer();
		} catch (Exception e) {
			System.out.println("Disclaimer popup didn't come");
		}
		screenshot(driver, System.currentTimeMillis());
	}
}
