package com.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RedbusSuggestion {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[@class = 'fl search-box clearfix']//input[@id = 'src']")).sendKeys("Ban");
		
		Thread.sleep(2000);
		//if we have used only "li" in the xpath i got InvalidSelectorException. and if the bangalore is not given in 
		//single quote you will get StaleElementReferenceException.	
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@class='autoFill']/li[contains(text(),'Ban')]"));
		Thread.sleep(2000);
	
		int count = sugg.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			System.out.println("-->" + sugg.get(i).getText());
		}
	}
}

