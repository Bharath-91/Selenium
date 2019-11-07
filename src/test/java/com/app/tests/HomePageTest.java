package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;

public class HomePageTest extends BasePage {
	HomePageObjects hp;
	//BasePage bp;
	public HomePageTest() {
		hp = new HomePageObjects();
		//bp = new BasePage();
	}
	
	@Test
	public void verifyisdisplay() {
		Assert.assertTrue(hp.elementFound(hp.getWomen()));
		Assert.assertTrue(hp.elementFound(hp.getdresses()));
		Assert.assertTrue(hp.elementFound(hp.gettshirt()));
	}
	@Test
	public void verifyTabNavigation() {
		hp.clickWomen();
		Assert.assertTrue(hp.getTitle().contains("Women"));
	}
	@Test
	public void verifyTabNavigation2() {
		hp.clickdresses();
		Assert.assertTrue(hp.getTitle().contains("Dresses"));
	}
	@Test
	public void verifyTabNavigation3() {
		hp.clickTshirts();
		Assert.assertTrue(hp.getTitle().contains("T-shirts"));
	}

}