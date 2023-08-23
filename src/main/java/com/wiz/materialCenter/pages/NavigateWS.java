package com.wiz.materialCenter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.wiz.materialCenter.util.TestBase;

public class NavigateWS extends TestBase {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	
	public NavigateWS() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[contains(@id,'TreeChoice')]")
	WebElement treeSelection;
	
	@FindBy(xpath = "//select[contains(@id,'TreeChoice')]/option[text()='Libraries']")
	WebElement librariesTree;
	
	@FindBy(xpath = "(//span[contains(text(),'materials_selector Library')]//preceding-sibling::img)[1]")
	WebElement matSelectorLibExpand;

	
	@FindBy(xpath = "(//div[@class='NavTree']/ul/li[contains(@id,'Gmg')]/img)[1]")
	WebElement matFordExpand;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='METAL']")
	WebElement metalsFord;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='Metals']")
	WebElement metals;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/span[text()='All Materials']")
	WebElement AllMats;
	
	@FindBy(xpath = "(//span[text()='Metals'])[1]")
	WebElement metalsFromMaterialSelectorLib;
	
	
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='Metals444']")
	WebElement metals444;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='NewMetals1']")
	WebElement newMat1;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='MetalsNonCompliant']")
	WebElement metalsNotCompliant;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/span[text()='Polymers']")
	WebElement polymers;
	
	@FindBy(xpath = "//table[@class='ModBody']")
	WebElement modArea;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/ul/li/span[text()='Ferrous Metals']")
	WebElement ferrousMetals;
	
//	@FindBy(xpath = "(//div[@class='NavTree']/ul/li/ul/li/ul/li[contains(@id,'ZMYBb')]/img)[1]")
	
	@FindBy(xpath = "(//span[contains(text(),'Ferrous Metals')]//preceding-sibling::img)[1]")

	WebElement ferrousExpand;
	
	//@FindBy(xpath = "(//div[@class='NavTree']/ul/li/ul/li/ul/li/ul/li[contains(@id,'fMWe')]/img)[1]")
	@FindBy(xpath = "(//span[contains(text(),'Alloy Steels')]//preceding-sibling::img)[1]")
	WebElement alloySteelsExpand;
	
	@FindBy(xpath = "(//span[text()='Stainless Steels']//preceding-sibling::img)[1]")
	WebElement stainlessSteelsExpand;
	
	@FindBy(xpath = "(//span[text()='Age-Hardenable']//preceding-sibling::img)[1]")
	WebElement ageHardenableExpand;
	
	@FindBy(xpath = "(//span[text()='Specialty']//preceding-sibling::img)[1]")
	WebElement specialityExpand;
	
	@FindBy(xpath = "(//span[text()='Plastics, Thermoplastic']//preceding-sibling::img)[1]")
	WebElement thermoplasticExpand;
	
	@FindBy(xpath = "(//span[contains(text(),'Metals')]//preceding-sibling::img)[1]")
	WebElement metalsExpand;
	
	@FindBy(xpath = "(//span[contains(text(),'Polymers')]//preceding-sibling::img)[1]")
	WebElement polymersExpand;
	
	@FindBy(xpath = "(//span[contains(text(),'Ceramics and Glasses')]//preceding-sibling::img)[1]")
	WebElement ceramicsExpand;
	
	@FindBy(xpath = "(//div[@class='NavTree']/ul/li/ul/li/ul/li[contains(@id,'CrQ')]/img)[1]")
	
	WebElement nonferrousExpand;
	
	@FindBy(xpath = "(//div[@class='NavTree']/ul/li/ul/li/ul/li/ul/li[contains(@id,'QUFwC')]/img)[1]")
	WebElement aluminumExpand;
	
	@FindBy(xpath = "(//span[contains(text(),'Ultra-High Strength')]//preceding-sibling::img)[1]")
	WebElement ultraHighStrength;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/ul/li/ul/li[contains(@id,'QUFwC')]/ul/li/span[text()='Wrought']")
	WebElement wroughtMetal;
	
	@FindBy(xpath = "//div[@class='NavTree']/ul/li/ul/li/ul/li/span[text()='Nonferrous Metals']")
	WebElement nonferrousMetals;
	
	@FindBy(xpath = "//span[text()='Material Design Data']")
	WebElement matDesignData;
	
	
	public void clickOnTreeSelection() {
		action.moveToElement(treeSelection).build().perform();
		action.click(treeSelection).build().perform();
	}
	
	public void selectLibrariesTree() {
		//action.click(librariesTree).build().perform();
		//js.executeScript("arguments[0].click();", librariesTree);
			Select select = new Select(treeSelection);
		
		select.selectByValue("tree.label.libraries");
	}
	
	public void clickOnMetalsExpand() {
		
		//Action seriesactions = action.moveToElement(metalsExpand).click(metalsExpand).build();
		//seriesactions.perform();
		
		try{
			js.executeScript("arguments[0].scrollIntoView(true);", metalsExpand);
		//action.moveToElement(metalsExpand).build().perform();
		//action.click(metalsExpand).build().perform();
			
			js.executeScript("arguments[0].click();", metalsExpand);
		}catch (Exception e) {
			System.out.println("Metals already expanded");
		}
		//js.executeScript("arguments[0].click();", metalsExpand);
	}
	
