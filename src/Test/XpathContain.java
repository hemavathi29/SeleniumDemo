package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContain {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("C:\\Users\\HEMA\\Desktop\\self learning training\\xpathcontain.html");
		driver.get("C:\\Users\\HEMA\\Desktop\\self learning training\\Table.html");
	
		//implicitlyWait method 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//&nbsp none break space is used only by using xpathcontains by artibute 
		//driver.findElement(By.xpath("//button[contains(@type,'submit ')]")).click();
		
		//&nbsp none break space is used only by using xpathcontains by text
		//driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		//forward travelling (We can't edit the value of the table but we can only edit textbox)
		WebElement value = driver.findElement(By.xpath("//tr[2]/td[2]"));
		System.out.println(value.getText());
	}
}
