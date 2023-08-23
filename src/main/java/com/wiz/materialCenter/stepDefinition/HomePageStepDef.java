package com.wiz.materialCenter.stepDefinition;

import java.util.List;
import java.util.Map;

import com.wiz.materialCenter.pages.HomePage;
import com.wiz.materialCenter.pages.LoginPage;
import com.wiz.materialCenter.util.TestBase;

import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class HomePageStepDef extends TestBase {
	HomePage homePage;
	LoginPage loginPage;

	@Given("user has already logged in to Material Center application")
	public void user_has_already_logged_in_to_Material_Center_application(DataTable userTable) throws InterruptedException {
		TestBase.initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		List<Map<String, String>> userList = userTable.asMaps();
		String userName = userList.get(0).get("username");
		String password = userList.get(0).get("password");
		loginPage.login(userName, password);
		//homePage = loginPage.login(userName, password);
		//Thread.sleep(20000);
		try {
			Thread.sleep(5000);
			homePage.closeDisclaimer();
		} catch (Exception e) {
			System.out.println("Disclaimer popup didn't come");
		}
		Thread.sleep(1000);
		screenshot(driver, System.currentTimeMillis());
	}
	
	
	/*
	 * @And("close the disclaimer") public void close_the_disclaimer() throws
	 * InterruptedException {
	 * 
	 * try { //Thread.sleep(5000); homePage.closeDisclaimer(); } catch (Exception e)
	 * { System.out.println("Disclaimer popup didn't come"); } Thread.sleep(1000);
	 * screenshot(driver, System.currentTimeMillis()); }
	 */
	
	@Given("log in to Material Center application")
	public void log_in_to_Material_Center_application(DataTable userTable) throws InterruptedException {
		//TestBase.launchUrl();
		loginPage = new LoginPage();
		homePage  = new HomePage();
		List<Map<String, String>> userList = userTable.asMaps();
		String userName = userList.get(0).get("username");
		String password = userList.get(0).get("password");
		loginPage.login(userName, password);
		//homePage = loginPage.login(userName, password);
		try {
			homePage.closeDisclaimer();
		} catch (Exception e) {
			System.out.println("Disclaimer popup didn't come");
		}
		screenshot(driver, System.currentTimeMillis());
	}
}
