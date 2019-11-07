package com.app.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.DressPageObjects;

public class DressPageTest {
	DressPageObjects dp;
	public DressPageTest() {
		dp = new DressPageObjects();
	}
	@Test
	public void verifyDressPage() {
		//dp.clickDresses();
		Assert.assertTrue(dp.elementFound(dp.getDresses()));
	}
	@Test
	public void verifyS() {
		dp.clickDresses();
		Assert.assertTrue(dp.elementFound(dp.sizeS()));
	}
	@Test
	public void verifyM() {
		dp.clickDresses();
		Assert.assertTrue(dp.elementFound(dp.sizeM()));
	}
	@Test
	public void verifyL() {
		dp.clickDresses();
		Assert.assertTrue(dp.elementFound(dp.sizeL()));
	}
	@Test
	public void verifytables() {
		Assert.assertTrue(dp.gettotalitems().contains("There are 5 products"));
	}
}
