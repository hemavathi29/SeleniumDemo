package com.selenium.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Actions act =  new Actions(driver);
		Thread.sleep(2000);
		
		WebElement jew = driver.findElement(By.xpath("//nav[@class = 'wh-navbar']//a[@title= 'Jewellery']"));
		act.moveToElement(jew).build().perform();
		
		driver.findElement(By.xpath("//ul[@class = 'two-column']//a[@title ='Kadas']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id = 'grid-view-result']//div[@class = 'inner pd-gray-bg']/div[@class = 'pr-i lazyload-bg']//img[@class = 'hc img-responsive center-block']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[2]/div/div/div/div/div[2]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]/input")).click();
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println(alt.getText());
	}

}
