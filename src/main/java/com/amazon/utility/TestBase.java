package com.amazon.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.amazon.Amazon.CartPage;
import com.amazon.Amazon.HomePage;
import com.amazon.Amazon.PDPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public HomePage h;
	public PDPage p;
	public CartPage c;
	ConfigReader read = new ConfigReader();
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(read.readConfig("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void initialize() {
		h = new HomePage(driver);
		p = new PDPage(driver);
		c = new CartPage(driver);
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
