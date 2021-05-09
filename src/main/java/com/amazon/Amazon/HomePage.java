package com.amazon.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.Utils;

public class HomePage {
	
  private WebDriver driver;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public  WebElement search;
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")	
	public WebElement searchIcon;
	
	public HomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}

	public void homepage() {
		Utils util = new Utils(driver);
		util.enterText(search,"mobile phones");
		util.click(searchIcon);
	}
}
