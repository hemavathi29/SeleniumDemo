package com.selenium.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleListAmazon {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		WebElement single = driver.findElement(By.xpath("//select[@class = 'nav-search-dropdown searchSelect']"));
		
		Select s1 = new Select(single);
		s1.selectByIndex(3); // output -> baby 
		Thread.sleep(2000);
		
		s1.selectByValue("search-alias=automotive-intl-ship"); //output -> Automotive
		Thread.sleep(2000);
		
		s1.selectByVisibleText("Computers"); //output -> computers
		
		List<WebElement> listopt = s1.getOptions();
		
		int count = listopt.size();
		System.out.println("No of list items = " + count);
		
		for (int i = 0; i < count; i++) {
			System.out.println(listopt.get(i).getText());
		}		
	}
}
