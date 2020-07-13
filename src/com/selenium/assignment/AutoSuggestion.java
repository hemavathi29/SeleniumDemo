package com.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(500);
		
		List<WebElement> auto = driver.findElements(By.xpath("//ul[@class = 'erkvQe']//span[contains(text(),'selenium')]"));
		//Thread.sleep(500);
		
		int count = auto.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			System.out.println("-->" + auto.get(i).getText());
		}
	}
	


}
