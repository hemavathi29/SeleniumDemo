package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraMouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		
		WebElement hliving = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[4]/div/a"));
		Thread.sleep(5000);
		
		act.moveToElement(hliving).build().perform();
		//Thread.sleep(5000);
		
		WebElement towel = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[4]/div/div/div/div/li[2]/ul/li[4]/a"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(towel)).click();	
	}
}
