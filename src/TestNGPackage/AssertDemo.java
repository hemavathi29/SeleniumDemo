package TestNGPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo 
{
	@Test
	public void assert1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		//xpath of the error message displayed.
		String errormsg =  driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/div[1]/form/div/div[5]")).getText();
		String expectedmsg = "You must specify a.";
		
		//Create the object of softassert 
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(errormsg, expectedmsg,"text msg");
		
		System.out.println("Passed whold script");
		soft.assertAll();
	}
}
