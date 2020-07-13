package com.selenium.assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TinyUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id = 'pickfiles']//span")).click();
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\HEMA\\Downloads\\TestAudoit.exe");
	}
}
