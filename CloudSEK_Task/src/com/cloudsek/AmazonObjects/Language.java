package com.cloudsek.AmazonObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Language 
{
	WebDriver driver;
	public Language(WebDriver driver)
	{
		this.driver=driver;
	}
	By kannada=By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[5]/div/label/i");
	By chng=By.xpath("//*[@id=\"icp-btn-save\"]/span/input");
	
	//clicking on Kannada 
	public void clickOnKan()
	{
		driver.findElement(kannada).click();
	}
	
	//clicking on Save Changes button to change language from English to Kannada
	public void clickOnChange()
	{
		driver.findElement(chng).click();
	}

}
