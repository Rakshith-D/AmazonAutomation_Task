package com.cloudsek.AmazonObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookSelection
{
	WebDriver driver;
	public BookSelection(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By book=By.xpath("//*[@id=\"zg_left_col1\"]/div[1]/div[4]/div/div[2]/a/div[2]");
	
	//clicking on the book that is inspected
	public void clickOnBook()
	{
		driver.findElement(book).click();
	}

}
