package com.wiz.materialCenter.pages;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class EditMatProcess extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));
	MaterialSOD matsod = new MaterialSOD();

	public EditMatProcess() {
		PageFactory.initElements(driver, this);
	}

	public String storeName;
	/* Tabs xpath under edit material option */

	@FindBy(xpath = "//span[text()='Init']")
	WebElement initTab;

	@FindBy(xpath = "//span[text()='Specimen Definition']")
	WebElement speciDefTab;

	@FindBy(xpath = "//span[text()='Test Definition']")
	WebElement testDefTab;

	/*@FindBy(xpath = "//span[text()='Classification']")
	WebElement classificationTab;*/
	@FindBy(xpath = "//td[@data-tabname='classificationTab']")
	WebElement classificationTab;
	
	@FindBy(xpath = "//span[text()='MaterialCenter Attribute']")
	WebElement textMatAttribute;

	@FindBy(xpath = "//span[text()='Sources']")
	WebElement sourcesTab;

	@FindBy(xpath = "//span[text()='Parameters']")
	WebElement parametersTab;

	@FindBy(xpath = "//span[text()='Footnotes']")
	WebElement footnotesTab;

	@FindBy(xpath = "//span[text()='Properties']")
	WebElement propertiesTab;

	@FindBy(xpath = "//input[@value='Add Properties']")
	WebElement addPropertiesButton;
	@FindBy(xpath = "//select[@class='available']")
	WebElement selectToAddProperty;
	@FindBy(xpath = "//img[@class='right']")
	WebElement clickRightButton;

	@FindBy(xpath = "(//td[@class='MatEditorTableOddRow']//select)[2]")
	WebElement selectParameterSet;

	@FindBy(xpath = "//input[@name='AddPropertyDialog-f:AddAttrButtonsOK']")
	WebElement addPropertyOkButton;

	@FindBy(xpath = "//span[text()='Preview']")
	WebElement previewTab;

	/* xpaths under properties tab */

	@FindBy(xpath = "//select[contains(@id,'propSetDropdown')]")
	WebElement propertySetDropDown;

	@FindBy(xpath = "//select[contains(@id,'CreateEditMaterial')]/option[text()='Composition']")
	WebElement compositionPropSet;

	@FindBy(xpath = "//select[contains(@id,'CreateEditMaterial')]/option[text()='Mechanical']")
	WebElement mechPropertySet;

	@FindBy(xpath = "//td[@class='MatLabel MatHeaderColor MatHeaderBorderColour']//select")
	WebElement propertySetDropdown;

	@FindBy(xpath = "//select[contains(@id,'CreateEditMaterial')]/option[text()='Mechanical - Curves']")
	WebElement mechCurvesPropSet;

	//@FindBy(xpath = "(//td[@class='MatEditorTableOddRow']//input[@title='Value taken from like materials;'])[2]")
	
	@FindBy(xpath = "(//input[@value='Select'])[3]")
	WebElement selectFootnotesButtonForElasticModulus;

	@FindBy(xpath = "(//span[text()='Footnotes'])[1]")
	WebElement textFootnotes;
	
	@FindBy(xpath = "(//td[@class='MatEditorTableEvenRow']//input)[2]")
	WebElement selectFootnotesButtonForSolderability;

	@FindBy(xpath = "(//input[@value='Edit'])[1]")
	WebElement curveEditButton;

	@FindBy(xpath = "(//select[@class='available']/option)[1]")
	WebElement footnoteValue;

	@FindBy(xpath = "//input[@id='FootnoteDialog-f:FootnoteButtonsOK']")
	WebElement okButton;

	@FindBy(xpath = "//input[contains(@id,'CreateCurveButtonsOK')]")
	WebElement curveOkButton;

	@FindBy(xpath = "//input[contains(@id,'CreateEditMaterial:submitBtn')]")
	WebElement submitButton;

	@FindBy(xpath = "(//table[contains(@id,'CreateEditMaterial')]/tbody/tr/td/input[@type='text'])[3]")
	WebElement editThirdPropText;

	@FindBy(xpath = "(//table[contains(@id,'CreateEditMaterial')]/tbody/tr/td/input[@type='text'])[5]")
	WebElement editFifthPropText;

	@FindBy(xpath = "(//table[contains(@id,'CreateEditMaterial')]/tbody/tr/td/input[@type='text'])[1]")
	WebElement editelectricalProtext;

	@FindBy(xpath = "//textarea[contains(@id,'CreateCurveDialog')]")
	WebElement curveEditText;

	@FindBy(xpath = "//a[text()='Edit Material']")
	WebElement editMaterialButton;

	@FindBy(xpath = "//img[contains(@id,'project_recentObjectListDropDownArrowImage')]")
	WebElement projectDropdown;

	@FindBy(xpath = "//span[text()='/Data']")
	WebElement dataProject;

	@FindBy(xpath = "//input[contains(@id,'matDataName')]")
	WebElement specDefName;

	@FindBy(xpath = "//img[contains(@id,'DropDownArrowImage')]")
	WebElement specDefDropdown;

	@FindBy(xpath = "//span[text()='Example Specimen Definition']")
	WebElement specDefValue;

	@FindBy(xpath = "(//span[text()='Common Name']//following::input[contains(@name,'text')])[1]")
	WebElement commonName;

	@FindBy(xpath = "(//span[text()='Specimen Gage Length']//following::input[contains(@name,'value')])[1]")
	WebElement speciGageLength;

	@FindBy(xpath = "(//span[text()='Thickness']//following::input[contains(@name,'value')])[1]")
	WebElement thickness;

	@FindBy(xpath = "(//span[text()='Width']//following::input[contains(@name,'value')])[1]")
	WebElement width;

	@FindBy(xpath = "(//span[text()='Test Category']//following::input[contains(@name,'text')])[1]")
	WebElement testCategory;

	@FindBy(xpath = "(//span[text()='Test Specification']//following::input[contains(@name,'text')])[1]")
	WebElement testSpecification;

	@FindBy(xpath = "//input[@title='Validate']")
	WebElement validateButton;

	@FindBy(xpath = "//span[text()='Validation completed with no errors']")
	WebElement validationMsg;

	@FindBy(xpath = "//input[contains(@name,'msgDlgOkBtn')]")
	WebElement validationOkButton;

	@FindBy(xpath = "//div[contains(@id,'objLabelDecPanel')]")
	WebElement verifySpeciDef;

	@FindBy(xpath = "(//input[@class='SmDisabled'])[1]")
	WebElement complianceFieldDisabled;

	@FindBy(xpath = "(//select[contains(@id,'srcDropdown')])[1]")
	WebElement sourceDropdown;

	@FindBy(xpath = "(//select[contains(@id,'srcDropdown')]//option[text()='Select...'])[1]")
	WebElement sourceDropdownValue;

	@FindBy(xpath = "(//input[contains(@id,'propertiesWidget') and @type='text'])[1]")
	WebElement compositionValue;

	@FindBy(xpath = "(//span[text()='Class']//following::input)[1]")
	WebElement classValue;

	@FindBy(xpath = "(//span[text()='Material Type']//following::input)[1]")
	WebElement matTypeValue;

	@FindBy(xpath = "(//span[text()='Sub Class']//following::input)[1]")
	WebElement subClassValue;

	/* xpaths under footnotes tab */

	@FindBy(xpath = "//textarea[contains(@id,'fnNameText')]")
	WebElement addFootnoteText;

	@FindBy(xpath = "//input[@value='Add/Edit Footnote']")
	WebElement addEditButton;
	
	@FindBy(xpath = "//input[contains(@id, 'AddAttrButtonsOK')]")
	WebElement addAttributesButton;
	
	@FindBy(xpath = "//span[text()='Add Attributes']")
	WebElement txtAddAttributesDialog;
	
	@FindBy(xpath = "//select[@class='available']/option[@title='Class']")
	WebElement classAttribute;
	
	@FindBy(xpath = "//select[@class='available']/option[@title='Cas Number']")
	WebElement casNumberAttribute;
	
	@FindBy(xpath = "//input[@id='AddAttributeDialog-f:AddAttrButtonsOK']")
	WebElement okButtonAddAttribute;
	
	@FindBy(xpath = "//input[contains(@id, 'CreateEditMaterial:okBtn')]")
	WebElement okButtonAddSource;
	
	@FindBy(xpath = "//input[contains(@id, 'CreateEditMaterial:srcEditButton')]")
	WebElement EditButtonEditSource;
	
	@FindBy(xpath = "//input[contains(@id, 'CreateEditMaterial:srcRemoveButton')]")
	WebElement RemoveButtonRemoveSource;
	
	
	@FindBy(xpath = "(//span[text()='Class']/following::td/input)[1]")
	WebElement classAttributeTextBox;
	
	@FindBy(xpath = "(//span[text()='Cas Number']/following::td/input)[1]")
	WebElement casNumberAttributeTextBox;
	
	@FindBy(xpath = "(//span[text()='Source Name']/following::td/input)[1]")
	WebElement sourceNameTextBox;
	
	
	@FindBy(xpath = "(//span[text()='Common Name']/following::td/input)[1]")
	WebElement commonNameTextBox;
	
	@FindBy(xpath = "//input[contains(@id, 'CreateEditMaterial:srcObj_slt')]")
	WebElement existingSourceSelectButton;
	
	@FindBy(xpath = "//span[text()='Source']")
	WebElement txtSourceWindow;

	@FindBy(xpath = "//table[@class='ModBody']/tbody/tr[@smrow='0']")
	WebElement firstSourceEle;
	
	@FindBy(xpath = "//tr[@class='WTKROW ']")
	WebElement firstAddedSource;
	
	public void clickAddedSource(){
		
		action.moveToElement(firstAddedSource).build().perform();
		action.click(firstAddedSource).build().perform();
	}
	public void doubleClickOnFirstSource(){
	action.moveToElement(firstSourceEle).build().perform();
	action.doubleClick(firstSourceEle).build().perform();
}
	
	public void clickOnSelectButtonToSelectExistingSource() {

		js.executeScript("arguments[0].click();", existingSourceSelectButton);
		wait.until(ExpectedConditions.visibilityOf(txtSourceWindow));
	}
	
	public void enterClassAttrValue(){
		storeName = RandomStringUtils.randomNumeric(6);
		action.moveToElement(classAttributeTextBox).build().perform();
		action.click(classAttributeTextBox).build().perform();
		classAttributeTextBox.sendKeys(storeName);
	}
	public void enterCASNumberAttrValue(){
		storeName = RandomStringUtils.randomNumeric(6);
		action.moveToElement(casNumberAttributeTextBox).build().perform();
		action.click(casNumberAttributeTextBox).build().perform();
		casNumberAttributeTextBox.sendKeys(storeName);
	}
	public void enterSourceNameOnSourcesTab(){
		storeName = RandomStringUtils.randomAlphabetic(2);
		action.moveToElement(sourceNameTextBox).build().perform();
		action.click(sourceNameTextBox).build().perform();
		sourceNameTextBox.sendKeys(storeName);
	}
	
	
