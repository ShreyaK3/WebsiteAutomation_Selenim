package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.basepage.TestBase;

public class HomePage extends TestBase{
	
	WebDriver driver;
	
	public HomePage() {
		this.driver =TestBase.driver;
	}
	
	WebElement homeButton= driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
	
	public String verfiyHomeButtonText() {
		String homeButtonText= homeButton.getText();
		return homeButtonText;
	}
	

}
