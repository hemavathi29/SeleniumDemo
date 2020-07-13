package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeoutClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
//		try 
//		{
//			driver.get("https://amazon.com");
//			System.out.println("System is displayed in 5 seconds");
//		}
//		catch (TimeoutException e) {
//			System.out.println("System is not displayed in 5 seconds");
//		}
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
	}
}

