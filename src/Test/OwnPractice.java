package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnPractice {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(200);
		
		//To maximuize the browser window 
		//driver.manage().window().maximize();
		//Thread.sleep(200);
		
		//LinkText locator
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//partialLinkText locator
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("hema");
		
		//xpath using attribute
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hemavathi");	
		
		//xpath using text
		driver.findElement(By.xpath("//a[text() ='Create a Page']")).click();
	}
}