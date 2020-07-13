	package com.selenium.assignment;
	
	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Scenario4 {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://in.ebay.com/");
			driver.manage().window().maximize();
	
			driver.findElement(By.xpath("//input[@class = 'gh-tb ui-autocomplete-input']")).sendKeys("Apple Watch");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id = 'gh-btn']")).click();
			Thread.sleep(2000);
			
			WebElement check = driver.findElement(By.xpath("//div[@id = 'x-refine__group_1__0']//span[text() = 'Apple']"));
			System.out.println(check.isEnabled());
			
			check.click();
			Thread.sleep(2000);
			
			List<WebElement> listname = driver.findElements(By.xpath("//ul[@class = 'srp-results srp-list clearfix']/li//div[@class = 's-item__info clearfix']//h3[@class = 's-item__title']"));
			int listsize = listname.size();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			List<WebElement> scroll = driver.findElements(By.xpath("//ol[@class = 'pagination__items']/li"));
			int scrollsize = scroll.size();
			System.out.println(scrollsize);
			
			System.out.println();
			for (int i = 0; i < scrollsize; i++) 
			{
				for (int j = 0; j < listsize; j++) 
				{
					System.out.println(listname.get(j).getText());
				}
				System.out.println("---------------------------------");
			}
			
			System.out.println("Name of the 10th watch");
			WebElement TenthName = driver.findElement(By.xpath("//ul[@class = 'srp-results srp-list clearfix']/li[10]//div[@class = 's-item__info clearfix']//h3[@class = 's-item__title']"));
			System.out.println(TenthName.getText());
			js.executeScript("arguments[0].scrollIntoView();",TenthName);
		}
	}
