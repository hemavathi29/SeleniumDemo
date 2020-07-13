package com.selenium.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//input[@id = 'identifierId']")).sendKeys("hemavathi024@gmail.com");
		driver.findElement(By.xpath("//span[@class = 'RveJvd snByac']")).click();
		//driver.findElement(By.xpath("//span[text() = 'Next']")).click();
	}		
}
