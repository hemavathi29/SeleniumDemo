package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
		driver.get("file:///C:/Users/HEMA/Desktop/self%20learning%20training/checkbox.html");
		
		WebElement checkbox = driver.findElement(By.xpath("//input"));
		System.out.println("checkbox is select ->"+ checkbox.isSelected());
		
		/*//WebElement box = driver.findElement(By.xpath("//input[@id ='email']"));
		//System.out.println(box.getAttribute("value"));
		
		//To check if login button is enabled or not
		WebElement login = driver.findElement(By.xpath("//input[@id ='u_0_b']"));
		System.out.println("login button -> "+login.isEnabled());
		
		//To check whether another of the radio button is selected or not??
		WebElement radio = driver.findElement(By.xpath("//input[@id ='u_0_6']"));
		System.out.println("raido button ->"+radio.isSelected());
		
		//To check if facebook log is displayed or not??
		WebElement log = driver.findElement(By.xpath("//i[@class ='fb_logo img sp_PtoC_M4ckZu sx_a6eeb2']"));
		System.out.println(log.isDisplayed()); */	
	}
}