public void clickOnPolymersExpand() {

		try{

			js.executeScript("arguments[0].click();", polymersExpand);
		}catch (Exception e) {
			System.out.println("Polymers already expanded");
		}
		//js.executeScript("arguments[0].click();", metalsExpand);
	}
	
public void clickOnCeramicsExpand() {

	try{

		js.executeScript("arguments[0].click();", ceramicsExpand);
	}catch (Exception e) {
		System.out.println("ceramics already expanded");
	}
	//js.executeScript("arguments[0].click();", metalsExpand);
}

	
	public void clickOnMatExpand_ford() {
		js.executeScript("arguments[0].click();", matFordExpand);
	}
	
	public MaterialMOD clickOnMetals() {
		js.executeScript("arguments[0].click();", metals);
		if(modArea.isDisplayed()) {
			System.out.println(" Metals MOD displayed");
		} else {
			System.out.println("Metals MOD didn't display");
		}
		return new MaterialMOD();
	}
	
	public MaterialMOD clickOnAllMats() {
		js.executeScript("arguments[0].click();", AllMats);
		if(modArea.isDisplayed()) {
			System.out.println(" Metals MOD displayed");
		} else {
			System.out.println("Metals MOD didn't display");
		}
		return new MaterialMOD();
	}
	
	
	public void clickOnMetalsFromMatSelectorLib() {
		js.executeScript("arguments[0].click();", metalsFromMaterialSelectorLib);
		if(modArea.isDisplayed()) {
			System.out.println(" Metals MOD displayed");
		} else {
			System.out.println("Metals MOD didn't display");
		}
	}
	
	
	
	public void clickOnMetals_Ford() {
		js.executeScript("arguments[0].click();", metalsFord);
		if(modArea.isDisplayed()) {
			System.out.println(" Metals MOD displayed");
		} else {
			System.out.println("Metals MOD didn't display");
		}
	}
	
	public void clickOnFerrousMetals() {
		js.executeScript("arguments[0].click();", ferrousMetals);
	}
	
	public void clickOnNonFerrousMetals() {
		js.executeScript("arguments[0].click();", nonferrousMetals);
		if(modArea.isDisplayed()) {
			System.out.println(" NonFerrous MOD displayed");
		} else {
			System.out.println("NonFerrous MOD didn't display");
		}
	}
	
	public void clickOnFerrousExpand() {
		
		//Action seriesactions = action.moveToElement(ferrousExpand).click(ferrousExpand).build();
		//seriesactions.perform();
		js.executeScript("arguments[0].click();", ferrousExpand);
	}
	
	public void clickOnNonFerrousExpand() {
		js.executeScript("arguments[0].click();", nonferrousExpand);
	}
	
	public void clickOnAluminumExpand() {
		js.executeScript("arguments[0].click();", aluminumExpand);
	}
	
	public void clickOnMatSelExpand() {
		js.executeScript("arguments[0].click();", matSelectorLibExpand);
	}
	
	public void clickOnWroughtMetals() {
		js.executeScript("arguments[0].click();", wroughtMetal);
	}
	
	public void clickOnAlloySteelsExpand() {
		
		//action.moveToElement(alloySteelsExpand).build().perform();
		//action.click(alloySteelsExpand).build().perform();
		js.executeScript("arguments[0].click();", alloySteelsExpand);
	}
	
public void clickOnStainlessSteelsExpand() {
		
		//action.moveToElement(alloySteelsExpand).build().perform();
		//action.click(alloySteelsExpand).build().perform();
		js.executeScript("arguments[0].click();", stainlessSteelsExpand);
	}

public void clickOnAgeHardExpand() {
	
	js.executeScript("arguments[0].click();", ageHardenableExpand);
}

public void clickOnSpecialityExpand() {
	
	js.executeScript("arguments[0].click();", specialityExpand);
}

public void clickOnThermoplasticExpand() {
	
	js.executeScript("arguments[0].click();", thermoplasticExpand);
}

	
	public void clickOnUltraHighStrength() {
		js.executeScript("arguments[0].click();", ultraHighStrength);
	}
	
	public void clickOnPolymers() {
		js.executeScript("arguments[0].click();", polymers);
		if(modArea.isDisplayed()) {
			System.out.println(" Polymers MOD displayed");
		} else {
			System.out.println("Polymers MOD didn't display");
		}
		// need to add code to verify that polymers MOD is open
	}
	
	public void clickOnMatDesignData() {
		action.click(matDesignData).build().perform();
	}
	
	public void coompliantMatTree() {
		action.moveToElement(metals444).build().perform();
		action.click(metals444).build().perform();
	}
	
	public void mappedMatTree() {
		action.moveToElement(newMat1).build().perform();
		action.click(newMat1).build().perform();
	}
	
	public void notCompliantMatTree() {
		action.click(metalsNotCompliant).build().perform();
	}

}
