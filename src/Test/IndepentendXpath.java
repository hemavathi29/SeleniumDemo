package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndepentendXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@title = 'Search for products, brands and more']")).sendKeys("mobiles");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//couldn't find using xpath so went with cssSelector 
		driver.findElement(By.cssSelector("button[type = 'submit']")).click();

	}

}
