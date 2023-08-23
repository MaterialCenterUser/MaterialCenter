package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;


public class ManageLayupPage extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));

	public ManageLayupPage() {
		PageFactory.initElements(driver, this);
	}

	/* Xpaths manageLayup page */

	@FindBy(xpath = "//span[text()='Manage Layup']")
	WebElement textManageLayup;

	@FindBy(xpath = "//span[@id='myWorkspaceActionDialog-f:ManageLayup:assemblyName_fixedInputlabelWidget']")
	WebElement textName;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:ManageLayup:matDataTypeDropDown_orDd']")
	WebElement materialDataTypeDropdown;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:ManageLayup:matDataTypeDropDown_orDd']/option[@value='Material']")
	WebElement MatDataTypeDropdownMatOption;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:ManageLayup:matDataTypeDropDown_orDd']/option[@value='Metals']")
	WebElement MatDataTypeDropdownMetalsOption;

	@FindBy(xpath = "//select[@id='myWorkspaceActionDialog-f:ManageLayup:matDataTypeDropDown_orDd']/option[@value='Composites']")
	WebElement MatDataTypeDropdownCompOption;

	@FindBy(xpath = "//div[@class='RecentObjectsSelection']/img")
	WebElement matDataDropdownImage;

	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr/td/span[contains(text(),'Composites')])[1]")
	WebElement firstEleFromMatDataDropdownForComposites;

	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr/td/span[contains(text(),'Composites')])[2]")
	WebElement secondEleFromMatDataDropdownForComposites;

	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr/td/span[contains(text(),'Metals')])[1]")
	WebElement firstEleFromMatDataDropdownForMetals;

	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr/td/span[contains(text(),'Metals')])[2]")
	WebElement secondEleFromMatDataDropdownForMetals;

	@FindBy(xpath = "(//table[@class='RecentObjSelTbl']/tbody/tr/td/span[contains(text(),'Ceramics')])[1]")
	WebElement secondEleFromMatDataDropdownForCeramics;
	
	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageLayup:materialOneRef_slt']")
	WebElement matDataSelectButton;

	@FindBy(xpath = "//span[@id='materialOneRef_osDlg_ttl']")
	WebElement textMaterialOnMatDataWindow;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageLayup:materialOneRef_clr' and @disabled='disabled']")
	WebElement disabledClearButton;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageLayup:materialOneRef_clr' and @value='Clear']")
	WebElement enabledClearButton;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageLayup:materialOneRef_orTxt' and @value='']")
	WebElement removeMatDataSelectionDisabledTextbox;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageLayup:componentMaterialSelectButton' and @value='Add Material Data']")
	WebElement addMatDataButton;

	@FindBy(xpath = "(//input[contains(@id,'removeMaterial')])[1]")
	WebElement firstRemoveMatButton;

	@FindBy(xpath = "(//span[contains(@id,'materialType')])[2]")
	WebElement firstMatDataTypeEntryInTable;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageLayup:updateStackingButton' and @value='Update']")
	WebElement updateStackingButton;

	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageLayup:stackingFormula']")
	WebElement stackFormulaTextbox;

	@FindBy(xpath = "//span[@class='rf-msg-det']")
	WebElement stackErrorMessage;
	@FindBy(xpath = "(//input[contains(@id,'ManageLayup:removePlyButton')])[1]")
	WebElement firstRemovePlyButton;

	@FindBy(xpath = "(//input[contains(@id,'ManageLayup:removePlyButton')])[2]")
	WebElement secondRemovePlyButton;

	@FindBy(xpath = "(//input[contains(@id,'ManageLayup:removePlyButton')])[3]")
	WebElement thirdRemovePlyButton;

	@FindBy(xpath = "(//input[contains(@id,'ManageLayup:removePlyButton')])[4]")
	WebElement forthRemovePlyButton;
	
	@FindBy(xpath = "(//input[contains(@id,'ManageLayup:removePlyButton')])[5]")
	WebElement fifthRemovePlyButton;
	
	@FindBy(xpath = "(//input[contains(@id,'ManageLayup:removePlyButton')])[6]")
	WebElement sixRemovePlyButton;

	@FindBy(xpath = "(//span[contains(@id,'ManageLayup:orientation')])[1]")
	WebElement firstOrieantationInPlyTable;

	@FindBy(xpath = "(//span[contains(@id,'ManageLayup:orientation')])[2]")
	WebElement secondOrieantationInPlyTable;

	@FindBy(xpath = "(//span[contains(@id,'ManageLayup:orientation')])[3]")
	WebElement thirdOrieantationInPlyTable;

	@FindBy(xpath = "(//span[contains(@id,'ManageLayup:orientation')])[4]")
	WebElement forthOrieantationInPlyTable;

	@FindBy(xpath = "(//span[contains(@id,'ManageLayup:orientation')])[5]")
	WebElement fifthOrieantationInPlyTable;

	@FindBy(xpath = "(//span[contains(@id,'ManageLayup:orientation')])[6]")
	WebElement sixthOrieantationInPlyTable;

	@FindBy(xpath = "(//select[contains(@id,'ManageLayup:componentMaterial')])[1]/option")
	WebElement firstMatDataOptionInPlyTable;
	
	@FindBy(xpath = "(//select[contains(@id,'ManageLayup:componentMaterial')])[1]")
	WebElement firstMatDataSelectBoxInPlyTable;
	
	@FindBy(xpath = "(//select[contains(@id,'ManageLayup:componentMaterial')])[1]/option[contains(text(),'Composites')]")
	WebElement firstMatDataEntrySelectInPlyTableComposites;
	
	@FindBy(xpath = "(//select[contains(@id,'ManageLayup:componentMaterial')])[1]/option[contains(text(),'Metals')]")
	WebElement firstMatDataEntrySelectInPlyTableMetals;
	
	@FindBy(xpath = "//input[@id='myWorkspaceActionDialog-f:ManageLayup:submitBtn' and @value='Submit']")
	WebElement submitLayupButton;
	
	public MaterialSOD clickOnSubmitLauypButton(){
		
		js.executeScript("arguments[0].click();", submitLayupButton);
		
		return new MaterialSOD();
	}
	
	public boolean firstMatDataEntrySelectInPlyTableCompositesDisplayed() {

		return (firstMatDataEntrySelectInPlyTableComposites.isDisplayed());
	}
	public boolean firstMatDataEntrySelectInPlyTableMetalsDisplayed() {

		return (firstMatDataEntrySelectInPlyTableMetals.isDisplayed());
	}
	public void clickOnFirstMatDataSelectBoxFromPlyTable(){
		js.executeScript("arguments[0].click();", firstMatDataSelectBoxInPlyTable);
	}
	
	public boolean matIsRemovedFromPlyTable() {
		try {
			if (firstMatDataOptionInPlyTable.isDisplayed())
				;

		} catch (Throwable e) {
			return false;
		}
		return false;

	}
	
	public boolean matIsRemovedFromMatDataTable() {
		try {
			if (firstMatDataTypeEntryInTable.isDisplayed())
				;

		} catch (Throwable e) {
			return false;
		}
		return false;

	}
	public void clickOnFirstRemoveMatButton(){
		js.executeScript("arguments[0].click();", firstRemoveMatButton);
	
	}
	public String getfirstOrienataioninPlyTable() {

		return (firstOrieantationInPlyTable.getText());
	}
	public String getfourthOrienataioninPlyTable() {

		return (forthOrieantationInPlyTable.getText());
	}

	public String getfifthOrienataioninPlyTable() {

		return (fifthOrieantationInPlyTable.getText());
	}

	public String getsixthOrienataioninPlyTable() {

		return (sixthOrieantationInPlyTable.getText());
	}

	public String getSecondOrienataioninPlyTable() {

		return (secondOrieantationInPlyTable.getText());
	}

	public String getThirdOrienataioninPlyTable() {

		return (thirdOrieantationInPlyTable.getText());
	}

	public boolean firstPlyIsRemoved() {
		try {
			if (firstRemovePlyButton.isDisplayed())
				;

		} catch (Throwable e) {
			return false;
		}
		return false;

	}

	public void clickOnFirstRemovePlyButton() throws InterruptedException {
		js.executeScript("arguments[0].click();", firstRemovePlyButton);
		//Thread.sleep(1000);
	}

	public void clickOnSecondRemovePlyButton() {
		js.executeScript("arguments[0].click();", secondRemovePlyButton);
	}
	
	public void clickOnThirdRemovePlyButton() {
		js.executeScript("arguments[0].click();", thirdRemovePlyButton);
	}
	public void clickOnFourthRemovePlyButton() {
		js.executeScript("arguments[0].click();", forthRemovePlyButton);
	}
	public void clickOnFifthRemovePlyButton() {
		js.executeScript("arguments[0].click();", fifthRemovePlyButton);
	}
	public void clickOnSixthRemovePlyButton() {
		js.executeScript("arguments[0].click();", sixRemovePlyButton);
	}
	
	public String getOrienationForOneply() {

		return (firstOrieantationInPlyTable.getText());
	}
	public String getStackFormula() {

		return (stackFormulaTextbox.getAttribute("value"));
	}
	

	public boolean onePlyisAdded() {

		return (firstRemovePlyButton.isDisplayed());
	}

	public String verifyInvalidStackErrorMessage() {

		return (stackErrorMessage.getText());
	}

	public void clickOnUpdateButton() {
		js.executeScript("arguments[0].click();", updateStackingButton);
	}

	public boolean firstRemoveButtonDisplayed() {

		return (firstRemoveMatButton.isDisplayed());
	}

	public void selectFirstRowFromMatDataDropdownForComp() {
		js.executeScript("arguments[0].click();", firstEleFromMatDataDropdownForComposites);
	}

	public void selectFirstRowFromMatDataDropdownforMetals() {
		js.executeScript("arguments[0].click();", firstEleFromMatDataDropdownForMetals);
	}
	public void selectSecondRowFromMatDataDropdownforCeramics() {
		js.executeScript("arguments[0].click();", secondEleFromMatDataDropdownForCeramics);
	}
	
	public boolean matDataSelectionRemovedAfterClickOnClearButton() {

		return (removeMatDataSelectionDisabledTextbox.isDisplayed());

	}

	public void clickOnClearButton() {
		js.executeScript("arguments[0].click();", enabledClearButton);
	}

	public void clickOnAddMatDataButton() {
		js.executeScript("arguments[0].click();", addMatDataButton);
	}

	public boolean clearButtonDisabledInitially() {

		return (disabledClearButton.isDisplayed());

	}

	public boolean clearButtonEnabledAfterMatDataSelection() {

		return (enabledClearButton.isDisplayed());

	}

	public boolean manageLayupPageDisplayed() {

		return (textManageLayup.isDisplayed());
	}

	public boolean verifyNamePopulatedDisplayed() {

		return (textName.isDisplayed());
	}

	public void clickOnMatDataTypeDropdown() {
		action.moveToElement(materialDataTypeDropdown).build().perform();
		action.click(materialDataTypeDropdown).build().perform();
	}

	public String MatDataTypeGetSeventhOption() {

		return (MatDataTypeDropdownMatOption.getText());
	}

	public String MatDataTypeGetSecondOption() {

		return (MatDataTypeDropdownCompOption.getText());
	}

	public String getMatDataTypeFromMatTable() {

		return (firstMatDataTypeEntryInTable.getText());
	}

	public String matDataTypeGetninthOption() {

		return (MatDataTypeDropdownMetalsOption.getText());
	}

	public void selectCompositesFromMatDataTypeDropdown() {

		Select select = new Select(materialDataTypeDropdown);
		select.selectByIndex(1);
	}

	public void clickMatDataDropdownImage() {

		action.moveToElement(matDataDropdownImage).build().perform();
		action.click(matDataDropdownImage).build().perform();
	}

	public boolean verifyCompositesComponentsDisplayed() {

		return (secondEleFromMatDataDropdownForComposites.isDisplayed());
	}

	public void selectMetalsFromMatDataTypeDropdown() {

		Select select = new Select(materialDataTypeDropdown);
		select.selectByIndex(8);
	}

	public boolean verifyMetalsComponentsDisplayed() {

		return (secondEleFromMatDataDropdownForMetals.isDisplayed());
	}

	public void clickOnSelectButton() {

		js.executeScript("arguments[0].click();", matDataSelectButton);
		wait.until(ExpectedConditions.visibilityOf(textMaterialOnMatDataWindow));
	}

	public boolean materialsDataSelectionWindowDisplayed() {
		return (textMaterialOnMatDataWindow.isDisplayed());
	}

	public void enterStackingFormula(String stackFormula) {
		stackFormulaTextbox.sendKeys(stackFormula);
		// wait.until(ExpectedConditions.textToBePresentInElement(easySearch,
		// textToSearch));
	}

}