public void editValueForCommonNameOnClassificationTab(){
		
		storeName = RandomStringUtils.randomNumeric(6);
		action.moveToElement(commonNameTextBox).build().perform();
		action.click(commonNameTextBox).build().perform();
		commonNameTextBox.clear();
		commonNameTextBox.sendKeys(storeName);
	}
public void removeClassAttributeValueFromClassficationTab(){

	action.moveToElement(classAttributeTextBox).build().perform();
	action.click(classAttributeTextBox).build().perform();
	commonNameTextBox.clear();
}

	public void addClassAttributes(){
		
		action.moveToElement(classAttribute).build().perform();
		action.doubleClick(classAttribute).build().perform();
	}
	
	public void addCASNumberAttribute()
	{
		action.moveToElement(casNumberAttribute).build().perform();
		action.doubleClick(casNumberAttribute).build().perform();
	}
	public void clickOkButtonAddAttributes(){
		
		js.executeScript("arguments[0].click();", okButtonAddAttribute);
	}
	
	public void clickOnAddAttributesButton(){
		js.executeScript("arguments[0].click();", addAttributesButton);
		wait.until(ExpectedConditions.visibilityOf(txtAddAttributesDialog));
		
	}
public void clickOkButtonAddSource(){
		
		js.executeScript("arguments[0].click();", okButtonAddSource);
	}
	
