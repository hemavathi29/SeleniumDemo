package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		 
		Thread.sleep(5000);
		
		String Title = driver.getTitle();
		System.out.println("Tilte of the page = "+Title);
		
		String Url = driver.getCurrentUrl();
		System.out.println("URL of the page = "+Url);
		
		//To open the browser using WebDriver method
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://facebook.com");
	}
}
