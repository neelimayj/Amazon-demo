package com.amazon.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.Utils;

public class PDPage {
	 private WebDriver driver;
		@FindBy(xpath = "//a[@aria-label='See more, Brand']/span[text()='See more']")
		public  WebElement seeMore;
		
		@FindBy(xpath = "//span[text()='Apple']")	
		public WebElement appleImage;
		
		public PDPage(WebDriver driver) {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		}

	public void productsPage() {
		Utils util = new Utils(driver);
		util.scrollDown(500);
		util.click(seeMore);
		util.click(appleImage);
	}
}
