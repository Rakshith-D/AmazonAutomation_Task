package com.cloudsek.AmazonObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart 
{
	WebDriver driver;
	public Cart(WebDriver driver)
	{
		this.driver=driver;
	}
	By addcart=By.xpath("//input[@id='add-to-cart-button']");
	By cart=By.xpath("//a[@id='hlb-view-cart-announce']");
	By bookcart=By.linkText("A Promised Land");
	By lang=By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]");
	
	//clicking on Add to cart 
	public void addToCart()
	{
		driver.findElement(addcart).click();
	}
	
	//clicking on Cart option
	public void clickOnCart()
	{
		driver.findElement(cart).click();
	}
	
	//checking for the selected book that is present in cart or not
	public void checkForBook()
	{
		if(driver.findElement(bookcart).isDisplayed())
		{
			System.out.println("Selected book is present in cart");
		}
		else {
			System.out.println("Selected book is not present in cart");
			
		}
	}
	
	//clicking on flag option to change language
	public void changeLang()
	{
		driver.findElement(lang).click();
	}

}
