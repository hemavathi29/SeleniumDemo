package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment33Ladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement slider =  driver.findElement(By.xpath("//div[@id = 'slider']"));
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.clickAndHold(slider);
		act.moveByOffset(10, 10);
		act.build().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}