package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		
		System.out.println("before dropping the values");
		System.out.println(dst.getCssValue("font-family"));
		System.out.println(dst.getCssValue("background"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst).build().perform();
		
		System.out.println("After dropping the values");
		System.out.println(dst.getCssValue("font-family"));
		System.out.println(dst.getCssValue("background"));
	}
}
