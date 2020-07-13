package TestNGPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VtigerAssertLogin {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		//driver.findElement(By.xpath("//input[@name = 'user_name']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name = 'user_password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id = 'submitButton']")).click();	
		
		String errormes = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/div[1]/form/div/div[5]")).getText();
		String errormessdis = "You must specify a";
		
		assertEquals(errormes, errormessdis,"Error messages found");
   }
}
