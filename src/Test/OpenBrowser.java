package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OpenBrowser {

	public static void main(String[] args) {
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		
		//Chrome Browser
		/* System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://facebook.com"); */
		
		
		//Firefox Browser 
		System.setProperty("webdriver.gecko.driver", "../Selenium/ChromeDriver/geckodriver.exe");
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("https://facebook.com");
		
		//IE Browser
		System.setProperty("webdriver.ie.driver", "../Selenium/ChromeDriver/IEDriverServer.exe");
		InternetExplorerDriver driver3 = new InternetExplorerDriver();
		driver3.get("https://google.com");
		
		
	}
}
