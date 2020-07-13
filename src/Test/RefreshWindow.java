package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.magicbricks.com");
		WebElement signvalue = driver.findElement(By.xpath("//*[@id=\"navUserName\"]"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(signvalue).build().perform();
	
		driver.findElement(By.xpath("//span[@class = 'loginBtn']/span")).click();
		
	 	Set<String> allwindow = driver.getWindowHandles();
	 	Iterator<String> it = allwindow.iterator();
	 	String parentwindow = it.next();
	 	String childwindow =  it.next();
	 	
	 	driver.switchTo().window(childwindow);
	 	System.out.println(driver.getTitle());
//	 	
//	 	WebElement info = driver.findElement(By.xpath("//*[@id=\"emailOrMobile\"]"));
//	 	driver.navigate().refresh();
//		info.sendKeys("124235321");
	 	
	 	POMRefresh pom1 = new POMRefresh(driver);
	 	pom1.getUsername().sendKeys("9363229254");
	}
}
