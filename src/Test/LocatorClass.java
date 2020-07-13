package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("C:///Users//HEMA//Desktop//self learning training//demo.html");
		driver.get("C:///Users//HEMA//Desktop//self learning training//xpathcontain.html");
		Thread.sleep(2000);
		
		//driver.findElement(By.tagName("a")).click();
		//Thread.sleep(200);
		
		//driver.findElement(By.id("“a1”")).click();
		
		//driver.findElement(By.className("“c1”")).click();
		
		//driver.findElement(By.name("“n1”")).click();
		
		//driver.findElement(By.linkText("actitime")).click();	
		
		driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]")).click();
		
		
		//span[text() ='Apple iPhone 11 Pro Max (256GB) - Midnight Green']/../../../../../../../div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[@class = 'a-offscreen']
		
	}
}