public void clickEditToButtonEditSource(){
	
	js.executeScript("arguments[0].click();", EditButtonEditSource);
}
public void clickRemoveButtonToRemoveSource(){
	
	js.executeScript("arguments[0].click();", RemoveButtonRemoveSource);
}

	public void clickOnInitTab() {
		action.click(initTab).build().perform();
	}

	public void clickOnClassificationTab() {
		//action.moveToElement(classificationTab).build().perform();
		//action.click(classificationTab).build().perform();
		js.executeScript("arguments[0].click();", classificationTab);
		wait.until(ExpectedConditions.visibilityOf(textMatAttribute));

	}

	public void clickOnSourcesTab() {
		js.executeScript("arguments[0].click();", sourcesTab);
		//action.click(sourcesTab).build().perform();
		wait.until(ExpectedConditions.visibilityOf(textMatAttribute));
	}

	public void clickOnParametersTab() {
		action.click(parametersTab).build().perform();
	}

	public void clickOnPropertiesTab() {
		action.moveToElement(propertiesTab).build().perform();
		action.click(propertiesTab).build().perform();
	}

	public void selectDiffrentparameterSet() {
		Select select = new Select(selectParameterSet);

		select.selectByValue("ParameterSet 3");
		editSubmitButton();
	}

	public void clickOnAddProperties() {
		action.moveToElement(addPropertiesButton).build().perform();
		action.click(addPropertiesButton).build().perform();
	}

	public void selectPropertyToAdd() {
		Select select = new Select(selectToAddProperty);

		select.selectByValue("solderability");
		js.executeScript("arguments[0].click();", clickRightButton);
		action.moveToElement(addPropertyOkButton).build().perform();
		action.click(addPropertyOkButton).build().perform();
	}

	public void clickOnFootnotesTab() {
		action.moveToElement(footnotesTab).build().perform();
		action.click(footnotesTab).build().perform();
	}

	public void clickOnPreviewTab() {
		action.click(previewTab).build().perform();
	}

	public void editSubmitButton() {
		action.moveToElement(submitButton).build().perform();
		action.click(submitButton).build().perform();
	}

	public void addFootnote() {
		addFootnoteText.click();
		addFootnoteText.clear();
		addFootnoteText.sendKeys(RandomStringUtils.randomAlphanumeric(6));
		action.moveToElement(addEditButton).build().perform();
		action.click(addEditButton).build().perform();
	}

	public void editPropDetails() {
		for (int i = 0; i <= 2; i++) {
			action.click(propertiesTab).build().perform();
			editThirdPropText.click();
			editThirdPropText.clear();
			editThirdPropText.sendKeys(RandomStringUtils.randomNumeric(4));
			editFifthPropText.click();
			editFifthPropText.clear();
			editFifthPropText.sendKeys(RandomStringUtils.randomNumeric(2));
			editSubmitButton();
			matsod.clickOnEditMat();
			// action.click(editMaterialButton).build().perform();
		}
	}

	public void clickOnPropertysetDropDown() {
		action.click(propertySetDropDown).build().perform();
	}

	public void editMultiplePropDetails() {
		for (int i = 0; i <= 2; i++) {
			// action.click(propertiesTab).build().perform();
			editThirdPropText.click();
			editThirdPropText.clear();
			editThirdPropText.sendKeys(RandomStringUtils.randomNumeric(4));
			editFifthPropText.click();
			editFifthPropText.clear();
			editFifthPropText.sendKeys(RandomStringUtils.randomNumeric(2));
			clickOnPropertysetDropDown();
			// action.click(mechCurvesPropSet).build().perform();
			// js.executeScript("arguments[0].click();", curveEditButton);
			// curveEditText.click();
			// curveEditText.clear();

			editelectricalProtext.click();
			editelectricalProtext.clear();
			for (int j = 0; j <= 5; j++) {
				/*
				 * curveEditText.sendKeys(RandomStringUtils.randomNumeric(5));
				 * curveEditText.sendKeys(Keys.SPACE);
				 * curveEditText.sendKeys(RandomStringUtils.randomNumeric(2));
				 * curveEditText.sendKeys(Keys.ENTER);
				 */
				editelectricalProtext.sendKeys(RandomStringUtils.randomNumeric(5));
				editelectricalProtext.sendKeys(Keys.SPACE);
				editelectricalProtext.sendKeys(RandomStringUtils.randomNumeric(2));
				editelectricalProtext.sendKeys(Keys.ENTER);

			}
			// action.click(curveOkButton).build().perform();
			editSubmitButton();
			matsod.clickOnEditMat();
			// action.click(editMaterialButton).build().perform();
		}
	}

	public void selectMechProp() {
		clickOnPropertysetDropDown();
		// action.click(mechPropertySet).build().perform();

		Select select = new Select(propertySetDropdown);
		select.selectByValue("Mechanical");
		wait.until(ExpectedConditions.elementToBeClickable(selectFootnotesButtonForElasticModulus));

	}

	public void clickOnFootnotes() throws InterruptedException {
		//action.moveToElement(selectFootnotesButtonForElasticModulus).build().perform();
		//action.click(selectFootnotesButtonForElasticModulus).build().perform();
		js.executeScript("return arguments[0].click();", selectFootnotesButtonForElasticModulus);
		//Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOf(textFootnotes));
				
	}

	public void selectFootnotesUnderSolderability() {
		action.moveToElement(selectFootnotesButtonForSolderability).build().perform();
		action.click(selectFootnotesButtonForSolderability).build().perform();
	}

	public void linkFootnote() {
		action.moveToElement(footnoteValue).build().perform();
		action.doubleClick(footnoteValue).build().perform();
		//js.executeScript("arguments[0].click();", okButton);
		//action.click(okButton).build().perform();
		//editSubmitButton();
	}


	public void clickOkButtonFootnotes() {
			js.executeScript("arguments[0].click();", okButton);
		//action.click(okButton).build().perform();
		//editSubmitButton();
	}
	public void provideInitSpecDefDetails() {
		action.moveToElement(projectDropdown).build().perform();
		action.click(projectDropdown).build().perform();
		js.executeScript("arguments[0].click();", dataProject);
		// specDefName.click();
		// specDefName.clear();
		// specDefName.sendKeys("Example Specimen Definition");
	}

	public void enterNameOnInitTab() {
		// action.moveToElement(projectDropdown).build().perform();
		// action.click(projectDropdown).build().perform();
		// js.executeScript("arguments[0].click();", dataProject);
		specDefName.click();
		specDefName.clear();
		specDefName.sendKeys("Example Specimen Definition");
	}

	public void provideSpecDeftabDetails() {
		action.moveToElement(speciDefTab).build().perform();
		action.click(speciDefTab).build().perform();
		commonName.click();
		// commonName.clear();
		commonName.sendKeys("Tensile Specimen Definition Example");
		speciGageLength.click();
		speciGageLength.clear();
		speciGageLength.sendKeys("2.5");
		thickness.click();
		thickness.clear();
		thickness.sendKeys("0.5");
		width.click();
		width.clear();
		width.sendKeys("1.2");
	}

	public void validateInfo() {
		action.moveToElement(validateButton).build().perform();
		action.click(validateButton).build().perform();
		wait.until(ExpectedConditions.visibilityOf(validationMsg));
		// driver.switchTo().alert().accept();
		String text = validationMsg.getText();
		if (text.contains("Validation completed with no errors")) {
			System.out.println("Validation is completed without any error");
		} else {
			System.out.println("Validation is not completed");
		}
		action.moveToElement(validateButton).build().perform();
		action.click(validationOkButton).build().perform();
	}

	public void clickOnSpecDefSubmitButton() {
		// editSubmitButton();
		action.moveToElement(submitButton).build().perform();
		action.click(submitButton).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(verifySpeciDef));
		/*
		 * String text = verifySpeciDef.getText(); if(text.
		 * contains("Example Specimen Definition [ Specimen Definition ]")) {
		 * System.out.println("Specimen Definition is created successfully"); }
		 * else {
		 * System.out.println("Specimen Deifinition is not created successfully"
		 * ); }
		 */
	}

	public void verifyCreatedSpecimenDefRecord() {
		// editSubmitButton();
		String text = verifySpeciDef.getText();
		if (text.contains("Example Specimen Definition [ Specimen Definition ]")) {
			System.out.println("Specimen Definition is created successfully");
		} else {
			System.out.println("Specimen Deifinition is not created successfully");
		}
	}

	public void verifyCreatedTestTemplate() {
		// editSubmitButton();
		String text = verifySpeciDef.getText();
		if (text.contains("ExampleTestTemplate [ Test Template ]")) {
			System.out.println("Test Template is created successfully");
		} else {
			System.out.println("Test Template is not created successfully");
		}
	}

	public void provideInitTestDefDetails() {
		action.click(projectDropdown).build().perform();
		js.executeScript("arguments[0].click();", dataProject);
		specDefName.click();
		specDefName.clear();
		specDefName.sendKeys("Example Test Definition");
	}

	public void provideTestDeftabDetails() {
		action.click(testDefTab).build().perform();
		commonName.click();
		commonName.clear();
		commonName.sendKeys("Instron Tensile Test");
		action.click(specDefDropdown).build().perform();
		// js.executeScript("arguments[0].click();", specDefValue); // First
		// create "Example Specimen Definition" to select this value
		testCategory.click();
		testCategory.clear();
		testCategory.sendKeys("Example Tensile Test");
		testSpecification.click();
		testSpecification.clear();
		testSpecification.sendKeys("ASTM E8");
	}

	public void clickOnTestDefSubmitButton() {
		editSubmitButton();
		wait.until(ExpectedConditions.elementToBeClickable(verifySpeciDef));
		String text = verifySpeciDef.getText();
		if (text.contains("Example Test Definition [ Test Definition ]")) {
			System.out.println("Test Definition is created successfully");
		} else {
			System.out.println("Test Deifinition is not created successfully");
		}
	}

	public void verifyEditComplianceField() {
		if (!complianceFieldDisabled.isEnabled()) {
			System.out.println("Overall Compliance status field is disabled");
		} else {
			System.out.println("Overall Compliance status field is enabled");
		}
	}

	public void selectCompositionPorpSet() {
		// wait.until(ExpectedConditions.elementToBeClickable(compositionPropSet));
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// compositionPropSet);
		action.moveToElement(compositionPropSet).build().perform();
		action.click(compositionPropSet).build().perform();
		// js.executeScript("arguments[0].click();", compositionPropSet);
	}

	public void selectSourceDropdown() {
		action.click(sourceDropdown).build().perform();
		// js.executeScript("arguments[0].click();", sourceDropdown);
		action.click(sourceDropdownValue).build().perform();
		// js.executeScript("arguments[0].click();", sourceDropdownValue);
	}

	public void changeFiledValues() {
		classValue.click();
		classValue.clear();
		classValue.sendKeys(RandomStringUtils.randomAlphabetic(15));
		matTypeValue.click();
		matTypeValue.clear();
		matTypeValue.sendKeys(RandomStringUtils.randomAlphabetic(8));
		subClassValue.click();
		subClassValue.clear();
		subClassValue.sendKeys(RandomStringUtils.randomAlphabetic(13));
	}

	public void changeCompositionValue() {
		compositionValue.click();
		compositionValue.clear();
		compositionValue.sendKeys("33");
	}

	public void removeCompositionSourceValue() {
		clickOnPropertysetDropDown();
		selectCompositionPorpSet();
		selectSourceDropdown();
	}

	public void editCompositionDataValue() {
		clickOnPropertysetDropDown();
		selectCompositionPorpSet();
		changeCompositionValue();
	}

	public void editClassificationValue() {
		// clickOnClassificationTab();
		/*
		 * action.moveToElement(classValue).build().perform();
		 * action.click(classValue).build().perform();
		 * action.doubleClick(classValue).click(classValue).sendKeys(
		 * RandomStringUtils.randomAlphabetic(15)).build().perform();
		 */
		// classValue.clear();
		// classValue.sendKeys(RandomStringUtils.randomAlphabetic(15));
		// matTypeValue.click();
		js.executeScript("arguments[0].click();", matTypeValue);
		// action.moveToElement(matTypeValue).build().perform();
		// action.click(matTypeValue).build().perform();
		matTypeValue.clear();
		matTypeValue.sendKeys(RandomStringUtils.randomAlphabetic(8));
		/*
		 * subClassValue.click(); subClassValue.clear();
		 * subClassValue.sendKeys(RandomStringUtils.randomAlphabetic(13));
		 */
		// editSubmitButton();
		// action.moveToElement(submitButton).build().perform();
		// action.click(submitButton).build().perform();
	}

	public void editSubClassValue() {
		// clickOnClassificationTab();
		/*
		 * action.moveToElement(classValue).build().perform();
		 * action.click(classValue).build().perform();
		 * action.doubleClick(classValue).click(classValue).sendKeys(
		 * RandomStringUtils.randomAlphabetic(15)).build().perform();
		 */
		// classValue.clear();
		// classValue.sendKeys(RandomStringUtils.randomAlphabetic(15));
		// matTypeValue.click();
		js.executeScript("arguments[0].click();", subClassValue);
		// action.moveToElement(matTypeValue).build().perform();
		// action.click(matTypeValue).build().perform();
		subClassValue.clear();
		subClassValue.sendKeys(RandomStringUtils.randomAlphabetic(13));
		/*
		 * subClassValue.click(); subClassValue.clear();
		 * subClassValue.sendKeys(RandomStringUtils.randomAlphabetic(13));
		 */
		// editSubmitButton();
		// action.moveToElement(submitButton).build().perform();
		// action.click(submitButton).build().perform();
	}
	public MaterialSOD clickSubmitButton() throws InterruptedException {
	//	action.moveToElement(submitButton).build().perform();
		//action.click(submitButton).build().perform();
		js.executeScript("arguments[0].click();", submitButton);
		Thread.sleep(2000);
		return new MaterialSOD();
	}

}
