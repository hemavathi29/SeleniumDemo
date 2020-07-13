package TestNGPackage;

import static org.testng.Assert.assertEquals;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	@Test (dependsOnMethods = "a")
	public void c()
	{
		System.out.println("C method");
	}
	
	@Test 
	public void b()
	{
		System.out.println("B method");
	}
	
	@Test
	public void a()
	{
		System.out.println("A method");
		assertEquals(true, false);
	}
	
//	public void testcase1() throws InterruptedException
//	{
//		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//		WebElement b1 = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/h1"));
//		System.out.println(b1.getCssValue("background-color"));
//	}
}
