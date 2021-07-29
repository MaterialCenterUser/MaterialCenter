package com.wiz.materialCenter.testRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDryRun {
	
public static void main(String[] args) {
	

	

			System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://ind-vibhavari:8989/MaterialCenter/facelets/main/application.xhtml");
		//String userName =prop.getProperty("username");
		//String passWord= prop.getProperty("password");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='form:userID']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='form:password']"));
		
		WebElement login = driver.findElement(By.xpath("//input[@id='form:login']"));
				
		
		username.sendKeys("smroot");
		password.sendKeys("sdm");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login);
		WebElement okButton = driver.findElement(By.xpath("//input[@value='Ok']"));
		okButton.click();
	}
	
}
	



