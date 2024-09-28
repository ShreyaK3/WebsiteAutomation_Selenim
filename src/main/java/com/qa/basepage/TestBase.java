package com.qa.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utility.TestUtility;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	//Constructor to read the values from properties file
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(TestUtility.propertiesFilePath);
			prop.load(ip);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	//driver initialization method
	
	public static void initialization() {
		
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", TestUtility.executableFilePath);
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtility.pageloadtimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtility.implicitwaittime, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
