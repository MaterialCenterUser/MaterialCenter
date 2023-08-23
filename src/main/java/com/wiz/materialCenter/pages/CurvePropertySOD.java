package com.wiz.materialCenter.pages;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wiz.materialCenter.util.TestBase;

public class CurvePropertySOD extends TestBase {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,(30));
	MaterialMOD matmod = new MaterialMOD();
	ProcessesPage processPage = new ProcessesPage();

	public CurvePropertySOD() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Download']/font/img")
	WebElement linkCurveFileDownload;
	@FindBy(xpath = "//span[text()='Curve File']")
	WebElement txtCurveFile;
	

public boolean verifyCurveFileDownloadLinkDisplayed(){
	
	return (txtCurveFile.isDisplayed());
}

public void clickOnCurveFileDownloadLink(){
	
	action.moveToElement(linkCurveFileDownload).build().perform();
	action.click(linkCurveFileDownload).build().perform();
	
}

public static Boolean isFileDownloaded(String fileName) {
    boolean flag = false;
    //paste your directory path below
    //eg: C:\\Users\\username\\Downloads
    String dirPath = prop.getProperty("downloadDirPath");
    File dir = new File(dirPath);
    File[] files = dir.listFiles();
    if (files.length == 0 || files == null) {
        System.out.println("The directory is empty");
        flag = false;
    } else {
        for (File listFile : files) {
            if (listFile.getName().contains(fileName)) {
                System.out.println(fileName + " is present");
                break;
            }
            flag = true;
        }
    }
    return flag;
}
}
