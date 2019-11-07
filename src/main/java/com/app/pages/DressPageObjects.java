package com.app.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPageObjects extends BasePage {
	
	public DressPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;
	
	public void clickDresses() {
		// TODO Auto-generated method stub
		Dresses.click();
	}

	public WebElement getDresses() {
		// TODO Auto-generated method stub
		return Dresses;
	}
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement sizeS;

	public WebElement sizeS() {
		// TODO Auto-generated method stub
		return sizeS;
	}
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement sizeM;

	public WebElement sizeM() {
		// TODO Auto-generated method stub
		return sizeM;
	}
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement sizeL;

	public WebElement sizeL() {
		// TODO Auto-generated method stub
		return sizeL;
	}
	//@FindBy(xpath = "//*[@id=\"center_column\"]/ul")
	//private List<WebElement> totalproducts; 
}
