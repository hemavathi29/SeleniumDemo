package com.selenium.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLoginProperyPage {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fl = new FileInputStream("../Selenium/ChromeDriver/qwerty.properties");
		Properties prop = new Properties();
		prop.load(fl);
		
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.xpath("//input[@name = 'user_name']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name = 'user_password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id = 'submitButton']")).click();	
	}
}
