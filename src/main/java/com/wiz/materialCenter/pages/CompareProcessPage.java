package com.wiz.materialCenter.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class CompareProcessPage extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);

	public CompareProcessPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[contains(@id,'compareOptions')]")
	WebElement comparatorsDropdown;

	@FindBy(xpath = "//option[text()='Property']")
	WebElement comparatorOptionProp;

	@FindBy(xpath = "//option[text()='Curve Property']")
	WebElement comparatorOptionCurveprop;

	@FindBy(xpath = "//img[contains(@class,'Hyperlink')]")
	WebElement curveImg;

	@FindBy(xpath = "//img[@id='math']")
	WebElement calculator;

	@FindBy(xpath = "//input[@value='Interpolate']")
	WebElement interpolate;

	@FindBy(xpath = "//input[@type='text' and @id='1']")
	WebElement xValue;

	@FindBy(xpath = "//input[@value='Compute Y']")
	WebElement computeYvalue;

	@FindBy(xpath = "//span[text()='OK']")
	WebElement calcOkButton;

	@FindBy(xpath = "//img[contains(@onclick,'close')]")
	WebElement curveViewerCloseButton;

	@FindBy(xpath = "//select[@class='CompareActionDropDown']")
	WebElement displayDropdown;

	@FindBy(xpath = "//option[text()='Show Differences Only']")
	WebElement showDiffOnly;

	@FindBy(xpath = "//table[@class='DifferentclassificationTable']/tbody/tr")
	List<WebElement> rowDiffResults;

	// @FindBy(xpath =
	// "//table[@class='DifferentclassificationTable']/tbody/tr/td")
	@FindBy(xpath = "//table[@class='DifferentclassificationTable']")

	List<WebElement> colDiffResults;

	@FindBy(xpath = "//div[text()='Compare Results']")
	WebElement textCompareResults;

	@FindBy(xpath = "//span[text()='Property Set']")
	WebElement propertySet;
	@FindBy(xpath = "//span[text()='Curve Property']")
	WebElement textCurvePropResults;

	public void compareResult() {
		if (textCompareResults.isDisplayed()) {
			System.out.println("Compare results displayed");
		} else {
			System.out.println("Compare results didn't display");
		}
	}

	public void selectPropOption() {
		// action.click(comparatorsDropdown).build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(comparatorOptionProp));
		// action.click(comparatorOptionProp).build().perform();
		Select select = new Select(comparatorsDropdown);

		select.selectByValue("MatCurveFigureProperty;comparews-MatRevisableProperty");
		wait.until(ExpectedConditions.visibilityOf(curveImg));

	}

	public boolean verifyCompareResultsPageDisplayed() {

		return (textCompareResults.isDisplayed());
	}

	public boolean verifyCompareCurvePropResultsPageDisplayed() {

		return (textCurvePropResults.isDisplayed());
	}

	public boolean verifyComparatorsDropdownDisplayed() {

		return (comparatorsDropdown.isDisplayed());
	}

	public boolean verifyPropertySetDisplayed() {

		return (propertySet.isDisplayed());
	}

	public void openPropCurve() {
		js.executeScript("arguments[0].scrollIntoView(true);", curveImg);
		action.click(curveImg).build().perform();
	}

	public void openCalculator() {
		action.moveToElement(calculator).build().perform();
		action.click(calculator).build().perform();
		wait.until(ExpectedConditions.visibilityOf(interpolate));
		action.moveToElement(interpolate).build().perform();
		action.click(interpolate).build().perform();
	}

	public void computeYvalue() {
		xValue.click();
		xValue.clear();
		xValue.sendKeys("0.005");
		action.moveToElement(computeYvalue).build().perform();
		action.click(computeYvalue).build().perform();
	}

	public void closeCurveDialog() {
		action.click(calcOkButton).build().perform();
		action.click(curveViewerCloseButton).build().perform();
	}

	public void displaydiffOnly() {
		/*
		 * action.click(displayDropdown).build().perform();
		 * wait.until(ExpectedConditions.elementToBeClickable(displayDropdown));
		 * action.click(showDiffOnly).build().perform();
		 */

		Select select = new Select(displayDropdown);

		select.selectByValue("Display_Show_Difference");
	}

	public void printAllDiffValues() {
		/*
		 * need to work on this way later int tableRowSize =
		 * rowDiffResults.size(); String diff = diffResults.getText();
		 * System.out.println("Rows :" + tableRowSize); int tableColSize =
		 * colDiffResults.size(); System.out.println("Columns :" +
		 * tableColSize); for(int i=1; i<tableRowSize; i++) { for(int j=1;
		 * j<tableColSize; j++) { } }
		 */
		for (WebElement col : colDiffResults) {
			System.out.println(col.getText());
		}
	}

}
