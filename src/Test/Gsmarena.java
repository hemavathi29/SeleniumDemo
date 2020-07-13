package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> mobile = driver.findElements(By.xpath("//div[@class = 'brandmenu-v2 light l-box clearfix']/ul/li"));
		int countsize = mobile.size();
		
		for (int i = 0; i < countsize; i++) 
		{
			System.out.println(mobile.get(i).getText());
			//System.out.println(mobile.get(i).click());
		}
	}
}
