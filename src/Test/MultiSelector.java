package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/HEMA/Desktop/self%20learning%20training/MultiSelector.html");
		WebElement multi = driver.findElement(By.xpath("//select"));
		
		Select s1 = new Select(multi);
		System.out.println(s1.isMultiple());
		
		s1.selectByIndex(3);
		Thread.sleep(500);
		
		s1.selectByIndex(2);
		Thread.sleep(500);
		
		s1.deselectByIndex(2);
		Thread.sleep(500);
		
		s1.selectByValue("volvo");
		Thread.sleep(500);
		
		s1.deselectByIndex(3);
		Thread.sleep(500);
		
		s1.selectByVisibleText("Opel");	
		Thread.sleep(500);
		
		s1.deselectAll();
	}
}
