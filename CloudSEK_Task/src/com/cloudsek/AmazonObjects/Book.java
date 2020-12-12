package com.cloudsek.AmazonObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Book
{
	WebDriver driver;
	public Book(WebDriver driver)
	{
		this.driver=driver;
	}
	

	By newrel= By.linkText("New Releases");
	
	//clicking on New Releases option
	public void clickOnNewRelease()
	{
		driver.findElement(newrel).click();
	}

}
