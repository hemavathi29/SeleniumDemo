package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.facebook.com");
		//driver.get("https://www.instagram.com/accounts/login/");
		//driver.get("https://www.magicbricks.com");
		driver.get("https://www.amazon.com/");
		//driver.get("https://www.flipkart.com/");
		//driver.get("https://www.indiabix.com/");
		
		Thread.sleep(2000);
		
		//facebook -> female button choice
		//driver.findElement(By.xpath("//label[@for = 'u_0_6']")).click();
		
		//facebook -> New password entry 
		//driver.findElement(By.xpath("//input[@autocomplete = 'new-password']")).sendKeys("new");
		
		//instragram -> login with facebook
		//driver.findElement(By.xpath("//span[@class = 'KPnG0']")).click();
		
		//instragram -> PhoneNumber enter
		//driver.findElement(By.xpath("//input[@maxlength= '75']")).sendKeys("984550");
		
		//instagram forget password
		//driver.findElement(By.xpath("//a[text() = 'Forgot password?']")).click();
		
		//Magic brick -> click on PG option
		//driver.findElement(By.xpath("//span[@class = 'newpg']")).click();
		//Thread.sleep(2000);
		
		//Magic brick -> click on Buy option
		//driver.findElement(By.xpath("//a[@class = 'dropAction']")).click();
		
		//Magic brick -> send some location 
		//driver.findElement(By.xpath("//input[@name = 'keyword']")).sendKeys("Bangalore");
		
		//Magicbrick clikc on share your requirement option
		//driver.findElement(By.xpath("//a[text() ='Share Your Requirement']")).click();
		
		//Magicbrick -> click on share your requirement options
		//driver.findElement(By.xpath("//a[@class ='covid19__link']")).click();
		
		//amazon click on amazon.in option
		//driver.findElement(By.xpath("//a[text() = 'Click here to go to amazon.in']")).click();
		
		//amazon click on amazon.in option
		//driver.findElement(By.xpath("//a[@rel = 'noopener']")).click();
		
		//amazon -> click on "click her to learn more" option
		//driver.findElement(By.xpath("//a[text() = 'Click to learn more']")).click();
		
		//amazon -> click on "click her to learn more" option
		//driver.findElement(By.xpath("//a[@aria-label = 'Discover Amazon - Click to learn more']")).click();
		
		//amazon -> click on "back to top" option
		//driver.findElement(By.xpath("//span[text() = 'Back to top']")).click();
		
		//amazon -> click on return otpin 
		//driver.findElement(By.xpath("//span[text() = 'Returns']")).click();
		
		//amazon -> click on register link
		//driver.findElement(By.xpath("//a[text() = 'Registry']")).click();
		
		//Indiabix -> click on Aptitude link
		//driver.findElement(By.xpath("//a[text() = 'Aptitude']")).click();
		
		//Indiabix -> click on contact me in bottom
		//driver.findElement(By.xpath("//span[text() = 'info.india']")).click();
		
		//Amazon -> click on login button
		driver.findElement(By.xpath("//span[text() = 'Hello, Sign in']")).click();
	}
}

