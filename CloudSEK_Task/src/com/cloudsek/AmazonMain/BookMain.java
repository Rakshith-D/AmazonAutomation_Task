package com.cloudsek.AmazonMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cloudsek.AmazonObjects.Book;
import com.cloudsek.AmazonObjects.BookSelection;
import com.cloudsek.AmazonObjects.Cart;
import com.cloudsek.AmazonObjects.Home;
import com.cloudsek.AmazonObjects.Language;

public class BookMain {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		
		Home h=new Home(driver);
		h.clickOnBooks();
		
		Book b=new Book(driver);
		b.clickOnNewRelease();
		
		BookSelection bs=new BookSelection(driver);
		bs.clickOnBook();
		
		Cart c=new Cart(driver);
		c.addToCart();
		c.clickOnCart();
		c.checkForBook();
		c.changeLang();
		
		Language l=new Language(driver);
		l.clickOnKan();
		l.clickOnChange();
		
		driver.quit();
	
		

	}

}
