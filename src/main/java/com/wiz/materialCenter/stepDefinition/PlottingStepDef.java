package com.wiz.materialCenter.stepDefinition;

import org.junit.Assert;

import com.wiz.materialCenter.pages.MaterialMOD;
import com.wiz.materialCenter.pages.MaterialSOD;
import com.wiz.materialCenter.pages.PlotProcessInput;
import com.wiz.materialCenter.pages.SearchPage;
import com.wiz.materialCenter.util.TestBase;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class PlottingStepDef extends TestBase {
	
	MaterialMOD materialMod = new MaterialMOD();
	MaterialSOD matSod = new MaterialSOD();
	PlotProcessInput plotProcessInput = new PlotProcessInput();
	SearchPage search = new SearchPage();
	
	@When("click on arrow button")
	public void click_on_arrow_button() {
		materialMod.clickOnArrow();
		screenshot(driver, System.currentTimeMillis());
	}

	@When("click on select page option")
	public void click_on_select_page_option() {
	    materialMod.clickOnSelectPage();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("click on select page option for rows100 or more")
	public void click_on_select_page_option_more() throws InterruptedException {
	    materialMod.clickOnSelectPageForMoreRows();
	    screenshot(driver, System.currentTimeMillis());
	}
	

	@When("click on plot action")
	public void click_on_plot_action() {
	    materialMod.clickOnPlotAction();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select plot type as Bar chart")
	public void select_plot_type_as_Bar_chart() {
		//plotProcessInput.clickOnPlotType();
	    plotProcessInput.clickOnBarChartType();
	    screenshot(driver, System.currentTimeMillis());
	}
	@When("click on bar chart")
	public void click_on_bar_chart() throws InterruptedException {
		//plotProcessInput.clickOnPlotType();
		materialMod.clickOnBarChart();
	    screenshot(driver, System.currentTimeMillis());
	}
	@Then("bar chart option is disabled")
	public void bar_chart_option_is_disabled() {
		//plotProcessInput.clickOnPlotType();
		Assert.assertTrue(materialMod.verifyBarChartDisabled());
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("bar chart option is enabled")
	public void bar_chart_option_is_enabled() {
		//plotProcessInput.clickOnPlotType();
		Assert.assertTrue(materialMod.verifyBarChartEnabled());
	    screenshot(driver, System.currentTimeMillis());
	}
	
	
	@Then("bar chart page is displayed")
	public void bar_chart_page_is_displayed() {
		//plotProcessInput.clickOnPlotType();
		Assert.assertTrue(plotProcessInput.barChartDisplayed());
	    screenshot(driver, System.currentTimeMillis());
	}
	

	@When("select multiple Y values")
	public void select_multiple_Y_values() {
	   plotProcessInput.selectMultipleValues();
	   screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("bar chart page with plot button is displayed")
	public void bar_chart_page_with_plot_button_is_displayed() {
	   plotProcessInput.barChartWithDisabledPlotButtonDisplayed();
	   screenshot(driver, System.currentTimeMillis());
	}
	
	
	@When("select two Y values")
	public void select_two_Y_values() {
	   plotProcessInput.selectTwoYValues();
	   screenshot(driver, System.currentTimeMillis());
	}

	@When("click on plot button")
	public void click_on_plot_button() {
	   plotProcessInput.clickOnPlotButton();
	   screenshot(driver, System.currentTimeMillis());
	}

	@Then("plot should be done successfully")
	public void plot_should_be_done_successfully() {
	   plotProcessInput.plottingResult();
	   screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify the plotted bar chart values by navigating to material SOD from plot")
	public void verify_the_plotted_bar_chart_values_by_navigating_to_material_SOD_from_plot() {
	   plotProcessInput.clickOnBarChartPlotResult();
	  // matSod.verifyBarChartPlottingValues();
	   screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify the plotted scatter plot values by navigating to material SOD from plot")
	public void verify_the_plotted_scatter_plot_values_by_navigating_to_material_SOD_from_plot() {
	   plotProcessInput.clickOnScatterPlotResult();
	   matSod.verifyScatterPlottingValuesUI();
	   screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify the plotted pie chart values by navigating to material SOD from plot")
	public void verify_the_plotted_pie_chart_values_by_navigating_to_material_SOD_from_plot() {
		plotProcessInput.clickOnScatterPlotResult();
		matSod.verifyPieChartPlottingValues();
	   screenshot(driver, System.currentTimeMillis());
	}
	
	@Then("verify the plotted spider plot values by navigating to material SOD from plot")
	public void verify_the_plotted_spider_plot_values_by_navigating_to_material_SOD_from_plot() {
		plotProcessInput.clickOnBarChartPlotResult();
		
	   screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select plot type as Scatter plot")
	public void select_plot_type_as_Scatter_plot() {
	    plotProcessInput.clickOnScatterPlot();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select Density as X values")
	public void select_Density_as_X_values() {
	    plotProcessInput.clickOnDensity();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select Ultimate Strength as Y values")
	public void select_Ultimate_Strength_as_Y_values() {
	    plotProcessInput.clickOnUltimateStrength();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select plot type as Pie chart")
	public void select_plot_type_as_Pie_chart() {
	    plotProcessInput.selectPieChart();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select Density as Y values")
	public void select_Density_as_Y_values() {
	    plotProcessInput.selectYvalueDensity();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select plot type as Spider plot")
	public void select_plot_type_as_Spider_plot() {
	    plotProcessInput.clickOnSpiderPlot();
	    screenshot(driver, System.currentTimeMillis());
	}

	@When("select four params as Y values")
	public void select_four_params_as_Y_values() {
	    plotProcessInput.spiderPlotYValuesFord();
	    screenshot(driver, System.currentTimeMillis());
	}
	
	@When("select test temperature from filters")
	public void select_test_temperature_from_filters() {
	    plotProcessInput.selectFilter();
	    screenshot(driver, System.currentTimeMillis());
	}

	@Given("user gives text to search in materials for plot")
	public void user_gives_text_to_search_in_materials_and_plot_the_graph() {
	    search.enterTextSearchForPlot();
	    screenshot(driver, System.currentTimeMillis());
	}
}
