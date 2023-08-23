package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class MeasureEquationPage extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));
	
	public MeasureEquationPage() {
		PageFactory.initElements(driver, this);
	}

	/* Xpaths for measure equations */

	@FindBy(xpath = "//a[@name='f:w:wm:MaterialsWorkspace:widgetlink_measureEquationLink']")
	WebElement measureEquationsLink;

	@FindBy(xpath = "//a[@name='f:w:wm:MaterialsWorkspace:widgetlink_measureEquationMappingLink']")
	WebElement measureEquationMappingsLink;
}
