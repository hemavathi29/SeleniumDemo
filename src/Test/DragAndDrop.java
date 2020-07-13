package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement b1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/h1"));
		System.out.println(b1.getCssValue("background-color"));
		WebElement b2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/h1"));

		//b2 to b4 
		WebElement d2 = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/h1"));
		WebElement d4 = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/h1"));
	
		Actions action = new Actions(driver);

		action.dragAndDrop(b1, b2).build().perform();
		System.out.println("block13 done");
		System.out.println(b2.getCssValue("background-color"));
		
		Thread.sleep(3000);
		action.dragAndDrop(d2, d4).build().perform();
		System.out.println("done");
	}

}

