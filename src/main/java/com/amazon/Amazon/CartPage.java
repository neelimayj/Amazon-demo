package com.amazon.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.Utils;

public class CartPage {
	
	 private WebDriver driver;
		@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[last()]")
		public  WebElement lastImage;
		
		@FindBy(xpath = "(//div[@class='a-box-inner']//span[@class='a-button-inner'])[2]")	
		public WebElement wishList;
		
		@FindBy(xpath = "//input[@name='submit.addToCart']")
		public WebElement addToCart;
		
		public CartPage(WebDriver driver) {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		}

		public void addToCart() {
			Utils util = new Utils(driver);
			util.scrollDown(6000);
			util.click(lastImage);
			util.click(wishList);
			util.click(addToCart);
			
			
		}

}
