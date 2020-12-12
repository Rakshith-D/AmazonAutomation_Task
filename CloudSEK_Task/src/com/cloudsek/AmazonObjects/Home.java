package com.cloudsek.AmazonObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Home
{
	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	By dropdown=By.xpath("//select[@id=\"searchDropdownBox\"]");
	public void clickOnBooks()
	{
		WebElement books = driver.findElement(dropdown);
		Select s=new Select(books);
		
		//selecting Books from the dropdown
		s.selectByVisibleText("Books"); 
		
		Actions a=new Actions(driver);
		
		//clicking on Books using keyboard event
		a.sendKeys(Keys.ENTER).build().perform();
	}

}
