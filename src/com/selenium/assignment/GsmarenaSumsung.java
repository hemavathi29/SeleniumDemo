package com.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaSumsung {
	public static void main(String args[]) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.gsmarena.com");
	
		//Display Names of Samsung mobiles displayed in 1st page under Samsung option
		driver.findElement(By.xpath("//a[text() = 'Samsung']")).click();
		
		List<WebElement> samsunglist = driver.findElements(By.xpath("//div[@id = 'review-body']//ul/li"));
		
		int samsungcount = samsunglist.size();
		System.out.println(samsungcount);
		
		for (int i = 0; i < samsungcount; i++) 
		{
			System.out.println("-->" + samsunglist.get(i).getText());
		}
		
		Thread.sleep(20000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//Display No of page available for oppo mobile options
		driver.findElement(By.xpath("//a[text() = 'Oppo']")).click();
		List<WebElement> oppocontent =  driver.findElements(By.xpath("//div[@class = 'nav-pages']/a"));
		
		int oppocount = oppocontent.size() + 1;
		System.out.println("No of pages = " + oppocount);
	}
}
