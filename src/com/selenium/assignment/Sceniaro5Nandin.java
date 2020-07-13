package com.selenium.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sceniaro5Nandin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		WebElement ring = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[2]/a"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.moveToElement(ring).build().perform();
		
		//diamond click
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[2]/div/ul/li[1]/div/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		//price mouseover action
		WebElement defpri =  driver.findElement(By.xpath("//div[@id = 'top-filter']//span[text() = 'Price']"));
		
		act.moveToElement(defpri).build().perform();
		Thread.sleep(2000);
	
		List<WebElement> defpric = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div[4]/div/div[1]/div/div[1]/aside/div/div[1]/div[2]/section/div/div/form/div"));
		int defprisize = defpric.size();
		
		for (int i = 0; i < defprisize; i++) {
			String defsortname =  defpric.get(i).getText();
			System.out.println(defsortname);
		}
		
		ArrayList<String> pricelist = new ArrayList<String>(defprisize);
		
		for (int i = 0; i < defprisize; i++) {
			String defsortname =  defpric.get(i).getText();
			System.out.println(defsortname);
			pricelist.add(defsortname);
		}
		
		ArrayList<String> sortpricelist = new ArrayList<String>(pricelist);
		Collections.sort(sortpricelist);
		
		for (int i = 0; i < defprisize; i++) {
			String defsortname =  defpric.get(i).getText();
			System.out.println(defsortname);
		}
		
		for (int i = 0; i < defprisize; i++) {
			if(!pricelist.equals(sortpricelist))
			{
				System.out.println("Data are different");
				break;
			}
			if(i==defprisize-1)
			{
				System.out.println("Data are same");
			}
		}
		
		driver.close();
	}
}
