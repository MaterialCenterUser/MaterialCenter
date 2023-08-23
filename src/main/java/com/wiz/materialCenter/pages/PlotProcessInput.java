package com.wiz.materialCenter.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class PlotProcessInput extends TestBase{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));
	
	public PlotProcessInput() {
		PageFactory.initElements(driver, this);
	}
	
	/*Plot type xpath coverages*/
	
	@FindBy(xpath = "//div[@class='XPlotMenu']/select[@id='plotType']")
	WebElement plotTypeDropDown;
	
	@FindBy(xpath = "//select[@id='plotType']/option[text()='Bar Chart']")
	WebElement barChartType;
	
	@FindBy(xpath = "//select[@id='plotType']/option[text()='Scatter Plot']")
	WebElement scatterPlot;
	
	@FindBy(xpath = "//select[@id='plotType']/option[text()='Pie Chart']")
	WebElement pieChartPlot;
	
	@FindBy(xpath = "//select[@id='plotType']/option[text()='Spider Plot']")
	WebElement spiderPlot;
	
	/*X-Values xpath coverages*/
	
	@FindBy(xpath = "//select[@id='xSel']")
	WebElement xValuesDropDown;
	
	@FindBy(xpath = "//select[@id='xSel']/option[text()='Density']")
	WebElement xValueDensity;
	
	/*Y-Values xpath coverages*/
	
	@FindBy(xpath = "//select[@id='ySel']")
	WebElement yValues;
	
	@FindBy(xpath = "//select[@id='ySel']/option[text()='Maximum Short-Term Material Temperature'] | //select[@id='ySel']/option[text()='Ultimate Strength'] | //select[@id='ySel']/option[text()='Ultimate Tensile Strength'] | //select[@id='ySel']/option[contains(text(),'Shear Ultimate Strength')]")
	WebElement yValueUltimateStrength;
	
	@FindBy(xpath = "//select[@id='ySel']/option[text()='Density']")
	WebElement yValueDensity;
	
	@FindBy(xpath = "//option[text()='[68.0 : 572] °F'] | //option[text()='572 °F'] | //option[text()='300 °C']")
	WebElement tempFilter;
	
	@FindBy(xpath = "//select[@id='ySel']/option[@value='0']")
	WebElement firstYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='1']")
	WebElement secondYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='2']")
	WebElement thirdYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='4']")
	WebElement fifthYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='5']")
	WebElement sixYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='6']")
	WebElement sevenYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='7']")
	WebElement eightYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='8']")
	WebElement nineYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='9']")
	WebElement tenYValue;
	@FindBy(xpath = "//select[@id='ySel']/option[@value='3']")
	WebElement fourthYValue;
	

	@FindBy(xpath = "//area[contains(@title,'Carbon')]")
	WebElement barChartPlotResult;
	@FindBy(xpath = "(//area[@href='ATrKWQ:AIY'])[1]")
	WebElement coords;
	
	@FindBy(xpath = "//area[@shape='poly'][1]")
	WebElement scatterPlotResult;
	
	/*Plot page buttons xpath coverages*/
	
	@FindBy(xpath = "//input[@value='Plot']")
	WebElement plotButton;
	
	@FindBy(xpath = "//input[@value='PNG' and @type='button']")
	WebElement plotResult;
	
	@FindBy(xpath = "//input[@value='PDF' and @type='button']")
	WebElement plotPdf;
	
	/*Compliance status plot xpaths*/
	
	@FindBy(xpath = "//map[@id='map1']")
	WebElement complianceStatusPlot;
	
	@FindBy(xpath = "//area[@shape='poly']")
	List<WebElement> pieChartSections;
	
	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr")
	List<WebElement> materialMod;
	
	@FindBy(xpath = "//h2[text()='Bar Chart   ']")
	WebElement textBarChart;
	
	@FindBy(xpath = "//button[@disabled='']/span[text()=' Plot']")
	WebElement disabledPlotButton;
	
	
