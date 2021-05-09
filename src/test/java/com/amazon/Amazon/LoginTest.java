package com.amazon.Amazon;

import org.testng.annotations.Test;

import com.amazon.utility.TestBase;


public class LoginTest extends TestBase {

	@Test
 public void login() {
		h.homepage();
		p.productsPage();
		c.addToCart();
 }
}
