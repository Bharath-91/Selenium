package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage{
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement Women;
	
	public WebElement getWomen() {
	return	Women;
	}
	public void clickWomen() {
		Women.click();
	}
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;

	public WebElement getdresses() {
		return	Dresses;
		}
	public void clickdresses() {
		// TODO Auto-generated method stub
		Dresses.click();
	}
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirts;
	
	public WebElement gettshirt() {
		return	Tshirts;
		}

	public void clickTshirts() {
		// TODO Auto-generated method stub
		Tshirts.click();
	}
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement sizeS;

	public WebElement sizes() {
		// TODO Auto-generated method stub
		return sizeS;
	}
	}
