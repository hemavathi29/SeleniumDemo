package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name = 'user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name = 'user_password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id = 'submitButton']")).click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement exp = driver.findElement(By.xpath("//td[@class = 'small']//a[text() = 'Organizations']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(exp)).click();
	}
}
