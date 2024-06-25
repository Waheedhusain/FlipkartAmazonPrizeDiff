package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// Declararion
	@FindBy(id =  "twotabsearchtextbox")
	private WebElement SearchField;
	
	@FindBy(xpath = "//span[text() = 'Apple iPhone 15 Plus (256 GB) - Blue']")
	private WebElement MobileNameLink;
	
	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	// utilize
	public WebElement getSearchField() {
		return SearchField;
	}
	private WebElement getMobileNameLink() {
		return MobileNameLink;
	}
}
