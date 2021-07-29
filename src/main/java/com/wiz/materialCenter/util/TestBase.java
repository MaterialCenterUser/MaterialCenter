package com.wiz.materialCenter.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/main/java/com/wiz/materialCenter/common/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}

	}

	public String getReportConfigPath() {
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		String FirefoxDriverPath = prop.getProperty("FirefoxDriver");
		String chromeDriverPath = prop.getProperty("chromeDriver");
		String edgeDriverPath = prop.getProperty("edgeDriver");
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", FirefoxDriverPath);
			//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	      //  capabilities.setCapability("marionette", true);
	      //  driver = new FirefoxDriver(capabilities);
			driver = new FirefoxDriver();
		} else {
			System.out.println("Different browser");
		}
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		} else {
			System.out.println("Different browser");
		}
		if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\software\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Different browser");
		}
		if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", edgeDriverPath);
			driver = new EdgeDriver();
		} else {
			System.out.println("Different browser");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	public static void launchUrl(){
		driver.get(prop.getProperty("url"));
	}

	public static void screenshot(WebDriver driver, long ms) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ScreenShots/" + ms + ".png"));
			// System.out.println("ScreenShot Taken");
		} catch (Exception e) {
			System.out.println("Exception while taking ScreenShot " + e.getMessage());
		}
	}

}