public boolean barChartWithDisabledPlotButtonDisplayed(){
		
		return (disabledPlotButton.isDisplayed());
	}
	public boolean barChartDisplayed(){
		
		return (textBarChart.isDisplayed());
	}
	public void clickOnPlotType() {
		action.click(plotTypeDropDown).build().perform();
		//js.executeScript("arguments[0].click();", plotTypeDropDown);
	}
	
	public void clickOnBarChartType() {
		//action.moveToElement(barChartType).build().perform();
		//action.sendKeys(Keys.ENTER).click(barChartType).build().perform();
		//action.click(plotTypeDropDown).build().perform();
		Select select = new Select(plotTypeDropDown);
		
		select.selectByValue("bar");
		//wait.until(ExpectedConditions.elementToBeSelected(yValues));
	}
	
	public void selectPieChart() {
		//action.moveToElement(pieChartPlot).build().perform();
		//action.sendKeys(Keys.ENTER).click(pieChartPlot).build().perform();
		
		Select select = new Select(plotTypeDropDown);
		
		select.selectByValue("pie");
	}
	
	public void clickOnScatterPlot() {
		//action.moveToElement(scatterPlot).build().perform();
		//action.sendKeys(Keys.ENTER).click(scatterPlot).build().perform();
			Select select = new Select(plotTypeDropDown);
		
				select.selectByValue("xy");
				//action.moveToElement().click().perform();
				
		//	wait.until(ExpectedConditions.elementToBeSelected(yValues));
		
	}
	
	public void clickOnSpiderPlot() {
	//	action.moveToElement(spiderPlot).build().perform();
	//	action.sendKeys(Keys.ENTER).click(spiderPlot).build().perform();
		Select select = new Select(plotTypeDropDown);
		
		select.selectByValue("spider");
	
	}
	
	public void clickOnXValuesDropDown() {
		action.click(xValuesDropDown).build().perform();
	}
	
	public void clickOnDensity() {
		
		Select select = new Select(xValuesDropDown);
		
		select.selectByVisibleText("Density");
		//select.selectByValue("6");
		
		//js.executeScript("arguments[0].scrollIntoView(true);", xValueDensity);
		//action.click(xValueDensity).build().perform();
	}
	
	public void clickOnUltimateStrength() {
		
		Select select = new Select(yValues);
		select.selectByVisibleText("Ultimate Strength");
		//select.selectByValue("29");
	//	js.executeScript("arguments[0].scrollIntoView(true);", yValueUltimateStrength);
		//action.click(yValueUltimateStrength).build().perform();
		
		
	}
	
	public void selectYvalueDensity() {
		//js.executeScript("arguments[0].scrollIntoView(true);", yValueDensity);
		//action.click(yValueDensity).build().perform();
		Select select = new Select(yValues);
		
		select.selectByVisibleText("Ultimate Strength");
	}
	
	public void selectMultipleValues() {
		Select select = new Select(yValues);
		select.selectByValue("0");
		select.selectByValue("1");
		select.selectByValue("2");
		select.selectByValue("3");
		select.selectByValue("4");
		select.selectByValue("5");
		select.selectByValue("6");
		select.selectByValue("7");
		select.selectByValue("8");
		select.selectByValue("9");
		select.selectByValue("10");
		select.selectByValue("11");
		
		action.keyDown(Keys.CONTROL).click(firstYValue).click(firstYValue).click(secondYValue).click(thirdYValue).click(fourthYValue).click(fourthYValue).click(fourthYValue).click(fourthYValue).
		click(fifthYValue).click(sixYValue).click(sevenYValue).click(eightYValue).click(nineYValue).click(tenYValue).keyUp(Keys.CONTROL).build().perform();
	}
	
	public void selectTwoYValues() {
		
		Select select = new Select(yValues);
		select.selectByValue("0");
		select.selectByValue("1");
		select.selectByValue("2");
		select.selectByValue("3");
		action.keyDown(Keys.CONTROL).click(firstYValue).click(fourthYValue).keyUp(Keys.CONTROL).build().perform();
	}
	
	public void selectFilter() {
		action.click(tempFilter).build().perform();
	}
	
	public void spiderPlotYValues() {
		Select select = new Select(yValues);
		select.selectByValue("9");
		select.selectByValue("15");
		select.selectByValue("17");
		select.selectByValue("19");
	}
	
	public void spiderPlotYValuesFord() {
		Select select = new Select(yValues);
		select.selectByValue("0");
		select.selectByValue("1");
		select.selectByValue("2");
		select.selectByValue("3");
	}
	
	public void clickOnPlotButton() {
		js.executeScript("arguments[0].click();", plotButton);
	}
	
	public void plottingResult() {
		js.executeScript("arguments[0].click();", plotResult);
		/*Boolean ImagePresent = (Boolean) (js.executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", plotResult));
		if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        } else {
            System.out.println("Image displayed.");
        }*/
	}
	
	public void clickOnBarChartPlotResult() {
		//js.executeScript("arguments[0].click();", barChartPlotResult);
		action.moveToElement(coords).build().perform();
		action.click(coords).build().perform();
		//js.executeScript("arguments[0].click();", coords);
		//action.click(barChartPlotResult).build().perform();
	}
	
	public void clickOnScatterPlotResult() {
		js.executeScript("arguments[0].click();", scatterPlotResult);
	}
	
	public void verifyCompliancePlot() {
		if(complianceStatusPlot.isDisplayed()) {
			System.out.println("Compliance Status pie chart has been displayed");
		} else {
			System.out.println("Compliance Status pie chart has not been displayed");
		}
	}
	
	public void openComplianceStatusSection() {
		//wait.until(ExpectedConditions.visibilityOfAllElements(pieChartSections));
		int count = pieChartSections.size();
		System.out.println("Types of Compliance status displayed are : " + count);
		pieChartSections.get(0).click();
		int count1 = materialMod.size();
		System.out.println("Number of materials displayed on MOD are : " + count1);
	}

	
}
